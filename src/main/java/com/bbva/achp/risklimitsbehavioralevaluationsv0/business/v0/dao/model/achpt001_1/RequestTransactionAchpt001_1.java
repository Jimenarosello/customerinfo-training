package com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.model.achpt001_1;

import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.mapper.InputMapperACHPT;
import com.bbva.achp.risklimitsbehavioralevaluationsv0.business.v0.dao.mapper.OutputMapperACHPT;
import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Atributo;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Transaccion;

/**
 * <p>Transacci&oacute;n <code>ACHPT001</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> RequestTransactionAchpt001_1</li>
 *    <li><b>Clase de respuesta:</b> ResponseTransactionAchpt001_1</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_apx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: ACHPT001-01-AR.xml
 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;yes&quot;?&gt;
 * &lt;transaction xmlns=&quot;http://www.w3schools.com&quot; transactionName=&quot;ACHPT001&quot; application=&quot;ACHP&quot; version=&quot;01&quot; country=&quot;AR&quot; language=&quot;ES&quot;&gt;
 * &lt;paramsIn&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;customerId&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;/paramsIn&gt;
 * &lt;paramsOut&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;10&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;exclusionReasonCode&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;10&quot;/&gt;
 * &lt;parameter order=&quot;3&quot; name=&quot;riskGroup&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;10&quot;/&gt;
 * &lt;parameter order=&quot;4&quot; name=&quot;lastAccreditationDate&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;5&quot; name=&quot;totalMonthsPayroll&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;6&quot; name=&quot;payrollCompanyCode&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;7&quot; name=&quot;numberTotalAccreditations&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;8&quot; name=&quot;riskScore&quot; mandatory=&quot;0&quot; type=&quot;Double&quot; size=&quot;20&quot;/&gt;
 * &lt;dto order=&quot;9&quot; name=&quot;riskSegment&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.actk.dto.risks.RiskSegmentDTO&quot; artifactId=&quot;ACTKC000&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;dto order=&quot;10&quot; name=&quot;lastPayrollIncome&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.actk.dto.risks.LastPayrollIncomeDTO&quot; artifactId=&quot;ACTKC000&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;amount&quot; mandatory=&quot;0&quot; type=&quot;Double&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;currency&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;/paramsOut&gt;
 * &lt;description&gt;Trx Proactive Hermes&lt;/description&gt;
 * &lt;/transaction&gt;
</pre></code>
 * 
 * @see ResponseTransactionAchpt001_1
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "ACHPT001",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_apx",
	respuesta = ResponseTransactionAchpt001_1.class,
	atributos = {@Atributo(nombre = "country", valor = "AR")},
	inputMapper = InputMapperACHPT.class,
	outputMapper = OutputMapperACHPT.class
)
@Getter
@Setter
public class RequestTransactionAchpt001_1 {
		
		/**
	 * <p>Campo <code>customerId</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "customerId", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 20, signo = true)
	private String customerId;
	
}