package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {2, 1, 8, -3, 6, 4, 12};
		int n = a.length;
//		boolean sorted = true;
		
		for(int i=0; i<n-1; i++) {
			boolean sorted = true;
			for(int j=0; j<n-1-i; j++) {
				
				if(a[j] > a[j+1]) {
				
				int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sorted = false;
				}	
			}
			
		if (sorted) break; 
			
		}
		
		for(int item: a) {
			System.out.print(item + " ");
		}

	}

}
