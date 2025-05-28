    package org.example.hotel.Entidades;

    import jakarta.persistence.*;

    import java.time.LocalDate;
    import java.util.Date;

    @Entity
    public class Consumo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idConsumo;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumns({
                @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva"),
                @JoinColumn(name = "id_habitacion", referencedColumnName = "id_habitacion")
        })
        private ReservaHabitacion reservaHabitacion;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "id_huesped")
        private Huesped idHuesped;

        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "id_servicio_adicional")
        private ServicioAdicional idServicioAdicional;

        private Integer cantidad;
        private double monto;

        private LocalDate fechaConsumo;

        public Consumo() {

        }

        public Integer getIdConsumo() {
            return idConsumo;
        }

        public void setIdConsumo(Integer idConsumo) {
            this.idConsumo = idConsumo;
        }

        public ReservaHabitacion getReservaHabitacion() {
            return reservaHabitacion;
        }

        public void setReservaHabitacion(ReservaHabitacion reservaHabitacion) {
            this.reservaHabitacion = reservaHabitacion;
        }

        public Huesped getIdHuesped() {
            return idHuesped;
        }

        public void setIdHuesped(Huesped idHuesped) {
            this.idHuesped = idHuesped;
        }

        public ServicioAdicional getIdServicioAdicional() {
            return idServicioAdicional;
        }

        public void setIdServicioAdicional(ServicioAdicional idServicioAdicional) {
            this.idServicioAdicional = idServicioAdicional;
        }

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public double getMonto() {
            return monto;
        }

        public void setMonto(double monto) {
            this.monto = monto;
        }

        public LocalDate getFechaConsumo() {
            return fechaConsumo;
        }

        public void setFechaConsumo(LocalDate fechaConsumo) {
            this.fechaConsumo = fechaConsumo;
        }
    }
