package com.vetnova.atencionclinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atenciones")
public class Atencion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre de la mascota no puede estar vacío")
    private String nombreMascota;

    @NotBlank(message = "El diagnóstico es obligatorio")
    @Size(min = 10, max = 200, message = "El diagnóstico debe tener entre 10 y 200 caracteres")
    private String diagnostico;

    @NotBlank(message = "El nombre del veterinario es obligatorio")
    private String veterinario;

    @NotNull(message = "El costo de la atención no puede ser nulo")
    private Integer costo;
}