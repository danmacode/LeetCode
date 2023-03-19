func moveZeroes(nums[] int) {
	// time O(n)
	var j = 0
		// every non-zero number we increment j, if i!=j, a swap occurs
	for i := 0; i < len(nums); i++ {
		if (nums[i] != 0) {
			if (i != j) {
				nums[i], nums[j] = nums[j], nums[i]
			}
			j++;
		}
	}
}
