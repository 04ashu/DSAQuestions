package first;

public class ArrayLeft {

	public static int[] arrayChallenge(int[] arr) {
		
		int[] result=new int[arr.length];
		result[0] = 0;
		for(int i=1;i<arr.length;i++) {
			int counter = 0;
			for(int j=0;j<=i-1;j++) {
				counter += (arr[i]-arr[j]);
			}
		result[i]=counter;	
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{2,1,3};
		System.out.println("Array given");
		for (int i : arr) {
			System.out.println(i);
		}
		
		int[] result = arrayChallenge(arr);
		System.out.println("Differnece Left Array");
		for (int i : result) {
			System.out.println(i);
		}

	}

}
