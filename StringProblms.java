package practice;
public class StringProblms {

	
	public static void pal(String str) {
		char[] arr=str.toCharArray();
		int left=0,right=arr.length-1;
		while(left<right) {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println(str+" : "+String.valueOf(arr));
	}
 
	public static void anag(String str1,String str2) {
		int[] arr=new int[256];
		if(str1.length()!=str2.length()) {
			System.out.println("not anagram..");
			return;
		}
		for(int i=0;i<str1.length();i++) {
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		for(int a:arr) {
			if(a!=0) {
				System.out.println("Not anagram.");
				return;
			}
		}
		System.out.println("Anagram");
	}
	
	
	public static void strcom(String str) {
		StringBuilder sb=new StringBuilder("");
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		sb.append(str.charAt(str.length()-1)).append(count);
		System.out.print("String com :"+sb.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pal("kushi");
		anag("kushi","kushi");
		strcom("aabbgg");
	}
}
