import java.util.ArrayList;

class Employee{
	private Integer id;
	private String name;
	private String city;
	public Employee(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
public class LaunchGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Roshan", "Mumbai"));
            employees.add(new Employee(2, "Kapil", "Delhi"));
            employees.add(new Employee(3, "Mayank", "Kolkata"));
            employees.add(new Employee(4, "Sonu", "Noida"));
            
            for (Employee e: employees) {
				System.out.println(e);
			}
	}

}
