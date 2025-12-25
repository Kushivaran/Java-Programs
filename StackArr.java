package practice;
import java.util.*;
public class StackArr {
    private int[] arr;
    private int capacity;
    private int top;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Stack:");
		int val=sc.nextInt();
		StackArr sa=new StackArr(val);
		System.out.println("1.push\n2.pop\n3.peek\n4.isFull\n5.isEmp");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("Enter val to push:");
			int pushNum=sc.nextInt();
			sa.push(pushNum);
			break;
		case 2:
			sa.pop();
		    break;
		case 3:
			sa.peek();
			break;
		case 4:
			sa.isFull();
			break;
		case 5:
			sa.isEmp();
			break;
		default:
			System.out.println("Entered wrong");
		}
		sc.close();	
	}
	public StackArr(int size) {
		capacity=size;
		arr=new int[capacity];
		top=-1;
	}
	public void push(int num) {
		if(isFull()) {
			System.out.print("Stack is full");
			return;
		}
		arr[++top]=num;
		System.out.print("pushed element");
	}
	public int pop() {
		if(isEmp()) {
			System.out.print("Stackis empty");
			return -1;
		}
		return arr[top--];
	}
	public int peek() {
		if(isEmp()) {
			System.out.print("Stack is empty");
			return -1;
		}
		return arr[top];
	}
	public boolean isEmp() {
		return top==-1;
	}
	public boolean isFull() {
		return top==(capacity-1);
	}
}
