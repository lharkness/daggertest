package com.leeharkness.daggertest;

import com.google.common.annotations.VisibleForTesting;

import javax.inject.Inject;

/**
 * Represents our window into the data layer.
 */
class DataAccessLayer {

    @VisibleForTesting
    static final String SMALL_MESSAGE = "Small Message";
    @VisibleForTesting
    static final String LARGE_MESSAGE = "Large Message";

    @Inject
    DataAccessLayer() {}

    /**
     * Retrieve a small message
     * @return the small message
     */
    String getSmallMessage() {
        return SMALL_MESSAGE;
    }

    /**
     * Retrieve a large message
     * @return the large message
     */
    String getLargeMessage() {
        return LARGE_MESSAGE;
    }
}
