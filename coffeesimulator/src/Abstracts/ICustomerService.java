package Abstracts;

import Entities.Customer;

public interface ICustomerService {
	void save(Customer customer); // iki müşteri tipi de bu operasyonu gerçekleştirmek zorunda. bu yüzden interface kullanırız. 
}
