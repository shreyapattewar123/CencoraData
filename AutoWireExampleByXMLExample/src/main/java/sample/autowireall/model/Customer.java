
package sample.autowireall.model;

public class Customer {
    private int custId;
    private String custName;
    private Order orders2;
    private Order orders;
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Order getOrders2() {
        return orders2;
    }

    public void setOrders2(Order orders2) {
        this.orders2= orders2;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders= orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", orders=" + orders2 +
                '}';
    }


}
