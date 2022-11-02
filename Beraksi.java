/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pbo;

/**
 *
 * @author DIPLONG
 */
public class Beraksi {
    public static void main(String[] args){
        Manager Anton1 = new Manager();
        
        Anton1.SetNama("Anton");
        Anton1.SetGajiPokok(4000000);
        Anton1.setTunjangan(5000000);
        
        Programmer anton2 = new Programmer();
        
        anton2.SetNama("Riko");
        anton2.SetGajiPokok(5000000);
        anton2.setBonus(200000);
        
        Anton1.CetakInfo();
        Anton1.CetakTunjangan();
        
        anton2.CetakInfo();
        anton2.CetakBonus();
    }
    
}
