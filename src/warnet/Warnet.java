/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package warnet;

/**
 *
 * @author hp
 */
public class Warnet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //penggunaan
       Penggunaan a = new Penggunaan();
       try{a.setpaket(2);}
       catch(Exception e){
           System.out.println("Terjadi Error: " + e.getMessage());
       }
       //pelanggan
       Pelanggan b = new Pelanggan();
       b.setname("barry");
       
       //computer
       Computer c = new Computer();
       c.setcompName("com1");
        //operator          
       Operator d = new Operator();
       d.setnama("Derp");
       
       //Pembayaran
       Pembayaran f = new Pembayaran();
       try{f.setbiaya(2);}
       catch(Exception e){
           System.out.println("Terjadi Error: " + e.getMessage());
       }
       
       cetakpengguna(a);
       cetakpelanggan(b);
       cetakcomputer(c);
       cetakOperator(d);
       cetakpembayaran(f);
       
       
    }
    static void cetakpengguna(Penggunaan pengguna){
        System.out.println(pengguna.getpaket());
        System.out.println(" ");
    }
    static void cetakOperator(Operator operator){
        System.out.print("Operator yang siap melayani anda = ");
        System.out.println(operator.getnama());
        System.out.println(" ");
    }
    static void cetakpelanggan(Pelanggan pelanggan){
        System.out.print("nama anda adalah :");
        System.out.println(pelanggan.getnama());
        System.out.println(" ");
    }
    static void cetakcomputer(Computer computer){
        System.out.print("anda menggunakan computer :");
        System.out.println(computer.getcompName());
        System.out.println(" ");
    }
    static void cetakpembayaran(Pembayaran pembayaran){
        System.out.print("Jumlah yang harus anda bayar = ");
        System.out.println(pembayaran.getbiaya());
        System.out.println(" ");
    }
}
