package com.utec.hembe.prototipo;


import java.io.Serializable;

public class ItemList implements Serializable {
    private String titulo;
    private String genero;
    private String precio;
    private String director;
    private String duracion;
    private String fecha;
    private int imgResource;

    public ItemList(String titulo,String genero,String precio,String director,
                    String duracion,String fecha, int imgResource) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.imgResource=imgResource;
        this.director = director;
        this.duracion = duracion;
        this.fecha = fecha;

    }

    public String getTitulo(){ return titulo;}
    public String getGenero(){return genero;}
    public String getPrecio(){return precio;}
    public String getDirector(){return director;}
    public String getDuracion(){return duracion;}
    public String getFecha(){return fecha;}
    public int getImgResource(){return imgResource;}
}
