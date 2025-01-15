package database;

public class MainDeleteProduct {
	public static void main(String[] args) {
		// Session
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Delete Product
        Product product = session.get(Product.class, 1L); // assuming ID=1 exists
        if (product != null) {
            for (Order order : product.getOrders()) {
                order.getProducts().remove(product);
            }//end for-loop
            session.delete(product); // delete the product but not the orders
        }//end if

        // Finish the transaction
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
