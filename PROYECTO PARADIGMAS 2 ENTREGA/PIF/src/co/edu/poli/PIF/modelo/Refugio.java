package co.edu.poli.PIF.modelo;

public class Refugio {

	  private String nombre;
	  
	  private double latitud;
	  
	  private double longitud;
	  
	  private String chip;
	  
	  private String direccion;

	  private int telefono;

	  private String email;

	  private String hora_atencion;

	  private String capacidad_maxima;
	  
	  private Mascota mascotas;
	  
	  private Solicitud_Adopcion solicitud;

	public Refugio(String nombre, double latitud, double longitud, String chip, String direccion, int telefono,
			String email, String hora_atencion, String capacidad_maxima, Mascota mascotas,
			Solicitud_Adopcion solicitud) {
		super();
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.chip = chip;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.hora_atencion = hora_atencion;
		this.capacidad_maxima = capacidad_maxima;
		this.mascotas = mascotas;
		this.solicitud = solicitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHora_atencion() {
		return hora_atencion;
	}

	public void setHora_atencion(String hora_atencion) {
		this.hora_atencion = hora_atencion;
	}

	public String getCapacidad_maxima() {
		return capacidad_maxima;
	}

	public void setCapacidad_maxima(String capacidad_maxima) {
		this.capacidad_maxima = capacidad_maxima;
	}

	public Mascota getMascotas() {
		return mascotas;
	}

	public void setMascotas(Mascota mascotas) {
		this.mascotas = mascotas;
	}

	public Solicitud_Adopcion getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud_Adopcion solicitud) {
		this.solicitud = solicitud;
	}

	@Override
	public String toString() {
		return "Refugio [nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", chip=" + chip
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", hora_atencion="
				+ hora_atencion + ", capacidad_maxima=" + capacidad_maxima + ", mascotas=" + mascotas + ", solicitud="
				+ solicitud + "]";
	}


	
}
