package com.Batch.Searching;

public class BinarySearch {

    public int BinarySearch(int arr[],int key) {
        if (arr.length == 0)
            return 0;
        int l = 0,size = arr.length-1;
        while (l <= size){
            int middle = l+(size-1)/2;
            if (arr[middle] == key)
                return middle;
            if (arr[middle] < key)
                l = middle+1;
            else
                size = middle-1;
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr [] ={2,3,4,10,40};
        int n = arr.length;
        int key = 5;
        int result  = ob.BinarySearch(arr,key);
        if (result == -1)
            System.out.println("element is not present");
        else
            System.out.println("element is present at index "+result);

    }

}
