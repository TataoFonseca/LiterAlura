package com.literaturaJonathan.literaturaJonathan.models;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "libros")
@Data
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    @Enumerated(EnumType.STRING)
    private Idioma idioma;

    private double numeroDescargas;

    @ManyToOne(fetch = FetchType.EAGER)
    private Autor autor;

    public Libro() {
    }

    public Libro(DatosLibro datosLibro) {
        this.titulo = datosLibro.titulo();
        this.idioma = Idioma.fromString(datosLibro.idiomas().get(0));
        this.numeroDescargas = datosLibro.numeroDescargas();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro: ").append(titulo)
                .append(" | Id: ").append(id)
                .append(" | Idioma: ").append(idioma)
                .append(" | Numero de Descargas: ").append(numeroDescargas)
                .append("\n")
                .append(autor);
        return sb.toString();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public double getNumeroDescargas() {
		return numeroDescargas;
	}

	public void setNumeroDescargas(double numeroDescargas) {
		this.numeroDescargas = numeroDescargas;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}