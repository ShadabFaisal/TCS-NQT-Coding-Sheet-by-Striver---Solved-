package Arrays;

public class CountFrequencyOfEachElement {

	public static void main(String[] args) {
		int arr[] ={10,5,10,15,10,5};
	      int n = arr.length;
	      countFreq(arr,n);
	}
	public static void countFreq(int[] num, int n) {
		boolean[] visited=new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int count=1;
			
			for(int j=i+1;j<n;j++) {
				if(num[i]==num[j]) {
					visited[i]=true;
					visited[j]=true;
					count++;
				}
			}
			
			System.out.println(num[i]+"----\t" +count);
		}
		
		
		
	}

}
