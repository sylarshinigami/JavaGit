package pruebas;

class vehiculo {

    public int velocidad;
    public int ruedas;

    public void parar() {
        velocidad = 0;
    }

    public void acelerar(int kmh) {
        velocidad += kmh;
    }
}

class coche extends vehiculo {

    public int ruedas = 4;
    public int gasolina;
    
    public coche(){}

    public void repostar(int litros) {
        gasolina += litros;
    }
}

// ...........................................................  
class appi {
static coche coche1;
    public static void main(String[] args) {
         coche1 = new coche();
        coche1.acelerar(80);//Método heredado coche.repostar(12);
        System.out.print(coche1.velocidad);
    }
}
