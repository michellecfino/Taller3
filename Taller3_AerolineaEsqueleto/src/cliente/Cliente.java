package cliente;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String identificador;
    private List<Tiquete> tiquetesSinUsar;
    private List<Tiquete> tiquetesUsados;

    public Cliente(String identificador) {
        this.identificador = identificador;
        this.tiquetesSinUsar = new ArrayList<>();
        this.tiquetesUsados = new ArrayList<>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public abstract String getTipoCliente();

    public void agregarTiquete(Tiquete tiquete) {
        tiquetesSinUsar.add(tiquete);
    }

    public int calcularValorTotalTiquetes() {
        int total = 0;
        for (Tiquete tiquete : tiquetesSinUsar) {
            total += tiquete.getTarifa();
        }
        return total;
    }

    public void usarTiquetes(Vuelo vuelo) {
        List<Tiquete> usados = new ArrayList<>();
        for (Tiquete tiquete : tiquetesSinUsar) {
            if (tiquete.getVuelo().equals(vuelo) && !tiquete.esUsado()) {
                tiquete.marcarComoUsado();
                usados.add(tiquete);
                tiquetesUsados.add(tiquete);
            }
        }
        tiquetesSinUsar.removeAll(usados);
    }

    public List<Tiquete> getTiquetesSinUsar() {
        return tiquetesSinUsar;
    }

    public List<Tiquete> getTiquetesUsados() {
        return tiquetesUsados;
    }
}
