package revision.repository;

import revision.model.Customer;

public interface DatabaseRepository {
    void read();
    void update();
    void create();
    void delete();
    Customer readById(int id);
}
