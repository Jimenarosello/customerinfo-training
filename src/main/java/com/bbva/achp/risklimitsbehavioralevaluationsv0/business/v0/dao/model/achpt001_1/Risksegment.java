package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1;

import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>riskSegment</code>, utilizado por la clase <code>ResponseTransactionAchpt001_1</code></p>
 * 
 * @see ResponseTransactionAchpt001_1
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
@Getter
@Setter
public class Risksegment {
	
	/**
	 * <p>Campo <code>id</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "id", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 9, signo = true)
	private String id;
	
}