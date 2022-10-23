package javasederhanatugasuts;

import java.util.Scanner;

public class JavaSederhanaTugasUts {
public static void main(String[] args) {
double r,luas;
double phi=3.14;
double sisi, luas2;
Scanner input = new Scanner(System.in);
  System.out.println("==================MENU==================");
  System.out.println("1.Luas Lingkaran");
  System.out.println("2.Luas Persegi");
  System.out.println("3.Exit");
  System.out.println("======================================== ");
  System.err.print("Pilih Menu Yang Tertera Di Atas (1-3)=: ");
String pilihan = input.nextLine();


    switch (pilihan) {
        case "1" :
                    
            System.out.print("masukan jari jari:");
            r = input.nextDouble();
            
            luas = phi*r*r;
            
            System.out.println("Luas Linkaran : " + luas);
            break;
            
        case "2":
        System.out.print("masukan panjang sisi persegi: ");      
            sisi = input.nextDouble();
            
            luas2 = sisi*sisi;
                    
            System.out.println("Jadi,luas persegi adalah : " + luas2);
            break;
         
         case "3" :
            System.exit(0);
            
    default:
    System.err.println("Kata Kunci Tidak Ada"); 
          
        
        }
     }
 }
