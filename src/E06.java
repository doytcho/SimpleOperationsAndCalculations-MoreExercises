import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceSkumria = Double.parseDouble(scan.nextLine());
        double priceCaca = Double.parseDouble(scan.nextLine());
        double palamundKilograms = Double.parseDouble(scan.nextLine());
        double safridKilograms = Double.parseDouble(scan.nextLine());
        int midiKilograms = Integer.parseInt(scan.nextLine());
        double totalPrice;
        double palamudPrice = priceSkumria * 1.6;
        double safridPrice = priceCaca * 1.8;
        totalPrice = palamudPrice * palamundKilograms + safridPrice * safridKilograms + midiKilograms * 7.5;
        System.out.printf("%.2f", totalPrice);
    }
}
