/**
 * 
 */
package com.example.demo;

/**
 * @author Camilo Lavado
 *
 */
public class FlashCard {

	
	    private String titulo;
	    private String descripcion;
	    private String comentario;
	    private String tema;
	    private String categoria;
	    private int id;
	    
	    
	    
	    /*Getters y Setters*/
	    
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getComentario() {
			return comentario;
		}
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		public String getTema() {
			return tema;
		}
		public void setTema(String tema) {
			this.tema = tema;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		/*Constructor*/
		public FlashCard(String titulo, String descripcion, String comentario, String tema, String categoria, int id) {
			super();
			this.titulo = titulo;
			this.descripcion = descripcion;
			this.comentario = comentario;
			this.tema = tema;
			this.categoria = categoria;
			this.id = id;
		}
	    
	

	
}
