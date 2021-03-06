package com.teaonlinestore.dao;

public class HibernateDaoFactory implements DaoFactory {

	public CategoryDao createCategoryDao() {
		return new CategoryDaoHibernate();
	}

	public CustomerDao createCustomerDao() {
		return new CustomerDaoHibernate();
	}

	public DeliveryDao createDeliveryDao() {
		return new DeliveryDaoHibernate();
	}

	public PaymentDao createPaymentDao() {
		return new PaymentDaoHibernate();
	}

	public ProductDao createProductDao() {
		return new ProductDaoHibernate();
	}

	public PurchaseDao createPurchaseDao() {
		return new PurchaseDaoHibernate();
	}

	public StatusDao createStatusDao() {
		return new StatusDaoHibernate();
	}
	
	public CoffeDao createCoffeDao() {
		return new CoffeDaoHibernate();
	}
	
	public MakerDao createMakerDao() {
		return new MakerDaoHibernate();
	}
	
	public TeaDao createTeaDao() {
		return new TeaDaoHibernate();
	}

	public AttributeDao createAttributeDao() {
		return new AttributeDaoHibernate();
	}
}
