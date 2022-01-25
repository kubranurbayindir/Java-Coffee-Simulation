package Concreate;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean customerCheckIfEmpty(Customer customer) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getDateOfBirth().isEmpty() && !user.getNationalityId().isEmpty()) {
			return true;
		}
		System.out.println("These fields cannot be blank!");
		return false;
	}

}
