public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream("Nutelina", 10, 3);
        IceCream iceCream2 = new IceCream("ChocoMax", 20, 5);

        iceCream.addTopping("Chocochips");
        iceCream.addTopping("Caramel");
        printIceCreamInfos(iceCream);

        System.out.println();

        iceCream2.addTopping("Chocolate powder");
        iceCream2.addTopping("Candy sticks");
        iceCream2.addTopping("Marshmallow");
        printIceCreamInfos(iceCream2);
    }

    public static void printIceCreamInfos(IceCream iceCream) {
        System.out.println(" ------ " + iceCream.getName() + " ----- ");
        System.out.println("Cost: $" + iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
    }
}
