class Solution {
  int removeElement(List<int> nums, int val) {
    int i2 = 0;
    for( var i = 0; i < nums.length; i++ ) { 
      if(nums[i] != val){
        nums[i2++] = nums[i];
      }
    }
    return i2;  
  }
}