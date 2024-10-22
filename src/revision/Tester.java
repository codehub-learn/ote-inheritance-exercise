package revision;

import revision.model.Customer;
import revision.repository.DatabaseRepository;
import revision.repository.DatabaseRepositoryMySQL;
import revision.repository.DatabaseRepostiryOracleSQL;
import revision.service.CustomerService;

public class Tester {
    public static void main(String[] args) {
        // ζωντάνευση - instantiation
        // object / instances
        DatabaseRepositoryMySQL databaseServiceMySQL = new DatabaseRepositoryMySQL();
        databaseServiceMySQL.read();

        DatabaseRepostiryOracleSQL databaseServiceOracleSQL = new DatabaseRepostiryOracleSQL();
        databaseServiceOracleSQL.read();

        DatabaseRepository db1 = new DatabaseRepositoryMySQL();
        DatabaseRepository db2 = new DatabaseRepostiryOracleSQL();

        Customer customer1 = new Customer("Elenh", 2);
        System.out.println(customer1);
        Customer customer2 = new Customer();
        System.out.println(customer2);
        Customer customer3 = new Customer(3, "Manolhs");
        System.out.println(customer3);

        customer1.sayMyName();
        customer1.sayMyName("is my name.");

        int myId = 5;
        int myInt = Integer.parseInt("5");

        //DatabaseRepostiryOracleSQL databaseRepostiryOracleSQL = new DatabaseRepostiryOracleSQL();
        // OR even better:
        DatabaseRepository databaseRepository = new DatabaseRepositoryMySQL();
        CustomerService customerService = new CustomerService(databaseRepository);
        // OR for faster writing:
        // CustomerService customerService = new CustomerService(new DatabaseRepositoryMySQL());
        Customer readCustomer = customerService.getCustomer(2);
        customerService.saveCustomer(customer1);
        customerService.saveCustomer(customer2);
        customerService.saveCustomer(customer3);
        customerService.saveCustomer(readCustomer);
        System.out.println(readCustomer);
    }
}
