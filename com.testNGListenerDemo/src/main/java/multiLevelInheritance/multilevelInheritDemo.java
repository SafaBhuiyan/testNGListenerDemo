package multiLevelInheritance;

class GrantParent{
	
	public void grantParentMethod1(){
		System.out.println("This is from Grant Parent Method1");
	}
	
	public void grantParentMethod2(){
		System.out.println("This is from Grant Parent Method2");
	}
	
	
}

class Parent extends GrantParent {
	
	public void grantParentMethod1(){
		System.out.println("This is from Parent Method Overridding Grant Parent Method");
	}
	
}

class Child extends Parent{
	
	public void grantParentMethod1(){
		System.out.println("This is from Child Method Overridding Parent Method");
	}
	
	
}

public class multilevelInheritDemo {

	public static void main(String[] args) {
	GrantParent parent = new Parent();
	parent.grantParentMethod1();
	GrantParent child = new Child();
	child.grantParentMethod1();
	child.grantParentMethod2();

	}

}
