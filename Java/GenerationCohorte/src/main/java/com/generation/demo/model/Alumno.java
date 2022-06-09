package com.generation.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_alumno;

    @Column(nullable = false)
    private String nombre_alumno;

    @Column(nullable = false)
    private Integer edad;

    @Column(nullable = false, unique = true)
    private String correo;


    // CLAVE FORANEA
    // Estamos relacionando al alumno con al cohorte
    // Necesitamos especificar el tipo de relacion

    @ManyToOne
    @JoinColumn(nullable = false, name = "cohorte_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cohorte cohorte;


    //GETTER AND SETTERS
    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre_alumno() {
        return nombre_alumno;
    }

    public void setNombre_alumno(String nombre_alumno) {
        this.nombre_alumno = nombre_alumno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
