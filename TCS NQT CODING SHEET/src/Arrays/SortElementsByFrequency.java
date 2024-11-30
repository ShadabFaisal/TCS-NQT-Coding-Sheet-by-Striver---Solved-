package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortElementsByFrequency {

	public static void main(String[] args) {
		
		int[] arr={1,2,3,2,4,3,1,2};
		//LinkedHashMap is used to maintain insertion order.
		Map<Integer,Integer> map=new LinkedHashMap<>();
		List<Integer> ans=new ArrayList<>();
			for(int element: arr) {
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}
			else {
				map.put(element, 1);
			}
		}
			
		map.entrySet().stream().sorted(Map.Entry.<Integer,Integer> comparingByValue().reversed()).forEach(record->{
			int key=record.getKey();
			int value=record.getValue();
			for (int i = 0; i < value; i++) {
				ans.add(key);
			}
		});
		
		System.out.println(ans);
		

	}

}

