// Problem 1: 
// Given an array of integers, perform the following operations: 
// 1. Find the second largest element in the array. 
// 2. Move all zeros to the end of the array while maintaining the order of non-zero 
// elements. 
// Input: 
// arr = [10, 0, 5, 20, 0, 8, 15] 
// Output: 
// Second largest element: 15   
// Array after moving zeros: [10, 5, 20, 8, 15, 0, 0] 
// Constraints: 
// ● Do not use built-in sort functions. 
// ● The array may contain duplicate elements or zeros at any position. 
// ● Array length ≥ 2.

import java.util.Scanner;

public class Q1 {
    static void secLar(int arr[]){
        int max=arr[0];
        int sec=arr[1];
        if(sec>max){
            sec=max+sec;
            max=sec-max;
            sec=sec-max;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>sec){
                if(arr[i]>max){
                    sec=max;
                    max=arr[i];
                }else{
                    sec=arr[i];
                }

            }
        }
        System.out.println("Second Largest Elment in Arr is : "+sec);
    }
    public static void moveZeros(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print lenght not less than 2 :");
        int n=sc.nextInt();
        if(n>2){          
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //secLar(a);
        moveZeros(a);
        }
        return;
        

    }
}