package cliente;

import org.json.JSONObject;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class ClienteCorporativo extends Cliente {
    
	private static final String CORPORATIVO = "Corporativo";
    private static final int GRANDE = 1;
    private static final int MEDIANA = 2;
    private static final int PEQUEÑA = 3;
    private String nombreEmpresa;
    private int tamanoEmpresa;

    public ClienteCorporativo(String nombreEmpresa, int tamano) {
        super();
        this.nombreEmpresa = nombreEmpresa;
        this.tamanoEmpresa = tamano;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public int getTamanoEmpresa() {
        return tamanoEmpresa;
    }

    @Override
    public String getTipoCliente() {
        return CORPORATIVO;
    }

    @Override
    public String getIdentificador() {
        return super.getIdentificador();
    }

    public static ClienteCorporativo cargarDesdeJSON(JSONObject cliente) {
        String nombreEmpresa = cliente.getString("nombreEmpresa");
        int tamano = cliente.getInt("tamanoEmpresa");
        return new ClienteCorporativo(nombreEmpresa, tamano);
    }

    public JSONObject salvarEnJSON() {
        JSONObject json = new JSONObject();
        json.put("nombreEmpresa", nombreEmpresa);
        json.put("tamanoEmpresa", tamanoEmpresa);
        return json;
    }
}
