package variables;

import jdk.swing.interop.SwingInterOpUtils;

public class C01_Variables {
    public static void main(String[] args) {
        // byte,short,integer,double,float veri tiplerinin max ve min değerlini yazdiralim

        byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
        byte byteMin=Byte.MIN_VALUE;
        System.out.println("byteMİn = " + byteMin);
        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        int intMax=Integer.MAX_VALUE;
        int intMin=Integer.MIN_VALUE;

        System.out.println("intMax = " + intMax);
        System.out.println("intMin = " + intMin);

        long longMin=Long.MIN_VALUE;
        long longMax=Long.MAX_VALUE;

        System.out.println("longMin = " + longMin);
        System.out.println("longMax = " + longMax);

        double doubleMin=Double.MIN_VALUE;
        double doubleMax=Double.MAX_VALUE;

        System.out.println("doubleMin = " + doubleMin);
        System.out.println("doubleMax = " + doubleMax);

        float floatMin=Float.MIN_VALUE;
        float floatMax=Float.MAX_VALUE;

        System.out.println("floatMin = " + floatMin);
        System.out.println("floatMax = " + floatMax);



    }





}
