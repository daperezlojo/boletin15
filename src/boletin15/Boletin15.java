package boletin15;
/**
 *
 * @author Damian
 */

import java.util.Scanner;
public class Boletin15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ProbasEscritas PE1 = new ProbasEscritas();
        ProbaPractica PP1 = new ProbaPractica();
        Boletins B1 = new Boletins();
        
        System.out.println("Bienvenido al Programa para calcular medias");
        System.out.println("Introduzca el valor de las notas en el siguiente ordem:\n"
                + "1- Primera Nota de las Pruebas Escritas\n"
                + "2- Segunda Nota de las Notas Escritas\n"
                + "3- Nota de la Prueba Práctica\n"
                + "4- Porcentaxe de Boletins Feitos");
        
         PE1.setNota1ProbaEscrita((int) sc.nextFloat());
         PE1.setNota2ProbaEscrita((int) sc.nextFloat());
         PP1.setNota1ProbaPractica((int) sc.nextFloat());
         B1.setPorcentaxe(sc.nextInt());

         
         PE1.calcularMediaProbasEscritas();
         B1.calcularMediaBoletins();
         
         PE1.calcularPorcentaxe();
         PP1.calcularPorcentaxe();
         B1.calcularPorcentaxe();
         
         System.out.println("PROBAS TEORICAS: "+PE1.calcularMediaProbasEscritas()+"\n"
                          + "PROBA PRACTICA:  "+PP1.getNota1ProbaPractica()+"\n"
                          + "BOLETINS:        "+B1.calcularMediaBoletins()+"\n"
                          + "NOTA TOTAL:      "+((PE1.calcularPorcentaxe())+(PP1.calcularPorcentaxe())+(B1.calcularPorcentaxe())) );
        
        
    }
    
}
