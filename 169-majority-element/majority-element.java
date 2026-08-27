class Solution
 {
    public int majorityElement(int[] nums) 
    {
        

        int n= nums.length;
        for(int i =0 ; i<n; i++)
        {
            int cmn = 0;
            for(int j = 0; j<n; j++)
            {
                if(nums[j]==nums[i])
                {
                    cmn++;

                }
                }
                 if(cmn> n/2){
                    return nums[i];
            }
            
        }
        return-1;
    }
}