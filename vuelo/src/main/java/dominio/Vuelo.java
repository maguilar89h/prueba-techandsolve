package dominio;

import java.util.Date;
import java.util.List;

public class Vuelo {
	
	private String codigo;
	private Date horaSalida;
	private Date horaRetorno;
	
	public void setHoraRetorno(Date horaRetorno) {
		this.horaRetorno = horaRetorno;
	}
	private List<Puesto> puestos;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public List<Puesto> getPuestos() {
		return puestos;
	}
	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}
	
	public Date getHoraRetorno() {
		return horaRetorno;
	}

}
