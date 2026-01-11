package io.sentry;

import android.support.v4.media.a;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.config.PropertiesProvider;
import io.sentry.protocol.SdkVersion;
import io.sentry.transport.ITransportGate;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import io.sentry.util.Platform;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public class SentryOptions {
    public static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String PROXY_PORT_DEFAULT = "80";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private BeforeBreadcrumbCallback beforeBreadcrumb;
    private BeforeSendCallback beforeSend;
    private String cacheDirPath;
    private int connectionTimeoutMillis;
    private Boolean debug;
    private SentryLevel diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private boolean enableAutoSessionTracking;
    private Boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private Boolean enableUncaughtExceptionHandler;
    private IEnvelopeCache envelopeDiskCache;
    private IEnvelopeReader envelopeReader;
    private String environment;
    private final List<EventProcessor> eventProcessors;
    private ISentryExecutorService executorService;
    private long flushTimeoutMillis;
    private HostnameVerifier hostnameVerifier;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private final List<Integration> integrations;
    private ILogger logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxQueueSize;
    private RequestSize maxRequestBodySize;
    private int maxSpans;
    private final List<IScopeObserver> observers;
    private Boolean printUncaughtStackTrace;
    private String proguardUuid;
    private Proxy proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private SdkVersion sdkVersion;
    private boolean sendDefaultPii;
    private String sentryClientName;
    private ISerializer serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeout;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private TracesSamplerCallback tracesSampler;
    private final List<String> tracingOrigins;
    private ITransportFactory transportFactory;
    private ITransportGate transportGate;

    public interface BeforeBreadcrumbCallback {
        Breadcrumb execute(Breadcrumb breadcrumb, Object obj);
    }

    public interface BeforeSendCallback {
        SentryEvent execute(SentryEvent sentryEvent, Object obj);
    }

    public static final class Proxy {
        private String host;
        private String pass;
        private String port;
        private String user;

        public Proxy() {
            this((String) null, (String) null, (String) null, (String) null);
        }

        public Proxy(String str, String str2) {
            this(str, str2, (String) null, (String) null);
        }

        public Proxy(String str, String str2, String str3, String str4) {
            this.host = str;
            this.port = str2;
            this.user = str3;
            this.pass = str4;
        }

        public String getHost() {
            return this.host;
        }

        public String getPass() {
            return this.pass;
        }

        public String getPort() {
            return this.port;
        }

        public String getUser() {
            return this.user;
        }

        public void setHost(String str) {
            this.host = str;
        }

        public void setPass(String str) {
            this.pass = str;
        }

        public void setPort(String str) {
            this.port = str;
        }

        public void setUser(String str) {
            this.user = str;
        }
    }

    public enum RequestSize {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface TracesSamplerCallback {
        Double sample(SamplingContext samplingContext);
    }

    public SentryOptions() {
        this(false);
    }

    private SentryOptions(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.shutdownTimeout = 2000;
        this.flushTimeoutMillis = 15000;
        this.enableNdk = true;
        this.logger = NoOpLogger.getInstance();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new EnvelopeReader();
        this.serializer = new GsonSerializer(this);
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = NoOpTransportFactory.getInstance();
        this.transportGate = NoOpTransportGate.getInstance();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000;
        this.attachServerName = true;
        Boolean bool = Boolean.TRUE;
        this.enableUncaughtExceptionHandler = bool;
        this.printUncaughtStackTrace = Boolean.FALSE;
        this.executorService = NoOpSentryExecutorService.getInstance();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = NoOpEnvelopeCache.getInstance();
        this.sendDefaultPii = false;
        this.observers = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520;
        this.enableDeduplication = bool;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = RequestSize.NONE;
        this.tracingOrigins = new CopyOnWriteArrayList();
        if (!z) {
            this.executorService = new SentryExecutorService();
            copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
            copyOnWriteArrayList2.add(new ShutdownHookIntegration());
            copyOnWriteArrayList.add(new MainEventProcessor(this));
            copyOnWriteArrayList.add(new DuplicateEventDetectionEventProcessor(this));
            if (Platform.isJvm()) {
                copyOnWriteArrayList.add(new SentryRuntimeEventProcessor());
            }
            setSentryClientName("sentry.java/5.6.2");
            setSdkVersion(createSdkVersion());
        }
    }

    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersion2 = new SdkVersion(BuildConfig.SENTRY_JAVA_SDK_NAME, BuildConfig.VERSION_NAME);
        sdkVersion2.setVersion(BuildConfig.VERSION_NAME);
        sdkVersion2.addPackage("maven:io.sentry:sentry", BuildConfig.VERSION_NAME);
        return sdkVersion2;
    }

    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    public static SentryOptions from(PropertiesProvider propertiesProvider, ILogger iLogger) {
        SentryOptions sentryOptions = new SentryOptions();
        sentryOptions.setDsn(propertiesProvider.getProperty("dsn"));
        sentryOptions.setEnvironment(propertiesProvider.getProperty("environment"));
        sentryOptions.setRelease(propertiesProvider.getProperty(BuildConfig.BUILD_TYPE));
        sentryOptions.setDist(propertiesProvider.getProperty("dist"));
        sentryOptions.setServerName(propertiesProvider.getProperty("servername"));
        sentryOptions.setEnableUncaughtExceptionHandler(propertiesProvider.getBooleanProperty("uncaught.handler.enabled"));
        sentryOptions.setPrintUncaughtStackTrace(propertiesProvider.getBooleanProperty("uncaught.handler.print-stacktrace"));
        sentryOptions.setTracesSampleRate(propertiesProvider.getDoubleProperty("traces-sample-rate"));
        sentryOptions.setDebug(propertiesProvider.getBooleanProperty("debug"));
        sentryOptions.setEnableDeduplication(propertiesProvider.getBooleanProperty("enable-deduplication"));
        String property = propertiesProvider.getProperty("max-request-body-size");
        if (property != null) {
            sentryOptions.setMaxRequestBodySize(RequestSize.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry next : propertiesProvider.getMap("tags").entrySet()) {
            sentryOptions.setTag((String) next.getKey(), (String) next.getValue());
        }
        String property2 = propertiesProvider.getProperty("proxy.host");
        String property3 = propertiesProvider.getProperty("proxy.user");
        String property4 = propertiesProvider.getProperty("proxy.pass");
        String property5 = propertiesProvider.getProperty("proxy.port", PROXY_PORT_DEFAULT);
        if (property2 != null) {
            sentryOptions.setProxy(new Proxy(property2, property5, property3, property4));
        }
        for (String addInAppInclude : propertiesProvider.getList("in-app-includes")) {
            sentryOptions.addInAppInclude(addInAppInclude);
        }
        for (String addInAppExclude : propertiesProvider.getList("in-app-excludes")) {
            sentryOptions.addInAppExclude(addInAppExclude);
        }
        for (String addTracingOrigin : propertiesProvider.getList("tracing-origins")) {
            sentryOptions.addTracingOrigin(addTracingOrigin);
        }
        sentryOptions.setProguardUuid(propertiesProvider.getProperty("proguard-uuid"));
        for (String next2 : propertiesProvider.getList("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(next2);
                if (Throwable.class.isAssignableFrom(cls)) {
                    sentryOptions.addIgnoredExceptionForType(cls);
                } else {
                    iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", next2, next2);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", next2, next2);
            }
        }
        return sentryOptions;
    }

    private Boolean getDebug() {
        return this.debug;
    }

    private Boolean getEnableDeduplication() {
        return this.enableDeduplication;
    }

    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public void addScopeObserver(IScopeObserver iScopeObserver) {
        this.observers.add(iScopeObserver);
    }

    public void addTracingOrigin(String str) {
        this.tracingOrigins.add(str);
    }

    public boolean containsIgnoredExceptionForType(Throwable th2) {
        return this.ignoredExceptionsForType.contains(th2.getClass());
    }

    public BeforeBreadcrumbCallback getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public BeforeSendCallback getBeforeSend() {
        return this.beforeSend;
    }

    public String getCacheDirPath() {
        return this.cacheDirPath;
    }

    @Deprecated
    public int getCacheDirSize() {
        return this.maxCacheItems;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public IEnvelopeCache getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public IEnvelopeReader getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public ISentryExecutorService getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public String getOutboxPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.cacheDirPath);
        return a.e(sb2, File.separator, "outbox");
    }

    public Boolean getPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<IScopeObserver> getScopeObservers() {
        return this.observers;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public ISerializer getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeout() {
        return this.shutdownTimeout;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public TracesSamplerCallback getTracesSampler() {
        return this.tracesSampler;
    }

    public List<String> getTracingOrigins() {
        return this.tracingOrigins;
    }

    public ITransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    public ITransportGate getTransportGate() {
        return this.transportGate;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return Boolean.TRUE.equals(this.debug);
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return Boolean.TRUE.equals(this.enableDeduplication);
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    @Deprecated
    public boolean isEnableSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return Boolean.TRUE.equals(this.enableUncaughtExceptionHandler);
    }

    public boolean isPrintUncaughtStackTrace() {
        return Boolean.TRUE.equals(this.printUncaughtStackTrace);
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void merge(SentryOptions sentryOptions) {
        if (sentryOptions.getDsn() != null) {
            setDsn(sentryOptions.getDsn());
        }
        if (sentryOptions.getEnvironment() != null) {
            setEnvironment(sentryOptions.getEnvironment());
        }
        if (sentryOptions.getRelease() != null) {
            setRelease(sentryOptions.getRelease());
        }
        if (sentryOptions.getDist() != null) {
            setDist(sentryOptions.getDist());
        }
        if (sentryOptions.getServerName() != null) {
            setServerName(sentryOptions.getServerName());
        }
        if (sentryOptions.getProxy() != null) {
            setProxy(sentryOptions.getProxy());
        }
        if (sentryOptions.getEnableUncaughtExceptionHandler() != null) {
            setEnableUncaughtExceptionHandler(sentryOptions.getEnableUncaughtExceptionHandler());
        }
        if (sentryOptions.getPrintUncaughtStackTrace() != null) {
            setPrintUncaughtStackTrace(sentryOptions.getPrintUncaughtStackTrace());
        }
        if (sentryOptions.getTracesSampleRate() != null) {
            setTracesSampleRate(sentryOptions.getTracesSampleRate());
        }
        if (sentryOptions.getDebug() != null) {
            setDebug(sentryOptions.getDebug());
        }
        if (sentryOptions.getEnableDeduplication() != null) {
            setEnableDeduplication(sentryOptions.getEnableDeduplication());
        }
        for (Map.Entry entry : new HashMap(sentryOptions.getTags()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(sentryOptions.getInAppIncludes()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(sentryOptions.getInAppExcludes()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(sentryOptions.getIgnoredExceptionsForType()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        Iterator it4 = new ArrayList(sentryOptions.getTracingOrigins()).iterator();
        while (it4.hasNext()) {
            addTracingOrigin((String) it4.next());
        }
        if (sentryOptions.getProguardUuid() != null) {
            setProguardUuid(sentryOptions.getProguardUuid());
        }
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBeforeBreadcrumb(BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
        this.beforeBreadcrumb = beforeBreadcrumbCallback;
    }

    public void setBeforeSend(BeforeSendCallback beforeSendCallback) {
        this.beforeSend = beforeSendCallback;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    @Deprecated
    public void setCacheDirSize(int i) {
        this.maxCacheItems = i;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setDebug(Boolean bool) {
        this.debug = bool;
    }

    public void setDiagnosticLevel(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableDeduplication(Boolean bool) {
        this.enableDeduplication = bool;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    @Deprecated
    public void setEnableSessionTracking(boolean z) {
        setEnableAutoSessionTracking(z);
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableUncaughtExceptionHandler(Boolean bool) {
        this.enableUncaughtExceptionHandler = bool;
    }

    public void setEnvelopeDiskCache(IEnvelopeCache iEnvelopeCache) {
        if (iEnvelopeCache == null) {
            iEnvelopeCache = NoOpEnvelopeCache.getInstance();
        }
        this.envelopeDiskCache = iEnvelopeCache;
    }

    public void setEnvelopeReader(IEnvelopeReader iEnvelopeReader) {
        if (iEnvelopeReader == null) {
            iEnvelopeReader = NoOpEnvelopeReader.getInstance();
        }
        this.envelopeReader = iEnvelopeReader;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(ISentryExecutorService iSentryExecutorService) {
        if (iSentryExecutorService != null) {
            this.executorService = iSentryExecutorService;
        }
    }

    public void setFlushTimeoutMillis(long j10) {
        this.flushTimeoutMillis = j10;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier2) {
        this.hostnameVerifier = hostnameVerifier2;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? NoOpLogger.getInstance() : new DiagnosticLogger(this, iLogger);
    }

    public void setMaxAttachmentSize(long j10) {
        this.maxAttachmentSize = j10;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setPrintUncaughtStackTrace(Boolean bool) {
        this.printUncaughtStackTrace = bool;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(Proxy proxy2) {
        this.proxy = proxy2;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d10) {
        if (d10 == null || (d10.doubleValue() <= 1.0d && d10.doubleValue() > Utils.DOUBLE_EPSILON)) {
            this.sampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values > 0.0 and <= 1.0.");
    }

    public void setSdkVersion(SdkVersion sdkVersion2) {
        this.sdkVersion = sdkVersion2;
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(ISerializer iSerializer) {
        if (iSerializer == null) {
            iSerializer = NoOpSerializer.getInstance();
        }
        this.serializer = iSerializer;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j10) {
        this.sessionTrackingIntervalMillis = j10;
    }

    public void setShutdownTimeout(long j10) {
        this.shutdownTimeout = j10;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d10) {
        if (d10 == null || (d10.doubleValue() <= 1.0d && d10.doubleValue() >= Utils.DOUBLE_EPSILON)) {
            this.tracesSampleRate = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(TracesSamplerCallback tracesSamplerCallback) {
        this.tracesSampler = tracesSamplerCallback;
    }

    public void setTransportFactory(ITransportFactory iTransportFactory) {
        if (iTransportFactory == null) {
            iTransportFactory = NoOpTransportFactory.getInstance();
        }
        this.transportFactory = iTransportFactory;
    }

    public void setTransportGate(ITransportGate iTransportGate) {
        if (iTransportGate == null) {
            iTransportGate = NoOpTransportGate.getInstance();
        }
        this.transportGate = iTransportGate;
    }
}
