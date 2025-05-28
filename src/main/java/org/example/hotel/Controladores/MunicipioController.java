package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Municipio;
import org.example.hotel.Repositorios.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/municipio")
public class MunicipioController {
    @Autowired
    private MunicipioRepository municipioRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Municipio> getMunicipios() {
        return municipioRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Municipio getMunicipio(@PathVariable("id") Integer id) {
        return municipioRepository.findById(id).orElse(null);
    }

    @GetMapping("/estado/{nombreEstado}")
    public List<Municipio> getMunicipiosPorNombreEstado(
            @PathVariable String nombreEstado
    ) {
        return municipioRepository.findByNombreEstado(nombreEstado);
    }

}
