package src.arrays.samplearray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list={3,2,-5,4,3,6,-2,0,1};
        Arrays.fill(list,2,5,12);
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(helper.search(list,2));
        System.out.println(Arrays.binarySearch(list,6));
    }
}
