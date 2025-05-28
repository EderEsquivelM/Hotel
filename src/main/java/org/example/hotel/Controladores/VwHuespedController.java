package org.example.hotel.Controladores;

import org.example.hotel.Entidades.VwHuesped;
import org.example.hotel.Repositorios.VwHuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vwhuesped")
public class VwHuespedController {

    @Autowired
    private VwHuespedRepository vwHuespedPRepository;

    @GetMapping("")
    public @ResponseBody Iterable<VwHuesped> getAll() {
        return vwHuespedPRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody VwHuesped getById(@PathVariable("id") Integer id) {
        return vwHuespedPRepository.findById(id).orElse(null);
    }
}
