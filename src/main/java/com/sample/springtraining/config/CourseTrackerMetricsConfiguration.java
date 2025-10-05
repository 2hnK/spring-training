package com.sample.springtraining.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Configuration
public class CourseTrackerMetricsConfiguration {

    @Bean
    public Counter createCourseCounter(MeterRegistry meterRegistry) {
        return Counter.builder("api.courses.created.count")
                .description("Total number of courses created")
                .register(meterRegistry);
    }
}
