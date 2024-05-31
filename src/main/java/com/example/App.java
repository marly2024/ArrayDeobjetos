package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static  int SIZE;
	
    public static void main( String[] args )
    {
    	
    	if(args.length != 0)
    		SIZE = Integer.parseInt(args[0]);
        //Para crear un array de Persona
    	Persona[] personas = {
    			Persona.builder()
   		     .nombre("Ivan")
   		     .primerApellido("Santiago")
   		     .segundoApellido("Gil")
   		     .genero(Genero.HOMBRE)
   		     .salario(2000.00)
   		     .build(),
   			
    			Persona.builder()
   		     .nombre("Tamara")
   		     .primerApellido("Sanchez")
   		     .genero(Genero.MUJER)
   		     .salario(2500.00)
   		     .build(),
    		Persona.builder()
    		     .nombre("Adrian")
    		     .primerApellido("Santos")
    		     .segundoApellido("Gil")
    		     .genero(Genero.HOMBRE)
    		     .salario(3000.00)
    		     .build(),
    		  Persona.builder()
    		  .nombre("Maria")
    		  .primerApellido("Lopez")
    		  .genero(Genero.MUJER)
    		  .salario(2800.80)
    		  .build(),
    			
    	}; 
    	
    	Persona[] arrayPersonasNoRecomendado = new Persona[10];
    	
    	arrayPersonasNoRecomendado[0] = new Persona();
    	arrayPersonasNoRecomendado[0].setNombre("Jessica");
    	
    	/*Que podemos hacer con los array de objetos?*/
    	// Recorrerlos y mostrar los elementos por consola
    	// como podemos recorrer el array de personas?
    	
    	for(Persona persona : personas)
    		System.out.println(persona);
    	
    	/*Agregar una nueva persona al array de personas NO ES POSIBLE*/
    	
    	// Para agregar un elemento a un array, por ejemplo, si fuese de enteros
    	int[] arrayDeNumeros = {
    			1, 2, 3, 4
    	};
    	
    	// arrayDeNumeros.push(5);
    	
    //	arrayDeNumeros[4] = 5;
    	
    	/*Recorrer el array de personas y almacenar las personas del genero MUJER
    	 * en un nuevo array que podemos llamar arrayDemujer*/
    	Persona[] arrayDeMujeres = new Persona[SIZE];
    	
    	int indice = 0;
    	
    	for (Persona p : personas) { 
    		if(p.getGenero().equals(Genero.MUJER))
    			arrayDeMujeres[indice++] = p;
    			
    			
    	}
    	System.out.println("Personas del genero mujer....");
    	for(Persona mujer : arrayDeMujeres) {
    		if (mujer != null)
    			System.out.println(mujer);
    		else 
    			break;
    	}
    	
    	/*Ejercicio # 1. Crear una rama nueva
    	 * 
    	 * Recorrer el array de personas y recuperar el salario promedio de 
    	 * todas las personas*/
    	
    	double sumatoriaDeLosSalarios = 0.0;
    	int totalDePersonas = personas.length;
    	double salarioPromedio = 0.0;
    	
    	for(Persona persona : personas) { 
    	   //  sumatoriaDeLosSalarios = sumatoriaDeLosSalarios + persona.getSalario()
    		sumatoriaDeLosSalarios += persona.getSalario();
}
    	salarioPromedio = sumatoriaDeLosSalarios / totalDePersonas;
    	
    	System.out.println("El salario promedio de todas las personas es: " + salarioPromedio);
    	
}
    /*EJERCICIO 2
     * Recorrer el array de personas y calcular el salario promedio por genero*/
   
       double sumatoriaSalariosHombre = 0.0;
       double sumatoriaSalariosMujer = 0.0;
       double sumatoriaSalariosOtro = 0.0;
       
       int totalGeneroHombre = 0;
       int totalGeneroMujer = 0;
       int totalGeneroOtro =0;
       
       double salarioPromedioHombres = 0.0;
       double salarioPromedioMujeres = 0.0;
       double salarioPromedioOtros = 0.0;
       
       for(Persona p : personas) { 
    	   if(p.getGenero().equals(Genero.HOMBRE)) {
    		   sumatoriaSalariosHombre += p.getSalario();
    		   totalGeneroHombre++;
    	   }   else if(p.getGenero().equals(Genero.MUJER)) { 
    		   sumatoriaSalariosMujer += p.getSalario();
    		   totalGeneroMujer++;  
    	   } else { 
    		   sumatoriaSalariosOtro += p.getSalario();
    		   totalGeneroOtro++;
    		   
    		 salarioPromedioHombres = sumatoriaSalariosHombre / totalGeneroHombre;
    		 salarioPromedioMujeres = sumatoriaSalariosMujer / totalGeneroMujer;
    		 salarioPromedioOtros = sumatoriaSalariosOtro / totalGeneroOtro;
    		 
    		  System.out.println("Salario promedio de los Hombres:" + salarioPromedioHombres);
    		  System.out.println("Salario promedio de las Mujeres:" + salarioPromedioMujeres);
    		  System.out.println("Salario promedio de Otros Generos:" + salarioPromedioOtros);
    	   }
}
      
}
}