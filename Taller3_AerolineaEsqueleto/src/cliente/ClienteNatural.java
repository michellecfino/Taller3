package cliente;
import org.json.JSONObject;




public class ClienteNatural extends Cliente {



	public static final String NATURAL = "Natural";
	private String nombre;

	public ClienteNatural(String nombre) {
		super(nombre); 
		this.nombre = nombre;
	}

	@Override
	public String getIdentificador() {
		return super.getIdentificador();
	}

	@Override
	public String getTipoCliente() {
		return NATURAL;
	}

	public static ClienteNatural cargarDesdeJSON(JSONObject cliente) {
		String nombre = cliente.getString("nombre");
		return new ClienteNatural(nombre);
	}

	public JSONObject salvarEnJSON() {
		JSONObject json = new JSONObject();
		json.put("nombre", nombre);
		return json;
	}
}


