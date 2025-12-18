package practice;

public class SecLar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.print(secl(arr));

	}
	public static int secl(int[] arr) {
		int fir=0,sec=0;
		for(int a:arr) {
			if(fir<a) {
				fir=a;
				sec=fir;
			}
			else if(sec<a && fir!=a) {
				sec=a;
			}
		}
		return sec;
	}

}
