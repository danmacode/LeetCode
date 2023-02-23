class Solution {
  int removeDuplicates(List<int> nums) {
    int k = 0;
    if (nums.isEmpty) {
      return k;
    }
    int last = nums[0] - 123;
    //enhanced for loop
    for(final e in nums){
      if (e != last){
        nums[k++] = last = e;  
      }
    }
    return k;
  }
}