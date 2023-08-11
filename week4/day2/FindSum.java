package com.aseem.week4.day2;
import java.util.ArrayList;
//Given a list of integers and a target sum, find two numbers in the list that add up to the target sum.
public class FindSum {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(6);
        int target = 5;

        System.out.println(findIntegers(nums, target));
    }
    public static ArrayList<Integer> findIntegers(ArrayList<Integer> nums, int target) {
        ArrayList<Integer> foundNum = new ArrayList<>();
        for (Integer num : nums) {
            if(nums.contains(target - num)){
                foundNum.add(num);
                foundNum.add(nums.get(nums.indexOf(target-num)));
                break;
            }
        }
        return foundNum;
    }
}
