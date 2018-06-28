package pe.com.jockeysalud.model;

public class Main {
	public static void main(String args[])throws Exception{
		 RptMargenContribucionData obj= new RptMargenContribucionData();
		 
		System.out.println(obj.getListGarantes().get(0).getDescripcion());
	}
}
