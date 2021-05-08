package Abstracts;

import Entities.Customer;

public interface ICustomerService {
	void save(Customer customer); // iki müþteri tipi de bu operasyonu gerçekleþtirmek zorunda. bu yüzden interface kullanýrýz. 
}
