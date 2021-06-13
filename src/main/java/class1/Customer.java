package class1;
import java.util.ArrayList;


interface ICustomer {
	public String getName();
	public ArrayList<Double> getTransaction();
	public void addTransactions(double transaction);
}

public class Customer implements ICustomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private String name;
	public ArrayList<Double> transactions = new ArrayList<Double>();
	
	public Customer(String customerName, double initialTransaction) {
		this.name = customerName;
		transactions = new ArrayList<Double>();
	}
	
	//getter
		public String getName() {
			return name; 
		}
		
		//getter
		public ArrayList<Double> getTransaction() {
			return transactions; 
		}
		
		public void addTransactions(double transaction) {
			transactions.add(transaction);
		}
}
