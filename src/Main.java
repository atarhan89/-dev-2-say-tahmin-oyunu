import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random rastgele = new Random();
        int rastgeleSayı =rastgele.nextInt(10);

        Scanner klavye = new Scanner(System.in);
        int tahmin;
        System.out.println("0 ile 10 arası bir sayı giriniz");
        tahmin= klavye.nextInt();


        Boolean dogruTahmin= false;


        while(!dogruTahmin){
            if( tahmin<0 || tahmin>10){
                System.out.println("lütfen 0 ile 10 arası bir rakam giriniz");
                tahmin= klavye.nextInt();
                ;}
            else if (tahmin==rastgeleSayı){
                System.out.println(" tebrikler!");
                dogruTahmin= true;

            }

            else if( tahmin<rastgeleSayı){
                System.out.println("sayının asagısında");
                tahmin= klavye.nextInt();
            }
           
            else {
                System.out.println("sayının yukarısında");
                tahmin= klavye.nextInt();
            }


        }
    }
}