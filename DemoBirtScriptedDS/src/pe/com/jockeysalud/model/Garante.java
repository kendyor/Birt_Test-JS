package pe.com.jockeysalud.model;

public class Garante {
	private String descripcion;
	private double cpm_costo;
	private double cpm_venta;
	private double pagoserv_costo;
	private double  pagoserv_venta;
	private double total_costo;
	private double tota_venta;
	//
	private double margen_cpm_soles;
	private double margen_pagoserv_soles;
	private double margen_total_soles;
	//
	private double margen_percent_cpm_soles;
	private double margen_percent_pagoserv_soles;
	private double margen_percent_total_soles;
	
	public Garante() {
		// TODO Auto-generated constructor stub
	}
	
	public Garante(String descripcion, double cpm_costo, double cpm_venta, double pagoserv_costo,
			double pagoserv_venta) {
		super();
		this.descripcion = descripcion;
		this.cpm_costo = cpm_costo;
		this.cpm_venta = cpm_venta;
		this.pagoserv_costo = pagoserv_costo;
		this.pagoserv_venta = pagoserv_venta;
		this.total_costo = this.getCpm_costo() + this.getPagoserv_costo();
		this.tota_venta = this.cpm_venta + this.getPagoserv_venta();
		//
		this.margen_cpm_soles = this.cpm_venta - this.cpm_costo;
		this.margen_pagoserv_soles = this.pagoserv_venta-this.pagoserv_costo;
		this.margen_total_soles = this.margen_cpm_soles+this.margen_pagoserv_soles;
		//
		this.margen_percent_cpm_soles = this.margen_cpm_soles * 100/tota_venta;
		this.margen_percent_pagoserv_soles = this.margen_pagoserv_soles * 100/tota_venta;
		this.margen_percent_total_soles = this.margen_percent_cpm_soles+this.margen_percent_pagoserv_soles;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCpm_costo() {
		return cpm_costo;
	}
	public void setCpm_costo(double cpm_costo) {
		this.cpm_costo = cpm_costo;
	}
	public double getCpm_venta() {
		return cpm_venta;
	}
	public void setCpm_venta(double cpm_venta) {
		this.cpm_venta = cpm_venta;
	}
	public double getPagoserv_costo() {
		return pagoserv_costo;
	}
	public void setPagoserv_costo(double pagoserv_costo) {
		this.pagoserv_costo = pagoserv_costo;
	}
	public double getPagoserv_venta() {
		return pagoserv_venta;
	}
	public void setPagoserv_venta(double pagoserv_venta) {
		this.pagoserv_venta = pagoserv_venta;
	}

	public double getTotal_costo() {
		return total_costo;
	}

	public void setTotal_costo(double total_costo) {
		this.total_costo = total_costo;
	}

	public double getTota_venta() {
		return tota_venta;
	}

	public void setTota_venta(double tota_venta) {
		this.tota_venta = tota_venta;
	}

	public double getMargen_cpm_soles() {
		return margen_cpm_soles;
	}

	public void setMargen_cpm_soles(double margen_cpm_soles) {
		this.margen_cpm_soles = margen_cpm_soles;
	}

	public double getMargen_pagoserv_soles() {
		return margen_pagoserv_soles;
	}

	public void setMargen_pagoserv_soles(double margen_pagoserv_soles) {
		this.margen_pagoserv_soles = margen_pagoserv_soles;
	}

	public double getMargen_total_soles() {
		return margen_total_soles;
	}

	public void setMargen_total_soles(double margen_total_soles) {
		this.margen_total_soles = margen_total_soles;
	}

	public double getMargen_percent_cpm_soles() {
		return margen_percent_cpm_soles;
	}

	public void setMargen_percent_cpm_soles(double margen_percent_cpm_soles) {
		this.margen_percent_cpm_soles = margen_percent_cpm_soles;
	}

	public double getMargen_percent_pagoserv_soles() {
		return margen_percent_pagoserv_soles;
	}

	public void setMargen_percent_pagoserv_soles(double margen_percent_pagoserv_soles) {
		this.margen_percent_pagoserv_soles = margen_percent_pagoserv_soles;
	}

	public double getMargen_percent_total_soles() {
		return margen_percent_total_soles;
	}

	public void setMargen_percent_total_soles(double margen_percent_total_soles) {
		this.margen_percent_total_soles = margen_percent_total_soles;
	}
	
	
}
