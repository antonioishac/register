package br.com.cactusdigital.erp.register.domain.enums;

/**
 * @author Antonio
 *
 */
public enum TipoRegimeEnum {

	LUCRO_REAL(1, "Lucro Real"), 
	LUCRO_PRESUMIDO(2, "Lucro Presumido"), 
	SIMPLES_NACIONAL(3, "Simples Nacional");

	private Integer codigo;
	private String descricao;	

	TipoRegimeEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	/**
	 * Busca o tipo do enum pela descricao
	 * 
	 * @param param
	 * @return TipoRegime
	 */
	public static TipoRegimeEnum parse(String param) {
		for (TipoRegimeEnum tipoRegime : TipoRegimeEnum.values()) {
			if (tipoRegime.name().equalsIgnoreCase(param)) {
				return tipoRegime;
			}
		}
		return null;
	}
	
	/**
	 * Busca o tipo do enum pelo codigo
	 * 
	 * @param param
	 * @return TipoRegime
	 */
	public static TipoRegimeEnum parseCode(Integer param) {
		for (TipoRegimeEnum tipoRegime : TipoRegimeEnum.values()) {
			if (tipoRegime.ordinal() == param) {
				return tipoRegime;
			}
		}
		return null;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}	

	/**
	 * @return the codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

}
