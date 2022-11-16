package scanner;

import java.util.Scanner;

public class scanner3 {
    public static void main(String[] args) {

        //bir işi bir isci 10 günde bitiriyor. iki iscinin kac günde bitirdigini bulan program yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isci bir isi kac günde bitirmektedir.");
        int bitirmeSuresi=scan.nextInt();

        System.out.println("toplam kac isci calisacak?");

        int isciSayisi=scan.nextInt();

        int birlikteBitirmeSuresi=bitirmeSuresi/isciSayisi;

        System.out.println("birlikte bitirme suresi;"+birlikteBitirmeSuresi);

    }
}
