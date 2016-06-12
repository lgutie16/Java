public boolean splitArray(int[] nums) {
  if(verify(nums, 0, 0, 0))
  return true;
  
  return false;
}

public boolean verify(int[] nums, int indice, int sum1, int sum2){
   if(indice>=nums.length) return (sum1==sum2);
   
   return verify(nums, indice+1, sum1, sum2 + nums[indice]) ||
    verify(nums, indice+1, sum1 + nums[indice], sum2);

}
