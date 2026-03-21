import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer {
	  int age;
	  String name;
	  Double avg;
	  public Cricketer() {
		super();
	  }
	  public Cricketer(int age, String name, Double avg) {
		super();
		this.age = age;
		this.name = name;
		this.avg = avg;
	  }
	  @Override
	  public String toString() {
		return "Cricketer [age=" + age + ", name=" + name + ", avg=" + avg + "]";
	  }  
  }

class Alpha implements Comparator<Cricketer>
{

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
		if (c1.avg>c2.avg) {
			return 1;
			
		}
		else {
			return -1;
		}
	}	
	}
	

public class LaunchComplex1 {

	public static void main(String[] args) {
		
               ArrayList<Cricketer> list = new ArrayList<>();
               list.add(new Cricketer(36,"SKY", 56.4));
               list.add(new Cricketer(31,"Samson", 60.4));
               list.add(new Cricketer(26,"Dubey", 40.4));
               
               System.out.println(list);
               
               
               Alpha a = new Alpha();
               Collections.sort(list, a);
               System.out.println(list);
               
               Comparator<Cricketer> c=new Comparator<>()
			{
            	
        			@Override
          		public int compare(Cricketer c1, Cricketer c2)
            				{
            					if(c1.age > c2.age)
            						return 1;
            					else
            						return -1;
            				}
            				
            			};
            			Collections.sort(list, c);
            			System.out.println(list);
            			
            			Collections.sort(list,(Cricketer c1, Cricketer c2) ->
            			{
            				if(c1.age > c2.age)
    						return 1;
    					else
    						return -1;});
            			
            			System.out.println(list);
	
	}

}
