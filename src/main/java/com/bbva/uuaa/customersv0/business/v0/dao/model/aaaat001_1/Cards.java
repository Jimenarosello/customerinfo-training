package com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1;

import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>cards</code>, utilizado por la clase <code>Customer</code></p>
 * 
 * @see Customer
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
@Getter
@Setter
public class Cards {
	
	/**
	 * <p>Campo <code>Type</code>, &iacute;ndice: <code>1</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 1, nombre = "Type", tipo = TipoCampo.DTO)
	private Type Type;
	
}