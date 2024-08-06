package objectdemo;

public class Employee implements Cloneable {// it must implements cloneable interface to support cloning

	private int id;
	private String name;
	private float salary;

	public Employee() {// default constructor

	}

	public Employee(int id, String name, float salary) {// Parameterized constructor
		super(); // super statement
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int hashCode() {// return hashcode with our on logic
		return id;
	}

	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if (this.id == emp.id && this.name.equals(emp.name) && this.salary == emp.salary) {
			return true;
		}
		return false;

	}

	public String toString() {
		return "ID : " + id + ", Name : " + name + ", Salary : " + salary;
	}

	public void finalize() {
		System.out.println("Clean up processing in finalize () ");
	}
	public Employee clone () {
		return new Employee (this.id, this.name,this.salary);
	}
		

	/* public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(100, "Soor", 345678);
		System.out.println("emp1 :" + emp1);

		Employee emp2 = (Employee) emp1.clone();
		System.out.println("Clone of emp1 : " + emp2); */

	}

