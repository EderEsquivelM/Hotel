package org.example.hotel.Controladores;


import org.example.hotel.Entidades.Empleado;
import org.example.hotel.Entidades.Tarjeta;
import org.example.hotel.Repositorios.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/tarjeta")
public class TarjetaController {
    @Autowired
    private TarjetaRepository tarjetaRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Tarjeta> gettarjetas() {
        return tarjetaRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Tarjeta getTarjeta(@PathVariable("id") Integer id) {
        return tarjetaRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addTarjeta(@RequestBody Tarjeta tarjeta) {
        tarjetaRepository.save(tarjeta);
        return "Tarjeta agregada con exito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateTarjeta(@PathVariable("id") Integer id, @RequestBody Tarjeta tarjeta) {
        Tarjeta tarjetaVieja = tarjetaRepository.getReferenceById(id);

        tarjetaVieja.setTipoTarjeta(tarjeta.getTipoTarjeta());
        tarjetaVieja.setBanco(tarjeta.getBanco());
        tarjetaVieja.setNombreTitular(tarjeta.getNombreTitular());
        tarjetaVieja.setNumeroTarjeta(tarjeta.getNumeroTarjeta());
        tarjetaVieja.setFechaCaducidad(tarjeta.getFechaCaducidad());
        tarjetaVieja.setIdHuesped(tarjeta.getIdHuesped());

        tarjetaRepository.save(tarjetaVieja);
        return "Tarjeta actualizada con éxito";
    }

}
