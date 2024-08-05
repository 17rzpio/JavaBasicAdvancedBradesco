/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacaoclasse3;

/**
 *
 * @author Usuário
 */
public class CriacaoClasse3 {

    /**
     * @param args the command line arguments
     */
    abstract class Pessoa{
        String nome;
    }
    public static class Aluno extends Pessoa{
        private int matricula;
        private String nome;
        private String turno;
        private int semestre=1;
        private int faltas=0;
        public int proximoSemestre(){
            return this.semestre +1;
        }
        public int quantidadeDeFaltas(){
            return this.faltas;
        }
        public double calcularMediaProvas(double nota1, double nota2, double nota3){
            return ((nota1+nota2+nota3)/3);
        }
        public void setMatricula(int numeroMatricula){
            this.matricula = numeroMatricula;
        }
        public int getMatricula(){
            return this.matricula;
        }
        public Aluno(int numeroMatricula){
            this.matricula = numeroMatricula;
            System.out.println("matricula "+this.matricula);
        }
        public Aluno(String nomeAluno, int numeroMatricula){
            this.nome = nomeAluno;
            this.matricula = numeroMatricula;
            System.out.println("nome "+this.nome+" matricula "+ this.matricula);
        }
        
    }
    public class Professor extends Pessoa{
        String usuario;
    }
    public class Servente extends Pessoa{
        String turno;
    }
    abstract class Geometria{
        public abstract double area();
        public abstract double perimetro();
    
    final class Quadrado extends Geometria{
        Quadrado(double lado){
            super();
        }
        public double area(){
            return 200;
            
        }
        public double perimetro(){
            return 0;
        }
    }
    }
    public static class Calculadora{
        static int soma (int valor1, int valor2){
            return valor1 + valor2;
        }
    }
    public class Caneta{
        String marca;
        boolean tinta;
        String corTinta;
        public Caneta(){
            marca = "pilot";
            tinta = true;
            corTinta = "azul";
        }
    }
    public class Animal{
        private String tipo;
        private String nome;
        public String getTipo(){
            return this.tipo;
        }
        public void setTipo(String tipo){
            this.tipo=tipo;
        }
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = tipo;
        }
    }
    public void som(){
        System.out.println("rawr");
        
    }
    public class Galinha extends Animal{
        public void Galinha(){
            this.setTipo("aves");
        }
        public void som(){
            System.out.println("corico");
        }
        public void executarVoo(Object obj){
            if(obj instanceof Galinha)
                ((Galinha) obj).voar();
        }
        public void voar(){
            boolean voar = true;
        }
    }
    public class Gato extends Animal{
        public void Gato(){
            this.setTipo("mamiferos");
        }
        
        //@Override
        public void som(){
            System.out.println("miau");
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1;
        aluno1= new Aluno(25484);
        Aluno aluno2 = new Aluno("segundo", 35874);
        aluno1.setMatricula(340578);
        System.out.println("matricula "+aluno1.getMatricula());
        double notasAluno1=aluno1.calcularMediaProvas(7.5,6.7,5.4);
        System.out.println("media "+notasAluno1);
        int numero1 = 23;
        int numero2 = 44;
        System.out.println("\n soma de "+numero1+" com numero 2 "+numero2+" "+Calculadora.soma(numero1,numero2));
        System.out.println("prox semestre "+ aluno1.proximoSemestre());
        System.out.println("qtd falta "+aluno1.quantidadeDeFaltas());
        Aluno[] alunos = new Aluno[50];
        int indice = 74;
        if(indice >= 0 && indice<50){
            System.out.println(alunos[indice]);
            
        }else{
            System.out.println("nao existe esse aluno");
        }
        indice = 75;
        try{
            System.out.println(alunos[indice]);
        }catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("aluno nao existe");
        }finally{
            System.out.println("executou finally");
        }
        
    }
    
}

/*
 
package criacaoclasse3;


public class CriacaoClasse3 {

    
    public static class Aluno{
        private int matricula;
        private String turno;
        private int semestre=1;
        private int faltas=0;
        public int proximoSemestre(){
            return this.semestre +1;
        }
        public int quantidadeDeFaltas(){
            return this.faltas;
        }
        public double calcularMediaProvas(double nota1, double nota2, double nota3){
            return ((nota1+nota2+nota3)/3);
        }
        public void setMatricula(int numeroMatricula){
            this.matricula = numeroMatricula;
        }
        public int getMatricula(){
            return this.matricula;
        }
        
    }
    public static class Calculadora{
        static int soma (int valor1, int valor2){
            return valor1 + valor2;
        }
    }
    public class Caneta{
        String marca;
        boolean tinta;
        String corTinta;
        public Caneta(){
            marca = "pilot";
            tinta = true;
            corTinta = "azul";
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1;
        aluno1= new Aluno();
        aluno1.setMatricula(340578);
        System.out.println("matricula "+aluno1.getMatricula());
        double notasAluno1=aluno1.calcularMediaProvas(7.5,6.7,5.4);
        System.out.println("media "+notasAluno1);
        int numero1 = 23;
        int numero2 = 44;
        System.out.println("\n soma de "+numero1+" com numero 2 "+numero2+" "+Calculadora.soma(numero1,numero2));
        System.out.println("prox semestre "+ aluno1.proximoSemestre());
        System.out.println("qtd falta "+aluno1.quantidadeDeFaltas());
        
    }
    
}*/
