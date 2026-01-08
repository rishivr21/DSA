class Solution {

public:
    bool isPalindrome(int x) 
    {
        
        if(x<0){
            return false;
        }
        int rem,temp=x;
            long rev=0;
    while(x!=0)
        {
          rem = x %10;
          rev = rev*10 +rem;
         x=x/10;
        }
        if(rev==temp ){
            return true;
        }
        else{
            return false;
        }
        
    }
};
//end