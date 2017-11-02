package com.iwcn.master.services.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.iwcn.master.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	Usuario findByNombre (String nombre);	

}
