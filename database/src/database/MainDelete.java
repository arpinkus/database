package database;

public class MainDelete {
	public static void main(String[] args) {
		// Session
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// Delete both Customer and associated Professor
		Customer customer = session.get(Customer.class, 1L); //assuming ID=1 exists
        if (customer != null) {
            session.delete(customer); 
        }//end if

        // Finish the transaction
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
	}
}
