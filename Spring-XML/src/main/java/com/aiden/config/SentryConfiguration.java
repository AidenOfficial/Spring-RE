package com.aiden.config;

import io.sentry.spring.jakarta.EnableSentry;
import org.springframework.context.annotation.Configuration;

@EnableSentry(dsn = "https://96ffaf20f6e9135bd35b057c50513440@o4506137927811072.ingest.sentry.io/4506145345437696")
@Configuration
class SentryConfiguration {
}