package net.btnz.pri.java.myspringbootbasetest.ehcachetest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;

@SpringBootApplication
public class MainApplication {
    public static void main(String... args) {
        CacheManager cacheManager = new SimpleCacheManager();
        Cache cache = new ConcurrentMapCache("myCache");
        cache.putIfAbsent()

        cacheManager.getCache();
        System.out.println("Hello World!");
    }
}
