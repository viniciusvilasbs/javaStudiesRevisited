package org.javaCore.streams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16Parallel {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;

        sumFor(num);
        sumStreamIterate(num);
        sumStreamParallelIterate(num);
        sumLongStreamIterate(num);
        sumLongStreamParallelIterate(num);

    }

    private  static void sumFor(long num) {
        System.out.println("Sum for: ");
        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++) {
            result += 1;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }

    private  static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate: ");
        long result = 0;
        long init = System.currentTimeMillis();
        Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }

    private  static void sumStreamParallelIterate(long num) {
        System.out.println("Sum StreamParallelIterate: ");
        long result = 0;
        long init = System.currentTimeMillis();
        Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }

    private  static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongStreamIterate: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }

    private  static void sumLongStreamParallelIterate(long num) {
        System.out.println("Sum LongStreamParallelIterate: ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms\n");
    }


}
