import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double greenArea = 2 * (x * y + x * x) - 2 * 1.2 - 2 * 1.5 * 1.5;
        double redArea = x * h + 2 * x * y;
        System.out.printf("%.2f%n", greenArea / 3.4);
        System.out.printf("%.2f", redArea / 4.3);
    }
}
