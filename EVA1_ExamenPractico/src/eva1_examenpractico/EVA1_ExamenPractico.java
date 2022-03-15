/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_examenpractico;

import java.util.Scanner;



/**
 *
 * @author yeyos
 */
public class EVA1_ExamenPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Datos Alum1 = new Datos();
       Alum1.ImprimirDatosAlumno();
       Datos Alum2 = new Datos();
       Alum2.ImprimirDatosAlumno2();
       Datos Alum3 = new Datos();
       Alum3.ImprimirDatosAlumno3();
       Datos NombreEquipo = new Datos();
       NombreEquipo.ImprimirNombreDelEquipo();
       Datos Problemas = new Datos();
       Problemas.ImprimirProblemas();
      
      System.out.println("Clase Peliculas"); 
      Peliculas Peli1 = new Peliculas();
      Peli1.setTitulo("Avengers");
      Peli1.setEstudio("Marvel");
      Peli1.setRating("5 años en adelante");
      Peli1.ImprimirDatosPelicula();
      
      Scanner Edad = new Scanner(System.in);
      System.out.println("Ingresa tu edad:");
      int EdadN = Edad.nextInt();
      if(EdadN <= 5){
          System.out.println("No puedes ver la película \n");
      } else{
          System.out.println("Puedes ver la película \n");
      }
      System.out.println("Clase Covid"); 
      Test_Covid Paciente = new Test_Covid();
      Paciente.CalcularPersonaRiesgo();
      
        System.out.println("Clase Fibonacci");
        Fibonacci SerieFibo = new Fibonacci(6,2,5);
        SerieFibo.ImprimirSerie();
    }   
         
    
}
class Datos{

public static String RegistrarNombre(String NombreCompleto){
    return NombreCompleto;
}
public static String RegistrarNombre(String Nombre, int valor){ 
    return Nombre;           
}
public static String RegistrarNombre(String NombreDelAlumno, double alumno3){ 
    return NombreDelAlumno;           
}
public static String RegistrarNumeroControl(String NoCtrl1){ 
    return NoCtrl1;
}
public static String RegistrarNumeroControl(String NoCtrl2, int alumno2){ 
    return NoCtrl2;   
}
public static String RegistrarNumeroControl(String NoCtrl3, double alumno3){ 
    return NoCtrl3;   
}
public static String RegistrarCarrera(String Carrera){
    return Carrera;
}
public void ImprimirDatosAlumno(){
  System.out.println("Nombre: " + RegistrarNombre("Andres Saenz Olivas") + "\n"
          + "Numero de Control: " + RegistrarNumeroControl("21550390")+ "\n"
          + "Carrera: " + RegistrarCarrera("Ingenieria en Sistemas Computacionales"));
}
public void ImprimirDatosAlumno2(){
  System.out.println("Nombre: " + RegistrarNombre("Diego Sandoval", 0)+ "\n"
          + "Numero de Control: " + RegistrarNumeroControl("21550307")+  "\n"
          + "Carrera: " + RegistrarCarrera("Ingenieria en Sistemas Computacionales"));
          
}
public void ImprimirDatosAlumno3(){
  System.out.println("Nombre: " + RegistrarNombre("Guillermo Sandoval Ordoñez", 1.0 ) + "\n"
          + "Numero de Control: " + RegistrarNumeroControl("21550329")+ "\n"
          + "Carrera: "  + RegistrarCarrera("Ingenieria en Sistemas Computacionales"));
}
public void ImprimirNombreDelEquipo(){
    System.out.println("Equipo: Jelly Beans");
}
public void ImprimirProblemas(){
    System.out.println("Problemas: \n" + "Clase Datos del Equipo \n" + "Clase peliculas \n" 
            +  "Clase test covid \n" + "Clase fibonacci \n");
}
}

class Peliculas{

    String titulo;
    String estudio;
    String rating;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getestudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
    
    public void ImprimirDatosPelicula(){
        System.out.println("Nombre de la pelicula: " + titulo + "\n" + "Estudio: " + estudio + "\n" + "Rating: " + rating );
        
    }
    
    
}

class Test_Covid{
    
    int edad;
    boolean enfermedad;
    double peso;
    double estatura;
    double imc;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEnfermedad() {
        return enfermedad;
    }

    public void setEnfermeda(boolean enfermedad) {
        this.enfermedad = enfermedad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public void CalcularPersonaRiesgo(){
      Scanner EdadCovid = new Scanner(System.in);
      System.out.println("Ingresa tu edad:");
      int EdadC19 = EdadCovid.nextInt();
      if(EdadC19 >= 65){
          System.out.println("Persona de riesgo");
      } else{
          System.out.println("Persona sin riesgo");
      }
      
      Scanner Enfermedad = new Scanner(System.in);
      System.out.println("Ingresa la palabra true si tienes una enfermedad cronica de lo contrario ingrese false");
      boolean EnfermedadC19 = Enfermedad.nextBoolean();
      if(EnfermedadC19 == true){
          System.out.println("Persona de riesgo");
      } else{
          System.out.println("Persona sin riesgo");
      } 
      Scanner estaturaA = new Scanner(System.in);
      System.out.println("Ingresa tu estatura en Metros");
      double EstaturaC19 = estaturaA.nextDouble();
      Scanner pesoA = new Scanner(System.in);
      System.out.println("Ingresa tu peso en Kg:");
      double PesoC19 = pesoA.nextDouble();
      double imcA = CalcularIMC(PesoC19, EstaturaC19);
    }
    private static double CalcularIMC(double pesoA, double estaturaA){
          double imcA;
          double altura = estaturaA* estaturaA;
        
        imcA = pesoA/altura;    
        System.out.println("Imc = " + imcA);
        if (imcA > 30 ){
            System.out.println("Persona de riesgo");  
        }else{
           System.out.println("Persona sin riesgo");
        }
      return imcA;
      }
      
}

class Fibonacci{
    
    int n;
    int a1;
    int a2;

    public Fibonacci() {
        n = 0;
        a1 = 0; 
        a2 = 0;    
    }
    
    public Fibonacci(int n, int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2; 
        this.n = n;        
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }
    
    public void ImprimirSerie(){
            System.out.println(a1 + "");
        for(int a= a1; a<=n; a++){
            System.out.println(a2 + "");
            a2 = a1 + a2;
            a1 = a2 - a1;
        }
    }
    
}
