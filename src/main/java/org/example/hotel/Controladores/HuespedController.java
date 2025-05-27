package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Huesped;
import org.example.hotel.Repositorios.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/huesped")
public class HuespedController {
    @Autowired
    private HuespedRepository huespedRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Huesped> getHuespeds() {
        return huespedRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Huesped getHuesped(@PathVariable("id") Integer id) {
        return huespedRepository.findById(id).orElse(null);
    }


    @PostMapping(path = "")
    public @ResponseBody String addHuesped(@RequestBody Huesped huesped) {
        huespedRepository.save(huesped);
        return "Huesped agregado con exito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateUsuario(@PathVariable (name="id") Integer id,@RequestBody Huesped huesped) {
        Huesped huespedViejo=huespedRepository.getReferenceById(id);
        huespedViejo.setNombre(huesped.getNombre());
        huespedViejo.setApellidoPaterno(huesped.getApellidoPaterno());
        huespedViejo.setApellidoMaterno(huesped.getApellidoMaterno());
        huespedViejo.setCorreo(huesped.getCorreo());
        huespedViejo.setDireccion(huesped.getDireccion());
        huespedViejo.setTelefono(huesped.getTelefono());
        huespedViejo.setIdEstado(huesped.getIdEstado());
        huespedViejo.setIdMunicipio(huesped.getIdMunicipio());
        huespedViejo.setIne(huesped.getIne());
        huespedRepository.save(huespedViejo);
        return "Usuario actualizado con exito";
    }

}
