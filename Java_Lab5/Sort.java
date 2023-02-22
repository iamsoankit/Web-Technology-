package com.Amlan;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(1000);
        }
        System.out.println("The Unsorted Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("The Sorted Array is: ");
        QuickSort(a, 0, n - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a, int i, int j) {
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int[] a, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = a[low];
        while (i <= j) {
            while (i <= high && a[i] <= pivot) {
                i++;
            }
            while (j > low && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, low, j);
        return j;
    }

    public static void QuickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = partition(a, low, high);
            QuickSort(a, low, pivot - 1);
            QuickSort(a, pivot + 1, high);
        }

    }
}
