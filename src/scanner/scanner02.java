package scanner;

import java.util.Scanner;

public class scanner02 {

    public static void main(String[] args) {
        //kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");

        int num =scan.nextInt();
        int ilkIkirkm=num/1000;
        System.out.println(ilkIkirkm);

        int ilkIkiTop=(ilkIkirkm%10)+(ilkIkirkm/10);
        System.out.println(ilkIkiTop);
        int sonIkiRkm=num%100;
        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println(sonIkiTop);
        int tumRkmTop=ilkIkiTop+sonIkiTop;
        System.out.println(tumRkmTop);




    }
}
