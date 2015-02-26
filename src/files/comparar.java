/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package files;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author vesprada
 */
public class comparar {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        String fichero="";
        String palabra="";
        System.out.println("Dime el nombre del fichero:");
        fichero=intro.nextLine()+(".txt");
        System.out.println("Dime la palabra a buscar");
        palabra=intro.nextLine();
        try{
            FileReader fr=new FileReader("/home/vesprada/Escritorio/"+fichero);
            int valor=fr.read();
            int cont=0;
            String aux="";
            do{
                //System.out.println("Valor= "+valor);
                if (valor!=32){
                aux=aux+(char)valor;
                //System.out.println("Cadena= "+aux);
                }else{
                    if (aux.equals(palabra)){
                        cont=1;
                    }
                }
                aux="";
            
            }while ((valor!=-1 || cont!=1));
            if (cont==1){
                System.out.println("La palabra si que está en el fichero");
            }else{
                System.out.println("La palabra no esta en el fichero, prueba con otra");
            }
            
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
        
    }
    
    
}
