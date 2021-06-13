package class1;
import java.util.ArrayList;
import java.util.Iterator;

interface IBank {
	boolean addBranch(String name);
	boolean addCustomer (String branchName, String customerName, double initialTransaction);
	boolean addCustomerTransaction(String branchName, String customerName, double transaction );
	//String findBranch(String name);
	boolean listCustomers(String branchName, boolean printTransaction);
}

public class Bank implements IBank {

public static void main(String[] args) {
		
		Bank bank = new Bank("Chase Bank");
		Branch branch = new Branch("Accra");
		
		
		bank.addBranch("Akosombo");
		bank.addBranch("Koforidua");
		bank.addBranch("Tema");
		
		bank.addCustomer("Tema", "John", 50.5);
		bank.addCustomer("Tema", "Mary", 100.0);
		bank.addCustomer("Tema", "Liz", 80.25);
		
		bank.addCustomerTransaction("Tema", "John", 20.5);
		bank.addCustomerTransaction("Tema", "Mary", 0.0);
		bank.addCustomerTransaction("Tema", "Liz", 50.75);
		
		bank.listCustomers("Tema", true);
	
		
	} 
	
	private String name;
	ArrayList<Branch> branches = new ArrayList<Branch>();
	Branch branch = new Branch(name);
	
	 public Bank(String bankName) {
		this.name = bankName;
		branches = new ArrayList<Branch>();	
	}
	
	public boolean addBranch (String branchName) {	
		
		Branch x = new Branch(branchName);

		for(int i = 0; i < branches.size(); i++)
		{
			if (branches.get(i) == x )
			{
				return false;
			}
		}
			branches.add(x);
			return true;
	}
	

	public boolean addCustomer (String branchName, String customerName, double initialTransaction) {
		
		if (addBranch(branchName))
		{
			branch.newCustomer(customerName,initialTransaction);
			return true;
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double transaction ) {
		
		if (addBranch(branchName))
		{
			Customer x = new Customer(customerName, transaction);
			branch.customers.add(x);
			return true;
		}
		return false;
	}
	
	private String findBranch(String name) {
		
		Branch x = new Branch(name);
		String xString = " ";
		for(int i = 0; i < branches.size(); i++)
		{
			if(branches.get(i) == x)
			{
				xString = name;
			}
		}
		return xString;
	}
	
	public boolean listCustomers(String branchName, boolean printTransaction) {
	
		Branch branch = new Branch(branchName);
		
		if(printTransaction == true) {	
			for (int i = 0; i < branches.size(); i++)
			{
				if (branches.get(i)==branch) {
				
					System.out.println("Branch "+branchName+ " Exists!");
					
					System.out.println("Customer: "+ branch.customers);
					return true;
				}
			}
		}
		
		return false;
	}

}
