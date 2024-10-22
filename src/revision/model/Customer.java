package revision.model;

public class Customer {
    private String name; // null
    private int id; // 0

    public Customer() {
    }

    public Customer(int id, String name) {
        this.name = "Panagiotis";
        this.id = -1;
    }

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sayMyName(){
        System.out.println(this.name);
    }

    public void sayMyName(String extraMessage){
        System.out.println(this.name + " " + extraMessage);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
