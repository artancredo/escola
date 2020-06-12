package com.java.escola.business;
import javax.ejb.Local;

/**
 *  Interface local do EJB 3.0 Teste
 *  @author F011????
 */
@Local
public interface ITesteBusinessLocal {
	
	/**
	 * Teste de lookup de EJB 3
	 * @return Resultado do teste de lookup.
	 */
	public String testarLookup();
}