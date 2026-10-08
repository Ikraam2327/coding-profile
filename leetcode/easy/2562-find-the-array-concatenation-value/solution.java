class Solution {
    public long findTheArrayConcVal(int[] nums) {
       int n=nums.length;
       int low=0;
       int high=n-1;
       long con=0;
       while(low<=high){
        if(low==high){
            con+=nums[low];
        }else{
        int temp=nums[high];
        long mul=1;
        while(temp>0){
            mul*=10;
            temp=temp/10;
        }
        con+=(nums[low]*mul)+nums[high];
        }
        low++;
        high--;
        
       } 
       return con;
    }
}