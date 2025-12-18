package practice;
import java.util.*;
public class UnqEle {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,2,3,4,5,6};
		arr=unq(arr);
		for(int a:arr) {
			System.out.print(a);
		}
	}
	public static int[] unq(int[] arr) {
		Arrays.sort(arr);
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[j]!=arr[i]) {
				j++;
				arr[j]=arr[i];
			}
		}
		return Arrays.copyOf(arr, j+1);
	}
}
