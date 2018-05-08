package controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dominio.Vuelo;

@RestController
public class VueloControlador {
	
	@GetMapping("/vuelo/")
	public List<Vuelo> listarVuelos(){
		List<Vuelo> vuelos = new ArrayList<>();
		
		return vuelos;
	}

}
