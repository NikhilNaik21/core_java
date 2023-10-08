package Practice;
import java.util.ArrayList;
public class slidingWindowTrick 
{	
	    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	        ArrayList<Integer> res = new ArrayList<>();
	        int left = 0; 
	        int right = 0; 
	        int sum = 0;
	        while (right < n) 
	        {
	        	sum += arr[right];

	            while (sum > s) 
	            {
	                sum -= arr[left];
	                left++;
	            }
          
	            if (sum == s) 
	            {
	                res.add(left + 1); 
	                res.add(right + 1);
	                return res;
	            }
	            right++;
	            
	            if (right >= n && sum < s) 
	            {
	                break;
	            }
	        }
	        res.add(-1);
	        return res;
	    }

	    public static void main(String[] args) 
	    {
	        int[] arr = {1, 2, 3, 7, 5};
	        int n = arr.length;
	        int s = 12;
	        ArrayList<Integer> result = subarraySum(arr, n, s);
	        System.out.println(result.get(0) + " " + result.get(1));
	    }
	}


for Subarray with given sum greek for greek
