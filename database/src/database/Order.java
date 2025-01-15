package database;
import java.util.List;
import java.date.DateTime; // ?

public class Order {
	// Attributes (Data)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="date")
	private DateTime date;
	
	@Column(name="customer_name")
	private String customerName;
	
	@ManyToMany
	@JoinTable(
		name = "order_product",
		joinColumns = @JoinColumn(name="order_id"),
		inverseJoinColumns = @JoinColumn(name="product_id")
	)
	private List<Product> products;
	
	public Order() {
		
	}//end constructor
	
	public Order(DateTime newDate, String newCustomerName) {
		date = newDate;
		customerName = newCustomerName;
	}//new Order(date, customerName)

	// Getters and Setters
	public DateTime getDate() {
		return date;
	}//end getDate()

	public void setDate(DateTime date) {
		this.date = date;
	}//end setDate()

	public String getCustomerName() {
		return customerName;
	}//end getCustomerName()

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}//end setCustomerName()

	public List<Product> getProducts() {
		return products;
	}//end getProducts()

	public void setProducts(List<Product> products) {
		this.products = products;
	}//end setProducts()
}//end Order
