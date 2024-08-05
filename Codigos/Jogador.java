/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

/**
 *
 * @author Usuário
 */
public class Jogador {
    
    /**
     * @param args the command line arguments
     */
    private int numero;
    private String nome;
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador jogador = new Jogador();
        jogador.setNumero(10);
        jogador.setNome("Pele");
        System.out.println("O " + jogador.getNome()+ "foi um dos melhores camisa "+jogador.getNumero()+ " de todos os tempos");
        System.out.println("referencia do objeto "+jogador);
    }
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNumero(int numero){
        this.numero= numero;
    }
    
}
