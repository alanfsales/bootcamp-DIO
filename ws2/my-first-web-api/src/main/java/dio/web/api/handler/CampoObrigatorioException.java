package dio.web.api.handler;

public class CampoObrigatorioException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public CampoObrigatorioException(String campo) {
		super("O campo %s é obrigatório.", campo);
	}
}
