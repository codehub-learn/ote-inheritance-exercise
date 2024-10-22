package revision.repository;

import revision.model.Customer;

public class DatabaseRepositoryMySQL implements DatabaseRepository {

    @Override
    public void read() {
        System.out.println("Database read MYSQL");
    }

    @Override
    public void update() {
        System.out.println("Database update MYSQL");
    }

    @Override
    public void create() {
        System.out.println("Database create MYSQL");
    }

    @Override
    public void delete() {
        System.out.println("Database delete MYSQL");
    }

    @Override
    public Customer readById(int id) {
        System.out.println("Database read by id MYSQL");
        Customer customer = new Customer(3, "Manolhs");
        return customer;
        // OR for faster writing:
        //return new Customer(3, "Manolhs");
    }

    public void readAll(){
        System.out.println("Database read all MYSQL");
    }
}
