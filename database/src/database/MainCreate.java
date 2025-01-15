package database;

public class MainCreate {
	public static void main(String[] args) {
		// Session
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		// Create the objects
		Customer customer = new Customer("Abby P.", "Cal Poly Street");
		Professor professor = new Professor("B102", "Data Science");
		// Link OnetoOne relationship
		customer.setProfessor(professor);
		professor.setCustomer(customer);
		
		// Save Customer and Professor (due to cascade)
		session.save(customer);

		// Finish the transaction
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}//end main()
}//end MainCreate
