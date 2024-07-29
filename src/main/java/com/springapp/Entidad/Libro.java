package com.springapp.Entidad;

import lombok.Data;

@Data
public class Libro {
    private int id;
    private String titulo;
    private String editorial;
    private int paginas;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
