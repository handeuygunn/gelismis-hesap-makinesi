import java.util.Scanner;

public class Main {
    static int sum(int a,int b){
        int result = a + b;
        System.out.println("Toplam:"+result);
        return result ;
    }
    static  int mines(int a, int b){
        int result =a-b;
        System.out.println("sonuc:"+ result);
        return result;
    }
    static  int times(int a, int b){
        int result = a*b;
        System.out.println("carpim:"+ result);
        return result;
    }
    static  int diveded(int a, int b){
        if (b == 0) {
            System.out.println("ikinci sayi sifirdan farkli olmali");
            return 0;
        }
        int result = a/b;
        System.out.println("bolum:"+result);
        return result;
    }
    static  int power(int a, int b){
        int result =1;
        for (int i =1; i<=b; i++){
            result *= a;
        }
        System.out.println("us alma:"+result);
        return result;
    }
    static  int mod(int a,int b){
        int result= a % b;
        System.out.println("mod alma:"+result);
        return result;
    }
    static void calc(int a,int b){
        int result1= (2*a)+(2*b);
        System.out.println("dikdortgen cevre:"+result1);
        int result2= a*b;
        System.out.println("dikdortgen alan:"+result2);
    }
    static void fac(int a){
        int result= 1;
        for (int i = 1; i<=a; i++){
            result *= i;
        }
        System.out.println("faktoriyel:"+ result);
        return;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama Islemi\n"
                + "2- Cıkarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdortgen Alan Ve Cevre Hesabı\n"
                + "0- Cıkıs Yap";
        while (true) {
            System.out.println("Bir islem seciniz:");
            select = scan.nextInt();
            if (select == 8){
                System.out.println("faktoriyel alinacak sayaiyi giriniz:");
                int a= scan.nextInt();
                fac(a);
                System.out.println("Bir islem seciniz:");
                select = scan.nextInt();
            }
            System.out.println("ilk sayiyi giriniz:");
            int a = scan.nextInt();
            System.out.println("ikinci sayiyi giriniz:");
            int b = scan.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    mines(a,b);
                    break;

                case 3:
                    times(a,b);
                    break;

                case 4:
                    diveded(a,b);
                    break;

                case 5:
                    power(a,b);
                    break;

                case 6:
                    mod(a,b);
                    break;

                case 7:
                    calc(a,b);
                    break;

                case 0:
                    System.out.println("gule gule");
                    break;
                default:

            }
        }

    }
}
