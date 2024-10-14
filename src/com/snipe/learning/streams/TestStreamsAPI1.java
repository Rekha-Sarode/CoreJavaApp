package com.snipe.learning.streams;

import java.util.*;
import java.util.stream.*;

class Product{  
	int id;  
	String name;  
	float price;  
	public Product(int id, String name, float price) {  
		this.id = id;  
		this.name = name;  
		this.price = price;  
	}  
}  

public class TestStreamsAPI1 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
		//Adding Products  
		productsList.add(new Product(1,"HP Laptop",25000f));  
		productsList.add(new Product(2,"Dell Laptop",30000f));  
		productsList.add(new Product(3,"Lenevo Laptop",28000f));  
		productsList.add(new Product(4,"Sony Laptop",28000f));  
		productsList.add(new Product(5,"Apple Laptop",90000f)); 
		// Normal way
		List<Float> productPriceList = new ArrayList<Float>();  
		for(Product product: productsList){  

			// filtering data of list  
			if(product.price<30000){  
				productPriceList.add(product.price);    // adding price to a productPriceList  
			}  
		}  
		System.out.println(productPriceList);   // displaying data  

		// Java Stream Example: Filtering Collection by using Stream
		List<Float> productPriceList2 =productsList.stream()  
				.filter(p -> p.price > 30000)// filtering data  
				.map(p->p.price)        // fetching price  
				.collect(Collectors.toList()); // collecting as list  
		System.out.println(productPriceList2);  

		// Java Stream Iterating Example
		Stream.iterate(1, element->element+1)  
		.filter(element->element%5==0)  
		.limit(5)  
		.forEach(System.out::println);  

		// Java Stream Example: Filtering and Iterating Collection
		productsList.stream()  
		.filter(product -> product.price == 30000)  
		.forEach(product -> System.out.println(product.name)); 

		// Java Stream Example : reduce() Method in Collection
		Float totalPrice = productsList.stream()  
				.map(product->product.price)  
				.reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
		System.out.println(totalPrice);  
		// More precise code   
		float totalPrice2 = productsList.stream()  
				.map(product->product.price)  
				.reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
		System.out.println(totalPrice2);  

		// Java Stream Example: Sum by using Collectors Methods
		double totalPrice3 = productsList.stream()  
				.collect(Collectors.summingDouble(product->product.price));  
		System.out.println(totalPrice3);  

		// Java Stream Example: Find Max and Min Product Price
		// max() method to get max Product price     
		Product productA = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();    
		System.out.println(productA.price);    
		// min() method to get min Product price    
		Product productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
		System.out.println(productB.price);   

		// Java Stream Example: count() Method in Collection
		//count number of products based on the filter  
		long count = productsList.stream()  
				.filter(product->product.price<30000)  
				.count();  
		System.out.println(count); 

		// Java Stream Example : Convert List into Set
		Set<Float> productPriceSet =   
				productsList.stream()  
				.filter(product->product.price < 30000)   // filter product on the base of price  
				.map(product->product.price)  
				.collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
		System.out.println(productPriceSet);  

		// Java Stream Example : Convert List into Map
		Map<Integer,String> productPriceMap =   
				productsList.stream()  
				.collect(Collectors.toMap(p->p.id, p->p.name));  
		System.out.println(productPriceMap);  
	}
}
