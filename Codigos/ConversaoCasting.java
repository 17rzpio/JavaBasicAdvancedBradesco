/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaocasting;

/**
 *
 * @author Usuário
 */
public class ConversaoCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d1 = 3.14;
        int i1 = (int) d1;
        System.out.println(i1);
        System.out.println(d1);
        double nota1,nota2;
        int media;
        nota1=4.75;
        nota2=5.75;
        media = (int)(nota1+nota2)/2;
        System.out.println("media "+media);
    }
    
}
