/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblo;

/**
 *
 * @author usuario
 */
public class RUser {
    
    String Nombre,Documento,Correo,estado;
  

    public RUser(String Nombre,String Docuemento, String Correo,String estado) {
        this.Nombre = Nombre;
        this.Documento = Documento;
        this.Correo = Correo;
        this.estado = estado;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
