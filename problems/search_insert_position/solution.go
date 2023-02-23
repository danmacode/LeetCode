func searchInsert(nums []int, target int) int {
    var r = 0
    for i := 0; i < len(nums); i++ {
		if(nums[i] == target){
            r = i
        }else if (nums[i] < target){
            r = i + 1
        }
	}
	return r
}