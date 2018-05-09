package manejador;

import dominio.Avion;
import dominio.Reserva;
import dominio.Vuelo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class AplicacionManejador {
	
	private Logger logger = Logger.getLogger(AplicacionManejador.class);
	private Avion avion;
	private Vuelo vuelo;
	private List<Reserva> listadoReservas;
	
	public AplicacionManejador(){
		avion = new Avion();
		vuelo = new Vuelo();
		listadoReservas = new ArrayList<>();
	}
	
	public void guardarReserva(Reserva reserva) {
		if(listadoReservas!=null && !listadoReservas.isEmpty()){
			listadoReservas.add(reserva);
		}
	}
	
	private boolean existeReserva() {
		boolean exite = false;
		if(listadoReservas!=null && !listadoReservas.isEmpty()){
			
		}
		return exite;
		
	}
	
	

}
