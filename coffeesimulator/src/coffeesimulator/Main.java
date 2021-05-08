package coffeesimulator;

import Abstracts.BaseCustomerManager;
import Adapter.MernisAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisAdapter());
		baseCustomerManager1.save(new Customer(1, "Kübra Nur", "Bayýndýr", 1998, "12345678911"));
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager(new MernisAdapter());
		baseCustomerManager2.save(new Customer(2, "Engin", "Demiroð", 1985, "12345678911"));
	}

}
