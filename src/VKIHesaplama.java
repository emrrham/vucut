import java.util.Scanner;

public class VKIHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu kg cinsinden girin: ");
        double kilo = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden girin: ");
        double boy = scanner.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        scanner.close();
    }
}