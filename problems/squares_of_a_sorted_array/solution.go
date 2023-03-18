func sortedSquares(nums[] int)[] int {
	// creating a squared array & sorting it afterwards is easy,
	// but it's more than O(n), if we want O(n) we need
	// to start at the start & end of the array
	lo, hi := 0, len(nums) - 1
	
	var res = make([] int, len(nums)) // length n
	for i := hi; i >= 0; i-- {
        loSqr, hiSqr := nums[lo] * nums[lo], nums[hi] * nums[hi]
         
		if (loSqr >= hiSqr) {
			res[i] = loSqr
            lo++
		} else {
			res[i] = hiSqr
            hi--
		}
	}
	return res

}
