package com.mycompany.examen1p1_walterdoblado;

import java.util.Scanner;

public class Examen1P1_WalterDoblado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
///comienzo del programa
        int opc = 0;

        while (opc != 2) {

            System.out.println("1. Ejercicico de palabras.");
            System.out.println("2. Salir ");
            opc = entrada.nextInt();

            switch (opc) {

                
                
                
                case 1 -> {
                  
                    String nome;
                    String nome2;
                    
                    System.out.println("ingrese una palabra");
                    nome = entrada.next();

                    System.out.println("ingrese otra palabra");
                    nome2 = entrada.next();
                    
                    String cad = palabra(nome,nome2);
                    
                        System.out.println("" + cad);
                }
                case 2 -> {
                        System.out.println("salio del codigo");
            }

        }

    }

    
//fin del programa 
}
    public static String palabra(String name, String name2) {
        
        
        
         
         String cad = "";
         
                    
String nam = "";

                    
                    
                    
                   ///comienza el if
                    

                    if (name.equalsIgnoreCase(name2)) {

                         
                        String nome = "";
                        
                        
                        
                        for (int i = name2.length() -1 ; i >= 0; i--) {
                            
                            
                            
                        /// no se que toque pero me funciono 
                            nome = nome + name2.charAt(i);
                            
                            
                             
                            nam = nome;
                          
                            
                       
                            
                           
                            
                             
                        }
                        
                       
                        cad = name + nam;
                        
                        
                      

                         
                    }
                    if (!name.equalsIgnoreCase(name2)) {
                        
                        
                        
                        
                        
                    }
                    
                    
                    if (name.length() != name2.length()){
                        
                        cad = name+name2;
                        
                        
                    }
                    
                    
            return cad;
            
    }
}


