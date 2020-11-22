
package stundent_note_calculate;

import java.util.Scanner;

public class Stundent_note_calculate {

  
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz(65 vb) :");
        int not = scn.nextInt();
        if (not >=90 && not<=100) {
            System.out.println("A+");
        }
        else if(not<90 && not>=85 ){
            System.out.println("A");
        }
          else if(not<85 && not>=70 ){
            System.out.println("A-");
        }
            else if(not<70 &&  not>=60 ){
            System.out.println("B+");
        }
            else if(not<60 &&  not>=55 ){
            System.out.println("B");
        }
            else if(not<55 &&  not>=48 ){
            System.out.println("B-");
        }
            else if(not<48 &&  not>=35 ){
            System.out.println("Şartlı C+");
        }
            else if(not<35&& not> 0){
            System.out.println("Ders tekrarı");
        }
            else if(not>100 || not<0 ){
            System.out.println("Kullanıcı hatası Öğrenci notu 0'dan küçük ve 100'den büyük olamaz");
        }
            else{
                System.out.println("Program hatası gerçekleşti...");
            }
    }
    
}
