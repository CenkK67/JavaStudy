package scanner;

import java.util.Scanner;

public class scanner01_Ucgen {
    public static void main(String[] args) {
        //soru:Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz.

        /*
        *         A
        *        A A
        *       A A A
        * */

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen bir karakter giriniz");
        char ch=scan.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);


        //
    }

}
