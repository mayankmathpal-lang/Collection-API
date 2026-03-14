
class Generics<T>
{
	private T ref;
	
	  public Generics(T ref) {
		// TODO Auto-generated constructor stub
		  this.ref=ref;
		  
	}  
	  public void disp() {
		System.out.println("The type of t is: "+ref.getClass().getName());
	}

	  public T getRef() {
		  return ref;
	  }
}

public class LaunchGenerics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Generics<Integer> g= new Generics<>(44); 
            g.disp();
           System.out.println(g.getRef());
            
	}

}
