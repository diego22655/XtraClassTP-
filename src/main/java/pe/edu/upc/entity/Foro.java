package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "foros")
public class Foro implements Serializable{ 
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="Foro_ID", columnDefinition="NUMERIC(6)")
	 private int idForo;

	 @Column(name="Asunto", length = 25)
	 private String asunto;
		 
	 @Column(name="Comentario", length = 255)
	 private String comentario;
	 
	 @ManyToOne
	 @JoinColumn(name = "Alumno_ID", nullable = false)
	 private Alumno alumno;
	 
	 public Foro() {
			super();
			// TODO Auto-generated constructor stub
		}
	 
	 public Foro(int idForo, String asunto, String comentario,Alumno alumno ) {
			super();
			this.idForo = idForo;
			this.asunto = asunto;
			this.comentario = comentario;
			this.alumno = alumno;
			
		}

	public int getIdForo() {
		return idForo;
	}

	public void setIdForo(int idForo) {
		this.idForo = idForo;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	 
	 // -- Constructor, Getter, Setter
	 
}
