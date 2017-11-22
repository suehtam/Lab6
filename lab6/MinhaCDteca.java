package lab4;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author
 * Samuel Luna
 * Matheus Rodrigues
 * Ivandro Rodrigues
 * */

public class MinhaCDteca {

	private List<CD> Cds;

	public MinhaCDteca() {
		Cds = new ArrayList();
	}

	public void adicionaCD(CD cd) {
		Cds.add(cd);
	}

	public void adicionaCDs(List cds) {
		Cds.addAll(cds);
	}

	public String removeCD(String titulo) {
		if (Cds.contains(titulo)) {
			Cds.remove(titulo);
			return "Cd removido!";

		} else
			return null;
	}

	public boolean removeCDs(List cds) {
		if (Cds.removeAll(cds)) {
			return true;
		} else
			return false;
	}
	
	public String pesquisaCD(String titulo) {
		if(Cds.contains(titulo)) {
			return "cd encontrado!";
		}else
			return null;		
	}
	
	public int numeroDeCDs() {
		return Cds.size();
	}
	
	
}
