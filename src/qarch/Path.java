/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qarch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

/* 
 * @author Maurizio
 * @author Minieri
 */

public class Path extends javax.swing.JFrame {

      public static String PATH = "";
  
    static String prova="";
     static String s="";
   
    
  
    public Path() 
    {
       initComponents();
      
       loadpath();
    }
     
    
    public  void savepath() throws Exception
    {
      
       //Creo il file pathsaved.txt (ATTENZIONE!! Lo creo nella cartella dove eseguo il programma)
        //se lo eseguo da netbeans si creerà nella cartella principale, se eseguo dal .jar si creerà nella cartella dist
        FileOutputStream path = new FileOutputStream("pathsaved.txt");   
        PrintStream scrivi = new PrintStream(path); 
        
          //Scrivo dentro al file appena creato quello che cè nel TestoPath
         scrivi.println(TestoPath.getText());                        
         
     
       
    }
    
    
    //questo metodo vede il file pathsaved e incolla il contentuto dentro la textfield della finestra path
    public void loadpath() 
    {
    
        try
        {
             FileReader k = new FileReader("pathsaved.txt");       //prendo il file pathsaved.txt
             BufferedReader q = new BufferedReader(k);
             
               //metto in PATH quello che c'è nel file pathsaved.txt
                      PATH = q.readLine();
 
                  //Nella textfield ci metto il PATH    
                      TestoPath.setText(PATH);       
        
        }
        catch(Exception e)
        {
        }
        
    }
    
    //public,perchè cosi può essere usata da altre classi.   static,perchè cosi si riferisce alla classe e non allistanza
    public static void deletepath() throws Exception{
         
        //Cerco il filepathsaved.txt
         FileWriter k=new FileWriter("pathsaved.txt");
         BufferedWriter q=new BufferedWriter(k);
         
         //e ci scrivo dentro ""
         q.write("");
         
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Sceglibutton = new javax.swing.JButton();
        TestoPath = new javax.swing.JTextField();
        Fattobutton = new javax.swing.JButton();
        Titolol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleziona il percorso della cartella 'Quiz Architettura Emme'");

        Sceglibutton.setText("Scegli");
        Sceglibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SceglibuttonActionPerformed(evt);
            }
        });

        Fattobutton.setText("Fatto");
        Fattobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FattobuttonActionPerformed(evt);
            }
        });

        Titolol.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Titolol.setForeground(new java.awt.Color(255, 10, 10));
        Titolol.setText("PATH");
        Titolol.setMaximumSize(new java.awt.Dimension(26, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TestoPath)
                        .addGap(18, 18, 18)
                        .addComponent(Sceglibutton)
                        .addGap(98, 98, 98))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(Fattobutton))
                    .addComponent(Titolol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titolol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TestoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sceglibutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Fattobutton)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SceglibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SceglibuttonActionPerformed
      
        //Per usare la grafica del selezionatore del mio sistema operativo
         try
         {
                       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         }
         catch(Exception e){ }
             
         
         
        
         //la classe che ci servirà per selezionare le cartelle
               JFileChooser fileChooser = new JFileChooser();
          //indica che dobbiamo scegliere solo le cartelle ( se non specificato, potranno essere selezionati solo i file)
               fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
               interfaccia_grafica i=new interfaccia_grafica();
               //mostra la finestra per scegliere la cartella
               //restituisce l'intero JFileChooser.APPROVE_OPTION solo se si ha premuto su "Apri"
               if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
               {
                      
                       TestoPath.setText(""+fileChooser.getSelectedFile()+"");
                       PATH=""+fileChooser.getSelectedFile();
                       
               }
               else
               {
               }
  
               
                  //torno alla grafica iniziale   
      try{
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());    
     }catch(Exception e){ }
       
     
    }//GEN-LAST:event_SceglibuttonActionPerformed

    private void FattobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FattobuttonActionPerformed
     
         
      
           try
          { 
             dispose();                         //LEVANDO QUESTO DISPOSE() FACCIO IN MODO CHE LA FINESTRA PATH RESTA APERTA PURE SE HO LA FINESTRA INTERFACCIA APERTA
 
            interfaccia_grafica i = new interfaccia_grafica();
            i.setVisible(true);
           
            
          
          
            savepath();                       // Per salvarti il path ogni volta
          }
          catch(Exception e){}
            
    }//GEN-LAST:event_FattobuttonActionPerformed
 
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaccia_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaccia_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaccia_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaccia_grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                         
                       //creo un'istanza della classe Path e la assegno a p
                               Path p=new Path();
                               
                                p.setVisible(true); 
                 
                                  
            }   
        });
     
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fattobutton;
    private javax.swing.JButton Sceglibutton;
    private javax.swing.JTextField TestoPath;
    private javax.swing.JLabel Titolol;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
