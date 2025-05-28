package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Consumo;
import org.example.hotel.Repositorios.ConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/consumo")
public class ConsumoController {

    @Autowired
    private ConsumoRepository consumoRepository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Consumo> getConsumos() {
        return consumoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Consumo getConsumo(@PathVariable("id") Integer id) {
        return consumoRepository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addConsumo(@RequestBody Consumo consumo) {
        consumoRepository.save(consumo);
        return "Consumo agregado con éxito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updateConsumo(@PathVariable("id") Integer id, @RequestBody Consumo consumoActualizado) {
        Consumo consumoViejo = consumoRepository.getReferenceById(id);

        consumoViejo.setReservaHabitacion(consumoActualizado.getReservaHabitacion());
        consumoViejo.setIdHuesped(consumoActualizado.getIdHuesped());
        consumoViejo.setIdServicioAdicional(consumoActualizado.getIdServicioAdicional());
        consumoViejo.setCantidad(consumoActualizado.getCantidad());
        consumoViejo.setMonto(consumoActualizado.getMonto());
        consumoViejo.setFechaConsumo(consumoActualizado.getFechaConsumo());

        consumoRepository.save(consumoViejo);
        return "Consumo actualizado con éxito";
    }
}
