package model.exception;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> erros = new HashMap<>();// variavel para guarda os erros de cada campo do formulario
														//String = campo, string = erro
	
	public ValidationException(String msg) {
		super(msg);
	}

	public Map<String, String> getErros() {
		return erros;
	}
	
	public void addErros(String fieldName, String erroMsg) {
		this.erros.put( fieldName, erroMsg);
	}

}
