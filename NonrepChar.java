package practice;

public class NonrepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonre("kushivaran"));
	}
	public static char nonre(String str) {
		int[] arr=new int[256];
		for(char a:str.toLowerCase().toCharArray()) {
			arr[a]++;
		}
		for(char a:str.toLowerCase().toCharArray()) {
			if(arr[a]==1) {
				return a;
			}
		}
		return '\0';
	}

}
