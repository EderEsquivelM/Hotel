package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Empleado;
import org.example.hotel.Repositorios.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Empleado> getEmpleados() {
        return empleadoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Empleado getEmpleado(@PathVariable("id") Integer id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addEmpleado(@RequestBody Empleado empleado) {
        empleadoRepository.save(empleado);
        return "Empleado agregado con exito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado empleado) {
        Empleado empleadoViejo = empleadoRepository.getReferenceById(id);

        empleadoViejo.setNombre(empleado.getNombre());
        empleadoViejo.setApellidoPaterno(empleado.getApellidoPaterno());
        empleadoViejo.setApellidoMaterno(empleado.getApellidoMaterno());
        empleadoViejo.setIne(empleado.getIne());
        empleadoViejo.setCorreo(empleado.getCorreo());
        empleadoViejo.setTelefono(empleado.getTelefono());
        empleadoViejo.setDireccion(empleado.getDireccion());
        empleadoViejo.setCargo(empleado.getCargo());
        empleadoViejo.setSalario(empleado.getSalario());

        empleadoViejo.setIdEstado(empleado.getIdEstado());
        empleadoViejo.setIdMunicipio(empleado.getIdMunicipio());
        empleadoViejo.setIdTipoEmpleado(empleado.getIdTipoEmpleado());

        empleadoRepository.save(empleadoViejo);
        return "Empleado actualizado con éxito";
    }

}
