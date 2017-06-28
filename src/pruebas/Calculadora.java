
package pruebas;

class Calculadora {

    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n--;
        }
        return fact;
    }
}

class app {

    public static void main(String[] args) {
        System.out.println(Calculadora.factorial(5));
        System.gc();
    }
}
