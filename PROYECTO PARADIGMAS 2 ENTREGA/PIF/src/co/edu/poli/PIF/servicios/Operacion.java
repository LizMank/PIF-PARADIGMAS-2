package co.edu.poli.PIF.servicios;

import co.edu.poli.PIF.modelo.Solicitud_Adopcion;

public interface Operacion {

	public String create (Solicitud_Adopcion x);
	public Solicitud_Adopcion[] readall ();
	public Solicitud_Adopcion read (int codigo);
	public String update (int codigo, Solicitud_Adopcion y);
	public Solicitud_Adopcion delete (int codigo);

}

