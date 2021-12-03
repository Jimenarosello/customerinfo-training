package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>lastPayrollIncome</code>, utilizado por la clase <code>ResponseTransactionAchpt001_1</code></p>
 * 
 * @see ResponseTransactionAchpt001_1
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
@Getter
@Setter
public class Lastpayrollincome {
	
	/**
	 * <p>Campo <code>amount</code>, &iacute;ndice: <code>1</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 1, nombre = "amount", tipo = TipoCampo.DECIMAL, longitudMaxima = 20, signo = true)
	private BigDecimal amount;
	
	/**
	 * <p>Campo <code>currency</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "currency", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true)
	private String currency;
	
}