package objectdemo;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(111, "Raj", 2500000.00f);
		System.out.println("emp1 hashcode : " + emp1.hashCode());// Internally generated hashcode
		System.out.println("emp1 : "+emp1);// toString is override so it is called internally.
		//when a object is printed it  get full qualified class name -- class name with memory address ..but when toString is override ..and
		//waht ever string value is returned by toStirng is printed on console
        System.out.println();
		Employee emp2 = new Employee(112, "Raj", 2500000.00f);
		System.out.println("emp2 hashcode : " + emp2.hashCode());// Internally generated hashcode
		System.out.println("emp2 : "+emp2);
        System.out.println();
		Employee emp3 = new Employee(111, "Raj", 2500000.00f);
		System.out.println("emp1 equals emp3 : " + (emp1.equals(emp3)));
		System.out.println("emp3 : "+emp3);
		System.out.println();
		Employee emp4 = emp3;
		emp4= null;
		emp3=emp4;// now eligible for garbage collection// we cannot force garbage collector to run ..
		//but request can be made to system.gc();// it may accept request or not
		emp2=null;
        System.gc();// only request could be made to garbage collector. we cannot force

        Employee emp5 = emp1.clone();
        System.out.println("clone of emp1 : "+emp5);
        
       
        }

	}


