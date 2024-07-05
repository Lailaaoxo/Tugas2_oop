/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumebalok;

import javax.swing.JOptionPane;

/**
 *
 * @author Laila Nur Azizah (2201010652)
 */
public class VolumeBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inp = JOptionPane.showInputDialog("Apakah Diketahui Volumenya? (y/n)");
        HitungVolumeBalok ht=new HitungVolumeBalok(inp);
        ht.status_handle();
    }
    
}
