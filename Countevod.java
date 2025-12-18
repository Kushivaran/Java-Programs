package practice;
import java.util.*;

public class Countevod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.print(evod(arr));
	}
	public static int evod(int[] arr) {
		int evc=0,odc=0;
		for(int val:arr) {
			if((val&1)==0) {
				evc++;
			}
			else odc++;
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter odd/even: ");
		String res=sc.nextLine();
		sc.close();
		if(res.equals("odd")) {
			return odc;
		}
		else if(res.equals("even")) {
			return evc;
		}
		return 0;
		
	}

}
