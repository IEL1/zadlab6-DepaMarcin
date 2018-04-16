/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;
import java.util.Scanner;

/**
 *
 * @author MARCIN
 */
public class Complex {
   public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
             
             System.out.println("Podaj cześć rzeczywistą pierwszej liczby zespolonej: ");
             int re = scanner.nextInt();
             System.out.println("Podaj cześć urojoną pierwszej liczby zespolonej: ");
             int im = scanner.nextInt();
             
              System.out.println("Podaj cześć rzeczywistą drugiej liczby zespolonej: ");
             int re2 = scanner.nextInt();
             System.out.println("Podaj cześć urojoną drugiej liczby zespolonej: ");
             int im2 = scanner.nextInt();
             
              System.out.println("Wybierz jakie działanie chcesz wykonać na liczbach zespolonych: ");
             System.out.println("1. Obliczanie modułu liczby zespolonej: ");
                System.out.println("2. Obliczanie liczby sprzężonej do liczby zespolonej: ");
                    System.out.println("3. Dodawanie liczb zespolonych w postaci algebraicznej: ");
                        System.out.println("4. Odejmowanie liczb zespolonych w postaci algebraicznej: ");
                            System.out.println("5. Mnożenie liczb zespolonych w postaci algebraicznej: ");
                                 System.out.println("6. Dzielenie liczb zespolonych w postaci algebraicznej: ");
                                 
             if(im>0)
             {
                  System.out.println("Liczba pierwsza: "+re+" + "+im+"i"); 
             }
             if(im<=0)
             {
                 System.out.println("Liczba pierwsza: "+re+" - "+Math.abs(im)+"i");
             }
             
              if(im2>0)
             {
                  System.out.println("Liczba druga: "+re2+" + "+im2+"i"); 
             }
             if(im2<=0)
             {
                 System.out.println("Liczba druga: "+re2+" - "+Math.abs(im2)+"i");
             }
             int wybór = scanner.nextInt();
             
             switch(wybór){
                 case 1:
                     System.out.println("Moduł pierwszej liczby zespolonej: "+Modul(re, im)+" ");
                     System.out.println("Moduł drugiej liczby zespolonej: "+Modul(re2, im2)+" ");
                     break;
                 case 2:
                     System.out.println("Sprzezenie pierwszej liczby zespolonej: ");
                     Sprzezenie(re, im);
                     System.out.println("Sprzezenie drugiej liczby zespolonej: ");
                     Sprzezenie(re2, im2);
                     break; 
                 case 3:
                 System.out.println("Suma liczb zespolonych: ");
                 Suma(re, im, re2, im2);
                 break;
                 case 4:
                 System.out.println("Różnica liczb zespolonych: ");
                 Roznica(re, im, re2, im2);
                 break;
                 case 5:
                 System.out.println("Iloczyn liczb zespolonych: ");
                 Iloczyn(re, im, re2, im2);
                 break;
                 case 6:
                 System.out.println("Iloraz liczb zespolonych: ");
                 Iloraz(re, im, re2, im2);
                 break;
             }
}
   public static double Modul(int re, int im){
return Math.sqrt(re*re+im*im);
   }
    public static void Sprzezenie(int re, int im){
        System.out.println(re+""+im*(-1) + "i");
    }
    
public static void Suma(int re, int im, int re2, int im2){
    double Re = re+re2;
    double Im = im+im2;
    System.out.println(Re+" "+Im+"i");
}
 public static void Roznica(int re, int im, int re2, int im2){
     double Re = re-re2;
     double Im = im-im2;
     System.out.println(Re+" "+Im+"i");
 }
 public static void Iloczyn(int re, int im, int re2, int im2){
      double Re = re*re2-im*im2;
      double Im = re*im2+im*re2;
      System.out.println(Re+" "+Im+"i");
 }
 public static void Iloraz(int re, int im, int re2, int im2){
     double Re = (re*re2 + im*im2)/(re2*re2+im2*im2);
     double Im = (im*re2-re*im2)/(re2*re2+im2*im2);
      System.out.println(Re+" "+Im+"i");
 }