public boolean split53(int[] nums) {
  if(verify(nums, 0, 0 ,0)) return true;
  
  return false;
}

public boolean verify(int[] nums, int indice, int sum5, int sum3){
   if(indice>= nums.length) return (sum5 == sum3);
   
   if(nums[indice] % 3 == 0 && nums[indice] % 5 !=0) 
       return verify(nums, indice+1, sum5, sum3 + nums[indice]);
   else if(nums[indice] % 5 ==0) {
         return verify(nums, indice+1, sum5 + nums[indice], sum3);
   } else{
      return (verify(nums, indice + 1, sum5 + nums[indice], sum3) || 
      verify(nums, indice + 1, sum5, sum3 + nums[indice]));   
   }
      
}