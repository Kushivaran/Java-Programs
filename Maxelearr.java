package practice;

public class Maxelearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,4,4};
		System.out.println(max(arr));

	}
	public static int max(int[] arr) {
		int max=arr[0];
		for(int val:arr) {
			if(max<val) max=val;
		}
		return max;
	}

}
