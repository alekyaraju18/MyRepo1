package com.capg.dao;

import org.junit.Test;

import com.capg.bean.CustomerDetails;
import com.capg.service.WalletService;



import junit.framework.TestCase;

public class WalletDaoTest extends TestCase{
WalletService service=new WalletService();
CustomerDetails details;


	@Test
	public void testCreateAccount() {
	
		assertEquals(0,service.createAccount(details));
		assertNull(details);
		assertTrue(true);
		assertNotSame(1,service.createAccount(details));
		//fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		assertNull(details);
		assertTrue(true);
		assertEquals(0,service.login(details));
		assertNotSame(1,service.login(details));
		//fail("Not yet implemented");
	}

	@Test
	public void testDeposit() {
		assertEquals(0,service.deposit());
		assertTrue(true);
		assertNull(details);
		assertNotSame(5000,details.getBalance());
		//fail("Not yet implemented");
	}

	@Test
	public void testWithdraw() {
		assertTrue(true);
		assertFalse(false);
		assertNull(details);
		//fail("Not yet implemented");
	}

	@Test
	public void testShowBalance() {
		
		//fail("Not yet implemented");
	}

	@Test
	public void testPrintTransactions() {
		//fail("Not yet implemented");
	}

}
