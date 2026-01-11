package io.sentry.config;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

final class ClasspathPropertiesLoader implements PropertiesLoader {
    private final ClassLoader classLoader;
    private final String fileName;
    private final ILogger logger;

    public ClasspathPropertiesLoader(ILogger iLogger) {
        this("sentry.properties", ClasspathPropertiesLoader.class.getClassLoader(), iLogger);
    }

    public ClasspathPropertiesLoader(String str, ClassLoader classLoader2, ILogger iLogger) {
        this.fileName = str;
        this.classLoader = classLoader2;
        this.logger = iLogger;
    }

    public Properties load() {
        BufferedInputStream bufferedInputStream;
        try {
            InputStream resourceAsStream = this.classLoader.getResourceAsStream(this.fileName);
            if (resourceAsStream != null) {
                try {
                    bufferedInputStream = new BufferedInputStream(resourceAsStream);
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th2) {
                    resourceAsStream.close();
                    throw th2;
                }
            } else {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            throw th;
        } catch (IOException e10) {
            this.logger.log(SentryLevel.ERROR, e10, "Failed to load Sentry configuration from classpath resource: %s", this.fileName);
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }
}
