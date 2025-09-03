package com.example.API.MODELO.MIERCOLES.repositorios;

import com.example.API.MODELO.MIERCOLES.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario,Integer> {
    //Espacio donde se personalizan las consultas en sql (DISTINTAS A LAS 5 BASICAS)

    //BUSCANDO UN USUARIO POR NOMBRE EXATO
    Optional<Usuario> findByNombre(String nombre);

    //BUSCANDO UN USUARIO POR CORREO
    Optional<Usuario> finByCorreo(String correo);

    //Buscando todos los usuarios que tengan un nombre en especifico
    List<Usuario> finByNombreContaining(String nombre);

    //Buscando todos los usuarios cuyo correo comience por :
    List<Usuario> finByCorreoStartingWith(String correo);
}
