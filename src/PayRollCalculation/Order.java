package PayRollCalculation;

import java.util.Date;

public class Order {
    private int orderNo;
    private Date orderdate;
    private double orderAmount;
    private Commissioned commisioned;

    public Order(int orderNo, Date orderdate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderdate = orderdate;
        this.orderAmount = orderAmount;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", orderdate=" + orderdate +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
