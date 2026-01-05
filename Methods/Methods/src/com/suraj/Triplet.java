package com.suraj;
//Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class Triplet {
    public static void main(String[] args) {

        int [] arr = {3, 1, 4, 6, 5};
        int arr_len= arr.length;
        System.out.println(inTriplets(arr, arr_len));
    }

static boolean inTriplets(int []arr, int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];
                if (x == y + z || y == z + x || z == x + y) {
                    return true;
                }
            }
        }

    }

    return false;
}
}