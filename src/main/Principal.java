package main;

import dataStructures.LinkedListProducts;
import models.Product;

public class Principal {
	public static void main(String[] args) {
		LinkedListProducts linkedListProducts = new LinkedListProducts();
		Product product = new Product();
		product.setCode(1);
		product.setDesc("Boca de Macaco");
		product.setValue(33.00d);
		linkedListProducts.addEnd(product);
		Product product1 = new Product();
		product1.setCode(2);
		product1.setDesc("Boca de Macaco");
		product1.setValue(22.00d);
		linkedListProducts.addEnd(product1);
		linkedListProducts.printList();
	}
}
