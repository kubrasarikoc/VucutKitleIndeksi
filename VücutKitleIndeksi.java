import java.util.Scanner;

public class VücutKitleIndeksi {
    public static void main(String[] args) {

        double kg, boy, vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = input.nextDouble();
        vki = kg / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " +vki);




    }
}
