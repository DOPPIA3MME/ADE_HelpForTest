/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qarch;

/* 
 * @author Maurizio
 * @author Minieri
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.ArrayList;

public class lettura_file 
{
    FileReader e=null;
    static int j=0;                //Per poter usare la j anche in altri metodi, la j cambia per riferimento
    Path p;
    interfaccia_grafica I;
    public lettura_file() 
    {
     
    }
    
    
    
    public int apertura_file() throws IOException
    {
         
         e = new FileReader(p.PATH+"\\Quizzone.txt"); // classe per identificare il file .txt
         BufferedReader b = new BufferedReader(e); // classe adibita per la lettura del file
         int i = 0;
            
             //Questo while serve per prendere riga per riga del file
             //il rigo andrà in s e se trovo un rigo vuoto allora esco dal ciclo
            while(true) 
            {
                String s = b.readLine();
                
                if(s == null)            //condizione di uscita
                break;
                
                i++;                      //incremento
            }
            e.close();
            return i;
    }
    
    
    
    
    public void close_file() throws IOException
    {
        this.e.close();
    }
    
    
    
    public int Getj()
    {
        return j;
    }
    
    
    
    public String lettura_singola(int n) throws IOException         
    {
    
         //ATTENZIONE!! se io eseguo il progetto dal .jar devo mettere p.PATH, perchè se non lo mettessi il programma
        //andrebbe a cercare il file Quizzone.txt nella cartella in cui mi trovo... cioe in dist.
            FileReader k = new FileReader(p.PATH+"\\Quizzone.txt"); 
            BufferedReader q = new BufferedReader(k);  
            
            //questa funzione serve per dare a j un valore random compreso tra 1 a n
            j=ThreadLocalRandom.current().nextInt(1,n+1);         
            
      
          
            String s="";            //inizializzi la stringa s

            for(int i=1; i<=j ; i++) 
            {      
                s = q.readLine();            
               
                if(s == null)               //s non penso che possa mai essere null, ma vabbe
                break;
   
            }
            
            k.close();
          
            return s;       //restituisco la stringa contenente la domanda indicizzata da j
            
   }
    
    
    public String lettura_risposta(int j) throws IOException         //devo passarmi j dalla lettura_singola a qua
    {
           
            FileReader f = new FileReader(p.PATH+"\\Risposte.txt");     // classe per identificare il file .txt
            BufferedReader q = new BufferedReader(f);                      // classe adibita per la lettura del file
           
           
            String s="";            //inizializzi la stringa s

            for(int z=1; z<=j ; z++) 
            {      
                s = q.readLine();             //in s ci metto la domanda 1 poi la domanda 2 poi la 3 fino alla j-esima
               
                if(s == null)               //s non penso che possa mai essere null, ma vabbe
                break;
   
            }
            
            f.close();
           
            return s;       //restituisco la stringa contenente la domanda indicizzata da j
    
    }
    
    
    
    //ndomande sono le domande selezionate da me, e n sono le domande totali
    public void lettura_multipla(int ndomande,int n) throws IOException 
    {        
        System.out.println("Sto dentro lettura multipla\n");
    
 
         int x;
         
         int[] A=new int[ndomande];
         
        
      //Creo un vettore con dei valori random dentro, SENZA DOPPIONI   
         for(int i=0;i<ndomande;i++)
         {
               x=ThreadLocalRandom.current().nextInt(1,n+1);
                for(int j=0;j<A.length;j++)
                {
                  //se la x gia c'è nel vettore
                  if(A[j]==x)
                  {             
                     //randomizzo la x di nuovo 
                       x=ThreadLocalRandom.current().nextInt(1,n+1);
                    
                       //Perchè devo controllare il vettore dall'inizio
                       j=0;
                  }
                }   
              A[i]=x;           
         }
         
         
         
        
         int swap;
         
         
       switch(I.SCELTA)
       {
           case 1:
               
                //Ordino l'array in modo Crescente   
                    for(int i = 0; i<A.length; i++) 
                    {  
                        for(int k = i+1;k<A.length; k++) 
                        {  
                           if(A[i] > A[k])
                           {  
                                swap = A[i];  
                                A[i] = A[k];  
                                A[k] = swap;  
                           }  
                        }  
                   } 
            break;
            
            case 2:
                
                //Ordino l'array in modo Decrescente   
                    for(int i = 0; i<A.length; i++) 
                    {  
                        for(int k = i+1;k<A.length; k++) 
                        {  
                           if(A[i] < A[k])
                           {  
                                swap = A[i];  
                                A[i] = A[k];  
                                A[k] = swap;  
                           }  
                        }  
                   } 
            break;
           
       }
         
       
       
              //Stampa del vettore
          for(int i=0;i<A.length;i++)
               System.out.print("["+A[i]+"]");




          //creerò un file chiamato Multiple_Domande.txt
        //con p.PATH creerò il file nella cartella principale, se non lo mettessi lo creerei nella cartella in cui sto
        FileOutputStream f1 = new FileOutputStream(p.PATH+"\\DOMANDA MULTIPLA\\M_Domande.txt");    
        PrintStream scrivi1 = new PrintStream(f1);
       
          FileOutputStream f2 = new FileOutputStream(p.PATH+"\\DOMANDA MULTIPLA\\M_Risposte.txt");    
          PrintStream scrivi2 = new PrintStream(f2);
          
           //prendo il file quizzone.txt dalla cartella principale,ATTENZIONE se non mettessi quel Path andrebbe a cercare il file 
           //quizzone.txt nella cartella in cui ho eseguito il progetto, se infatti lo eseguo con il jar avrei avuto problemi, 
           //perchè non avrebbe trovato il file Quizzone.txt nella cartella dist, giustamente.
         FileReader f_r1 = new FileReader(p.PATH+"\\Quizzone.txt");       
         BufferedReader b1 = new BufferedReader(f_r1);
         
         FileReader f_r2 = new FileReader(p.PATH+"\\Risposte.txt");       
         BufferedReader b2 = new BufferedReader(f_r2);
              
         
          String domanda="",risposta="";
       
          
          
          for(int i=0;i<A.length;i++)
          {
             //vado a vedere cella per cella, se la prima cella del vettore conterrà 3 ...
              for(int j=0;j<A[i];j++) 
              {
                 //... scorrero' 3 righe del file Quizzone
                 domanda=b1.readLine();  
                 
                 //e 3 righe del file Risposte
                 risposta=b2.readLine();
              }
                  //e scrivero la terza riga(la domanda 3) nel file esame.txt appena creato
                   scrivi1.println(domanda);
                   scrivi2.println(risposta);
                   //torno da capo nel file, altrimenti non mi troverei piu' con le righe
                   f_r1 = new FileReader(p.PATH+"\\Quizzone.txt");
                   b1 = new BufferedReader(f_r1);
                   
                   f_r2 = new FileReader(p.PATH+"\\Risposte.txt");
                   b2 = new BufferedReader(f_r2);
          }
         
         f_r1.close();
         f_r2.close();
        
    }
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
}


 
    

    
    

