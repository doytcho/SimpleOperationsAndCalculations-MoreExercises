import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b1 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = 1.0 * (b1 + b2) * h / 2;
        System.out.printf("%.2f",area);
    }
}
