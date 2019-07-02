/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 * 
 * @author Frognas
 */
public class Ronda {

    private int idRonda;
    private int puntaje1;
    private int puntaje2;
    private int puntaje3;
    private int id_usuario;
    
    public Ronda(){}

    public Ronda(int idRonda, int puntaje1, int puntaje2, int puntaje3,int id_usuario) {
        this.idRonda = idRonda;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
        this.puntaje3 = puntaje3;
        this.id_usuario=id_usuario;
    }

    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public int getPuntaje3() {
        return puntaje3;
    }

    public void setPuntaje3(int puntaje3) {
        this.puntaje3 = puntaje3;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
}
