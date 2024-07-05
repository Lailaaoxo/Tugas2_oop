/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package volumebalok;

import javax.swing.JOptionPane;

/**
 *
 * @author Laila Nur Azizah (2201010652)
 */
public class HitungVolumeBalok {
    private Double Pj, Lb, Tg,nil1, nil2,volum;
    private String status;
    public HitungVolumeBalok(String status) {
        this.status = status;
    }
    private double miss(Double volume,double nil1, double nil2){
        return volume/(nil1*nil2);
    }
    public void status_handle(){
        if(status.equals("y")){
           String inp = JOptionPane.showInputDialog("Masukkan Volume");
           String inp1 = JOptionPane.showInputDialog("Masukkan Nilai 1 yang diketahui");
           String inp2 = JOptionPane.showInputDialog("Masukkan Nilai 2 yang diketahui");
           volum=Double.valueOf(inp);
           nil1=Double.valueOf(inp1);   
           nil2=Double.valueOf(inp2);
           PrintHasil(miss(volum,nil1,nil2));
        }else{
           String inp = JOptionPane.showInputDialog("Masukkan Panjang");
           String inp1 = JOptionPane.showInputDialog("Masukkan Lebar");
           String inp2 = JOptionPane.showInputDialog("Masukkan Tinggi");
           double temp=Double.parseDouble(inp);
            setPj(temp);
           double temp1=Double.parseDouble(inp1);
            setLb(temp1);
           double temp2=Double.parseDouble(inp2);
            setTg(temp2);
           PrintHasil(hitung());
        }
    }
    private void setPj(double npj){
        Pj=npj;
    }
    private void setLb(double nlb){
        Lb=nlb;
    }
    private void setTg(double ntg){
        Tg=ntg;
    }
    double hitung(){
        return Pj*Lb*Tg;
    }
    private void PrintHasil(double hasil){
        if (status.equals("y")) {
          System.out.println("Nilai Dicari = Volume : nilai 1 * nilai 2");
          System.out.println("Nilai Dicari = "+volum+" : "+nil1+" * "+nil2);
          System.out.println("Nilai Dicari = "+hasil);  
        } else {
          System.out.println("Volume = Panjang x Lebar x Tinggi");
          System.out.println("Volume = "+Pj+" x "+Lb+" x "+Tg);
          System.out.println("Volume = "+hasil);  
        }
        
    }
}
