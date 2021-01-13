package com.spring.tarea.domain;

public class Move {
    private String titulo;
    private String clasificacion;
    private int duracion;

    public Move(String titulo, String clasificacion, int duracion) {
        super();
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
    }
    public String getTitulo() {

        return titulo;
    }
    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }
    public String getClasificacion() {

        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public Move() {
        super();
    }
}
