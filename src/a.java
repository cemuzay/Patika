package src;

import java.util.*;

public class a {
    public static int binarySearch(int arr[], int l, int r, int x){
        if (r >= l){
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid+1, x);

            return binarySearch(arr, mid+1,r,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5};
        System.out.println(binarySearch(arr,2,3,4));

    }
}
