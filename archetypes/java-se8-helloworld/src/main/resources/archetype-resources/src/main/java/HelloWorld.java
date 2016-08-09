#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class HelloWorld {

	public static void main(String[] args) {
		Runnable task=()-> System.out.println("Hello, World!");

		Thread t = new Thread(task);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {}
	}
}
