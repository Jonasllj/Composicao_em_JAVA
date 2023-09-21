package Entidades;

import java.util.Date;

public class HoraContrato {
	
	private Date date;
	private Double valor_por_hora;
	private Integer hora;
	
	public HoraContrato() {
	}

	public HoraContrato(Date date, Double valor_por_hora, Integer hora) {
		this.date = date;
		this.valor_por_hora = valor_por_hora;
		this.hora = hora;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValor_por_hora() {
		return valor_por_hora;
	}

	public void setValor_por_hora(Double valor_por_hora) {
		this.valor_por_hora = valor_por_hora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}
	
	public double valorTotal() {
		return valor_por_hora * hora;
	}
}
