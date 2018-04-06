
package clsFila;

/**
 *
 * @author Wanderson
 */
public class Fila {
    
  
    public static void main(String[] args) {
    
        //Fila utilizada como default para ambas questões
        clsFila fila = new clsFila();
        
        fila.Adicionar(10);
        fila.Adicionar(2);
        
        
        System.out.println("Lista original:");
        for (int i = 0; i < 5; i++) {
            System.out.println(fila.fila[i]);
        }
        
        //Chama a função fura fila, com a fila acima, inserindo o numero 100.
        
        fila.FuraFila(fila, 100);
        //fila.Remover();
        System.out.println("Fura Fila:");
        for (int i = 0; i < 5; i++) {
            System.out.println(fila.fila[i]);
        }
        
        //Chama a função que inverte a fila, usando a pilhaP, e retorna...
        Pilha pilhaP = new Pilha();
        
        clsFila resultado = InverterFila(fila, pilhaP);
        
        System.out.println("Lista invertida:");
        for (int i = 0; i < 5; i++) {
            System.out.println(resultado.fila[i]);
        }
        
    
    }
    
    public static clsFila InverterFila(clsFila fila, Pilha pilha) {
        Object aux;
        
        do {
        aux = fila.Remover();
        pilha.push(aux);
        } while (!fila.estaVazia());        
        
        do {
            aux = pilha.pop();
            fila.Adicionar(aux);
        } while (!pilha.isEmpty());
        
        return fila;
    }
    
}
