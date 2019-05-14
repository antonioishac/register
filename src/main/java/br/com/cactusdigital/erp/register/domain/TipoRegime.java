package br.com.cactusdigital.erp.register.domain;

/**
 * @author Antonio
 *
 */
public enum TipoRegime {

	LUCRO_REAL(1, "Lucro Real"), 
	LUCRO_PRESUMIDO(2, "Lucro Presumido"), 
	SIMPLES_NACIONAL(3, "Simples Nacional");

	private Integer codigo;
	private String descricao;	

	TipoRegime(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	/**
	 * Busca o tipo do enum pela descricao
	 * 
	 * @param param
	 * @return TipoRegime
	 */
	public static TipoRegime parse(String param) {
		for (TipoRegime tipoRegime : TipoRegime.values()) {
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
	public static TipoRegime parseCode(Integer param) {
		for (TipoRegime tipoRegime : TipoRegime.values()) {
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
