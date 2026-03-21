import java.util.ArrayList;
import java.util.Collections;


class Cricketer1 implements Comparable<Cricketer1>{
	  int age;
	  String name;
	  Double avg;
	  public Cricketer1() {
		super();
	  }
	  public Cricketer1(int age, String name, Double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	  }
	  @Override
	  public String toString() {
		return "Cricketer1 [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	  }  

	  @Override
	  public int compareTo(Cricketer1 c1) {
		if (this.avg> c1.avg) {
			return 1;
		}
		 else {

		return -1;}
	  	
}

}

	
        
        
public class LaunchComplex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<Cricketer1> list = new ArrayList<>();
        list.add(new Cricketer1(36,"SKY", 56.4));
        list.add(new Cricketer1(31,"Samson", 60.4));
        list.add(new Cricketer1(26,"Dubey", 40.4));
        
          System.out.println(list);
          Collections.sort(list);
          System.out.println(list);
  
	}

}

