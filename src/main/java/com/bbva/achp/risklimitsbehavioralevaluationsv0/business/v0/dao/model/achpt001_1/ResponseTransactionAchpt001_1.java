package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1;

import java.math.BigDecimal;
import com.bbva.jee.arq.spring.core.host.Cabecera;
import com.bbva.jee.arq.spring.core.host.NombreCabecera;

import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.RespuestaTransaccion;
import com.bbva.jee.arq.spring.core.host.TipoCampo;

/**
 * Bean de respuesta para la transacci&oacute;n <code>ACHPT001</code>
 * 
 * @see RequestTransactionAchpt001_1
 */
@RespuestaTransaccion
@Formato(nombre = "1")
@Getter
@Setter
public class ResponseTransactionAchpt001_1 {
	
	/**
	 * <p>Cabecera <code>COD-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.CODIGO_AVISO)
	private String codigoAviso;
	
	/**
	 * <p>Cabecera <code>DES-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.DESCRIPCION_AVISO)
	private String descripcionAviso;
	
	/**
	 * <p>Cabecera <code>COD-UUAA-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.APLICACION_AVISO)
	private String aplicacionAviso;
	
	/**
	 * <p>Cabecera <code>COD-RETORNO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.CODIGO_RETORNO)
	private String codigoRetorno;
	
	/**
	 * <p>Campo <code>id</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "id", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 8, signo = true)
	private String id;
	
	/**
	 * <p>Campo <code>exclusionReasonCode</code>, &iacute;ndice: <code>2</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 2, nombre = "exclusionReasonCode", tipo = TipoCampo.ENTERO, longitudMaxima = 6, signo = true)
	private Integer exclusionReasonCode;
	
	/**
	 * <p>Campo <code>riskGroup</code>, &iacute;ndice: <code>3</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 3, nombre = "riskGroup", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 2, signo = true)
	private String riskGroup;
	
	/**
	 * <p>Campo <code>lastAccreditationDate</code>, &iacute;ndice: <code>4</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 4, nombre = "lastAccreditationDate", tipo = TipoCampo.ENTERO, longitudMaxima = 6, signo = true)
	private Integer lastAccreditationDate;
	
	/**
	 * <p>Campo <code>totalMonthsPayroll</code>, &iacute;ndice: <code>5</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 5, nombre = "totalMonthsPayroll", tipo = TipoCampo.ENTERO, longitudMaxima = 6, signo = true)
	private Integer totalMonthsPayroll;
	
	/**
	 * <p>Campo <code>payrollCompanyCode</code>, &iacute;ndice: <code>6</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 6, nombre = "payrollCompanyCode", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 9, signo = true)
	private String payrollCompanyCode;
	
	/**
	 * <p>Campo <code>numberTotalAccreditations</code>, &iacute;ndice: <code>7</code>, tipo: <code>ENTERO</code>
	 */
	@Campo(indice = 7, nombre = "numberTotalAccreditations", tipo = TipoCampo.ENTERO, longitudMaxima = 6, signo = true)
	private Integer numberTotalAccreditations;
	
	/**
	 * <p>Campo <code>riskScore</code>, &iacute;ndice: <code>8</code>, tipo: <code>DECIMAL</code>
	 */
	@Campo(indice = 8, nombre = "riskScore", tipo = TipoCampo.DECIMAL, longitudMaxima = 25, signo = true)
	private BigDecimal riskScore;
	
	/**
	 * <p>Campo <code>riskSegment</code>, &iacute;ndice: <code>9</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 9, nombre = "riskSegment", tipo = TipoCampo.DTO)
	private Risksegment riskSegment;
	
	/**
	 * <p>Campo <code>lastPayrollIncome</code>, &iacute;ndice: <code>10</code>, tipo: <code>DTO</code>
	 */
	@Campo(indice = 10, nombre = "lastPayrollIncome", tipo = TipoCampo.DTO)
	private Lastpayrollincome lastPayrollIncome;
	
}