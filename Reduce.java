import java.util.* ;
import java.io.*; 
public class Solution{
	public static int Reduce(int s){
		int nsum=0;
		while(s>0){
			int rem=s%10;
			nsum+=rem;
			s/=10;
		}
			
		return nsum<10?nsum:Reduce(nsum); 
		
	}
	public static int specialSum(ArrayList<Integer> arr, int n ){
        // Write your code here.
		int sum=0;
		for(int i:arr){
			sum+=i;
		}
		int r= Reduce(sum);
		return r;
	}
}
