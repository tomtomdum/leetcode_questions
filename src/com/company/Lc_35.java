package com.company;

public class Lc_35 {

    public int searchInsert(int[] nums, int target) {
        int lowerbound =0;
        int upperbound = nums.length -1;
        int currentIndex;

        while(true){
            currentIndex = (lowerbound + upperbound)/2; // looking for middle part
            if(lowerbound > upperbound){
                return nums.length;
            }
            else if (nums[currentIndex] == target){
                return currentIndex;
            }
            else if(nums[currentIndex] > target ){
                // target is in the left part of the array
                upperbound = currentIndex -1;
            }
            else if(nums[currentIndex] < target ){
                // target is in the left part of the array
                lowerbound = currentIndex + 1;
            }
        }
    }


}
