package lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 
 * Samuel Luna
 * Matheus Rodrigues
 * Ivandro Rodrigues
 * */

public class CD {

	private String artista;
	protected String titulo;
	private String trilhaPrincipal;
	private int numeroDeMusicas = 0;
	protected List<String> faixas;
	static int cont = 0;

	public CD(String artista, String titulo, int numeroDeMusicas) {
		this.artista = artista;
		this.titulo = titulo;
		this.numeroDeMusicas = numeroDeMusicas;
		faixas = new ArrayList();
	}

	public CD(String artista, String titulo) {
		this.artista = artista;
		this.titulo = titulo;
		this.numeroDeMusicas = 10;
		faixas = new ArrayList();
	}

	public boolean cadastrarFaixas(String musica) {
		if (cont <= this.numeroDeMusicas) {
			faixas.add(musica);
			this.setTrilhaPrincipal(musica);
			return true;
		} else {
			System.out.println("nao pode ser add.");
			return false;
		}
	}

	public String getTrilhaPrincipal() {
		return trilhaPrincipal;
	}

	public String setTrilhaPrincipal(String trilhaPrincipal)  {
		if (faixas.contains(trilhaPrincipal)) {
			this.trilhaPrincipal = trilhaPrincipal;
			return trilhaPrincipal;
		} else
			return null;

	}

	public int irPara(int numeroDaFaixa) {
		if (faixas.contains(numeroDaFaixa)) {
			return numeroDaFaixa;
		} else
			return (Integer) null;
	}

	public String getArtista() {
		return artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getM() {
		return numeroDeMusicas;
	}

	public String toString() {
		return "Artista:" + getArtista() + " Ttulo: " + getTitulo() + " trilhaPrincipal:" + getTrilhaPrincipal()
				+ " faixas: " + faixas.toString();
	}

	@Override
	public boolean equals(Object obj) {
		CD other = (CD) obj;
		if (artista == null) {
			if (other.artista != null)
				return false;
		} else if (!artista.equals(other.artista))
			return false;
		if (faixas == null) {
			if (other.faixas != null)
				return false;
		} else if (!faixas.equals(other.faixas))
			return false;
		if (numeroDeMusicas != other.numeroDeMusicas)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (trilhaPrincipal == null) {
			if (other.trilhaPrincipal != null)
				return false;
		} else if (!trilhaPrincipal.equals(other.trilhaPrincipal))
			return false;
		return true;
	}

}
