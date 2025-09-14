public class Cat extends Animal {
    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String makeNoise() {
        return "Miau!";
    }

}
