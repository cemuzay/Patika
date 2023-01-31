package src.arrays.samplearray;

public class helper {
    void printarray(int[] arr){
        System.out.println("[");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("]");
    }
     static int[] fill(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            arr[i]=value;
        }
        return arr;
    }
    static int search(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

}
