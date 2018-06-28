package pe.com.jockeysalud.model;

import java.util.Iterator;
import java.util.Map;

public class DSPojo {
	 Iterator iterator;

	 public void open(Object appContext, Map params) {
		 RptMargenContribucionData obj= new RptMargenContribucionData();

		 //como ultima linea llamamos al iterador
		 iterator = obj.getListGarantes().iterator();
	 }
	 
	 	public Object next() {
		  if (iterator.hasNext()) {
		   return iterator.next();
		  }
		  return null;
		 }

		 public void close() {
		  iterator = null;
		 }
	 
}
