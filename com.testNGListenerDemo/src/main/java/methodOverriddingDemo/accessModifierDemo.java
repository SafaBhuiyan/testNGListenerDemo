package methodOverriddingDemo;

class Animal{
	public void parentPublicMethod() {
		System.out.println("This is Parent Public Method");
	}
	
	protected void parentProtectedMethod() {
		System.out.println("This is Parent Protected Method");
	}
	 void parentDefaultMethod() {
		System.out.println("This is Parent Default Method");
	}

	private void parentPrivateMethod() {
		System.out.println("This is Parent Private Method");
	}

	
}

class Lion extends Animal{
	
	public void parentPublicMethod() {
		System.out.println("This is Child Public method ovrriding "
				+ "Parent Public Method");
	}
	
	// Default Child method can not override Public parent method
//	     void parentPublicMethod() {
//		System.out.println("This is Child Public method ovrriding Parent Public Method");
//	}
	
	
	protected void parentDefaultMethod() {
			System.out.println("This is Children Protected Method "
					+ "Overriding Parent Default Method");
		}

	
	
	
	
	
}

public class accessModifierDemo {


	public static void main(String[] args) {
		
		Animal animal = new Lion();
		animal.parentPublicMethod();
		animal.parentDefaultMethod();

	

	}

}
