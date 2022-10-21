import java.util.Scanner;

public class main {
public static void main(String[] args) {
double panjang,lebar,kll;
double alas,tinggi,luas;
double alasj,tinggij,luasj;
Scanner input = new Scanner(System.in);
   
  System.out.println("==================MENU==================");
  System.out.println("1.Luas Segitiga");
  System.out.println("2.Keliling Persegi Panjang");
  System.out.println("3.Luas Jajar Genjang");
  System.out.println("4.Exit");
  System.out.println("======================================== ");
  System.err.print("Pilih Menu Yang Tertera Di Atas (1-4)=: ");
String pilihan = input.nextLine();


    switch (pilihan) {
        case "1" :
                    
            System.out.println("masukan alas segitiga:");
            alas = input.nextDouble();
            System.out.println("masukan Tinggi Segitiga");
            tinggi = input.nextDouble();
            
            luas = (alas*tinggi)/2;
            
            System.out.println("Luas Segitiga : " + luas);
            break;
            
        case "2":
        System.out.print("masukan panjang : ");
                    
            panjang = input.nextDouble();
            System.out.print("masukan lebar: ");
            lebar = input.nextDouble();
                    
            kll = 2*(panjang+lebar);
                    
            System.out.println("Jadi, Keliling panjang panjang : " + kll);
            break;
                    
        case "3" :
            System.out.println("masukkan nilai alasnya:");
        alasj = input.nextInt();
        
            System.out.println("masukkan nialai tingginya");
            tinggij = input.nextInt();
            luasj = (alasj*tinggij);
            System.out.println("jadi luas jajar genjang adalah:"+luasj);
         break;
         
         case "4" :
            System.exit(0);
            
    default:
    System.err.println("Kata Kunci Tidak Ada"); 
            
        
        }
     }
 }
