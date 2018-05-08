package controlador;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dominio.Reserva;

@RestController
public class ReservaControlador {

	@PostMapping("/reserva/")
	public void guardar(@RequestBody @Valid Reserva reserva){
		
	}
	
	@GetMapping("/reserva/{id}")
	public Reserva consultar(@PathVariable String id) {
		
		return new Reserva();
	}
	
}
