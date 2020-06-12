package com.java.escola.bean;

import java.util.Date;

import javax.ejb.EJB;

import com.porto.infra.util.LogManager;
import com.java.escola.business.ITesteBusinessLocal;

/**
 *  Managed Bean referencia para arquitetura 3.0
 *  @author F011????
 */
public class TesteBean {

	public static final LogManager LOGGER = LogManager.getLog(TesteBean.class);

	private Date data;
	private String resultado = null;
	private String campo = null;

	@EJB
	private ITesteBusinessLocal teste;

	/**
	 * Teste de lookup de EJB 3.0
	 */
	public void enviar() {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Testando o lookup de EJB3");
		}
		this.resultado = this.getCampo() + " " + teste.testarLookup();
	}

	
	/**
	 * @return data
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the resultado
	 */
	public final String getResultado() {
		return resultado;
	}

	/**
	 * @param resultado
	 */
	public final void setResultado(String resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return campo
	 */
	public final String getCampo() {
		return campo;
	}

	/**
	 * @param campo
	 */
	public final void setCampo(String campo) {
		this.campo = campo;
	}
}