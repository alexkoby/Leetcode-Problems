/**
 * Compleded 1/19/18
 * https://leetcode.com/problems/two-sum/description/
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * nums is NOT sorted
 * 
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] answer = new int [2];
        for(int i = 0; i < nums.length-1; i++ ){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return null;   
    }
}