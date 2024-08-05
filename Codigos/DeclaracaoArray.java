/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaracaoarray;
import java.util.Arrays;

/**
 *
 * @author Usuário
 */
public class DeclaracaoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] cursos;
        cursos = new String[4];
        cursos[0]="Redes";
        cursos[1]="internet";
        cursos[2]="sistemas";
        cursos[3]="manutencao";
        double media2=0;
        double[] notas = new double[] {7, 7.5, 9.3, 8.5};
        double[][]notas2={{4.3,3.2,1.3,4.2},{3.2,3.4,4.5,1.2}};
        notas2[0][0]=8.0;
        for(int l=0;l<notas2.length;l++){
            for(int d = 0; d < notas2[l].length; d++){
                System.out.println(notas2[l][d]);
                media2 = ((media2 + notas2[l][d])/2);
            }
        }
        System.out.println(media2);
        //------------
        char[] nomeCurso={'s','i','s','t','e','m','a'};
        char[] codigoCurso = new char[4];
        int[] codigo = {1,2,5,3};
        System.arraycopy(nomeCurso,0,codigoCurso,0,4);
        Arrays.sort(codigo);
        System.out.println( Arrays.toString(codigo));
        for(int valor2 : codigo){
            System.out.println(valor2);
        }
        //--------
        int num=491;
        System.out.println("raiz quadrada de 491 "+ Math.round(Math.sqrt(num)));
        System.out.println("exponencializaçao com euler "+Math.exp(num));
        System.out.println("\n491 elevado potencia 3 "+Math.pow(num, 3));
       
        
    }
    
}
