package Concreate;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager{
	
	 ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {	
		
		if (customerCheckService.checkCustomerInformation(customer))
        {
            System.out.println("Person Checked!");
        }else{
            System.out.println("Not a valid person!");
        }
	}
}
