/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;

/**
 *
 * @author Usuário
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int media = 9;
        String status;
        if (media>=6){
            status = "aprovado";
        }else{
            status = "reprovado";
        }
        System.out.println("media"+media+"status"+status);
        System.out.println(media>=9?"otimo":"aprovado");
            
        int limiteCheque;
        int saldoMedio = 2500;
        if(saldoMedio>5000){
            limiteCheque = 1000;
        }else if (saldoMedio>3000 && saldoMedio <= 5000){
            limiteCheque = 800;
        }else if (saldoMedio>2000 && saldoMedio <=3000){
            limiteCheque = 600;
        }else if (saldoMedio>1000 && saldoMedio <=2000){
            limiteCheque=400;
        }else{
            limiteCheque=0;
        }
        System.out.println("limite"+limiteCheque);
            
        char indice ='b';
        String resultado ="";
        switch(indice){
            case 'a':
                resultado += 'a';
                break;
            case 'b':
                resultado += 'b';
                break;
            case 'c':
                resultado += 'c';
                break;
            default:
                resultado += 'd';
        }
        System.out.println(resultado);
        int idade=18;
        String categoria;
        System.out.println("Teste Categoria");
        if(idade<=16){
            categoria="Infantil";
        }else{  if(idade<18){
                categoria="juvenil";
        }else{
                categoria="adulto";
        }
        }
        System.out.println(categoria);
        int anos = 9;
        while(anos<18){
            System.out.println("idade"+anos+"proibido alcool");
            anos++;
        }
        int r=0;
        do{
            System.out.println("aleatorio"+Math.random()*r);
            r++;
        }
        while(r<=10);
        System.out.println("total acumulado"+r);
        
        System.out.println("----------------------");
        System.out.println("forma 1 valor inicial p =10 declarado externamente");
        int p=10;
        for(;p<=20;p++){
            System.out.println("intervalo aleatorio pra x entre 10 e 20"+ Math.random()*p);
        }
        System.out.println("--------");
        System.out.println("forma2 condicional controlada no final do loop por if p>25");
        for(p=20;;p++){
            System.out.println("intervalo aleatorio de p entre 20 e 25"+Math.random()*p);
            if (p>25) break;
        }
        System.out.println("-----------");
        System.out.println("forma 3 incremento controlado no acumulador de comando p++");
        for(p=1;p<=10;){
            System.out.println("intervalo aleatorio de p entre 1 e 10"+Math.random()*p);
            p++;
        }
        System.out.println("-------");
        System.out.println("forma 4 aninhamento de for para acumulador p e q");
        int q=1;
        for(p=1;p<=10;p++){
            for(;q<-5;q++){
                System.out.println("valor incrementado de 1 em 1 para q entre 1 e 5"+q);
            }
            System.out.println("intervalo aleatorio para p entre 1 e 10"+Math.random()*p);
        }
        System.out.println("--------");
        System.out.println("forma 5 decremento de 5 em 5 para p");
        for(p=50;p>=5;p-=5){
            System.out.println("valor decrescente de 5 em 5 de p entre 50 e 5"+p);
        }
        //-------------------
        int numero2;
        int soma=0;
        int i2;
        for(i2 = 0; i2 < 10 ; i2++){
            numero2 = (int) (Math.random()*100);
            soma+=numero2;
        }
        System.out.println("soma"+soma);
               
    }
    
}
