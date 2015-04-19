/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package warnet;

/**
 *
 * @author hp
 */
public class Pembayaran {
    private String biaya;
   
    public void setbiaya(int a)throws Exception{
     if (a == 1){
         this.biaya = "Rp. 10.000";
     }   
     else if (a==2){
         this.biaya = "Rp. 15.000";
     }
     else if (a==3){
         this.biaya = "Rp. 30.000";
     }
     else{
         throw new Exception("Pilihan tidak tersedia");
     }
    }
    public String getbiaya(){
        return biaya;
    }
       
    
}