package syntaxbase;

import text.section_15.Product;

public class HelloWorld {

	public static void main(String[] args) {
	// Hello Worldと表示
		System.out.println("こんにちは");
		Product shampoo = new Product( "シャンプー", 800, 10 );
		shampoo.takeOrder(7);

	}

}
