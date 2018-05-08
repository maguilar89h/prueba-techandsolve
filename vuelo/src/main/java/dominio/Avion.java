package dominio;

import java.util.List;

public class Avion {
	
	private String codigo;
	private String marca;
	private String modelo;
	private Integer capacidad;
	private List<Puesto> puestos;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public List<Puesto> getPuestos() {
		return puestos;
	}
	public void setPuestos(List<Puesto> puestos) {
		this.puestos = puestos;
	}

}
