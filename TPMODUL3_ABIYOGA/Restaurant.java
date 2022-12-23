package TPMODUL3_ABIYOGA;

public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodnumber = 1;

    @Override
    public void run() {
        while(true){
            makeFood();
            try {
                Thread.sleep(7000);
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber(){
        return foodnumber;
    }

    public void makeFood(){
        synchronized(Restaurant.lock){
            if (this.waitingForPickup){
                try {
                    System.out.println("Restaurant: Waiting for the waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("Restaurant: Making food number "+ foodnumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food\n");
            waitingForPickup = true;
        }
    }

    public static Object getLock(){
        return lock;
    }

}
