package uniandes.dpoo.aerolinea.tiquetes;
import cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class Tiquete {
	
	private String codigo;
	private Vuelo vuelo;
	private Cliente clienteComprador;
	private int tarifa;
	private boolean usado;
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		super();
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
		this.tarifa = tarifa;
		this.usado = false;
	}
	
	public Cliente getClienteComprador() {
		return clienteComprador;
	}
	

	public Vuelo getVuelo() {
		return vuelo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public void marcarComoUsado() {
		this.usado=true;
	}
	public boolean esUsado() {
		return usado;
	}

	
	
	
	
	
	
}
