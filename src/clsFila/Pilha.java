/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clsFila;

/*
 * To change this license header, choose Lice
nse Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Pilha {

    public Pilha() {

        this.pilha = new Object[100];
        this.posPilha = -1;

    }

    public Object[] pilha;
    private int posPilha;

    public boolean isEmpty() {
        if (posPilha == -1) {
            return true;
        }
        return false;

    }

    public int Size() {
        return this.posPilha;

    }

    public boolean isFull() {
        if (this.posPilha == this.pilha.length - 1) {
            return true;
        }
        return false;

    }

    public void push(Object item) {
        if (!isFull()) {
            this.pilha[++posPilha] = item;
        } else {
            System.out.println("A pilha esta cheia.");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            return this.pilha[this.posPilha--];

        }
        return null;

    }

}
