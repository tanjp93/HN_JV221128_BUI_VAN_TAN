package Exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[50];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int) Math.ceil(Math.random()*100);
        }
        System.out.println("Your input array is "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sort is "+ Arrays.toString(arr));
        System.out.println("Number min in array is : "+ arr[0]);
        System.out.println("Number max in array is : "+ arr[arr.length-1]);
    }
}
