/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagit;

class Ficha {

    private int casilla;

    Ficha() { //constructor casilla = 1; 
    }

    public void avanzar(int n) {
        casilla += n;
    }

    public int casillaActual() {
        return casilla;
    }
}

class app {

    public static void main(String[] args) {
        Ficha ficha1 = new Ficha();
        ficha1.avanzar(3);
        System.out.println(ficha1.casillaActual());//Da 4
    }
}