package com.vetnova.atencionclinica.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fichas_clinicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FichaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El ID o nombre de la mascota es obligatorio")
    private String mascota; // En el futuro esto será el ID del MS Mascotas

    @NotBlank(message = "El diagnóstico no puede estar vacío")
    @Size(min = 5, max = 500, message = "El diagnóstico debe tener entre 5 y 500 caracteres")
    private String diagnostico;

    private String tratamiento;

    @NotBlank(message = "El veterinario responsable es obligatorio")
    private String veterinario;
}