import java.util.*;
public class SearchN {

	
		
		public static void main(String[] args) {
			int N=1<<20;
			int [] a= new int[N];
			for (int i=0; i<a.length; i++){
				a[i]=(int)(Math.random()*N/2);
			}
			int key= (int)(Math.random()*N/2);
			Arrays.sort(a);
			Stopwatch w1= new Stopwatch();
			System.out.println("Binary: "+Search(a, key)+" "+ w1.elapsedTime());
			w1= new Stopwatch();
			System.out.println("Sequential:"+ seqSearch(a, key)+" "+ w1.elapsedTime());
			
		}

	
	public static  int Search(int [] a, int x){
		int lo= 0;
		int hi= a.length-1;
		
		while (hi>=lo){
			int mid =lo +(hi-lo)/2;
			if(x<a[mid]) 
				hi=mid;
			else if(x>a[mid])
				lo=mid+1;
			else
				return mid;
				
		}return -1;
		
			
			
			
		}
	public static int seqSearch(int [] a, int x){
		for (int i=0; i<a.length; i++) {
			if(a[i]==x) return i;
		}return -1;
	}
		
	}


