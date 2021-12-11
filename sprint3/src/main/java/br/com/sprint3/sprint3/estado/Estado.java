package br.com.sprint3.sprint3.estado;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTADOS")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private RegioesEnum regiao;
	private int populacao;
	private String capital;
	private double area;

	public Estado() {
	}

	public Estado(String nome, RegioesEnum regiao, int populacao, String capital, double area) {
		this.nome = nome;
		this.regiao = regiao;
		this.populacao = populacao;
		this.capital = capital;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public RegioesEnum getRegiao() {
		return regiao;
	}

	public int getPopulacao() {
		return populacao;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRegiao(RegioesEnum regiao) {
		this.regiao = regiao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setArea(double area) {
		this.area = area;
	}
}