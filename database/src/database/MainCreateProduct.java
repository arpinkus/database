package database;

public class MainCreateProduct {
	public static void main(String[] args) {
		// Session
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Create a Product
        Product product = new Product("Apples", 150.0);

        // Save Product
        session.save(product);

        // Finish the transaction
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }//end main()
}//end MainCreateProduct
