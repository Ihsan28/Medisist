/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medisist;
import java.awt.Color;

/**
 *
 * @author dev
 */
public class S_Screen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic her  
      Splash sp =new Splash();
        sp.setVisible(true);
        Login l=new Login();
         sp.pgbar.setForeground(new Color(38, 166, 91));
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(15);
                sp.pgnum.setText(Integer.toString(i)+"%");
                sp.pgbar.setValue(i);
                if(i==100){
                    sp.setVisible(false);
                    l.setVisible(true);
                }
        }
        }
        catch(Exception e){
            
        }
    }
    
}
