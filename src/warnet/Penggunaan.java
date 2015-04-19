/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package warnet;

/**
 *
 * @author hp
 */
public class Penggunaan {
    private int paket;
    
    public void setpaket(int paket) throws Exception{
        System.out.println("Pilihan Paket = ");
        System.out.println(" 1 = 3 jam");
        System.out.println(" 2 = 5 jam");
        System.out.println(" 3 = 10 jam");
           
        if (paket>=1 && paket <=3){
        this.paket=paket;}
        else{
            throw new Exception("Pilihan Hanya 1 - 3");
        }
    }
    public int getpaket(){
        System.out.print("Paket anda = ");
        return paket;
    }
            
    
}
