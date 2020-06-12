package com.java.escola.business;
import javax.ejb.Remote;

/**
 *  Interface remota do EJB 3.0 Teste
 *  @author F011????
 */
@Remote
public interface ITesteBusiness {
	
	/**
	 * Teste de lookup de EJB 3
	 * @return Resultado do teste de lookup.
	 */
	public String testarLookup();
}