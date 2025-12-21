package practice;
import java.util.*;
public class RandNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(randomnum());
		System.out.println(randommath());
		System.out.println(randomimp());
	}
	public static int randomnum() {
		long time=System.nanoTime();
		return (int)(Math.sqrt(time)%1000);
	}
	public static int randommath() {
		return (int)(Math.random()*100);
	}
	public static int randomimp() {
		Random rand=new Random();
		return rand.nextInt(1,999);
	}
}
