package ru.netology;

public class Main {

    public static void main(String[] args) {
        Store store=new Store();
        Producer producer = new Producer(store);
        Сustomer customer1 = new Сustomer(store);
        Сustomer customer2 = new Сustomer(store);
        new Thread(customer1).start();
        new Thread(customer2).start();
        new Thread(producer).start();
    }

}
