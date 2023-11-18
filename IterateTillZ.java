// coding ninjas weekend contest 100

import java.util.Arrays;
public class Solution {
    static int[] iterateTillZ(int x, int y, int z) {
        // Write your code here.
        int count1=0;
        int [] count = new int[z];
        for(int i=1;i<=z;i++)
        {
            if(i%x==y)
            {
               count[count1] = i;
               count1++;
           
            }
            else{
                continue;
            }
        }
        return Arrays.copyOf(count, count1);
    }
}
