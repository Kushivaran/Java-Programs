package practice;

public class MajEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,2,1,1};
		System.out.println(maj(arr));
	}
	public static int maj(int[] arr) {
		int count=0,res=0;
		for(int num:arr) {
			if(count==0) res=num;
			count+=(res==num)?1:-1;
		}
		return res;
	}

}
