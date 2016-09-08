/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp 14
 */
import java.io.*;

public class tarea1 {
    
    public static void main(String[]args)
    {
       try{
        FileReader r=new FileReader("texto.txt");
        BufferedReader br=new BufferedReader(r);
        
        String texto="";
        while(texto!=null)
        {
            texto=br.readLine();
            String x;
            x=texto;
            
            String[]arreglo=x.split(" ");
            
            for(int i=0;i<arreglo.length;i++)
            {
                System.out.println(" "+ arreglo[i]);
            }
            System.out.println("FORMA ASCENDENTE: ");
            
            for(int i=arreglo.length-1;i>0;i--)
            {
              
                
                System.out.println(" "+ arreglo[i]);
            }
            
            }
       
            
        }
        
        
        
        
          
       catch(Exception e)
          {
             System.out.println(e.getMessage());    
          }
    }
}
