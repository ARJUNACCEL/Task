import java.util.Scanner;

public class Product {
       private int pid;
       private double price;
       private int quantity;

       public Product(int pid,double price, int quantity){

        this.pid=pid;
        this.price=price;
        this.quantity=quantity;

       }
       public static double findMax(Product[] p){
           double max= 0;
           for(Product pro:p){
               if(pro.price>max){
                   max= pro.price;
               }

           }

        return max;
       }
       public static double findTotal(Product[] p){
           double total =0;

           for(Product pro: p){
               total +=pro.price * pro.quantity;

           }
           return total;
       }



    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
        System.out.println("Number of different products you want to buy ?");

        int n= s.nextInt();
       Product[] p= new Product[n];

           for(int i=0;i<n;i++){
               System.out.print("Enter the Product Id -> ");
               int pid= s.nextInt();
               System.out.print("Enter the price in $ ->");
               double price= s.nextDouble();
               System.out.print("enter the quantity ->");
               int quantity = s.nextInt();
              p[i]= new Product(pid,price,quantity);
               System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           }
        System.out.printf("The product with the max price is $%.4f ",findMax(p));
        System.out.println();

        System.out.printf("The total amount spent in all of the products is $%.4f",findTotal(p));
    }
}
