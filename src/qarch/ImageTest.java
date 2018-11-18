/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qarch;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
 

/* 
 * @author Maurizio
 * @author Minieri
*/

public class ImageTest 
{
    
    public void loadimage(Integer j)
    {
        //la j la trasformo in stringa e la ci metto .jpg, in questo modo se avrò la domanda 2, imag sarà 2.jpg
        String imag= j.toString() +".jpg";
      
        
        //seleziono il percorso, che prendo dal file Path.java ovviamente vado a vedere nella cartella immagini e seleziono la 2.jpg
        ImagePanel panel = new ImagePanel(new ImageIcon(Path.PATH + "\\IMMAGINI\\"+ imag).getImage());
        JFrame frame = new JFrame();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        
        
    }
    
  
}
 





class ImagePanel extends JPanel 
{
 
  private Image img;
 
  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }
 
  //metodo che setta le caratteristiche del pannello
  public ImagePanel(Image img) 
  {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }
 
  
  // Stampa l'immagine nel pannello appena aperto
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
 
}

