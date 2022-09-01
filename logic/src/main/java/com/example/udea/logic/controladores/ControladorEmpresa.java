package com.example.udea.logic.controladores;


import com.example.udea.logic.servicios.ServicioEmpresa;
import com.example.udea.logic.entidades.Empleado;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/empleados")
public class ControladorEmpresa {

    private ServicioEmpresa servicioEmpresa;

    public ControladorEmpresa() {
        this.servicioEmpresa = new ServicioEmpresa();
    }

    @GetMapping
    public ArrayList<Empleado> getAll(){
        return servicioEmpresa.getAll();
    }

    @PostMapping
    public Empleado agregarEmpleado (@RequestBody Empleado empleado){
        return servicioEmpresa.agregarEmpleado(empleado);
    }
}


