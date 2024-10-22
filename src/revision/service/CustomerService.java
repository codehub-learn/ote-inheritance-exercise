package revision.service;

import revision.model.Customer;
import revision.repository.DatabaseRepository;
import revision.repository.DatabaseRepositoryMySQL;

public class CustomerService {
    private DatabaseRepository databaseRepository;


    public CustomerService(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    public Customer getCustomer(int id){
        System.out.println("Reading customer with id..." + id);
        // returns a customer "normally":
        Customer customer = this.databaseRepository.readById(id);
        return customer;
        // OR for faster writing:
        //return databaseServiceMySQL.readById(id);
    }

    public void saveCustomer(Customer customer) {
        // incomplete, arguments are wrong (should include customer)
        //this.databaseRepository.create(customer);
        System.out.println("validating customer...");
        /*
        *
        *
        *
        *
        * */
        this.databaseRepository.create();
    }
}
