package tsm03_J_CSSI;

import java.io.IOException;

//Immutable Foo 
final class Foo {
	private static final Helper helper = new Helper(42);

	public static Helper getHelper() { 
		return helper;
	} 
	
	public void testCase(){
		Thread test = new Thread(new Runnable() {
			public void run() {
				Foo testF = new Foo();
				testF.getHelper();
				}
			});
			   test.start();
	}
	
	public void main(String[] args) throws IOException { 
		
		testCase(); // starts thread 1 
		testCase(); // starts thread 2
	}
}
