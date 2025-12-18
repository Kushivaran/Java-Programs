package practice;
import java.util.*;

public class ResStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.next();
		sc.close();
		System.out.println("rev :"+rev(str));
	}
	public static String rev(String name) {
		/*
		 * char[] str=name.toCharArray();
		 *  int left=0,right=name.length()-1;
		 * while(left<right) { 
		 * char temp=str[left]; 
		 * str[left]=str[right];
		 * str[right]=temp; 
		 * left++; right--; 
		 * } 
		 * String result= new String(str);
		 *  return result;
		 */
		if(name.isEmpty()) {
			return name;
		}
		return rev(name.substring(1))+name.charAt(0);
	}

}
