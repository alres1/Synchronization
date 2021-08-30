package ru.netology;

class Producer implements Runnable{

    private int maxCars = 10;
    private int createTime = 3000;
    Store store;

    Producer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i <= maxCars; i++) {
            try {
                Thread.sleep(createTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            store.put();
        }
    }
}
