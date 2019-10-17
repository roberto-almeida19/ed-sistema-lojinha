package dataStructures;

import models.Product;

public class NodeProduct {
	public Product product;
	public NodeProduct next;
	
	
	public NodeProduct(Product product) {
		this.product = product;
		next = null;
	}
	
	
}
