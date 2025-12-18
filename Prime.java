package practice;
import java.util.*;
public class Prime {
	public static boolean ispri(int num) {
		if(num<=1) return false;
		else if(num==2) return true;
		else if((num&1)==0) return false;
		for(int i=3;i*i<num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter num:");
		int val=sc.nextInt();
		sc.close();
		System.out.print(ispri(val)?"prime":"not prime");
	}
	
}
