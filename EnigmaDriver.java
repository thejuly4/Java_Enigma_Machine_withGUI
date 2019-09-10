package FullMachine;

import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class EnigmaDriver {
    
    public static void main (String[] args){
        
        /*
        Beginning of code for starting the GUI
        Frame was generated from NetBean's Design Panel, using the Nimbus theme
        URL for page that explains the themes: http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuiFrame frame = new GuiFrame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
        
        //The program now uses the GuiFrame object to progress.
        //This was done due to the program continuing without
        //waiting for the end of the FileChooser in the GUI.
        
        
    }// end of main

    
}
