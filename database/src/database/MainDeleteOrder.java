package database;

public class MainDeleteOrder {
	public static void main(String[] args) {
		// Session
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Delete Order
        Order order = session.get(Order.class, 1L); // assuming ID=1 exists
        if (order != null) {
            for (Product product : order.getProducts()) {
                product.getOrders().remove(order);
            }//end for-loop
            session.delete(order); // delete the order but not the products
        }//end if

        // Finish the transaction
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }//end main()
}//end MainDeleteOrder
