import java.util.TreeSet;
public class LaunchTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                TreeSet ts = new TreeSet();
                ts.add(100);
                ts.add(50);
                ts.add(150);
                ts.add(25);
                ts.add(75);
                ts.add(125);
                ts.add(175);
                
                System.out.println(ts);
            //    ts.add(125);            // Duplicates are not allowed
            //    System.out.println(ts);
                
                System.out.println(ts.ceiling(50));  //50
                System.out.println(ts.ceiling(65));   //75
          // Ceiling will check for the nearest highest ,it will check if the element itself is present in the data set in that case it will return the element itself otherwise it will check for the nearest highest.
                
                
                System.out.println(ts.higher(50));  //75
                System.out.println(ts.higher(65));   //75
  //Highest will not check for the element itself it will only search for the nearest highest.              
                
                System.out.println(ts.floor(50));  //50
                //Same like ceiling but for lower value.
                System.out.println(ts.lower(50));  //25
                //Check for nearest lowest value.
                
                System.out.println(ts.tailSet(75));
                System.out.println(ts.headSet(75));
	}

}
