public boolean splitOdd10(int[] nums) {  
  if(divideTwo(nums, 0, 0, 0))
    return true;
    
  return false;
}

public boolean divideTwo(int[] nums, int indice, int Fsum, int Ssum){
  if(indice>=nums.length)
  return ((Fsum % 10 == 0 && Ssum % 2 != 0) || 
  ( Ssum % 10 == 0 && Fsum % 2 != 0));
  
  return (divideTwo(nums, indice+1, Fsum+nums[indice], Ssum) || divideTwo(nums, indice+1, Fsum, Ssum+nums[indice]));
}