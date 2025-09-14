public class AnimalDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Sid", 2);
        Dog myDog = new Dog("Garota", 23);
        Cat myCat = new Cat("Wendy", 4);

        System.out.println("Noises");
        System.out.println("Animal: " + myAnimal.makeNoise());
        System.out.println("Dog: " + myDog.makeNoise());
        System.out.println("Cat: " + myCat.makeNoise());
    }
}
