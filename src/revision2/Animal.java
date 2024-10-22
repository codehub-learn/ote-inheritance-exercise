package revision2;

public abstract class Animal {
    private String name;
    private int limbs;

    public Animal(String name, int limbs) {
        this.name = name;
        this.limbs = limbs;
    }

    public void introduceSelf(){
        System.out.println("Hello, I am an animal and my name is " + this.name);
    }

    // implemented by tiger
    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
}
