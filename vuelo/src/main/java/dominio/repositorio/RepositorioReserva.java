package dominio.repositorio;

import dominio.Reserva;

public interface RepositorioReserva {
	
	public void guardar(Reserva reserva);
	
	public Reserva consultar(String identificacion);

}
