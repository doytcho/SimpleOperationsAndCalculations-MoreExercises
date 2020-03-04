import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double degree = Double.parseDouble(scan.nextLine());
        if (degree >= 5 && degree <= 11.9) {
            System.out.println("Cold");
        } else if (degree >= 12 && degree <= 14.9) {
            System.out.println("Cool");
        } else if (degree >= 15 && degree <= 20) {
            System.out.println("Mild");
        } else if (degree >= 20.1 && degree <= 25.9) {
            System.out.println("Warm");
        } else if (degree >= 26 && degree <= 35) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}