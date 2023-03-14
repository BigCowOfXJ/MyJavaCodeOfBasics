package HomeWork;

public class HomeWork03 {
    public static void main(String[] args) {
        
        Operation03 operation03 = new Operation03();

        operation03.getPrice();
        operation03.setPrice(45);
        operation03.getPrice();
        operation03.setPrice(110);
        operation03.getPrice();
        operation03.setPrice(210);
        operation03.getPrice();
    }
}

class Operation03{

    private double price;

    public void setPrice(double price){
        if(price >= 100 && price < 150){
            this.price = 100;
        }else if(price >= 150){
            this.price = 150;
        }else{
            this.price = price;
        }

    }

    public double getPrice(){
        System.out.println("price = " + price);
        return this.price;
    } 
}
