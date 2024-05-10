package lib;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Utilizador
 */
public class NumberUtils {
    
    // Calcula a média dos números da lista indicada
    public static double calcularMedia(List<Double> numeros) {
        if (numeros.isEmpty()){ // Se a lista de numeros for vazia devolve 0
            return 0;
        } 
        else {
            double soma = 0;
            for (Double num : numeros) {
                soma += num;
            }
            
            return soma / numeros.size();
        }
    }

    // Calcul a mediana dos números da lista indicada
    public static double calcularMediana(List<Double> numeros) {
        int tamanho = numeros.size();
        
        if (tamanho == 0) { // Se a lista de numeros for vazia devolve 0
            return 0;
        }  
        else {
            Collections.sort(numeros);  // Ordena a lista para saber o valor do meio da lista
            if (tamanho % 2 == 1) { 
                return numeros.get(tamanho / 2);
            } else { // Se a lista for par calcula a média os dois numeros do meio da lista
                return (numeros.get(tamanho / 2 - 1) + numeros.get(tamanho / 2)) / 2.0;
            }
        }
    }

    // Calcula a moda dos números da lista indicada
    public static double calcularModa(List<Double> numeros) {
        if (numeros.isEmpty()) {  // Se a lista de numeros for vazia devolve 0
            return 0; 
        }  
        else {
            Map<Double, Integer> frequencia = new HashMap<>();
            for (Double num : numeros) {
                frequencia.put(num, frequencia.getOrDefault(num, 0) + 1); // Conta a frequencia de cada numero, incrementado o valor sempre que seja igual
            }
            
            double moda = 0;
            int maxFreq = 0;
            
            for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
                if (entry.getValue() > maxFreq) { // vai atualizado conforme a maior frequencia encontrada
                    maxFreq = entry.getValue(); 
                    moda = entry.getKey();
                }
            }
            
            return moda;
        }
    }

    // Ordena a lista de números em ordem crescente ou decrescente
    public static List<Double> ordenarLista(List<Double> numeros, boolean crescente) {
        if (crescente) {
            Collections.sort(numeros); 
        } else {
            Collections.sort(numeros, Collections.reverseOrder()); 
        }
        return numeros;
    }
}
