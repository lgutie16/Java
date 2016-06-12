public boolean groupSumClump(int start, int[] nums, int target) {
  if(start >= nums.length) return (target == 0);      
  
     if (start + 1 < nums.length && nums[start + 1] == nums[start]) {
      int contador = 0;
      int i = start;
      
      while(nums[i] == nums[start] && i < nums.length){        
          contador++;
          i++;
      }
      
   if (groupSumClump(start + contador, nums, target - nums[start] * contador))
        return true;
   else
        return groupSumClump(start + contador, nums, target);
   } else if (groupSumClump(start + 1, nums, target - nums[start]))
      return true;
    else
      return groupSumClump(start + 1, nums, target);
  
      
}