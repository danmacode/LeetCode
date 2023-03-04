class Solution {
  public int singleNumber(int[] nums) {
    // instead of increasing loadFactor to 1f, best to increase initiaalCapacity of HashSet|HashMap
    final int n = nums.length, initCap = (int) (10 / 0.75f); // 10 different digits
    final int res = nums[0];
    if (n == 1) return res;

    final Set<Integer> possible = new HashSet<>(initCap), discarded = new HashSet<>(initCap);
    for (int i = 0; i < n; i++)
      if (!discarded.contains(nums[i]))
        if (!possible.contains(nums[i])) possible.add(nums[i]);
        else {
          possible.remove(nums[i]);
          discarded.add(nums[i]);
        }

    System.out.println(possible);
    return possible.stream().findAny().get();
  }
}

