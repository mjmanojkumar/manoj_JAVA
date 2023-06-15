package day11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ArraySumCalculator {

    private static final int ARRAY_SIZE = 100;
    private static final int THREAD_COUNT = 5;
    private static final int ELEMENTS_PER_THREAD = ARRAY_SIZE / THREAD_COUNT;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[THREAD_COUNT];

    public static void main(String[] args) {
        // Initialize the array
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }

        // Create a thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        // Submit tasks to the thread pool
        for (int i = 0; i < THREAD_COUNT; i++) {
            final int threadIndex = i;
            executorService.submit(() -> calculatePartialSum(threadIndex));
        }

        // Shutdown the executor and wait for all tasks to complete
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combine the partial sums to get the final sum
        int finalSum = 0;
        for (int partialSum : partialSums) {
            finalSum += partialSum;
        }

        System.out.println("Final sum: " + finalSum);
    }

    private static void calculatePartialSum(int threadIndex) {
        int startIndex = threadIndex * ELEMENTS_PER_THREAD;
        int endIndex = startIndex + ELEMENTS_PER_THREAD;

        int partialSum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }

        partialSums[threadIndex] = partialSum;
    }
}
