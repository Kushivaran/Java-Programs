package practice;
import java.util.*;

public class StrBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer("");
		while(true) {
			String word=sc.nextLine();
			if(word.equals("#")) {
				break;
			}
			sb.append(word+" ");
		}
		sc.close();
		System.out.println(sb.toString());
	}

}
