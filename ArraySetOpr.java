package practice;

import java.util.HashSet;

public class ArraySetOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arru={1,2,3,4,5,1,2,3,4};
		unique(arru);
		int[] selfsum= {1,2,3,4};
		sumself(selfsum);
		int[] sortarr= {4,3,5,2,1,6};
		sort(sortarr);
	}
	public static void unique(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		System.out.print("uniqe :");
		for(int a:arr) {
			set.add(a);
		}
		for(int a:set) {
			System.out.print(a);
		}
		System.out.println(" ");
	}
	public static void sumself(int[] arr) {
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		System.out.print("Sum of ele expect self :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sum-arr[i];
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
	public static void sort(int[] arr) {
		System.out.print("Sorted arr :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr)System.out.print(a);
	}

}
