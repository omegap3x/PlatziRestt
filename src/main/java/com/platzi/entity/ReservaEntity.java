package com.platzi.entity;

import lombok.Data;
import com.platzi.model.Cliente;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "reserva")
public class ReservaEntity  {
    @Id
    @GeneratedValue
    @Column(name="idReserva")
    private String  idReserva;
    @Column(name="fechaIngresoReserva")
    private Date fechaIngresoReserva;
    @Column(name="fechaSalidaReserva")
    private Date fechaSalidaReserva;
    @Column(name="cantidadPersonasReserva")
    private int cantidadPersonasReserva;
    @Column(name="descripcionReserva")
    private String descripcionReserva;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private ClienteEntity cliente;



}
