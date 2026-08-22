class Solution {
    public void sortColors(int[] num) {
        int n=num.length;

        int i, count0=0,count1 = 0 ,count2=0;
        for( i = 0; i < n ;i++)
        {

            if(num[i]==0){
                    count0++;
                }
                else if(num[i]==1){
                    count1++;
                }
                else {
                    count2++;
                }
        
         }

                for( i = 0; i<count0;i++){
                    num[i]=0;
                }
                for( i = count0;i<count0 + count1; i++){
                    num[i]=1;
                }
                for( i =count0 + count1; i<n; i++){
                    num[i]=2;
                }

            
        
    }
}