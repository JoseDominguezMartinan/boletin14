/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author jdominguezmartinan
 */
public class Garaje {

    private int numeroPlazas = 0;
    private int opcion;
    private boolean i = true;
    String matricula;
    float tempo1;
    float tempo2;
    private float prezo;
    private float cartos;
  
    ArrayList<Coches> coche = new ArrayList<>(5);

    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public void insertarCoches() {

        while (i == true) {
            System.out.println("Xestión do garaxe, inserte o numero de opción");
            System.out.println("1:Insertar coche");
            System.out.println("2:Eliminar coche");
            System.out.println("3:Sair");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Insertar matricula");
                    Coches coches = new Coches(sc1.nextLine());
                    coche.add(coches);
                    tempo1 = System.currentTimeMillis();

                    //for (numeroPlazas = 0; numeroPlazas < 5; numeroPlazas++) {
                    // coche[numeroPlazas] = new Coches(); 
                    //if (coche[numeroPlazas].getMatricula()==null){
                    // System.out.println("Insertar matricula");
                    // coche[numeroPlazas].setMatricula(sc1.nextLine());
                    // }
                    //   else System.out.println("Matricula existente");
                    break;
                case 2:
                    System.out.println("Insertar matricula");
                    matricula=sc1.nextLine();
                    coche.remove(matricula);
                    tempo2 = System.currentTimeMillis();
                    System.out.println("Insertar dinero");
                    cartos=sc2.nextFloat();

                    if (1 >= ((tempo2 - tempo1) / 3600000)) {
                        prezo = 1.5f;
                    } else if (2 >= ((tempo2 - tempo1) / 3600000)) {
                        prezo = 3.0f;
                    } else if (3 >= ((tempo2 - tempo1) / 3600000)) {
                        prezo = 4.5f;
                    } else {
                        prezo = 4.5f + (((tempo2 - tempo1-3) / 3600000) * 0.20f);
                    }

                    System.out.println("FACTURA");
                    System.out.println("MATRICULA COCHE " + matricula);
                    System.out.println("TEMPO " + (tempo2 - tempo1)/3600000);
                    System.out.println("PRECIO " + prezo);
                    System.out.println("CARTOS RECIBIDOS " + cartos);
                    System.out.println("CARTOS DEVOLTOS " + (prezo - cartos));
                    System.out.println("GRAZAS POR USAR O NOSO APARCADOIRO");

                    //  for (numeroPlazas = 0; numeroPlazas < 5; numeroPlazas++) {
                    //     coche[numeroPlazas] = new Coches(); 
                    //     System.out.println("Insertar matricula");
                    //    String matricula = sc1.nextLine();
                    //     if (coche[numeroPlazas].getMatricula().equals(matricula)){
                    //      coche[numeroPlazas].setMatricula(null);
                    //     }
                    //     else System.out.println("Matricula no existente");
                    //     break;
                    break;
                case 3:

                    i = false;
                    break;
            }

        }

    }

}
