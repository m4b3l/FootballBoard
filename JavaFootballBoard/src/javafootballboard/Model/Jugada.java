/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafootballboard.Model;

/**
 *
 * @author Naty
 */
public class Jugada {
    Juego juego;
    String nombre;
    Jugador jugador;
    Equipo equipo;
    String hora;
    
    public Jugada(){
        inicializar();
    }
   
    public Jugada(Juego juego, String nombre, Jugador jugador, Equipo equipo, String hora){
        this.juego = juego;
        this.nombre = nombre; 
        this.equipo = equipo;
        this.jugador = jugador; 
        this.hora = hora;
    }
    
     public void setJuego(Juego juego){
       this.juego = juego;
   }
    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    
    public void setEquipo(Equipo equipo){
       this.equipo = equipo;
    }
    
    public void setJugador(Jugador jugador){
       this.jugador = jugador;
    }    
    public void setHora(String hora){
       this.hora = hora;
    }
    public Juego getJuego(){
       return juego;
   }
    public String getNombre(){
        return nombre;
    }
    public Equipo getEquipo(){
        return equipo;
    }
    public Jugador getJugador(){
       return jugador;
    }
    public String getHora(){
       return hora;
    }
    
    private void inicializar(){
        String noData = "No data";
        this.juego = new Juego();
        this.nombre = noData; 
        this.equipo = new Equipo();
        this.jugador = new Jugador(); 
        this.hora = noData;
    }
}
   
   
   

                
   
   
    
