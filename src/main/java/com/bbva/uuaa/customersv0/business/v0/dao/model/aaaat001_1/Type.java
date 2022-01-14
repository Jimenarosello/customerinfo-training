package com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>Type</code>, utilizado por la clase <code>Cards</code></p>
 * 
 * @see Cards
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
@Getter
@Setter
public class Type {
	
	/**
	 * <p>Campo <code>cardNumber</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "cardNumber", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true)
	private String cardNumber;
	
	/**
	 * <p>Campo <code>type</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "type", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 7, signo = true)
	private String type;
	
	/**
	 * <p>Campo <code>cardHolder</code>, &iacute;ndice: <code>3</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 3, nombre = "cardHolder", tipo = TipoCampo.ENTERO, longitudMaxima = 20, signo = true)
	private BigInteger cardHolder;
	
	/**
	 * <p>Campo <code>purchaseLimit</code>, &iacute;ndice: <code>4</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 4, nombre = "purchaseLimit", tipo = TipoCampo.DECIMAL, longitudMaxima = 10, signo = true)
	private BigDecimal purchaseLimit;
	
	/**
	 * <p>Campo <code>expirationDate</code>, &iacute;ndice: <code>5</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 5, nombre = "expirationDate", tipo = TipoCampo.FECHA, signo = true, formato = "yyyy-MM")
	private Date expirationDate;
	
}