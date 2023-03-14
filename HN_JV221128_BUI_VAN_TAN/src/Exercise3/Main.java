package Exercise3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int count = 0;
        boolean isPrime=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.ceil(Math.random() * 100);
            if (arr[i] != 1) {
                if (arr[i] == 2) {
                    isPrime=true;
                } else {
                    for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                        if (arr[i]%j==0){
                            isPrime=false;
                            break;
                        }else isPrime=true;
                    }
                }
            }else isPrime=false;
            if (isPrime){
                count++;
            }
            ////
        }
        System.out.println("Your input array is " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sort is " + Arrays.toString(arr));
        System.out.println("Number min in array is : " + arr[0]);
        System.out.println("Number max in array is : " + arr[arr.length - 1]);
        System.out.println("Your array has  : " +count +"primes");
    }
}
