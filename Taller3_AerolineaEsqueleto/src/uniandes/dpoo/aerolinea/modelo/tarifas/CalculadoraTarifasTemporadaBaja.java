package uniandes.dpoo.aerolinea.modelo.tarifas;


import uniandes.dpoo.aerolinea.modelo.Vuelo;
import cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
		
	    private static final int COSTO_POR_KM_NATURAL = 600;
	    private static final int COSTO_POR_KM_CORPORATIVO = 900;
	    private static final double DESCUENTO_PEQ = 0.02;
	    private static final double DESCUENTO_MEDIANAS = 0.1;
	    private static final double DESCUENTO_GRANDES = 0.2;

	    @Override
	    public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
	        int costoBase = calcularCostoBase(vuelo, cliente);
	        double descuento = calcularPorcentajeDescuento(cliente);
	        int valorImpuestos = calcularValorImpuestos(costoBase);
	        return (int) (costoBase - (costoBase * descuento) + valorImpuestos);
	    }

	    @Override
	    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
	        int distancia = calcularDistanciaVuelo(vuelo.getRuta());
	        if (cliente.getTipoCliente().equals("Corporativo")) {
	            return distancia * COSTO_POR_KM_CORPORATIVO;
	        } else {
	            return distancia * COSTO_POR_KM_NATURAL;
	        }
	    }

	    @Override
	    protected double calcularPorcentajeDescuento(Cliente cliente) {
	        // Implementar lógica de descuentos basados en el tipo de cliente
	        // Ejemplo simple:
	        if (cliente.getTipo().equals("pequeño")) {
	            return DESCUENTO_PEQ;
	        } else if (cliente.getTipo().equals("mediana")) {
	            return DESCUENTO_MEDIANAS;
	        } else if (cliente.getTipo().equals("grande")) {
	            return DESCUENTO_GRANDES;
	        }
	        return 0;
	    }

		@Override
		public int calcularTarifa(uniandes.dpoo.aerolinea.modelo.tarifas.Vuelo vuelo,
				uniandes.dpoo.aerolinea.modelo.tarifas.Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected int calcularCostoBase(uniandes.dpoo.aerolinea.modelo.tarifas.Vuelo vuelo,
				uniandes.dpoo.aerolinea.modelo.tarifas.Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected double calcularPorcentajeDescuento(uniandes.dpoo.aerolinea.modelo.tarifas.Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int calcularTarifa(uniandes.dpoo.aerolinea.modelo.tarifas.Vuelo vuelo,
				uniandes.dpoo.aerolinea.modelo.tarifas.Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected int calcularCostoBase(uniandes.dpoo.aerolinea.modelo.tarifas.Vuelo vuelo,
				uniandes.dpoo.aerolinea.modelo.tarifas.Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected double calcularPorcentajeDescuento(uniandes.dpoo.aerolinea.modelo.tarifas.Cliente cliente) {
			// TODO Auto-generated method stub
			return 0;
		}
	}



