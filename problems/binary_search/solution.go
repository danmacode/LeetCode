func search(nums[] int, target int) int {
    var low, high = 0, len(nums) - 1
    for {
        var mid = low + (high - low) / 2
        if (nums[mid] == target) {
            return mid
        } else if (nums[mid] < target) {
            low = mid + 1
        } else {
            high = mid -1 
        }

        if (low > high){
            break
        }
    }
    return -1
}
