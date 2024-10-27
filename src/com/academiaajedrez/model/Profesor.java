package com.academiaajedrez.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * Clase que representa a un profesor en el sistema.
 */
public class Profesor extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Nombre completo del profesor.
     */
    private String nombreCompleto;

    /**
     * ID único del profesor.
     */
    private UUID idProfesor;

    /**
     * Correo electrónico del profesor.
     */
    private String correoElectronico;

    /**
     * Años de experiencia del profesor.
     */
    private int experiencia;

    /**
     * Constructor de la clase Profesor.
     *
     * @param username        Nombre de usuario.
     * @param password        Contraseña.
     * @param nombreCompleto  Nombre completo.
     * @param correoElectronico Correo electrónico.
     * @param experiencia     Años de experiencia.
     */
    public Profesor(String username, String password, String nombreCompleto, String correoElectronico, int experiencia) {
        super(username, password);
        this.idProfesor = UUID.randomUUID(); // Generación automática de ID
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.experiencia = experiencia;
    }

    /**
     * Método para aprobar a un alumno.
     *
     * @param alumno Alumno a aprobar.
     */
    public void aprobarAlumno(Alumno alumno) {
        alumno.setAprobado(true);
        System.out.println("El alumno " + alumno.getNombreCompleto() + " ha sido aprobado por el profesor " + nombreCompleto + ".");
    }

    // Getters y setters con comentarios

    /**
     * Obtiene el nombre completo del profesor.
     *
     * @return Nombre completo del profesor.
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Establece el nombre completo del profesor.
     *
     * @param nombreCompleto Nombre completo.
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Obtiene el ID único del profesor.
     *
     * @return ID del profesor.
     */
    public UUID getIdProfesor() {
        return idProfesor;
    }

    /**
     * Establece el ID único del profesor.
     *
     * @param idProfesor ID del profesor.
     */
    public void setIdProfesor(UUID idProfesor) {
        this.idProfesor = idProfesor;
    }

    /**
     * Obtiene el correo electrónico del profesor.
     *
     * @return Correo electrónico del profesor.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Establece el correo electrónico del profesor.
     *
     * @param correoElectronico Correo electrónico.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene la experiencia del profesor en años.
     *
     * @return Años de experiencia.
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Establece la experiencia del profesor en años.
     *
     * @param experiencia Años de experiencia.
     */
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
