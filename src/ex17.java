import java.util.Scanner;
public class ex17 {

    public static void main(String[] args) {
//Scanner pentru tastatura
        Scanner keyBoard =new Scanner(System.in);
//total Retail
        double totalRetail=0;
        while(true){
            System.out.println("1 - Product 1, $5.00");
            System.out.println("2 - Product 2, $10.50");
            System.out.println("3 - Product 3, $99.98");
            System.out.println("4 - Product 4, $25.75.");
            System.out.println("5 - Product 5, $1.87");
            System.out.println("6 - Exit program");
            System.out.print("Enter product number: ");
            int productnumber=keyBoard.nextInt();
//exit program
            if(productnumber==6){
                break;
            }
///Enter quantity sold
            System.out.print("Enter quantity sold: ");
            int quantitySold=keyBoard.nextInt();

            switch(productnumber){
                case 1:
                    totalRetail+=2.98*quantitySold;
                    break;
                case 2:
                    totalRetail+=4.50*quantitySold;
                    break;
                case 3:
                    totalRetail+=9.98*quantitySold;
                    break;
                case 4:
                    totalRetail+=4.49*quantitySold;
                    break;
                case 5:
                    totalRetail+=6.87*quantitySold;
                    break;
            }
//display result
            System.out.println("\nThe total retail value of all products sold: $"+totalRetail);
        }
    }
}
