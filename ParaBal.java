package practice;
import java.util.*;
public class ParaBal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter '{[()]}' from this : ");
		String parastring=sc.nextLine();
		sc.close();
		map.put("Open", 0);
		map.put("close", 0);
		for(char s:parastring.toCharArray()) {
			if(s=='('||s=='{'||s=='[') {
				map.put("Open", map.get("Open")+1);
			}
			else if(s==')'||s=='}'||s==']') {
				map.put("close", map.get("close")+1);
			}
		}
		if(map.get("Open")==map.get("close")) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}
}
