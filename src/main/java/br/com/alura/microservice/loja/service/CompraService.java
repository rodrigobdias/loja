package br.com.alura.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDto;

@Component
public class CompraService {

	public void realizaCompre(CompraDTO compra) {
		
		RestTemplate client = new RestTemplate();
		ResponseEntity<InfoFornecedorDto> exchange = client.exchange("http://localhost:8088/info/"+compra.getEndereco().getEstado(), 
				HttpMethod.GET, null, InfoFornecedorDto.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}

}
