import java.util.Scanner;
public class Hesap_makinesi {
   public static void main(String args[]){
     Scanner scan1=new Scanner(System.in);
     Scanner scan2=new Scanner(System.in);
     Scanner scan3=new Scanner(System.in);
     float sayı1;
     float sayı2;
     String işlem;
     System.out.print("Sayı giriniz=");
     sayı1=scan1.nextFloat();
     System.out.print("İşlem giriniz=");
     işlem=scan3.nextLine();
     if(işlem.equals("!")){
      int faktoriyel = 1;
      for(int i = 1; i<= sayı1; i++){
          faktoriyel = faktoriyel * i;
      }   
      System.out.println(faktoriyel);
       }
     else if(işlem.equals("abs")){
       if(sayı1<0){
         System.out.println(-1*sayı1);
       }
       if(sayı1>=0){
         System.out.println(sayı1);
       }
     }
     else{
     System.out.print("İkinci sayıyı giriniz=");
     sayı2=scan2.nextFloat();
     if (işlem.equals("+")){
      System.out.println(sayı1 + sayı2);
    }
    if (işlem.equals("-")){
      System.out.println(sayı1 - sayı2);
    }
    if (işlem.equals("*")){
      System.out.println(sayı1 * sayı2);
    }
    if (işlem.equals("/")){
      System.out.println(sayı1 / sayı2);
    }
    if (işlem.equals("p")){
      float faktoriyel1 = 1;
      float faktoriyel2=1;
      float n=sayı1-sayı2;
      float sonuç;
        for(int i = 1; i<= sayı1; i++){
            faktoriyel1 = faktoriyel1 * i;
        }
        for(int i = 1; i<= n; i++){
          faktoriyel2 = faktoriyel2 * i;
      }
        sonuç=faktoriyel1/faktoriyel2;
        System.out.println(sonuç);
    }
    if (işlem.equals("c")){
      float faktoriyel1 = 1;
      float faktoriyel2=1;
      float faktoriyel3=1;
      float n=sayı1-sayı2;
      float sonuç;
        for(int i = 1; i<= sayı1; i++){
            faktoriyel1 = faktoriyel1 * i;
        }
        for(int i = 1; i<= n; i++){
          faktoriyel2 = faktoriyel2 * i;
      }
      for(int i = 1; i<= sayı2; i++){
        faktoriyel3 = faktoriyel3 * i;
    }
      float r=faktoriyel2*faktoriyel3;
        sonuç=faktoriyel1/r;
        System.out.println(sonuç);
    }
    if(işlem.equals("exp")){
     float sonuç=1;
     for(int i=1;i<=sayı2;i++){
      sonuç=sayı1*sonuç;
     }
     System.out.println(sonuç);
    }
    }
   }
}