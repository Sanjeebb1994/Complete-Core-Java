package learn.coding.arraybased;

public class ArrayShorting {
	public static void main(String[] args) {
		int[] arr= {4,8,2,9,1,6,10,3,5,7};
		//Shorting in ascending order.
		System.out.println("Array before shorting is: ");
		for (int i : arr) {
			
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
			System.out.println();
			System.out.println("Array after shorting is: ");
			for(int j : arr) {
				System.out.print(j+" ");
		}
		
	}

}
