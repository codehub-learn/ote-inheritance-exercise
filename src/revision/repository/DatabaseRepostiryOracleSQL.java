package revision.repository;

import revision.model.Customer;

public class DatabaseRepostiryOracleSQL implements DatabaseRepository {
    @Override
    public void read() {
        System.out.println("Database read ORACLE");
    }

    @Override
    public void update() {
        System.out.println("Database update ORACLE");
    }

    @Override
    public Customer readById(int id) {
        System.out.println("Database read by id ORACLE");
        Customer customer = new Customer(1, "Ioulia");
        return customer;
        // OR for faster writing:
        //return new Customer(1, "Ioulia");
    }

    @Override
    public void create() {
        System.out.println("Database create ORACLE");
    }

    @Override
    public void delete() {
        System.out.println("Database delete ORACLE");
    }
}
