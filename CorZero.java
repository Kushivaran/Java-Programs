package practice;

public class CorZero {

	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0,4};
		cozer(arr);
	}
	public static void cozer(int[] arr) {
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index++]=arr[i];
			}
		}
		while(index<arr.length) {
			arr[index++]=0;
		}
		for(int a:arr) {
			System.out.print(a+",");
		}
	}
}
