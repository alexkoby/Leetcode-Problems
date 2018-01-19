/**
 * https://leetcode.com/problems/reverse-integer/description/
 * Completed 1/19/2018
 * 
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:
 * Input: 123
 * Output:  321
 * 
 * Example 2:
 * Input: -123
 * Output: -321
 * 
 * Example 3:
 * Input: 120
 * Output: 21
 * 
 * Note:
 * Assume we are dealing with an environment which could only hold integers within 
 * the 32-bit signed integer range. For the purpose of this problem, assume that your 
 * function returns 0 when the reversed integer overflows.
 */
class Solution {
    public int reverse(int x) {
        
        int digits = Integer.toString(x).length();
        int reversedNum = 0;
        
        if(x < 0){ //dont want to count extra digit for '-' if negative
            digits--;
        }
        
        while(digits>0){ //If number is 9463847412, this wont work - number will be 2147483640 = not overflow, then + 9 == overflow and                                //second two conditions check this edge case
            if(reversedNum == 2147483647 || reversedNum == -2147483648 ||
              (reversedNum == 2147483640 && x > 7) || (reversedNum == -2147483640 && x <-8)){
                return 0;
            }
            reversedNum += (x%10)*Math.pow(10, --digits);
            x /= 10;   
        }
        return reversedNum;
    }
}
