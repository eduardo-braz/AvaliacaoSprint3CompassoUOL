package br.com.sprint3.sprint3.controllers.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.sprint3.sprint3.estado.Estado;
import br.com.sprint3.sprint3.estado.RegioesEnum;

public class EstadoDto {
	private int id;
	private String nome;
	private RegioesEnum regiao;
	private int populacao;
	private String capital;
	private double area;
	public EstadoDto() {
		
	}
	public EstadoDto(Estado estado) {
		this.id = estado.getId();
		this.nome = estado.getNome();
		this.regiao = estado.getRegiao();
		this.populacao = estado.getPopulacao();
		this.capital = estado.getCapital();
		this.area = estado.getArea();
	}	
	public static List<EstadoDto> toEstadoDto (List<Estado> estados){
		return estados.stream().map(EstadoDto::new).collect(Collectors.toList());
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
}
