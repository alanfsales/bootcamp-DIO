package dio.gof.facade;

import dio.gof.subsistema1.crm.CrmService;
import dio.gof.subsistema2cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estatdo = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estatdo);
	}
}
