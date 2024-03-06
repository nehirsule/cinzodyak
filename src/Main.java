import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int birthYear,zodiac;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        birthYear = input.nextInt();

        zodiac = (birthYear % 12);
        String horoscopce;
        if (zodiac==0) {
            horoscopce="Maymun";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }
        if (zodiac==1) {
            horoscopce="Horoz";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }
        if (zodiac==2) {
            horoscopce="Köpek";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }
        if (zodiac==3) {
            horoscopce="Domuz";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==4) {
            horoscopce="Fare";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==5) {
            horoscopce="Öküz";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==6) {
            horoscopce="Kaplan";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==7) {
            horoscopce="Tavşan";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==8) {
            horoscopce="Ejderha";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==9) {
            horoscopce="Yılan";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==10) {
            horoscopce="At";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }if (zodiac==11) {
            horoscopce="Koyun";
            System.out.println("Çin zodyağı burcunu : "+ horoscopce);
        }


    }

}
