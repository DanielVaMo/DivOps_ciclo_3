package com.example.udea.logic.servicios;


import com.example.udea.logic.entidades.Empleado;
import com.example.udea.logic.entidades.Empresa;

import java.util.ArrayList;

public class ServicioEmpresa {

    private Empresa empresa;

    public ServicioEmpresa() {
     empresa = new Empresa("Divops", "Calle 100", "310245785","4578-8");
     /*Empleado empleado = new Empleado("Daniel", "daniel@udea.co", empresa, Enum_RoleName.OPERARIO,"124557896");

     empresa.agregarEmpleado(empleado);
     */

    }

    public ArrayList<Empleado> getAll(){
        return empresa.getListaEmpleado();
    }

    public Empleado agregarEmpleado(Empleado empleado){
        return empresa.agregarEmpleado(empleado) ? empleado : null;

    }

}
