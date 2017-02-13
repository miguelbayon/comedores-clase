import java.util.ArrayList;

/**
 * Write a description of class Pruebas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pruebas
{
    public void prueba01()
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosOrdenados = new ArrayList<Integer>();
        numeros.add(20);
        numeros.add(6);
        numeros.add(4);
        numeros.add(34);
        numeros.add(7);
        numeros.add(100);
        numeros.add(40000);
        numeros.add(700);
        numeros.add(550);
        numeros.add(2);
        
        // Creamos un nuevo arraylist que tenga los mismos elementos del
        // array "numeros"
        ArrayList<Integer> numerosCopia = new ArrayList<Integer>();
        for (int posicionActual = 0; posicionActual < numeros.size(); posicionActual++) {
            numerosCopia.add(numeros.get(posicionActual));
        }
        
        
        int numeroElementos = numeros.size();
        
        for (int indiceLento = 0; indiceLento < numeroElementos; indiceLento++) {
            int valorMaximo = -1;
            int posicionElementoMaximo = 0;
            for (int posicionActual = 0; posicionActual < numerosCopia.size(); posicionActual++) {
                if (numerosCopia.get(posicionActual) > valorMaximo) {
                    valorMaximo = numerosCopia.get(posicionActual);
                    posicionElementoMaximo = posicionActual;
                }
            }
        
            numerosOrdenados.add(valorMaximo);
            numerosCopia.remove(posicionElementoMaximo);
        }
        
        
        System.out.println(numeros);
        System.out.println(numerosCopia);
        System.out.println(numerosOrdenados);
        
    }
    
}









