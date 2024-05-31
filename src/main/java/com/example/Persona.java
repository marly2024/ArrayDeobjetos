package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Persona  {
	
      private String nombre;
      private String primerApellido;
      private String segundoApellido;
      private double salario;
      private Genero genero;
      
     
    	  
      }

