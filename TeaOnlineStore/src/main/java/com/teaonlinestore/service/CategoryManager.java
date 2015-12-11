package com.teaonlinestore.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;

import com.teaonlinestore.dao.CategoryDao;
import com.teaonlinestore.dao.DaoFactory;
import com.teaonlinestore.dao.HibernateDaoFactory;
import com.teaonlinestore.model.Category;
import com.teaonlinestore.utils.HibernateUtil;

public class CategoryManager implements CategoryManagerInterface {
	private static final Logger LOG = Logger.getLogger(CategoryManager.class);
	private DaoFactory daoFactory;
	private CategoryDao categoryDao;
	
	public CategoryManager() {
		this(new HibernateDaoFactory());
	}

	public CategoryManager(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
		categoryDao = daoFactory.createCategoryDao();
	}

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
		categoryDao = daoFactory.createCategoryDao();
	}

	public List<Category> getAllCategory() {
		List<Category> categories = new ArrayList<Category>();
		try {
			HibernateUtil.beginTransaction();
			categories = categoryDao.getAllCategory();
			HibernateUtil.commitTransaction();
		} catch(HibernateException ex) {
			LOG.error("Get all Category transaction field", ex);
		}
		return categories;
	}
	
	public List<Category> getCategoryByVisible(boolean visible) {
		List<Category> categories = new ArrayList<Category>();
		try {
			HibernateUtil.beginTransaction();
			categories = categoryDao.getCategoryByVisible(visible);
			HibernateUtil.commitTransaction();
		} catch(HibernateException ex) {
			LOG.error("Get all Category transaction field", ex);
		}
		return categories;
	}
}