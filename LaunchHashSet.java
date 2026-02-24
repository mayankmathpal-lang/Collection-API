import java.util.*;
public class LaunchHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);     //Order of insertion will not be preserved it will be according to the Hash Fuction (No ascending or descending).
		hs.add(75);
		hs.add(125);
		hs.add(175);
		hs.add(50);
		System.out.println(hs);
		
		hs.add(50);         //Duplicates not allowed
		System.out.println(hs);

	
	}

}
