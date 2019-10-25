package com.savitha.leetcode;

/*iven a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0 
 */
public class SearchInsertPos {
  public int searchInsert(int[] nums, int target) {
    int index = -1;
    boolean found = false;
    for (int i = 0; i < nums.length; i++) 
    {
      if (target == nums[i]) {
        index = i;
        found = true;
      }
      if(nums.length ==1)
      {
        if (target <nums[i])
            {
             index=0;
            }
        else if (target>nums[i])
        {
          index=1;
        }
      }
      
      else {
        if (found == false) {

          for (int j = 1; j < nums.length; j++) {
            int prev = nums[j - 1];
            int current = nums[j];

            if (target > nums[nums.length - 1]) {
              return nums.length;
            }
            if (target <= nums[0]) {
              return 0;
            }
            if ((prev < target) && (target < current)) {
              index = j;
              found = true;

            }
          }
        }

      }
    }

    return index;
  }

  public static void main(String[] args) {
    SearchInsertPos obj = new SearchInsertPos();
    /*
     * int[] nums={1,3,5,6}; int target=5;
     */
    int[] nums={1,3,5,6};
    //int[] nums = {1};
    int target = 0;
    int output = obj.searchInsert(nums, target);
    System.out.println(output);
  }

}
