/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qarch;

import javax.swing.JOptionPane;

/* 
 * @author Maurizio
 * @author Minieri
 */

public class interfaccia_grafica extends javax.swing.JFrame {
  
     boolean start=false;   
     static int Error=0;                  //questa variabile si riferisce alla classe e non all'istanza 
     boolean Crescente=false;
      boolean Decrescente=false;
      static int SCELTA;
    
     
    public interfaccia_grafica() 
    {
        //initComponents() inizializzerà tutti i componenti della finestra
         initComponents();
         //questo comando serve a collegare il tasto invio della tastiera con il tasto start della finestra
         this.getRootPane().setDefaultButton(Startbuttons);   
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MyGroup = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        parentPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Startbuttons = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Rispostabutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextPane();
        ImageButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        Startbuttonm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rCrescente = new javax.swing.JRadioButton();
        rDecrescente = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(parentPanel, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SORTEGGIA LA DOMANDA: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 57, -1, -1));

        Startbuttons.setText("START");
        Startbuttons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartbuttonsActionPerformed(evt);
            }
        });
        jPanel1.add(Startbuttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 53, 90, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 411, 10));

        Rispostabutton.setText("RISPOSTA");
        Rispostabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RispostabuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Rispostabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, -1));

        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 330, 64));

        ImageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qarch/ICONA Immagine.png"))); // NOI18N
        ImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qarch/singola_img.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -26, 530, 350));

        jTabbedPane1.addTab("DOMANDA SINGOLA", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("DIGITA IL NUMERO DI DOMANDE DESIDERATO: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 60, 280, -1));

        jSpinner1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSpinner1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 57, 60, -1));

        Startbuttonm.setText("START");
        Startbuttonm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                StartbuttonmStateChanged(evt);
            }
        });
        Startbuttonm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartbuttonmActionPerformed(evt);
            }
        });
        jPanel2.add(Startbuttonm, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 161, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("—");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 430, 18));

        MyGroup.add(rCrescente);
        rCrescente.setText("Crescente");
        rCrescente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rCrescenteStateChanged(evt);
            }
        });
        rCrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCrescenteActionPerformed(evt);
            }
        });
        jPanel2.add(rCrescente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        MyGroup.add(rDecrescente);
        rDecrescente.setText("Descrescente");
        rDecrescente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDecrescenteStateChanged(evt);
            }
        });
        rDecrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDecrescenteActionPerformed(evt);
            }
        });
        jPanel2.add(rDecrescente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("In DOMANDA MULTIPLA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qarch/multipla_img.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -26, 530, 350));

        jTabbedPane1.addTab("DOMANDA MULTIPLA", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    //questo codice riguarderà le azioni che fa il tasto start della domanda multipla
    private void StartbuttonmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartbuttonmActionPerformed
         
         lettura_file a= new lettura_file();
         int sp1 =(Integer) jSpinner1.getValue();   
      
        try
        {
          int n=a.apertura_file();
          
          if(sp1>n)  
          {
               jLabel3.setText("—");
               JOptionPane.showMessageDialog(null, "Il numero di domande desiderate è maggiore rispetto al numero delle domande esistenti", "Error", JOptionPane.ERROR_MESSAGE);
          }
          else if(sp1<0)
          {
               jLabel3.setText("—");
               JOptionPane.showMessageDialog(null, "Non ha senso", "Error", JOptionPane.ERROR_MESSAGE);
          }
          else
          {
              
             if(Crescente==true)
             {
                  SCELTA=1;
                  jLabel3.setText("Creato in modo crescente M_Domande.txt e M_Risposte.txt");
             }
             else if(Decrescente==true)
             {
                  SCELTA=2;
                  jLabel3.setText("Creato in modo decrescente M_Domande.txt e M_Risposte.txt");
             }
             else
             {
                  jLabel3.setText("Creato M_Domande.txt e M_Risposte.txt");
             }
               a.lettura_multipla(sp1,n);
          }
              a.close_file();
        }
        catch (Exception e)
        {
        }
        

    }//GEN-LAST:event_StartbuttonmActionPerformed

    
    
    private void RispostabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RispostabuttonActionPerformed
        
        //Se il tasto start non e' stato premuto oppure non e' stato trovato il file quizzione.txt 
         if(start==false||Error==1)
         {
            JOptionPane.showMessageDialog(null, "Non c'e' alcuna domanda", "Error", JOptionPane.ERROR_MESSAGE);
         }
         else
         {
          //Creo un'istanza della classe risposta e la assegno alla variabile r (che è del tipo opportuno)
            risposta r=new risposta(); 
            r.setVisible(true);
         }

    }//GEN-LAST:event_RispostabuttonActionPerformed

    
    
     
     
      //questo codice riguarderà le azioni che fa il tasto start della domanda singola
    private void StartbuttonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartbuttonsActionPerformed
       
        start = true;
        
                                            
        lettura_file a= new lettura_file();

        
        String risultato="";
        int j=0;
    
             
             
        try
        {
            int n=a.apertura_file();               //in n ci metto il numero di domande totali (cioè la i)
            risultato=a.lettura_singola(n);       //in risultato metterò quindi la stringa s trovata nella funzione lettura_singola()

        
            jTextArea1.setText(risultato);        //metto nella sezione area di testo la stringa
         
        }
        catch(Exception e)
        {
            
            try 
            {
                //Per richiamare il metodo deletepath(), deve essere statico!!!
                Path.deletepath();
            } 
            catch (Exception ex) {}


            Error=1;
            JOptionPane.showMessageDialog(null, "Il file Quizzone.txt non esiste. Nella finestra PATH devi selezionare la cartella Quiz Architettura Emme", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
          
          
          
    }//GEN-LAST:event_StartbuttonsActionPerformed

    private void ImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageButtonActionPerformed
      
        
         ImageTest i= new ImageTest();
        // i.setVisible(true);
     
        
       if(start==false||Error==1)
             JOptionPane.showMessageDialog(null, "Non c'e' alcuna domanda", "Error", JOptionPane.ERROR_MESSAGE);
        else if(lettura_file.j==1||lettura_file.j==2||lettura_file.j==3||lettura_file.j==8||lettura_file.j==9||lettura_file.j==10||lettura_file.j==14)
            //Uso il metodo loadimage passandoci dentro la j presa del file lettura_file.java
            i.loadimage(lettura_file.j);
           else
              JOptionPane.showMessageDialog(null, "Immagine non trovata", "Sorry", JOptionPane.INFORMATION_MESSAGE);
          
    
        
        
    }//GEN-LAST:event_ImageButtonActionPerformed

    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
       
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
      jLabel3.setText("—");
    }//GEN-LAST:event_jSpinner1StateChanged

    private void StartbuttonmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_StartbuttonmStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_StartbuttonmStateChanged

    private void rDecrescenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDecrescenteStateChanged
        
    }//GEN-LAST:event_rDecrescenteStateChanged

    private void rCrescenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rCrescenteStateChanged
       
    }//GEN-LAST:event_rCrescenteStateChanged

    private void rCrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCrescenteActionPerformed
         jLabel3.setText("—");
         Crescente=true;
         Decrescente=false;
         
    }//GEN-LAST:event_rCrescenteActionPerformed

    private void rDecrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDecrescenteActionPerformed
         jLabel3.setText("—");
         Decrescente=true;
         Crescente=false;
    }//GEN-LAST:event_rDecrescenteActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImageButton;
    private javax.swing.ButtonGroup MyGroup;
    private javax.swing.JButton Rispostabutton;
    private javax.swing.JButton Startbuttonm;
    private javax.swing.JButton Startbuttons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextArea1;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JRadioButton rCrescente;
    private javax.swing.JRadioButton rDecrescente;
    // End of variables declaration//GEN-END:variables
}
