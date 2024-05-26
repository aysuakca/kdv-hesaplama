import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int para;
        Scanner inp= new Scanner(System.in);

        System.out.print("Para Değerini Giriniz :  ");
        para= inp.nextInt();

double KDV= (para >1000 ) ? 0.08 : 0.18;


        double kdvli= para*KDV+para;

        System.out.println("KDV'li Fiyat : "+kdvli);

        System.out.print("KDV Tutarı : " +KDV);






    }
}