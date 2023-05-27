package JAVA.Array;

import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter Size of array : ");
        int n=sc.nextInt();
        System.out.println("Enter Array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Rotation of array :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.print("Enter a Rotation value: ");
        int k=sc.nextInt();
        while(k>0){
            int temp=arr[0];
            for(int i=0;i<n;i++){
                arr[i]=arr[i+1];
            }
             arr[n-1]=temp;
            k--;
        }
        System.out.println("Before Rotation of array :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
