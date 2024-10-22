package revision2;

public class Tiger extends Animal{
    private String color;

    public Tiger(String name, int limbs, String color) {
        super(name, limbs);
        this.color = color;
    }

    public void introduceSelf(){
        super.introduceSelf();
        System.out.println("I am a tiger and my name is " + this.getName());
    }

    @Override
    public void eat() {
        // eating action
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
