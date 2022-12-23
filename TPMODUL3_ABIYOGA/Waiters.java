package TPMODUL3_ABIYOGA;

public class Waiters implements Runnable {
    private final int orderQty, customerID;
    public static int foodPrice = 14000;

    public Waiters(int customerID, int orderQty){
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run(){
        while (true){
            getFood();
            try {
                Thread.sleep(7000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void orderInfo(){
        System.out.println("==================================================");
        System.out.println("Customer ID: "+this.customerID+"\nNumber of food: "+this.orderQty+"\nTotal Price: "+orderQty*foodPrice);
        System.out.println("==================================================");
    }

    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter: Food is ready to deliver");
            Restaurant resto = new Restaurant();
            resto.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty+1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
    
}
