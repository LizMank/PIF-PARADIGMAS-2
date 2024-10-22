package co.edu.poli.PIF.servicios;

import co.edu.poli.PIF.modelo.Mascota;
import co.edu.poli.PIF.modelo.Refugio;
import co.edu.poli.PIF.modelo.Solicitud_Adopcion;

public class Refugio_de_paso extends Refugio{
	
	private String seguimientoPersonalizado;

	public Refugio_de_paso(String nombre, double latitud, double longitud, String id, String direccion, int telefono,
			String email, String hora_atencion, String capacidad_maxima, Mascota mascotas, Solicitud_Adopcion solicitud,
			String seguimientoPersonalizado) {
		super(nombre, latitud, longitud, id, direccion, telefono, email, hora_atencion, capacidad_maxima, mascotas,
				solicitud);
		this.seguimientoPersonalizado = seguimientoPersonalizado;
	}

	public String getSeguimientoPersonalizado() {
		return seguimientoPersonalizado;
	}

	public void setSeguimientoPersonalizado(String seguimientoPersonalizado) {
		this.seguimientoPersonalizado = seguimientoPersonalizado;
	}

	@Override
	public String toString() {
		return "Refugio_de_paso [seguimientoPersonalizado=" + seguimientoPersonalizado + "]";
	}


}
