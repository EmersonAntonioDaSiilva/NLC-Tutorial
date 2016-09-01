package br.com.afirmanet.core.constant;

import java.nio.charset.Charset;

/**
 * <p>
 * Centraliza a defini��o de Charsets.
 * </p>
 */
public final class CharsetConstants {

	public static final Charset UTF8 = Charset.forName("UTF-8");

	/**
	 * <p>
	 * Classe utilit�ria n�o deve ter construtor p�blico ou default.
	 * </p>
	 */
	private CharsetConstants() {
		// Classe utilit�ria n�o deve ter construtor p�blico ou default
	}

}
