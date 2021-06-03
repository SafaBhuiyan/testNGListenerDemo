package methodOverriddingDemo;

class Parent {
	
	//Co-variant return type is applicable for only Object return type
	public Object ParentMethod() {
		System.out.println("This is from Parnet Object Type Method");
	return null;
	}
	
	public int ParentIntegerMethod() {
		System.out.println("This is from Parnet Integer Type Method");
		return 0;
	
	}
	
	

}

class child extends Parent {
	

	public String ParentMethod() {
		System.out.println("This is String type Child Method Overridding "
				+ "Object type Parent Method");
		return null;
		}
	
	public int ParentIntegerMethod() {
		System.out.println("This is Integer type Child Method Overridding "
				+ "Integer type Parent Method");
		return 0;
		}

	
	//For Overriding a parent Method form Primitive data type Return Type should be exactly same
//	public float ParentIntegerMethod() {
//		System.out.println("This is Integer type Child Method Overriding "
//				+ "Integer type Parent Method");
//		return 0;
//		
//		}
	
	
	
	}



public class MethodOverridingDemo {

	public static void main(String[] args) {
	
		Parent child = new child();
		child.ParentMethod();
		child.ParentIntegerMethod();

	}

}
