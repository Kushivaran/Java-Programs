package practice;
import java.util.*;

public class Jancode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		evenint(num);
	}
	public static void evenint(int num) {
		int count=0;
		for(int i=2;i<=num;i++) {
			if((i&1)==0) {
				count++;
				if(count==2) {
					count=0;
					continue;
				}
				System.out.print(i+" ");
			}
		}
	}

}
