package dataStructures;

import models.Product;

public class LinkedListProducts {
	private NodeProduct begin;

	public LinkedListProducts() {
		begin = null;
	}

	public void addEnd(Product product) {
		NodeProduct nodeProduct = new NodeProduct(product);
		if (begin == null) {
			begin = nodeProduct;
		} else {
			NodeProduct aux = begin;
			while (aux.next != null) {
				aux = aux.next;
			}
			aux.next = nodeProduct;

		}
	}

	public void printList() {
		NodeProduct aux = begin;
		while (aux != null) {
			System.out.println(aux.product.toString());
			aux = aux.next;
		}

	}
}
