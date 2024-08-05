/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodostring;

/**
 *
 * @author Usuário
 */
public class MetodoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n***Recomenda-se nao acentuar palavras***");
        System.out.println("---------------");
        String v1 = "Sistema";
        String v2 = new String("sistema");
        System.out.println("exemplo equals");
        if(v1.equals(v2))
        {
            System.out.println("variaveis identicas"+v1+"v2"+v2);
        }else{
            System.out.println("variaveis diferntes"+v1+"v2"+v2);
        }
        System.out.println("\n-----------");
        System.out.println("equalsIgnoreCase");
        if(v1.equalsIgnoreCase(v2)){
            System.out.println("variaveis identicas!"+"v1"+v1+"v2"+v2);
        }else{
            System.out.println("variaveis diferentes"+"v1"+v1+"v2"+v2);
        }
        System.out.println("n----");
        System.out.println("indexOf, substring, charAt");
        String frase = "desenvolvimento de sistemas";
        System.out.println("desenvolvimento de sistemas");
        System.out.println("\nindexOf - posição da fonte <a>"+frase.charAt(5));
        System.out.println("\n----------");
        String titulo1 = "desenvolvimento", titulo2 = "de sistemas";
        String cursoCompleto = titulo1.concat(titulo2);
        System.out.println("\ntitulo1"+titulo1+"titulo2"+titulo2+"concat"+cursoCompleto);
    }
    
}
