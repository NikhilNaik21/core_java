import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
    int res=0;
    int count=0;
        for( int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
               res =i;
                count++;

                if(count==2)
                {
                   return res=0;
                }
                return res;
            }
           
        }
         return -1;
    }
}
