package eserciziog4s2m1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
        private long id;
        private String status;
        private LocalDate orderDate;
           private LocalDate     deliveryDate;
        private   Custumer clienti;
        private List<Product> productList;

    public Order(long id, Custumer clienti, String status, LocalDate orderDate, LocalDate deliveryDate,  List<Product> productList ) {

        this.id = id;
        this.clienti = clienti;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.productList = new ArrayList<Product>();

    }



        public Custumer getClienti() {
            return clienti;
        }

        public List<Product> getProductList() {
            return productList;

        }

        public LocalDate getDeliveryDate() {
            return deliveryDate;
        }

    public LocalDate getOrderDate() {
        return orderDate;
    }


    public long getId() {
            return id;
        }

        public String getStatus() {
            return status;
        }

        public void setClienti(Custumer clienti) {
            this.clienti = clienti;
        }

        public void setDeliveryDate(LocalDate deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", clienti=" + clienti +
                ", productList=" + productList +
                '}';
    }
}
