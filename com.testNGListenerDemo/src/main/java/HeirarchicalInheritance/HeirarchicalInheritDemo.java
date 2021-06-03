package HeirarchicalInheritance;


class Parent {
	
	public void parentMethod1(){
		System.out.println("This is from Parent Method1");
	}
	
}

class child1 extends Parent {
	
	public void parentMethod1(){
		System.out.println("This is from child1 Ovrridding Parent Method1");
	}
	
	
}

class child2 extends Parent{
	
	public void parentMethod1(){
		System.out.println("This is from child2 Ovrridding Parent Method1");
	}
	
	
	
}

public class HeirarchicalInheritDemo {

	public static void main(String[] args) {
	Parent child1 = new child1();
	Parent child2 = new child2();
	child1.parentMethod1();
	child2.parentMethod1();

	}

}
