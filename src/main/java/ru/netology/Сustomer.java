package ru.netology;

class Сustomer implements Runnable{

    private int maxСustomers = 5;
    private int customerTime = 5;
    Store store;

    Сustomer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i <= maxСustomers; i++) {
            try {
                Thread.sleep(customerTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.get();
        }
    }
}
