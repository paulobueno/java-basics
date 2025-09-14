public class Dog extends Animal {
    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String makeNoise() {
        return "AU AU!";
    }
}
