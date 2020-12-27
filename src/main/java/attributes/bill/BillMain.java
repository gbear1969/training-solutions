package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.addItem(new Item("alma", 100, 400));
        bill.addItem(new Item("körte", 80, 500));
        bill.addItem(new Item("szilva", 50, 800));

        System.out.println(bill.getItemsToString());
        System.out.println(bill.calculateTotalPrice());
    }
}
