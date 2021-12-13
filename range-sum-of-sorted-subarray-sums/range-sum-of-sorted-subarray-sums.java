// https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/

/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

class Solution {
  public static void main(String[] args) {
    
    int[] nums = new int[] {1,2,3,4};
    rangeSum(nums, 4, 1, 5); 
  }
  
  public static int rangeSum(int[] nums, int n, int left, int right) {
    
    List<Integer> summedSubArray = new ArrayList<>();
    
    for (int i = 0; i < nums.length; i++) {
      
      Integer sum = 0;
      
      for(int j = i; j < nums.length; j++) {
        sum += nums[j];
        summedSubArray.add(sum);
      }
    }
    
    Collections.sort(summedSubArray);
    
    int leftToRightSum = 0;
    
    for( int i = left-1; i < right; i++) {
    
      leftToRightSum += summedSubArray.get(i);
    }
        
    return leftToRightSum;
    }
}
