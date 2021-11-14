/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merkez_acısı_verilen_dairenin_alani;
import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class Merkez_acısı_verilen_dairenin_alani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */
        
        int r=0,a=0;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Yarıçapı Giriniz:");
        r=input.nextInt();
        
        System.out.print("Merkez açıyı giriniz:");
        a=input.nextInt();
        
        
        double pi=3.14;
        
        double alan= (pi* (r*r) * a)/360;
        
        System.out.print("Alan:" + alan);
        
        
       
        
        
        
        
    }
    
}
