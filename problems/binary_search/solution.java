class Solution {
  /* O(n)
  public static int search(int[] nums, int target) {  
      final int n = nums.length;
      for (int i = 0; i < n; i++)
        if (nums[i] == target) return i;
      return -1;
  */            
  public static int search(int[] nums, int target) {
    // to achieve O(log n) we need divide & conquer
    if (nums.length == 0)
      return -1;

    int first = 0, last = nums.length;
    // divide & conquer O(log n)
    while ((last - first) > 5) {
      final int mid = (last + first) / 2; // mid or superior half
      if (nums[mid] <= target)
        first = mid;
      else
        last = mid;
    }
    // O(4)
    for (int i = first; i < last; i++)
      if (nums[i] == target)
        return i;
    return -1;
  }
}