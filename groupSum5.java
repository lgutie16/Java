public boolean groupSum5(int start, int[] nums, int target){
   if(start>= nums.length) return (target == 0);
   if(nums[start] % 5 == 0){
     if(start<nums.length-1 && nums[start+1] == 1)
        return (groupSum5(start+2, nums, target-nums[start]));
     else 
        return (groupSum5(start+1, nums, target-nums[start]));
   }else if(groupSum5(start+1, nums, target-nums[start])){
            return true;   
          }else 
           return groupSum5(start+1, nums, target);
          }