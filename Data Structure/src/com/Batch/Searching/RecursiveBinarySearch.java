package com.Batch.Searching;

public class RecursiveBinarySearch {

    public static int BinarySearch(int arr[], int l, int size, int key) {
        if (size >= 1) {
            int mid = l + (size - 1) / 2;

            if (arr[mid] == size)
                return mid;

            if (arr[mid] > size)
                return BinarySearch(arr,l,mid-1,key);
            return BinarySearch(arr,mid+1,size,key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr [] ={2,3,4,10,40};
        int size = arr.length-1;
        int key = 10;
        int result  = BinarySearch(arr,0,size,key);
        if (result == -1)
            System.out.println("element is not present");
        else
            System.out.println("element is present at index "+result);

    }
}
