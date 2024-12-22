package Methods;

public class calculate {
    public static void main(String[] args) {

        System.out.println("Toplama : " + toplama(10, 20));

        System.out.println("Çıkarma : " + cikarma(150, 515));

        System.out.println("Çarpma  : " + carpma(15165, 1516));

        System.out.println("Bölme   : " + bolme(45151, 0));


    }

    public static double bolme(double a, double b) {

        if (b == 0) {
            System.out.println("Tanımsız Değer");

        }
        return a / b;
    }

    public static int carpma(int a, int b) {
        return a * b;
    }

    public static double cikarma(double a, double b) {

        if (a < b) {
            System.out.println("a sayısı b sayıyından büyük olmalı ");
        } else {
            return a - b;
        }

        return a - b;
    }


    public static int toplama(int a, int b) {

        return a + b;


    }


}
