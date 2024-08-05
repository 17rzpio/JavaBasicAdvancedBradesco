/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacaoclasse2;

/**
 *
 * @author Usuário
 */

public class CriacaoClasse2 {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1;
     //   aluno1= new Aluno();
     //   double notasAluno1=aluno1.calcularMediaProvas(7.5,6.7,5.4);
    //    System.out.println("media "+notasAluno1);
    }
    public class Aluno{
        int matricula;
        String turno;
        int semestre;
        public double calcularMediaProvas(double nota1, double nota2, double nota3){
            return (nota1+nota2+nota3);
        }
    }
    
}
