/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cifrar;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class Cifrar {
    private String cifrado;
    public Cifrar(){
    }
    public String getCifrado () { return cifrado; } 
    public void setCifrado(int cifrado){
        String newCifrado = ""; 
        for (char ch: Integer.toString(cifrado).toCharArray()) {
            switch(ch) {
                case '0':
                    newCifrado += "A";
                    break;
                case '1':
                    newCifrado += 'B';
                    break;
                case '2':
                    newCifrado += 'C';
                    break;
                case '3':
                    newCifrado += 'D';
                    break;
                case '4':
                    newCifrado += 'E';
                    break;
                case '5':
                    newCifrado += 'F';
                    break;
                case '6':
                    newCifrado += 'G';
                    break;
                case '7':
                    newCifrado += 'H';
                    break;
                case '8':
                    newCifrado += 'I';
                    break;
                case '9':
                    newCifrado += 'J';
                    break;
                default:
            }
        }
        this.cifrado = newCifrado;
    }
    public static void main(String[] args) {
        String isYORN;
        Cifrar dato = new Cifrar();
        //total.setTotal(new BigDecimal(0), 0);
        System.out.println("Introduce un numero de 4 digitos: ");
        Scanner inputNumero = new Scanner(System.in);
        int numero = inputNumero.nextInt();
        dato.setCifrado(numero);
        System.out.println("El número cifrado es: " + dato.getCifrado());
        System.out.println("¿Desea decifrarlo (Y/N)?: ");
        Scanner inputContinuar = new Scanner(System.in);
        isYORN = inputContinuar.next();
        if (isYORN.equals("Y")) {
            String newCifrado = ""; 
            for (char ch: dato.getCifrado().toCharArray()) {
            switch(ch) {
                case 'A':
                    newCifrado += "0";
                    break;
                case 'B':
                    newCifrado += '1';
                    break;
                case 'C':
                    newCifrado += '2';
                    break;
                case 'D':
                    newCifrado += '3';
                    break;
                case 'E':
                    newCifrado += '4';
                    break;
                case 'F':
                    newCifrado += '5';
                    break;
                case 'G':
                    newCifrado += '6';
                    break;
                case 'H':
                    newCifrado += '7';
                    break;
                case 'I':
                    newCifrado += '8';
                    break;
                case 'J':
                    newCifrado += '9';
                    break;
                default:
            }
            }
            System.out.println("El número cifrado es: " + newCifrado);
        }
    }
}
