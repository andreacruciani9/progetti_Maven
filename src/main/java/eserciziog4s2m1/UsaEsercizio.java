package eserciziog4s2m1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UsaEsercizio {
    public static void main(String[] args) {

        Product p1 = new Product(1, "il codice da vinci", "Books", 10.50);
        Product p2 = new Product(2, "Lufy One Piace 5th Gear", "boys", 40.90);
        Product p3 = new Product(3, "cluedo", "Boys", 30.50);
        Product p4 = new Product(4, "Biberon", "Baby", 12.50);
        Product p5 = new Product(5, "ciccio", "Baby", 6.50);
        Product p6 = new Product(6, "Harry Potter il calice di fuoco", "Books", 100.50);
        //creato clienti
        Custumer c1 = new Custumer(7, "Andrea", 2);
        Custumer c2 = new Custumer(8, "Simone", 2);
        Custumer c3 = new Custumer(9, "Davide", 1);
        Custumer c4 = new Custumer(10, "Fabio", 1);

        Order order =new Order(1,c1 ,"delivered", LocalDate.now(),LocalDate.now().plusDays(3),List.of(p2,p3,p6));;
        Order order1=new Order(2,c2,"consegnato", LocalDate.now(),LocalDate.now().plusDays(7),List.of(p1,p4,p3));
        Order order2=new Order(2,c3,"consegnato",LocalDate.now(),LocalDate.now().plusDays(2),List.of(p2,p5,p1));

    }


    //Stream<Order> orderStream = order.stream();

}
