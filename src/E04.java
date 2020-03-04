import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(scan.nextLine());
        double fruitPrice = Double.parseDouble(scan.nextLine());
        int vegetableKilo = Integer.parseInt(scan.nextLine());
        int fruitKilo = Integer.parseInt(scan.nextLine());
        double totalPrice = (vegetablePrice * vegetableKilo + fruitKilo * fruitPrice) / 1.94;
        System.out.printf("%.2f", totalPrice);

    }
}
