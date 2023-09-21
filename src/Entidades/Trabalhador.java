package Entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Entidades_enum.NivelTrabalhador;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalhador nivel;
	private double salario_base;
	
	private Departamento departamento;
	private List<HoraContrato> contrato = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, double salario_base, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario_base = salario_base;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContrato() {
		return contrato;
	}

	public void adicionarContrato(HoraContrato contratos) {
		adicionarContrato(contrato);
	}
	
	public void adcionarContrato(HoraContrato contratos) {
		contrato.add(contratos);
	}
	
	public void removeContrato(HoraContrato contratos) {
	contrato.add(contratos);
	}
	
	public double renda(int ano, int mes) {
		double soma = salario_base;
		Calendar cal = Calendar.getInstance();
		for(HoraContrato c :contrato) {
			cal.setTime(c.getDate());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma = soma + c.valorTotal();
			}
		}
		return soma;
	}
	
}
