/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Random;

/**
 *
 * @author guoyike
 */
public class Maximum 
{
    public static int maxima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > array[m])
            {
                m = i;
            } 
            i++;
        }
        return m;
    }
    public static int maximum(int [] array)
    {
        int temmaximum = array[0];
        int i=1;
        while ( i < array.length)
        {
            if (array[i] > temmaximum)
               temmaximum = array[i];
            i++;
        }
         
        return temmaximum;
    }
//    public static int minimum(int [] array)
//    {
//        int temminimum = array[0];
//        int i=1;
//        while ( i < array.length)
//        {
//            if (array[i] < temminimum)
//                temminimum = array[i];
//            i++;
//        }
//        return temminimum;
//    }
//    public static int minima(int [] array)
//    {
//        int temminima = array[0];
//        int i=1;
//        while ( i < array.length)
//        {
//            if (array[i] < temminima)
//                temminima = array[i];
//            i++;
//        }
//        return temminima;
//    }
//    public static int[] extremal(int[] array) {
//        if (array.length == 0) {
//            return null;
//        }
//        int min = array[0];
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            } else if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        return new int[]{min, max};
//    }
    
    static void extremal(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
    int minIndex = 0;
    int maxIndex = 0;

// Find the minimum element
    for (int i = 1; i < array.length; i++) {
        if (compare(array[i], array[minIndex])) {
            minIndex = i;
        }
    }

// Find the maximum element, starting from the second element
    for (int i = 1; i < array.length; i++) {
        if (compare(array[maxIndex], array[i])) {
            maxIndex = i;
        }
    }

// Print the results
    System.out.println("Minimum element is at index: " + minIndex + ", value: " + array[minIndex]);
    System.out.println("Maximum element is at index: " + maxIndex + ", value: " + array[maxIndex]);
    System.out.println("Total comparisons: " + count);
}
static int count = 0;
static boolean compare(int x, int y)
{
    count++;
    return x > y;
}
private static int findMax(int[] arr, int start, int end) {
    int max = arr[start];
    for (int i = start + 1; i < end; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
static int maximum(int[][] x) {
    if (x == null || x.length == 0 || x[0].length == 0) {
        throw new IllegalArgumentException("Invalid input array");
    }
    int max = x[0][0];
    int[] flattened = new int[x.length * x[0].length];
    int index = 0;
    for (int[] row : x) {
        System.arraycopy(row, 0, flattened, index, row.length);
        index += row.length; 
    }
    return findMax(flattened, 0, flattened.length);
}
    


// Test driver

public static void main(String[] args)
{
//    System.out.println(maximum(arr));
//    System.out.println(maxima(arr));
//    System.out.println(minimum(arr));
//    System.out.println(minima(arr));
//    System.out.println(Arrays.toString(extremal(arr)));
    int [] arr = new int[]{342,34,233,456};
    extremal(arr);
//    count=0; String [] twoends = extremal(new String[]{"Zhang", "Li", "Chao","1","%", "*", "@"});
//    System.out.println("min=" + twoends[0] + ", and max=" + twoends[1]+ ", #comparisons=" + count);
}
    // test driver
//    public static void main(String[] args) 
//    {
//       int [] arr = new int[]{342,34,233,456};
//       System.out.println(maximum(arr));
//       System.out.println(maxima(arr));
//       for(int j=1; j<=10;j++)
//       {
//       int N=1000000*j;
//       int[] a =new int[N];
//       Random r= new Random();
//       for(int i=0;i<N;i++)
//       {
//           a[i]=r.nextInt();
//       }
//       long t0 =System.currentTimeMillis();
//       System.out.println(maxima(a));
//       long t1 =System.currentTimeMillis();
//       System.out.println(N+","+(t1-t0));
//       }
//    }

}
