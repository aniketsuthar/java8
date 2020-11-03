import java.io.IOException;

public class Employee extends Person {
	@Override
	public String toString() {
		return "Employee [age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	private double salary;
	private String name;

	@Override
	public void sayHi(){
		// TODO Auto-generated method stub
		System.out.println("Sub Class");
	}

	public static void main(String[] args) throws IOException {
		Person p = new Employee();
		p.sayHi();
	}

}
