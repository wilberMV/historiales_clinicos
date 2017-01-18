/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historialesclinicos;

/**
 *
 * @author TOSHIBA
 */
public class Paciente {
    private String Nombre;
    private String FechadeNaciomiento;
    private String InformeConyugal;
    private int Edad;
    private String Genero;

    public Paciente() {
    }

    public Paciente(String Nombre, String FechadeNaciomiento, String InformeConyugal, int Edad, String Genero) {
        this.Nombre = Nombre;
        this.FechadeNaciomiento = FechadeNaciomiento;
        this.InformeConyugal = InformeConyugal;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechadeNaciomiento() {
        return FechadeNaciomiento;
    }

    public void setFechadeNaciomiento(String FechadeNaciomiento) {
        this.FechadeNaciomiento = FechadeNaciomiento;
    }

    public String getInformeConyugal() {
        return InformeConyugal;
    }

    public void setInformeConyugal(String InformeConyugal) {
        this.InformeConyugal = InformeConyugal;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
    
    
}
