import static org.junit.Assert.*;

import org.junit.Test;

import class1.Bank;
import class1.Branch;
import class1.Customer;

public class JUnitTest1 {

	@Test
	public void test() {
		fail("Not yet implemented");
	}


	@Test
	public void BankTest() {
		
		Bank bank = new Bank("Chase Bank");
		assertTrue(bank.addBranch("Tema"));
		assertTrue(bank.addCustomer("Tema","John",50.5));
		assertTrue(bank.addCustomer("Tema","John",50.5));
		assertTrue(bank.addCustomerTransaction("Tema","John",20.5));
		assertTrue(bank.listCustomers("Tema",true));
	}
	
	@Test
	public void BranchTest() {
		
		Branch branch = new Branch("Tema");
		assertTrue(branch.newCustomer("Mary",100.0));
		assertTrue(branch.addCustomerTransaction("Mary",0.0));	
	}

	@Test
	public void CustomerTest() {
		Customer customer = new Customer("Liz",20.25); 
		//assertEquals(customer.transactions.addTransactions(50.5));
	}
}
