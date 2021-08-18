/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


public class Semana {
    private int numeroDia;
    private String dia;

    public Semana(int numeroDia, String dia) {
        this.numeroDia = numeroDia;
        this.dia = dia;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(int numeroDia) {
        this.numeroDia = numeroDia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return '[' + "numeroDia=" + numeroDia + ", dia=" + dia + '}';
    }
    
    
}
