package practice;
import java.util.*;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int num=sc.nextInt();
		sc.close();
		fib(num);
		
	}  
	public static void fib(int num) {
		int first=0,second=1;
		System.out.print(first+" ");
		for(int i=0;i<num;i++) {
			System.out.print(second+" ");
			int temp = first+second;
			first = second;
			second = temp;
		}
	}

}