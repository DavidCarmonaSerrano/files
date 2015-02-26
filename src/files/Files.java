/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package files;
import java.io.*;
/**
 *
 * @author vesprada
 */
public class Files {
    
    public void palabra(){
        String palabra1="hola";
        String palabra2="";
        
        try{
            FileReader fr=new FileReader("/home/vesprada/Escritorio/files.txt");
            int valor=fr.read();

            while(valor!=-1){
                if (valor!=0){
                    palabra2=palabra2+(char)valor;
                }else{
                    if(palabra2.equals(palabra1)){
                        System.out.println("La palabra se ha encontrado");    
                    }
                    palabra2="";
                }
                valor=fr.read();
            }
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
        
    }
    public void contar(){
    try{
            FileReader fr=new FileReader("/home/vesprada/Escritorio/files.txt");
            int valor=fr.read();
            int cont=0;
            System.out.println("valor= "+valor);

            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
                cont++;
                System.out.println("valor= "+valor);
            }
            System.out.println("El texto tiene= "+cont+ " letras");
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String palabra1="mariposon";
        String palabra2="";
        
        try{
            FileReader fr=new FileReader("/home/vesprada/Escritorio/files.txt");
            int valor=0;

            while(valor!=-1){
                valor=fr.read();

                if ((valor!=32) && (valor!=-1) && (valor!=10)){
                    palabra2=palabra2+(char)valor;
                    System.out.println(""+palabra2);
                    System.out.println(valor);
                }else{
                    if(palabra2.equals(palabra1)){
                        System.out.println("La palabra se ha encontrado");    
                    }else{
                        System.out.println("No se ha encontrado");
                    }
                    palabra2="";
                }
            }
            fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
        
    }
}
