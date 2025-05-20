#Autor: Rebeca Garcia Rodríguez
#Matrícula: 14457
#Fecha: 15-Mayo-2025
#FUERZA BRUTA
from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[j] == target - nums[i]:

                    return [i, j]

solu = Solution()
nums = [3,8,12,15,7]
target = 19
result = solu.twoSum(nums, target)
print("index", result)
