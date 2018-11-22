package it.unibo.oop.lab.workers01;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

/**
 * 
 * TestMatrix for worker 1.
 *
 */
public class TestListSumWithStreams {

    /**
     * SumList and its multithreaded implementation are given as reference
     * implementation of a software that sums the elements of a list.
     * 
     * Note that it is often impossible to split the load in an exact equal
     * manner - that's not an issue normally, however.
     */
    private static final int SIZE = 10000000;
    private static final String MSEC = " msec";

    /**
     * Base test for a multithreaded list sum.
     */
    @Test
    public void testBasic() {
        final List<Integer> list = IntStream
                .iterate(0, i -> i + 1)
                .limit(SIZE)
                .boxed()
                .collect(Collectors.toList());
        final long sum = list.stream()
                .mapToLong(Integer::longValue)
                .sum();
        System.out.println("BTW: the sum with " + SIZE + " elements is: " + sum);
        /*
         * Prepare time ant test with different number of threads
         */
        long time;
        for (int threads: new int[] { 1, 2, 3, 4, 8, 16, 32 }) {
            final SumList sumList = new MultiThreadedListSumWithStreams(threads);
            time = System.currentTimeMillis();
            assertEquals(sumList.sum(list), sum);
            System.out.println("Tried with " + threads + " thread: "
                    + (System.currentTimeMillis() - time) + MSEC);
        }
    }

}