package trab3_main;

import lib.NumberUtils;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Utilizador
 */
public class Trab3_Main {

    public static void main(String[] args) {
        List<Double> numeros = Arrays.asList(5.0, 3.0, 8.0, 1.0, 2.0, 5.0);  // lista de números.

        // Teste da Média
        System.out.println("Média: " + NumberUtils.calcularMedia(numeros));
        
        // Teste da Médiana
        System.out.println("Mediana: " + NumberUtils.calcularMediana(numeros));
        
        // Teste da Moda
        System.out.println("Moda: " + NumberUtils.calcularModa(numeros));
        
        // Teste da Ordenação Crescente
        System.out.println("Lista Ordenada Crescente: " + NumberUtils.ordenarLista(numeros, true));
        
        // Teste da Ordenação Decrescente
        System.out.println("Lista Ordenada Decrescente: " + NumberUtils.ordenarLista(numeros, false));
    }
}
    
