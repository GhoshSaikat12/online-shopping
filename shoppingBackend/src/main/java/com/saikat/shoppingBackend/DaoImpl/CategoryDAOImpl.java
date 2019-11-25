package com.saikat.shoppingBackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.saikat.shoppingBackend.dao.CategoryDAO;
import com.saikat.shoppingBackend.dto.Category;

@Repository("CategoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public List<Category> list() {


		String selectActiveCategory = "FROM Category WHERE active=:active";
		
		Query<Category> query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active", true);
		return query.getResultList();
	}

	/*
	 * 
	 * Getting single single categoory From Database
	 */
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public boolean add(Category category) {
		
		try {
			//add Category to database here
			sessionFactory.getCurrentSession().persist(category);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(Category category) {

		try {
			//update Category to database here
			sessionFactory.getCurrentSession().update(category);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean delete(Category category) {
		try {
			//delete Category to database here
			category.setActive(false);
			sessionFactory.getCurrentSession().update(category);
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

}
