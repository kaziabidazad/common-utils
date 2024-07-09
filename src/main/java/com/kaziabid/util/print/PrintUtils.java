package com.kaziabid.util.print;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Kazi Abid
 */
public class PrintUtils {

    public static void printArray(Object[] arr) {
        printArray(arr, false);
    }

    /**
     * 
     * @param arr
     * @param newLineForEveryElements
     */
    public static void printArray(Object[] arr, boolean newLineForEveryElements) {
        for (Object object : arr) {
            if (newLineForEveryElements)
                System.out.println(object + " ");
            else
                System.out.print(object + " ");
        }
        System.out.println();
    }

    /**
     * 
     * @param arr
     * @param start
     * @param end
     * @param newLineForEveryElements
     */
    public static void printArray(Object[] arr, int start, int end,
            boolean newLineForEveryElements) {
        for (int i = start; i <= end; i++) {
            if (newLineForEveryElements)
                System.out.println(arr[i] + " ");
            else
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(float[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(double[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(long[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(short[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(byte[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(char[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void printArray(boolean[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 
     * @param arr
     * @param start
     * @param end
     * @param newLineForEveryElements
     */
    public static void printArray(Object[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(float[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(long[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(short[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(byte[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void printArray(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static List<Integer> getRandomIntegers(int numOfIntegers) {
        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        ints = random.ints(numOfIntegers).boxed().collect(Collectors.toList());
        return ints;
    }

    public static Integer[] getRandomInts(int numOfIntegers) {
        Integer[] ints = new Integer[numOfIntegers];
        Random random = new Random();
        ints = random
                .ints(numOfIntegers).boxed().collect(Collectors.toList()).toArray(ints);
        return ints;
    }

    public static List<Integer> getRandomIntegers(int lowerBound, int numOfIntegers) {
        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        ints = random
                .ints(numOfIntegers, lowerBound, numOfIntegers * 50).boxed()
                .collect(Collectors.toList());
        return ints;
    }

    public static Integer[] getRandomInts(int lowerBound, int numOfIntegers) {
        Integer[] ints = new Integer[numOfIntegers];
        Random random = new Random();
        ints = random
                .ints(numOfIntegers, lowerBound, numOfIntegers * 50).boxed()
                .collect(Collectors.toList()).toArray(ints);
        return ints;
    }

    public static Integer[] getRandomIntsLarge(int numOfIntegers) {
        Integer[] ints = new Integer[numOfIntegers];
        Random random = new Random();
        for (int i = 0; i < numOfIntegers; i++) {
            ints[i] = random.nextInt();
        }
        return ints;
    }

    public static char[] getRandomCharsAToZ() {
        String seed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = new char[seed.length()];
        SecureRandom random = new SecureRandom();
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < seed.length()) {
            int pos = random.nextInt(seed.length());
            if (set.contains(pos))
                continue;
            set.add(pos);
            chars[i++] = seed.charAt(pos);
        }
        return chars;
    }

    public static Character[] getRandomCharactersAToZ() {
        String seed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Character[] chars = new Character[seed.length()];
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < seed.length()) {
            int pos = random.nextInt(seed.length());
            if (set.contains(pos))
                continue;
            set.add(pos);
            chars[i++] = seed.charAt(pos);
        }
        return chars;
    }

    public static char[] getRandomCharsaToZ() {
        String seed = "abcdefghijklmnopqrstuvwxuvyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = new char[seed.length()];
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < seed.length()) {
            int pos = random.nextInt(seed.length());
            if (set.contains(pos))
                continue;
            set.add(pos);
            chars[i++] = seed.charAt(pos);
        }
        return chars;
    }

    public static Character[] getRandomCharactersaToZ() {
        String seed = "abcdefghijklmnopqrstuvwxuvyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Character[] chars = new Character[seed.length()];
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while (i < seed.length()) {
            int pos = random.nextInt(seed.length());
            if (set.contains(pos))
                continue;
            set.add(pos);
            chars[i++] = seed.charAt(pos);
        }
        return chars;
    }

    public static int[] arrayMerge(int[] a, int[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        int[] resultArray = new int[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static short[] arrayMerge(short[] a, short[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        short[] resultArray = new short[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static byte[] arrayMerge(byte[] a, byte[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        byte[] resultArray = new byte[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static char[] arrayMerge(char[] a, char[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        char[] resultArray = new char[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static long[] arrayMerge(long[] a, long[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        long[] resultArray = new long[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static float[] arrayMerge(float[] a, float[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        float[] resultArray = new float[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static double[] arrayMerge(double[] a, double[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        double[] resultArray = new double[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static Object[] arrayMerge(Object[] a, Object[] b) {
        int aLen = a.length, bLen = b.length;
        int rLen = aLen + bLen;
        Object[] resultArray = new Object[rLen];
        System.arraycopy(a, 0, resultArray, 0, aLen);
        System.arraycopy(b, 0, resultArray, aLen, bLen);
        return resultArray;
    }

    public static int[] addItemToArray(int[] array, int... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        int[] result = new int[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static short[] addItemToArray(short[] array, short... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        short[] result = new short[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static byte[] addItemToArray(byte[] array, byte... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        byte[] result = new byte[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static char[] addItemToArray(char[] array, char... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        char[] result = new char[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static long[] addItemToArray(long[] array, long... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        long[] result = new long[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static float[] addItemToArray(float[] array, float... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        float[] result = new float[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static double[] addItemToArray(double[] array, double... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        double[] result = new double[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static Object[] addItemToArray(Object[] array, Object... items) {
        int arrayLength = array.length;
        int itemsLenght = items.length;
        Object[] result = new Object[array.length + itemsLenght];
        System.arraycopy(array, 0, result, 0, arrayLength);
        System.arraycopy(items, 0, result, arrayLength, itemsLenght);
        return result;
    }

    public static void printResult(String input, String expectedOutput,
            String actualOutput) {
        separator();
        System.out
                .println(String
                        .format("Input:    %s %nOutput:   %s %nExpected: %s ", input,
                                actualOutput, expectedOutput));
        separator();
    }

    public static void printResult(Object input, Object expectedOutput,
            Object actualOutput) {
        separator();
        System.out
                .println(String
                        .format("Input:    %s %nOutput:   %s %nExpected: %s ", input,
                                actualOutput, expectedOutput));
        separator();
    }

    public static void log(boolean logEnabled, Object... message) {
        if (!logEnabled)
            return;
        if (message != null && message.length > 0) {
            int len = message.length;
            String format = "%s " + ",%s ".repeat(len - 1);
            String line = String.format(format, message);
            System.out.println(line);
        }
    }

    public static void separator() {
        System.out
                .println(
                        "-----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        printArray(arrayMerge(new int[] { 1, 2, 3, 4 }, new int[] { 5, 6, 7, 8 }));
        printArray(arrayMerge(new int[] {}, new int[] {}));
        printArray(arrayMerge(new int[] {}, new int[] { 1, 2, 3, 4 }));
        printArray(arrayMerge(new int[] { 1, 2, 3, 4 },
                new int[] { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }));
    }
}
