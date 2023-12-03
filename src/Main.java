import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Armstrong Sayı bulma programına hoş geldiniz");
        System.out.println("Bir sayı rakamlarının küpleri toplamına eşitse Armstrong Sayı denir");
        Scanner klavye = new Scanner(System.in);
        double top = 0, kalan = 0;
        System.out.println("Sisteme incelenicek sayıyı gir");
        double sayi = klavye.nextDouble();
       double sayi1=sayi*1;
        while (sayi != 0) {
            kalan = sayi % 10;
            sayi = sayi - kalan;
            sayi = sayi / 10;
            top =top+Math.pow(kalan,3);
        }
if (sayi1==top){
    System.out.println(sayi1+"Armstrong Sayıdır");
}
else {
    System.out.println(sayi1+"Armstrong Sayı Değildir");
}
















    }
}