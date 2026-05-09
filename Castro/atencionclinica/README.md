# Proyecto Backend - Clinica Veterinaria VetNova

Proyecto desarrollado para la asignatura Desarrollo FullStack I (DSY1103). 
Este repositorio contiene la propuesta tecnica y el desarrollo del backend para la migracion del sistema monolitico de la Clinica Veterinaria VetNova hacia una Arquitectura de Microservicios.

## Descripcion del Proyecto
VetNova es una clinica en expansion con sucursales en Chillan, Los Angeles y Talca. Debido a problemas de rendimiento y alto acoplamiento en su sistema actual, se propone una arquitectura distribuida (Domain-Driven Design) para escalar los servicios de forma independiente, aislar fallos y mejorar la seguridad y privacidad de los datos clinicos.

## Tecnologias Utilizadas
* Lenguaje: Java
* Framework: Spring Boot (MVC)
* Persistencia: Spring Data JPA / Hibernate
* Base de Datos: MySQL (XAMPP local)
* Herramientas: Maven, Lombok, Postman, Git/GitHub
* Validaciones: Jakarta Bean Validation

## Arquitectura (Patron CSR)
Todos los microservicios de este ecosistema estan desarrollados siguiendo el patron Controller - Service - Repository, garantizando un codigo modular, mantenible y escalable, ademas de contar con un manejo global de excepciones (@RestControllerAdvice).

## Microservicios del Equipo
* atencionclinica-service: Gestion de fichas clinicas, diagnosticos y tratamientos (Disponible en este repositorio).
* ventas-pagos-service: (En desarrollo)
* agenda-service: (En desarrollo)

---
Desarrollado aplicando buenas practicas de codigo, control de versiones y manejo de errores HTTP formal.