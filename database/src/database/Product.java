package database;

import java.util.List;

public class Product {
	// Attributes (Data)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
		
	@Column(name="name")
	private String name;
		
	@ManyToMany
	@JoinTable(
		name = "order_product",
		joinColumns = @JoinColumn(name="order_id"),
		inverseJoinColumns = @JoinColumn(name="product_id")
	)
	private List<Order> orders;
		
	// Constructors
	public Product() {
		
	}//end constructor
		
	public Product(String newName) {
		name = newName;
	}//end constructor(name)

	// Getters and Setters
	public String getName() {
		return name;
	}//end getName()

	public void setName(String name) {
		this.name = name;
	}//end setName()

	public List<Order> getOrders() {
		return orders;
	}//end getOrder()

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}//end setOrders()
}//end Product
