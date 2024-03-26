class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        res = []
        prev = 0
        for i in range(len(nums)):
            prev += nums[i]
            res.append(prev)
        return res
