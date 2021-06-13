package class1;
import java.util.ArrayList;

interface IBranch {
	
	void setName(String name);
	public String getName();
	boolean newCustomer(String customerName, double initialTransaction);
	boolean addCustomerTransaction(String customerName, double transaction);
}

public class Branch implements IBranch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private String name;
	double transaction;
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	//Customer customer = new Customer(name, transaction);
	
	//constructor
	public Branch(String branchName) {
		// TODO Auto-generated constructor stub
		this.name = branchName;
		customers = new ArrayList<Customer>();
	}
	
	//getter
	public String getName() {
		return name; 
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean newCustomer(String customerName, double initialTransaction) {
	
		Customer x = new Customer(customerName, initialTransaction);
		
		for(int i = 0; i < customers.size(); i++)
		{
			if (customers.get(i) == x )
			{
				return false;
			}
		}
		
		customers.add(x);
		return true;
	}
	
	public boolean addCustomerTransaction(String customerName, double transaction) {
		
		Customer x = new Customer(customerName, this.transaction);
		
		for(int i = 0; i < customers.size(); i++)
		if (customers.get(i) == x)
		{
			return false;
		}
		
		x.addTransactions(transaction);
		return true;
	}	
	
	private String findCustomer(String customerName) {
		return customerName;
	}
}
