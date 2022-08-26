package com.example.udea.logic;

public class Empleado {
    public String nombre;
    public String correo;
    public Empresa empresa;
    public Enum_RoleName rolEmpleado;

    public Empleado(String nombre, String correo, Empresa empresa, Enum_RoleName rolEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Enum_RoleName getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Enum_RoleName rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
