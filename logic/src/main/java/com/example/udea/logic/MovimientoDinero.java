package com.example.udea.logic;

public class MovimientoDinero {
    public double montoMovimiento;
    public String conceptoMovimiento;
    public Empleado usuarioRegistrarMovimiento;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, Empleado usuarioRegistrarMovimiento){
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioRegistrarMovimiento = usuarioRegistrarMovimiento;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getUsuarioRegistrarMovimiento() {
        return usuarioRegistrarMovimiento;
    }

    public void setUsuarioRegistrarMovimiento(Empleado usuarioRegistrarMovimiento) {
        this.usuarioRegistrarMovimiento = usuarioRegistrarMovimiento;
    }
}
