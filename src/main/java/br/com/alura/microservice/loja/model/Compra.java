package br.com.alura.microservice.loja.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private Long pedidoId;
	private Integer tempoDePreparo;
	private String enderecoDestino;
	private LocalDate dataParaEntrega;
	private Long voucher;
	
	@Enumerated(EnumType.STRING)
	private CompraState state;

	public CompraState getState() {
		return state;
	}

	public void setState(CompraState state) {
		this.state = state;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalDate getDataParaEntrega() {
		return dataParaEntrega;
	}

	public Long getVoucher() {
		return voucher;
	}

	public LocalDate getLocalDate() {
		return dataParaEntrega;
	}

	public void setLocalDate(LocalDate localDate) {
		this.dataParaEntrega = localDate;
	}

	public Long getVoucherId() {
		return voucher;
	}

	public void setVoucherId(Long voucherId) {
		this.voucher = voucherId;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public void setDataParaEntrega(LocalDate previsaoParaEntrega) {
		this.dataParaEntrega = previsaoParaEntrega;
	}

	public void setVoucher(Long numero) {
		this.voucher = numero;
	}

}
