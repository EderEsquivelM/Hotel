package org.example.hotel.Controladores;

import org.example.hotel.Entidades.Pago;
import org.example.hotel.Repositorios.PagoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pago")
public class PagoController {

    @Autowired
    private PagoRespository pagoRespository;

    @GetMapping(path = "")
    public @ResponseBody Iterable<Pago> getPagos() {
        return pagoRespository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Pago getPago(@PathVariable("id") Integer id) {
        return pagoRespository.findById(id).orElse(null);
    }

    @PostMapping(path = "")
    public @ResponseBody String addPago(@RequestBody Pago pago) {
        pagoRespository.save(pago);
        return "Pago agregado con éxito";
    }

    @PutMapping(path = "/{id}")
    public @ResponseBody String updatePago(@PathVariable("id") Integer id, @RequestBody Pago pagoActualizado) {
        Pago pagoViejo = pagoRespository.getReferenceById(id);

        pagoViejo.setIdReserva(pagoActualizado.getIdReserva());
        pagoViejo.setFechaPago(pagoActualizado.getFechaPago());
        pagoViejo.setMonto(pagoActualizado.getMonto());
        pagoViejo.setMetodoPago(pagoActualizado.getMetodoPago());
        pagoViejo.setStatusPago(pagoActualizado.getStatusPago());
        pagoViejo.setIdTarjeta(pagoActualizado.getIdTarjeta());

        pagoRespository.save(pagoViejo);
        return "Pago actualizado con éxito";
    }
}
