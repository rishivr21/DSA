class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 1;
        int low = 0;

        for(int pile: piles){
            low = Math.max(low,pile);
        }
        int ans = low;

        while(max<=low){
                int mid = max + (low - max)/2;

                long hour = 0;

                for(int pile: piles){
                    hour += (pile + mid - 1)/mid;

                }
                if(hour<= h){
                    ans = mid;
                    low = mid -1;
                }
                else{
                    max= mid +1;
                }

        }
        return ans;
        
    }
}