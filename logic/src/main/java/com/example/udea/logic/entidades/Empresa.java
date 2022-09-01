package com.example.udea.logic.entidades;

import java.util.ArrayList;

public class Empresa {
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String NITEmpresa;

    private ArrayList <Empleado> listaEmpleado;

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NITempresa){
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NITEmpresa = NITempresa;
        this.listaEmpleado = new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNITEmpresa() {
        return NITEmpresa;
    }

    public void setNITEmpresa(String NITEmpresa) {
        this.NITEmpresa = NITEmpresa;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return (ArrayList<Empleado>) listaEmpleado.clone();
    }

    public Empleado encontrarEmpleado ( String cedula){
        for (Empleado empleado : listaEmpleado){
            if (cedula.equals(empleado.getCedula())){
                return empleado;
            }

        }
            return null;
    }
    public boolean agregarEmpleado (Empleado empleado){
        if (encontrarEmpleado(empleado.getCedula()) == null){
            listaEmpleado.add(empleado);
            return true;
        }
        return false;
    }
}
