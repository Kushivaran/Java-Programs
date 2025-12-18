package practice;
import java.util.*;
public class DigSin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter :");
		int num=sc.nextInt();
		System.out.print(sumd(num));
		sc.close();

	}
	public static int sumd(int num) {
		if(num<10) {
			return num;
		}
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sumd(sum);
	}

}
