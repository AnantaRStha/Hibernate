package com.example.mains;

import java.util.List;

import com.example.entities.ProductEntity;
import com.example.repositories.ProductRepository;

public class MainApp {
		public static void main(String args[]) {
//		ProductEntity productEntity = new ProductEntity();
//		productEntity.setCode("Squareball");
//		productEntity.setName("FootBall");
//		productEntity.setCategory("Ball");
//		productEntity.setPrice(20d);
//		
//		ProductRepository productRepository = new ProductRepository();
//		productRepository.save(productEntity);
//		
			
			ProductRepository productRepository = new ProductRepository();
			ProductEntity p1 = productRepository.getById(3l);
			System.out.println(p1.toString());
		
		System.out.println("---------------------");
		
		List<ProductEntity> ball = productRepository.getByCategory("Ball");
		System.out.println("Theses are Balls:");
		
		for (ProductEntity p : ball) {
			System.out.println(p.toString());
		}
		System.out.println("**************************");
		
		p1.setName("BasketBallOne");
		productRepository.updateProduct(p1);
		
		
		
		
		}	
}
