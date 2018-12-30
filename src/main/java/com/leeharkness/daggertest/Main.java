package com.leeharkness.daggertest;

public class Main {
    public static void main(String[] args) {
        // Get Dagger involvement
        ServiceRegistry serviceRegistry = DaggerServiceRegistry.create();

        // Retrieve our test service
        TestService testService = serviceRegistry.createTestService();

        // And use it
        System.out.println(testService.doWork(42));
    }
}
