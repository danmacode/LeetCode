class Solution {
  public int majorityElement(int[] nums) {
    
    // time O(n) Space = O (1)
    // tf we see nums[i] more times than we don't see it, then it's the biggest one
    int count = 0;
    Integer mostSeen = null;
    
    for (int e : nums) {
      if (count == 0) mostSeen = e;
      count += (e == mostSeen) ? 1 : -1;
    }
    
    return mostSeen;
    
  }
}