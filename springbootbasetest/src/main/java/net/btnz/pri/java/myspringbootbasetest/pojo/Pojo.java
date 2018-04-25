package net.btnz.pri.java.myspringbootbasetest.pojo;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class Pojo {
    public AtomicReference<String> strRef = new AtomicReference<>();
    public AtomicReference<Set<String>> setRef = new AtomicReference<>();
}
