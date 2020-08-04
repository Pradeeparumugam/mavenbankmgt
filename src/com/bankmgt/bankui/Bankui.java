package com.bankmgt.bankui;

import java.util.HashMap;
import com.bankmgt.entities.*;
//import com.bankmgt.dao.*;
//import com.bankmgt.service.*;



import java.util.Map;
import java.util.Set;

public class Bankui {
	private Map<String, Customer> store = new HashMap<>();

	public static void main(String args[]) {
		Bankui m = new Bankui();
		m.fun();
	}

	public void fun() {
		Account ac1 = new Account("abcd", 1000.0);
		Account ac2 = new Account("efgh", 2000.0);
		Business bcust1 = new Business("111", "pradeep", "baddress", ac1);
		Business bcust2 = new Business("222", "pradeep2", "baddress", ac2);
		Account ac3 = new Account("dcba", 1000.0);
		Account ac4 = new Account("hgfe", 4000.0);
		Regular rcust1 = new Regular("333", "pradeep3", "raddress", ac3);
		Regular rcust2 = new Regular("444", "pradeep4", "raddress", ac4);
		store.put(bcust1.getId(), bcust1);
		store.put(bcust2.getId(), bcust2);
		store.put(rcust1.getId(), rcust1);
		store.put(rcust2.getId(), rcust2);
		displayAll();

	}

	public void displayAll() {
		Set<String> keys = store.keySet();
		for (String key : keys) {
			Customer cust = store.get(key);
			boolean isBCustomer = cust instanceof Business;
			if (isBCustomer) {
				Business bc = (Business) cust;
				display(bc);
			}
			boolean isRCustomer = cust instanceof Regular;
			if (isRCustomer) {
				Regular rc = (Regular) cust;
				display(rc);
			}
		}
	}

	public void display(Business bc) {
		String name = bc.getName();
		String id = bc.getId();
		String address = bc.getAddress();
		System.out.println("BUSINESS COUSTOMER DETAILS");
		System.out.println(name + id + address);
	}

	public void display(Regular rc) {
		String name = rc.getName();
		String id = rc.getId();
		String address = rc.getAddress();
		// Account acct=rc.getAccount();
		System.out.println("REGULAR COUSTOMER DETAILS");
		System.out.println(name + id + address);
	}
}
