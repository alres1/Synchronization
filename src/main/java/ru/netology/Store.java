package ru.netology;

public class Store {

    private int car = 0;
    private int customerNumber = 0;

    public synchronized void get() {
        customerNumber++;
        System.out.println("Покупатель "+customerNumber+" зашел в автосалон");
        while (car==0) {
            try {
                System.out.println("Машин нет");
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        car--;
        System.out.println("Покупатель "+customerNumber+" купил 1 машину");
        System.out.println("Осталось машин в автосалоне: " + car);
        notify();
    }

    public synchronized void put() {
        while (car>=1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        car++;
        System.out.println("Производитель поставил 1 машину в автосалон");
        System.out.println("Стало машин в автосалоне: " + car);
        notify();
    }

}
