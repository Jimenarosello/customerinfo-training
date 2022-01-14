package com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.FilaCampoTabular;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * <p>Bean fila para el campo tabular <code>customer</code>, utilizado por la clase <code>ResponseTransactionAaaat001_1</code></p>
 * 
 * @see ResponseTransactionAaaat001_1
 * 
 * @author Arquitectura Spring BBVA
 */
@FilaCampoTabular
@Getter
@Setter
public class Customer {
	
	/**
	 * <p>Campo <code>id</code>, &iacute;ndice: <code>1</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 1, nombre = "id", tipo = TipoCampo.ENTERO, longitudMaxima = 20, signo = true)
	private BigInteger id;
	
	/**
	 * <p>Campo <code>accountNumber</code>, &iacute;ndice: <code>2</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 2, nombre = "accountNumber", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true)
	private String accountNumber;
	
	/**
	 * <p>Campo <code>dni</code>, &iacute;ndice: <code>3</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 3, nombre = "dni", tipo = TipoCampo.ENTERO, longitudMaxima = 8, signo = true)
	private Integer dni;
	
	/**
	 * <p>Campo <code>name</code>, &iacute;ndice: <code>4</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 4, nombre = "name", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true)
	private String name;
	
	/**
	 * <p>Campo <code>lastname</code>, &iacute;ndice: <code>5</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 5, nombre = "lastname", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true)
	private String lastname;
	
	/**
	 * <p>Campo <code>dateOfBirth</code>, &iacute;ndice: <code>6</code>, tipo: <code>FECHA</code>
	 */
	@Campo(indice = 6, nombre = "dateOfBirth", tipo = TipoCampo.FECHA, signo = true, formato = "yyyy-MM-dd")
	private Date dateOfBirth;
	
	/**
	 * <p>Campo <code>cards</code>, &iacute;ndice: <code>7</code>, tipo: <code>LIST</code>
	 */
	@Campo(indice = 7, nombre = "cards", tipo = TipoCampo.LIST)
	private List<Cards> cards;
	
}