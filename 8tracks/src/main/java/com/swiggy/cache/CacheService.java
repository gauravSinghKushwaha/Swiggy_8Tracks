package com.swiggy.cache;


/**
 * A counter to provide various counting functionalities.
 *
 * @author gauravSingh
 *
 */
public interface CacheService {

    Object get(final String key);

    void add(final String key, final Object value);
}
