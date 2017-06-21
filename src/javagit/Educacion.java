package javagit;


public class Educacion{

    public boolean estatus=false;
    public String departamento="";
    
    double  arreglo[] = new double[10]; 
    double aleatorio =0.0;
    public Educacion() {
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void rellenarArreglo(){
       for(int contar=0;contar<10;contar++){
           aleatorio = Math.random();
           arreglo[contar]=(contar*5)*aleatorio;
       }
   }
   
    public void imprimirArreglo(){
        try{
        for(int j=0;j<10;j++){
            System.out.println("El arreglo ["+j+"] tiene el siguiente valor:"+arreglo[j]);
        }
        }catch (Exception e){
            System.out.print("Ha ocurrido el siguiente error:"+e.getMessage());
        }
    }
           
    
}