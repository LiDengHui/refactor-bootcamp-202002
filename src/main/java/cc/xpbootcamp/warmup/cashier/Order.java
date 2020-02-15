package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
    private String cName;
    private String addr;
    private List<LineItem> lineItemList;
    private double saleRate = .10;

    public Order(String cName, String addr, List<LineItem> lineItemList) {
        this.cName = cName;
        this.addr = addr;
        this.lineItemList = lineItemList;
    }

    public String getCustomerName() {
        return cName;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return lineItemList;
    }

    public double getOrderAmount() {
        double totalAmount = 0d;
        for (LineItem lineItem : this.lineItemList) {
            totalAmount += lineItem.totalAmount();
        }
        return totalAmount;
    }

    public double getSalesTax() {
        return this.getOrderAmount() * this.saleRate;
    }

    public double getTotalAmount() {
        return this.getOrderAmount() * (1 + this.saleRate);
    }

    public String getMessage() {
        StringBuilder output = new StringBuilder();
        for (LineItem lineItem : this.lineItemList) {
            output.append(lineItem.getMessage());
        }
        return output.toString();
    }
}
