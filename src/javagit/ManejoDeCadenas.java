package javagit;

import java.util.Date;

/**
 *
 * @author Ronald Aguilar Navarrete
 */
public class ManejoDeCadenas {

    public static void main(String[] arg) {
//String.valueOf convierte el valor recibido al tipo que se llama
        String numero = String.valueOf(1234);
        String fecha = String.valueOf(new Date());
        System.out.println(fecha + "\n" + numero);

//lengthPermite devolver la longitud de una cadena (el número de caracteres de la cadena): 
        String texto1 = "Prueba";
        System.out.println(texto1.length());//Escribe 6 

//concatenar cadenas Se puede hacer de dos formas, utilizando el método concat  o con el operador +. Ejemplo: 
        String s1 = "Buenos ", s2 = "días", s3, s4;
        s3 = s1 + s2;
        s4 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);

//charAt Devuelve un carácter de la cadena.
        s1 = "Prueba";
        try {
            char c1 = s1.charAt(20); //c1 valdrá ‘u’ 
            System.out.println(c1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//substring Da como resultado una porción del texto de la cadena. 
        s1 = "Buenos Días";
        s2 = s1.substring(7, 10); //s2 = día 
        System.out.println(s2);

//indexOf Devuelve la primera posición en la que aparece un determinado texto en la cadena.
        s1 = "Quería decirte que quiero que te vayas";
        System.out.println(s1.indexOf("a")); //Da 15 

//lastIndexOf Devuelve la última posición en la que aparece un determinado texto en la cadena.
        System.out.println(s1.lastIndexOf("a")); //Da 15 

//endsWith Devuelve true si la cadena termina con un determinado texto. Ejemplo: 
        System.out.println(s1.endsWith("anillo"));

//startsWith Devuelve true si la cadena empieza con un determinado texto.  
        System.out.println(s1.startsWith("Que"));

        //replace Cambia todas las apariciones de  un carácter por otro en el texto que se indique y lo almacena como resultado. 
        s1 = "Mariposa";
        System.out.println(s1.replace('a', 'e'));//Da Meripose 
        System.out.println(s1);//Sigue valiendo Mariposa 

        //replaceAll Modifica en un texto cada entrada de una cadena por otra y devuelve el resultado.
        s1 = "Cazar armadillos";
        System.out.println(s1.replace("ar", "er"));//Da Cazer ermedillos 
        System.out.println(s1);//Sigue valiendo Cazar armadilos 

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        char palabra[] = s1.toCharArray();
        System.out.println(palabra[2]);

        //trim elimina los espacios en blanco por delante y por detràs
        s1 = "   Educacion para la vida     ";
        System.out.println(s1.trim());
    }//FIN DEL MÈTODO MAIN

}//FIN DE LA CLASE
