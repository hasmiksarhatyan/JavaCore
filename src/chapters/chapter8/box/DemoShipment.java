package chapters.chapter8.box;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol = shipment1.volume();
        System.out.println("Объeм shipment1 равен " + shipment1.volume());
        System.out.println("Bec shipment1 равен " + shipment1.weight);
        System.out.println("Cтoимocть доставки: $" + shipment1.cost);
        vol = shipment2.volume();
        System.out.println("Объeм shipment2 равен " + shipment2.volume());
        System.out.println("Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки: $" + shipment2.cost);
    }
}