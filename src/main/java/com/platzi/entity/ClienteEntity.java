package com.platzi.entity;

import lombok.Data;
import com.platzi.model.Reserva;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "cliente")

public class ClienteEntity {

    @Id
    @GeneratedValue
    @Column(name="idCliente")
    private Long idCliente;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="identificacion")
    private String identificacion;
    @Column(name="direccion")
    private String direccion;
    @Column(name="telefono")
    private String telefono;
    @Column(name="mail")
    private String mail;

}
