package br.com.sprint3.sprint3.controllers.form;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import br.com.sprint3.sprint3.estado.Estado;
import br.com.sprint3.sprint3.estado.RegioesEnum;
import br.com.sprint3.sprint3.repositories.EstadoRepository;

public class EstadoForm {
	@NotNull @NotEmpty @Length(max = 50)
	private String nome;
	@Enumerated(EnumType.STRING)
	private RegioesEnum regiao;
	@Range(min = 0)
	private int populacao;
	@NotNull @NotEmpty @Length(max = 50)
	private String capital;
	@Range(min = 0) 
	private double area;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public RegioesEnum getRegiao() {
		return regiao;
	}
	public void setRegiao(RegioesEnum regiao) {
		this.regiao = regiao;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Estado atualizar(int id, EstadoRepository estadoRepository) {
		Estado estado = estadoRepository.getById(id);
		estado.setNome(this.nome);
		estado.setArea(this.area);
		estado.setCapital(this.capital);
		estado.setPopulacao(this.populacao);
		estado.setRegiao(this.regiao);
	
		return estado;
	}
	
}
