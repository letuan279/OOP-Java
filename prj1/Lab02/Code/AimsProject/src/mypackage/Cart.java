package mypackage;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        }

        itemsOrdered[qtyOrdered++] = disc;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                if (i == qtyOrdered - 1) {
                    itemsOrdered[i] = null;
                    qtyOrdered--;
                    break;
                }
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--;
                break;
            }
        }
    }

    public float totalCost() {
        float ans = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            ans += itemsOrdered[i].getCost();
        }
        return ans;
    }

}
