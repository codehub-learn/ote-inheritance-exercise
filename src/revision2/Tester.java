package revision2;

public class Tester {
    public static void main(String[] args) {
        // not possible because abstract:
        //Animal animal = new Animal("Ioannis", 2);

        Animal tiger = new Tiger("Juliette", 4, "yellow");
        tiger.introduceSelf();
    }
}
