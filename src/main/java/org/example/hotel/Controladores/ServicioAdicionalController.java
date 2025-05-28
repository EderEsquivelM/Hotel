package org.example.hotel.Controladores;

import org.example.hotel.Entidades.ServicioAdicional;
import org.example.hotel.Repositorios.ServicioAdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/servicioadicional")
public class ServicioAdicionalController {

    @Autowired
    private ServicioAdicionalRepository servicioAdicionalRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<ServicioAdicional> getServiciosAdicionales() {
        return servicioAdicionalRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody ServicioAdicional getServicioAdicional(@PathVariable("id") Integer id) {
        return servicioAdicionalRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addServicioAdicional(@RequestBody ServicioAdicional servicioAdicional) {
        servicioAdicionalRepository.save(servicioAdicional);
        return "Servicio adicional agregado con éxito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateServicioAdicional(@PathVariable("id") Integer id, @RequestBody ServicioAdicional servicioAdicional) {
        ServicioAdicional servicioViejo = servicioAdicionalRepository.getReferenceById(id);

        servicioViejo.setNombre(servicioAdicional.getNombre());
        servicioViejo.setPrecio(servicioAdicional.getPrecio());

        servicioAdicionalRepository.save(servicioViejo);
        return "Servicio adicional actualizado con éxito";
    }
}
