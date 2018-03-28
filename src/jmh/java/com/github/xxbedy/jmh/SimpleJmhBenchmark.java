package com.github.xxbedy.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

public class SimpleJmhBenchmark {

    @Benchmark
    public void baseLine() {
	}

    @Benchmark
    public void stringConcat() {
    	String foo = "foo";
    	String bar = "bar";
    	String concat = foo + bar;
    }

    @Benchmark
    public void stringConcatWithBlackhole(Blackhole bh) {
    	String foo = "foo";
    	String bar = "bar";
    	String concat = foo + bar;
    	bh.consume(concat);
    }

}
