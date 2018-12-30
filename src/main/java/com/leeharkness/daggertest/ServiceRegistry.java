package com.leeharkness.daggertest;

import dagger.Component;

/**
 * Dagger Service factory
 */
@Component
public interface ServiceRegistry {
    TestService createTestService();
}
