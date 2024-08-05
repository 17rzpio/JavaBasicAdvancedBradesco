/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excessoes;
import java.util.Arrays;

/**
 *
 * @author Usuário
 */
public class Excecoes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(getFatoresB(a)));
    }
    public static boolean[ ] getFatoresB (int[ ] valores){
        boolean[] saida;
        saida = new boolean [valores.length];
        for (int i =0; i < valores.length; i++){
            boolean valido = true;
            try{
                int b = valores[i];
                int c = valores[i] / 2;
                int d = valores[i]/3;
                int e = b/(c-d);
            }catch(Exception ex){              valido=false;
            }finally{
                saida[i]=valido;
            }
            return saida;
        }
        return saida;
    }
}/*
//// * To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// */
//package excessoes;
//import java.util.Arrays;
//
//
//public class Excecoes {
//
//    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        int[] a = new int[] {1,2,3,4};
//        System.out.println(Arrays.toString(getFatoresB(a)));
//    }
//    public static boolean[ ] getFatoresB (int[ ] valores){
//        boolean[] saida;
//        saida = new boolean [valores.length];
//        for (int i =0; i < valores.length; i++){
//            boolean valido = true;
//            try{
//                int b = valores[i];
//                int c = valores[i] / 2;
//                int d = valores[i]/3;
//                int e = b/(c-d);
//            }catch(Exception ex){
//                valido=false;
//            }finally{
//                saida[i]=valido;
//            }
//            return saida;
//        }
//        return saida;
//    }
//}
//
//  
