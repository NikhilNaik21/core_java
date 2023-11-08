import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {

 long MOD = 1000000007;
long res=1;
int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(q==1)
		{
			

				sum = sum+i;
				res = sum;
				// return sum;
		}
		else if(q==2) {
			res = (res*i)%MOD;
			
		}
	}
return res;
	}
}
