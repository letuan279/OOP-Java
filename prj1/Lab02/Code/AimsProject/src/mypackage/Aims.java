package mypackage;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Tuan", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King 2", "Anime", "Tuan", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King 3", "Anime", "Tuan", 87, 18.99f);

        anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Test remove function
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("Total Cost remain: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total Cost remain: ");
        System.out.println(anOrder.totalCost());

        System.out.println("ID of dvd1: " + dvd1.getId());
        System.out.println("ID of dvd2: " + dvd2.getId());
        System.out.println("ID of dvd3: " + dvd3.getId());

    }
}
