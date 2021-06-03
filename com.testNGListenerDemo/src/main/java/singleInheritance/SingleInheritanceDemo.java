package singleInheritance;

class Parent {
	public void parentMethod1() {
		System.out.println("This is from parent Method-1");
	}
	
	public static void parentStaticMethod() {
		System.out.println("This is from Parent Static Method");
		
	}
	public final void parentFinalMethod() {
		System.out.println("This is from Parent Final Method");
		
	}
	
	private void parentPrivateMethod() {
		System.out.println("This is from Parent Private Method");
		
	}



}

class Child extends Parent {

	public void parentMethod1() {
		System.out.println("This is from child Method1 Overridding Parent Method1");
	}

	// Final Method can not be Overridden 
//	public void parentFinalMethod() {
//		System.out.println("This is from child Final Method");
//	}
	
	//Static Method can not be Overridden
//	public void parentStaticMethod() {
//		System.out.println("This is from child Method-1");
//	}

}

public class SingleInheritanceDemo {

	public static void main(String[] args) {

		Parent child = new Child();
		child.parentMethod1();
		child.parentFinalMethod();
		child.parentStaticMethod();
		//child.parentPrivateMethod();  private method is not even visible from child class
	}

}
