package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import models.Product;

public class ReadFile {

		BufferedReader openFile(){
			FileReader fileReader;
			BufferedReader bufferedReader = null;
			try {
				fileReader = new FileReader("C:\\Users\\RobertoFariasdeAlmei\\eclipse-workspace\\Trabalho-ED\\src\\teste.txt");
				bufferedReader = new BufferedReader(fileReader);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return bufferedReader;
		}
	
	
	
	 public Product readAllProducts(){
		 Product product = new Product();
		try {
			
			String[] line = openFile().readLine().split(" ");
			product.setCode(Integer.parseInt(line[0]));
			product.setDesc(line[1]);
			product.setValue(Double.parseDouble(line[2]));
			System.out.println(product.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	
	
	
}
