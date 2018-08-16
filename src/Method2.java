
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Method2 {
    public static void hitung(int a, int b){
        
        System.out.println("Kecepatan :" +(a / b)+ "KM/JAM");
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Masukan jarak :");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukan waktu tempuh :");
        int bil2 = scanner.nextInt();
        
        hitung (bil1, bil2);
       
    }
}
        
        
        
    

