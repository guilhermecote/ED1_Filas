/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clsFila;

/**
 *
 * @author Pc-Home
 */
public class clsFila {

    public clsFila() {
        this.tamanhoMax = 5;
        this.fila = new Object[tamanhoMax];
        this.fim = -1;
        this.inicio = -1;

    }

    public Object[] fila;
    private int fim;
    private int inicio;
    private int tamanhoMax;

    public boolean estaCheia() {
        if (incrementa(fim) == inicio) {
            return true;
        }
        return false;
    }
    
 

    int incrementa(int i) {

        if (i == tamanhoMax - 1) {
            fim = -1;
            return 0;
        } else {
            return i + 1;
        }

    }
    
    public void FuraFila(clsFila fila, Object item) {
      if (fila.estaCheia()){
          System.out.println("A fila esta cheia!");
          return;
      }        
      if (fila.inicio == 0) {
      fila.fila[fila.tamanhoMax -1] = item;
      fila.inicio = fila.tamanhoMax -1;
      
              } else {
          fila.fila[inicio -1] = item;
          fila.inicio--;
          
      }      
    }
    
    public void Adicionar(Object item) {

       
        if (estaCheia()) {
            System.out.println("A fila esta cheia!");
            return;
        }
        this.fila[incrementa(fim)] = item;
        fim++;
        if (inicio == -1) 
            inicio ++;
        
    }

    public Object Remover() {
        if (!estaVazia()) {
            if (inicio == tamanhoMax -1) {
            this.fila[inicio] = null;    
            inicio = 0;
            return null;
            }
            
            
            Object aux = this.fila[inicio];
            this.fila[inicio] = null;
            inicio++;
            return aux;

        }
        System.out.println("Fila vazia!");
        return null;

    }

    public boolean estaVazia() {
        if (this.fila[fim] == null) {
            this.inicio = -1;
            this.fim = -1;
            return true;
            
        }
        return false;
    }

    public int Size() {
        return this.fim;
    }

}
