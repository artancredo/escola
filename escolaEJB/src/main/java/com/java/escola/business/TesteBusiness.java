package com.java.escola.business;

import javax.ejb.Stateless;

import com.porto.infra.util.LogManager;


/**
 *  Session Bean implementation class Teste
 *  @author F011????
 */
@Stateless
public class TesteBusiness implements ITesteBusinessLocal {

	public static final LogManager LOGGER = LogManager.getLog(TesteBusiness.class);
	
	//@PersistenceContext(unitName="?????")
	//private EntityManager em;
	
    /**
     * Construtor padr�o sem par�metros.
     */
    public TesteBusiness() {
    
    }

	
	/**
	 * Teste de lookup de EJB 3
	 * @return Resultado do teste de lookup.
	 */
    public String testarLookup() {
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("Lookup testado");
		}
		return "TESTADOOOOOOOO";
	}

}
