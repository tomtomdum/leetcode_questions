package com.company;

public class Lc_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i =0; i < nums.length; i++){
            for (int j =0; j < nums.length; j ++){
                if( i != j && nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        } return null;
    }
    public int[] twoSumButFaster(int[] nums, int target) {
        int[] answer = new int[2];
        int j = 1;
        for (int i =0; i < nums.length; i++){
            if( i != j && nums[i] + nums[j] == target){
                answer[0] = i;
                answer[1] = j;
                return answer;
            }
            j++;
        } return null;
    }

}
