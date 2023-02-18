/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  const d = new Object();
  for (let i = 0; i < nums.length; i++)
    if (nums[i] in d) return [d[nums[i]], i];
    else d[target - nums[i]] = i;
};
