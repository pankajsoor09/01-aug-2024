package pack1;

public class FlyingTest {

	public static void main(String[] args) {

		Flying obj = new Aeroplane();
		obj.fly();

		obj = new Bird();
		obj.fly();
	}

}

/* 
 * Object -- default pack java .lang no need to import// super class of all class
 * public int hashCode() according to our need to override it give hash code .two different obj can have same hash code
 * 
 * is used for identification of obj but not for unique id it might be possible there are two different obj with same hash code value.
 * when we are creating any obj in java it will get hash code value assign to it as per the hash code algorithm.
 * 
 * public Boolean equals (Object obj) -- check equality on basis of reference obj and not actual continent
 * is checking the equality on the basic of references means if 2 references are holding same obj then only it returns true otherwise false
 * 
 * public String toStirng () to convert object into class
 * 
 * public void finalize () : Garbage collector : to do clean up processing
 * 
 * Garbage collector is running on demon thread --which is running after certain time interval independent of your application state
 * Garbage collection---when there is no reference on the stack holding particular object then object is eligible for garbage collection
 * Employee emp1 = new Employee (1,"raj",34567);
 * Employee emp2 = emp1; 
 * Employee emp2 = new Employee (2,"arun",55567);
 * emp1=emp2;//after this line object created on line one will be eligible for garbage collection
 * emp1=null;
 * emp2=emp1;after this line object created on line 2nd will be eligible for garbage collection
 * 
 * protected Object clone() : to create clone/dummy object
 * 
 * clonable  interface : java .lang // it is marker interface it means which is not having any abstract method
 * all the marker in are designed for special purpose . cloneable is designed for cloning when any class will implement cloneable interface it internally supports cloning process
 * 
 *  public Class getClass() -- inbuilt class 

 * 
 */