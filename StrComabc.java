package practice;
import java.util.*;
public class StrComabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		System.out.println(strcom(str));
		sc.close();
	}
	public static String strcom(String str) {
		int count=1;
		StringBuffer sb=new StringBuffer("");
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(str.charAt(str.length() - 1)).append(count);
		String res=sb.toString();
		return res;
	}

}
