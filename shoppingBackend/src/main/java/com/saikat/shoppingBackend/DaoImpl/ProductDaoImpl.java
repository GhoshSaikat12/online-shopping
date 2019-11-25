package com.saikat.shoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.saikat.shoppingBackend.dao.ProductDAO;
import com.saikat.shoppingBackend.dto.Category;
import com.saikat.shoppingBackend.dto.Product;


@Repository("ProductDAO")
@Transactional
public class ProductDaoImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Product get(int productID) {
		
		return sessionFactory.getCurrentSession().get(Product.class,Integer.valueOf(productID));
	}
	
	@Override
	public List<Product> list() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Product",Product.class).getResultList();
	}


	@Override
	public boolean add(Product product) {
		try {
			//add Product to database here
			sessionFactory.getCurrentSession().persist(product);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Product product) {
		try {
			//add Product to database here
			sessionFactory.getCurrentSession().update(product);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Product product) {
		try {
			//add Product to database here
			product.setActive(false);
			sessionFactory.getCurrentSession().update(product);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Product> listActiveProducts() {
		
		String selectActiveQuery="FROM Product WHERE active=:active";
		Query query= sessionFactory.getCurrentSession().createQuery(selectActiveQuery,Product.class);
		query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectActiveQuery="FROM Product WHERE active=:active AND categoryId=:categoryID";
		Query query= sessionFactory.getCurrentSession().createQuery(selectActiveQuery,Product.class);
		query.setParameter("active", true);
		query.setParameter("categoryID", categoryId);
		return query.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		String selectActiveQuery="FROM Product WHERE active=:active ORDER BY id";
		Query query= sessionFactory.getCurrentSession().createQuery(selectActiveQuery,Product.class);
		query.setParameter("active", true);
		return query.setFirstResult(0).setMaxResults(count).getResultList();
	}

}
