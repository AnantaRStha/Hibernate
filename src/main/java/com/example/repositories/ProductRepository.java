package com.example.repositories;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.entities.AddressEntity;
import com.example.entities.AuthorEntity;
import com.example.entities.BooksEntity;
import com.example.entities.DrinksEntity;
import com.example.entities.ProductEntity;
import com.example.entities.VehicleEntity;
import com.example.utils.HibernateUtil;

public class ProductRepository {
	 
	//to save the product content
	public void save(ProductEntity product) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		session.close();
	}
	//to get the product using id
	public ProductEntity getById(Long Id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery("From ProductEntity p where p.id = :id", ProductEntity.class);
		query.setParameter("id", Id);
		ProductEntity productEntity = (ProductEntity)query.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return productEntity;
		
	}
	
	//to get the list of product
	public List<ProductEntity> getByCategory(String category) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery("From ProductEntity p where p.category = :category", ProductEntity.class);
		query.setParameter("category", category);
		
		List<ProductEntity> products = query.getResultList();
		session.getTransaction().commit();
		session.close();
		
		return products;
		
	}
	
	//to update the product content
	public void updateProduct(ProductEntity productEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.merge(productEntity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	//to save the vehicle content
	public void save(VehicleEntity vehicle) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
	}
	
	
	//to save the drinks content
	public void save(DrinksEntity drinks) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(drinks);
		session.getTransaction().commit();
		session.close();
	}
	
	//to save the address content
	public void save(AddressEntity address) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(address);
		session.getTransaction().commit();
		session.close();
	}
	
	//to save the author content
	public void save(AuthorEntity author) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(author);
		session.getTransaction().commit();
		session.close();
	}
	
	//to get author by id
	public AuthorEntity getByid(Long id) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery("From AuthorEntity p where p.id = :id", AuthorEntity.class);
		query.setParameter("id", id);
		AuthorEntity authorEntity = (AuthorEntity)query.getSingleResult();
		session.getTransaction().commit();
		session.close();
		return authorEntity;
		
	}
	
	//to merge address content
	public void mergeAddress(AddressEntity addressEntity) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.merge(addressEntity);
		session.getTransaction().commit();
		session.close();
		
	}
	
	//to update author content
		public void updateAuthor(AuthorEntity authorEntity) {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			session.merge(authorEntity);
			session.getTransaction().commit();
			session.close();
			
		}
	
	//to save the books content
	public void save(BooksEntity books) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(books);
		session.getTransaction().commit();
		session.close();
	}
}
