import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = 1.0 * a * h / 2;
        System.out.printf("%.2f", area);
    }
}
