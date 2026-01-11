package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.protocol.SentryId;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class OutboxSender extends DirectoryProcessor implements IEnvelopeSender {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final IEnvelopeReader envelopeReader;
    private final IHub hub;
    private final ILogger logger;
    private final ISerializer serializer;

    public OutboxSender(IHub iHub, IEnvelopeReader iEnvelopeReader, ISerializer iSerializer, ILogger iLogger, long j10) {
        super(iLogger, j10);
        this.hub = (IHub) Objects.requireNonNull(iHub, "Hub is required.");
        this.envelopeReader = (IEnvelopeReader) Objects.requireNonNull(iEnvelopeReader, "Envelope reader is required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    private void logEnvelopeItemNull(SentryEnvelopeItem sentryEnvelopeItem, int i) {
        this.logger.log(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i), sentryEnvelopeItem.getHeader().getType());
    }

    private void logItemCaptured(int i) {
        this.logger.log(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i));
    }

    private void logTimeout(SentryId sentryId) {
        this.logger.log(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", sentryId);
    }

    private void logUnexpectedEventId(SentryEnvelope sentryEnvelope, SentryId sentryId, int i) {
        this.logger.log(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i), sentryEnvelope.getHeader().getEventId(), sentryId);
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01dd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void processEnvelope(io.sentry.SentryEnvelope r10, java.lang.Object r11) {
        /*
            r9 = this;
            io.sentry.ILogger r0 = r9.logger
            io.sentry.SentryLevel r1 = io.sentry.SentryLevel.DEBUG
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Iterable r4 = r10.getItems()
            int r4 = io.sentry.util.CollectionUtils.size(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "Processing Envelope with %d item(s)"
            r0.log((io.sentry.SentryLevel) r1, (java.lang.String) r4, (java.lang.Object[]) r3)
            java.lang.Iterable r0 = r10.getItems()
            java.util.Iterator r0 = r0.iterator()
            r1 = r5
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01fb
            java.lang.Object r3 = r0.next()
            io.sentry.SentryEnvelopeItem r3 = (io.sentry.SentryEnvelopeItem) r3
            int r1 = r1 + r2
            io.sentry.SentryEnvelopeItemHeader r4 = r3.getHeader()
            if (r4 != 0) goto L_0x0049
            io.sentry.ILogger r3 = r9.logger
            io.sentry.SentryLevel r4 = io.sentry.SentryLevel.ERROR
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r5] = r7
            java.lang.String r7 = "Item %d has no header"
            r3.log((io.sentry.SentryLevel) r4, (java.lang.String) r7, (java.lang.Object[]) r6)
            goto L_0x0024
        L_0x0049:
            io.sentry.SentryItemType r4 = io.sentry.SentryItemType.Event
            io.sentry.SentryEnvelopeItemHeader r6 = r3.getHeader()
            io.sentry.SentryItemType r6 = r6.getType()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00d2
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00cf }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00cf }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x00cf }
            byte[] r8 = r3.getData()     // Catch:{ all -> 0x00cf }
            r7.<init>(r8)     // Catch:{ all -> 0x00cf }
            java.nio.charset.Charset r8 = UTF_8     // Catch:{ all -> 0x00cf }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00cf }
            r4.<init>(r6)     // Catch:{ all -> 0x00cf }
            io.sentry.ISerializer r6 = r9.serializer     // Catch:{ all -> 0x00c5 }
            java.lang.Class<io.sentry.SentryEvent> r7 = io.sentry.SentryEvent.class
            java.lang.Object r6 = r6.deserialize(r4, r7)     // Catch:{ all -> 0x00c5 }
            io.sentry.SentryEvent r6 = (io.sentry.SentryEvent) r6     // Catch:{ all -> 0x00c5 }
            if (r6 != 0) goto L_0x007e
            r9.logEnvelopeItemNull(r3, r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c0
        L_0x007e:
            io.sentry.SentryEnvelopeHeader r3 = r10.getHeader()     // Catch:{ all -> 0x00c5 }
            io.sentry.protocol.SentryId r3 = r3.getEventId()     // Catch:{ all -> 0x00c5 }
            if (r3 == 0) goto L_0x00a6
            io.sentry.SentryEnvelopeHeader r3 = r10.getHeader()     // Catch:{ all -> 0x00c5 }
            io.sentry.protocol.SentryId r3 = r3.getEventId()     // Catch:{ all -> 0x00c5 }
            io.sentry.protocol.SentryId r7 = r6.getEventId()     // Catch:{ all -> 0x00c5 }
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x00c5 }
            if (r3 != 0) goto L_0x00a6
            io.sentry.protocol.SentryId r3 = r6.getEventId()     // Catch:{ all -> 0x00c5 }
            r9.logUnexpectedEventId(r10, r3, r1)     // Catch:{ all -> 0x00c5 }
        L_0x00a1:
            r4.close()     // Catch:{ all -> 0x00cf }
            goto L_0x0024
        L_0x00a6:
            io.sentry.IHub r3 = r9.hub     // Catch:{ all -> 0x00c5 }
            r3.captureEvent(r6, r11)     // Catch:{ all -> 0x00c5 }
            r9.logItemCaptured(r1)     // Catch:{ all -> 0x00c5 }
            boolean r3 = r9.waitFlush(r11)     // Catch:{ all -> 0x00c5 }
            if (r3 != 0) goto L_0x00c0
            io.sentry.protocol.SentryId r3 = r6.getEventId()     // Catch:{ all -> 0x00c5 }
            r9.logTimeout(r3)     // Catch:{ all -> 0x00c5 }
        L_0x00bb:
            r4.close()     // Catch:{ all -> 0x00cf }
            goto L_0x01fb
        L_0x00c0:
            r4.close()     // Catch:{ all -> 0x00cf }
            goto L_0x01d0
        L_0x00c5:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch:{ all -> 0x00cf }
        L_0x00ce:
            throw r3     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r3 = move-exception
            goto L_0x016c
        L_0x00d2:
            io.sentry.SentryItemType r4 = io.sentry.SentryItemType.Transaction
            io.sentry.SentryEnvelopeItemHeader r6 = r3.getHeader()
            io.sentry.SentryItemType r6 = r6.getType()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0176
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00cf }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00cf }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x00cf }
            byte[] r8 = r3.getData()     // Catch:{ all -> 0x00cf }
            r7.<init>(r8)     // Catch:{ all -> 0x00cf }
            java.nio.charset.Charset r8 = UTF_8     // Catch:{ all -> 0x00cf }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00cf }
            r4.<init>(r6)     // Catch:{ all -> 0x00cf }
            io.sentry.ISerializer r6 = r9.serializer     // Catch:{ all -> 0x0162 }
            java.lang.Class<io.sentry.protocol.SentryTransaction> r7 = io.sentry.protocol.SentryTransaction.class
            java.lang.Object r6 = r6.deserialize(r4, r7)     // Catch:{ all -> 0x0162 }
            io.sentry.protocol.SentryTransaction r6 = (io.sentry.protocol.SentryTransaction) r6     // Catch:{ all -> 0x0162 }
            if (r6 != 0) goto L_0x0107
            r9.logEnvelopeItemNull(r3, r1)     // Catch:{ all -> 0x0162 }
            goto L_0x00c0
        L_0x0107:
            io.sentry.SentryEnvelopeHeader r3 = r10.getHeader()     // Catch:{ all -> 0x0162 }
            io.sentry.protocol.SentryId r3 = r3.getEventId()     // Catch:{ all -> 0x0162 }
            if (r3 == 0) goto L_0x012c
            io.sentry.SentryEnvelopeHeader r3 = r10.getHeader()     // Catch:{ all -> 0x0162 }
            io.sentry.protocol.SentryId r3 = r3.getEventId()     // Catch:{ all -> 0x0162 }
            io.sentry.protocol.SentryId r7 = r6.getEventId()     // Catch:{ all -> 0x0162 }
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x0162 }
            if (r3 != 0) goto L_0x012c
            io.sentry.protocol.SentryId r3 = r6.getEventId()     // Catch:{ all -> 0x0162 }
            r9.logUnexpectedEventId(r10, r3, r1)     // Catch:{ all -> 0x0162 }
            goto L_0x00a1
        L_0x012c:
            io.sentry.protocol.Contexts r3 = r6.getContexts()     // Catch:{ all -> 0x0162 }
            io.sentry.SpanContext r3 = r3.getTrace()     // Catch:{ all -> 0x0162 }
            if (r3 == 0) goto L_0x0143
            io.sentry.protocol.Contexts r3 = r6.getContexts()     // Catch:{ all -> 0x0162 }
            io.sentry.SpanContext r3 = r3.getTrace()     // Catch:{ all -> 0x0162 }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0162 }
            r3.setSampled(r7)     // Catch:{ all -> 0x0162 }
        L_0x0143:
            io.sentry.IHub r3 = r9.hub     // Catch:{ all -> 0x0162 }
            io.sentry.SentryEnvelopeHeader r7 = r10.getHeader()     // Catch:{ all -> 0x0162 }
            io.sentry.TraceState r7 = r7.getTrace()     // Catch:{ all -> 0x0162 }
            r3.captureTransaction(r6, r7, r11)     // Catch:{ all -> 0x0162 }
            r9.logItemCaptured(r1)     // Catch:{ all -> 0x0162 }
            boolean r3 = r9.waitFlush(r11)     // Catch:{ all -> 0x0162 }
            if (r3 != 0) goto L_0x00c0
            io.sentry.protocol.SentryId r3 = r6.getEventId()     // Catch:{ all -> 0x0162 }
            r9.logTimeout(r3)     // Catch:{ all -> 0x0162 }
            goto L_0x00bb
        L_0x0162:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch:{ all -> 0x00cf }
        L_0x016b:
            throw r3     // Catch:{ all -> 0x00cf }
        L_0x016c:
            io.sentry.ILogger r4 = r9.logger
            io.sentry.SentryLevel r6 = io.sentry.SentryLevel.ERROR
            java.lang.String r7 = "Item failed to process."
            r4.log((io.sentry.SentryLevel) r6, (java.lang.String) r7, (java.lang.Throwable) r3)
            goto L_0x01d0
        L_0x0176:
            io.sentry.SentryEnvelope r4 = new io.sentry.SentryEnvelope
            io.sentry.SentryEnvelopeHeader r6 = r10.getHeader()
            io.sentry.protocol.SentryId r6 = r6.getEventId()
            io.sentry.SentryEnvelopeHeader r7 = r10.getHeader()
            io.sentry.protocol.SdkVersion r7 = r7.getSdkVersion()
            r4.<init>((io.sentry.protocol.SentryId) r6, (io.sentry.protocol.SdkVersion) r7, (io.sentry.SentryEnvelopeItem) r3)
            io.sentry.IHub r6 = r9.hub
            r6.captureEnvelope(r4, r11)
            io.sentry.ILogger r4 = r9.logger
            io.sentry.SentryLevel r6 = io.sentry.SentryLevel.DEBUG
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            io.sentry.SentryEnvelopeItemHeader r8 = r3.getHeader()
            io.sentry.SentryItemType r8 = r8.getType()
            java.lang.String r8 = r8.getItemType()
            r7[r5] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7[r2] = r8
            java.lang.String r8 = "%s item %d is being captured."
            r4.log((io.sentry.SentryLevel) r6, (java.lang.String) r8, (java.lang.Object[]) r7)
            boolean r4 = r9.waitFlush(r11)
            if (r4 != 0) goto L_0x01d0
            io.sentry.ILogger r10 = r9.logger
            io.sentry.SentryLevel r11 = io.sentry.SentryLevel.WARNING
            java.lang.Object[] r0 = new java.lang.Object[r2]
            io.sentry.SentryEnvelopeItemHeader r1 = r3.getHeader()
            io.sentry.SentryItemType r1 = r1.getType()
            java.lang.String r1 = r1.getItemType()
            r0[r5] = r1
            java.lang.String r1 = "Timed out waiting for item type submission: %s"
            r10.log((io.sentry.SentryLevel) r11, (java.lang.String) r1, (java.lang.Object[]) r0)
            goto L_0x01fb
        L_0x01d0:
            boolean r3 = r11 instanceof io.sentry.hints.SubmissionResult
            if (r3 == 0) goto L_0x01ef
            r3 = r11
            io.sentry.hints.SubmissionResult r3 = (io.sentry.hints.SubmissionResult) r3
            boolean r3 = r3.isSuccess()
            if (r3 != 0) goto L_0x01ef
            io.sentry.ILogger r10 = r9.logger
            io.sentry.SentryLevel r11 = io.sentry.SentryLevel.WARNING
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r5] = r1
            java.lang.String r1 = "Envelope had a failed capture at item %d. No more items will be sent."
            r10.log((io.sentry.SentryLevel) r11, (java.lang.String) r1, (java.lang.Object[]) r0)
            goto L_0x01fb
        L_0x01ef:
            boolean r3 = r11 instanceof io.sentry.hints.Resettable
            if (r3 == 0) goto L_0x0024
            r3 = r11
            io.sentry.hints.Resettable r3 = (io.sentry.hints.Resettable) r3
            r3.reset()
            goto L_0x0024
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.OutboxSender.processEnvelope(io.sentry.SentryEnvelope, java.lang.Object):void");
    }

    private boolean waitFlush(Object obj) {
        if (obj instanceof Flushable) {
            return ((Flushable) obj).waitFlush();
        }
        LogUtils.logIfNotFlushable(this.logger, obj);
        return true;
    }

    public boolean isRelevantFileName(String str) {
        return str != null && !str.startsWith(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);
    }

    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    public void processEnvelopeFile(String str, Object obj) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), obj);
    }

    public void processFile(File file, Object obj) {
        BufferedInputStream bufferedInputStream;
        Objects.requireNonNull(file, "File is required.");
        if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
            return;
        }
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            SentryEnvelope read = this.envelopeReader.read(bufferedInputStream);
            if (read == null) {
                this.logger.log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
            } else {
                processEnvelope(read, obj);
                this.logger.log(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
            }
            bufferedInputStream.close();
            if (obj instanceof Retryable) {
                if (!((Retryable) obj).isRetry()) {
                    try {
                        if (!file.delete()) {
                            this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                            return;
                        }
                        return;
                    } catch (RuntimeException e10) {
                        this.logger.log(SentryLevel.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (IOException e11) {
            try {
                ILogger iLogger = this.logger;
                SentryLevel sentryLevel = SentryLevel.ERROR;
                iLogger.log(sentryLevel, "Error processing envelope.", (Throwable) e11);
                if (obj instanceof Retryable) {
                    if (!((Retryable) obj).isRetry()) {
                        try {
                            if (!file.delete()) {
                                this.logger.log(sentryLevel, "Failed to delete: %s", file.getAbsolutePath());
                                return;
                            }
                            return;
                        } catch (RuntimeException e12) {
                            this.logger.log(SentryLevel.ERROR, e12, "Failed to delete: %s", file.getAbsolutePath());
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } catch (Throwable th2) {
                if (!(obj instanceof Retryable)) {
                    LogUtils.logIfNotRetryable(this.logger, obj);
                } else if (!((Retryable) obj).isRetry()) {
                    try {
                        if (!file.delete()) {
                            this.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
                        }
                    } catch (RuntimeException e13) {
                        this.logger.log(SentryLevel.ERROR, e13, "Failed to delete: %s", file.getAbsolutePath());
                    }
                }
                throw th2;
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        LogUtils.logIfNotRetryable(this.logger, obj);
        return;
        throw th;
    }
}
