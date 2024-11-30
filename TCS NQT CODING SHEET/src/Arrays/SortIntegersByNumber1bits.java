package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.LinkedHashMap;

public class SortIntegersByNumber1bits {

	public static void main(String[] args) {
		int[] arr= {1633,2181,7558,2650,1920,809,4903,2223,4271,4110,7564,5428,1730,5970,9640,3185,7564,5040,4344,9479,2070,6569,9849,73,2961,7991,9419,7946,3293,882,4714,3813,278,6121,9244,8248,5424,2377,4270,7656,1983,2928,2876,4746,129,5971,522,349,1239,9493,4777,1421,1763,8419,5696,726,6130,9164,5290,6793,3670,3090,3395,5597,7557,6246,956,7791,677,2284,7280,5309,8274,1760,2383,7003,4094,1681,8885,3010,1551,7419,813,9937,7054,9615,8126,2739,3255,334,587,634,3382,3316,4630,6077,4687,2226,8910,8357,1961,1454,6416,8838,6295,4523,9736,6165,2849,7877};
		int[] ans=sortByBits(arr);
		System.out.println(Arrays.toString(ans));
	}
	 public static int[] sortByBits(int[] arr) {
		   
	        Arrays.sort(arr);
	        ArrayList<Integer> ans=new ArrayList<>();
	        Map<Integer, Integer> map=new LinkedHashMap<>();
	        
	        for(int i=0;i<arr.length;i++){
	            int n=arr[i];
	            int count=countSetBits(n);
	            map.put(n, count);
	            }
	        
	        map.entrySet().stream().sorted(Map.Entry.<Integer,Integer> comparingByValue()).forEach(record->{
	            int key=record.getKey();
				ans.add(key);
			});
	        System.out.println(ans);
	        int[] result = ans.stream().mapToInt(i -> i).toArray();
	        return result;
	        
	    }
	    static int countSetBits(int n)
	    {
	        int count = 0;
	        while (n > 0) {
	            count += n & 1;
	            n >>= 1;
	        }
	        return count;
	    }

}
