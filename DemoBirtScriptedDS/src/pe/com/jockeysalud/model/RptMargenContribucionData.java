package pe.com.jockeysalud.model;

import java.util.ArrayList;
import java.util.List;

public class RptMargenContribucionData {
	private String beneficio_cobertura ="Todas";
	private String especialidad="Todas";
	private String agrup_diag="Todas";
	private Sociedad cliente=new Sociedad("COMPAÑIA RIVERA");
	private List<Garante> listGarantes;
	
	
	public RptMargenContribucionData() {
		super();
	}
	public String getBeneficio_cobertura() {
		return beneficio_cobertura;
	}
	public void setBeneficio_cobertura(String beneficio_cobertura) {
		this.beneficio_cobertura = beneficio_cobertura;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getAgrup_diag() {
		return agrup_diag;
	}
	public void setAgrup_diag(String agrup_diag) {
		this.agrup_diag = agrup_diag;
	}
	public Sociedad getCliente() {
		return cliente;
	}
	public void setCliente(Sociedad cliente) {
		this.cliente = cliente;
	}
	public List<Garante> getListGarantes() {
		
			listGarantes = new ArrayList<Garante>();
			listGarantes.add(new Garante("Formación Laboral", 2992, 5625, 0	, 0));
			listGarantes.add(new Garante("Planes Médicos EPS", 2533570, 2956559, 347120	, 376435));
		
		return listGarantes;
	}
	public void setListGarantes(List<Garante> listGarantes) {
		this.listGarantes = listGarantes;
	}

	
}
