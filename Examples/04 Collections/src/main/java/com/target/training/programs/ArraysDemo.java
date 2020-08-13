package com.target.training.programs;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] nums = null;
        // int nums[];
        // int[] nums, evens; // both nums and evens are arrays
        // int a[], b; // only a is an array, b is an int

        nums = new int[] {12, 34, 56, 78};

        nums[2] = 10000;

        System.out.println("nums is " + nums);
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                System.out.printf("nums[%d] = %d\n", i, nums[i]);
            }
        }
    }
}
