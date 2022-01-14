package com.bbva.uuaa.customersv0.business.v0.dao.model.aaaat001_1;

import com.bbva.uuaa.customersv0.business.v0.dao.mapper.InputMapperAAAAT;
import com.bbva.uuaa.customersv0.business.v0.dao.mapper.OutputMapperAAAAT;
import lombok.Getter;
import lombok.Setter;
import com.bbva.jee.arq.spring.core.host.Atributo;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Transaccion;

/**
 * <p>Transacci&oacute;n <code>AAAAT001</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> RequestTransactionAaaat001_1</li>
 *    <li><b>Clase de respuesta:</b> ResponseTransactionAaaat001_1</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_apx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: AAAAT001-01-AR.xml
 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;yes&quot;?&gt;
 * &lt;transaction xmlns=&quot;http://www.w3schools.com&quot; transactionName=&quot;AAAAT001&quot; application=&quot;AAAA&quot; version=&quot;01&quot; country=&quot;AR&quot; language=&quot;ES&quot;&gt;
 * &lt;paramsIn&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;customerId&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;8&quot;/&gt;
 * &lt;/paramsIn&gt;
 * &lt;paramsOut&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;customer&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.aaaa.dto.training.CustomerDTO&quot; artifactId=&quot;AAAAC001&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;id&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;accountNumber&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;3&quot; name=&quot;dni&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;8&quot;/&gt;
 * &lt;parameter order=&quot;4&quot; name=&quot;name&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;5&quot; name=&quot;lastname&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;6&quot; name=&quot;dateOfBirth&quot; mandatory=&quot;0&quot; type=&quot;Date (YYYY-MM-DD)&quot; size=&quot;0&quot;/&gt;
 * &lt;list order=&quot;7&quot; name=&quot;cards&quot; mandatory=&quot;0&quot;&gt;
 * &lt;dto order=&quot;1&quot; name=&quot;Type&quot; mandatory=&quot;0&quot; package=&quot;com.bbva.aaaa.dto.training.CardDTO&quot; artifactId=&quot;AAAAC001&quot;&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;cardNumber&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;2&quot; name=&quot;type&quot; mandatory=&quot;0&quot; type=&quot;String&quot; size=&quot;7&quot;/&gt;
 * &lt;parameter order=&quot;3&quot; name=&quot;cardHolder&quot; mandatory=&quot;0&quot; type=&quot;Long&quot; size=&quot;20&quot;/&gt;
 * &lt;parameter order=&quot;4&quot; name=&quot;purchaseLimit&quot; mandatory=&quot;0&quot; type=&quot;Double&quot; size=&quot;10&quot;/&gt;
 * &lt;parameter order=&quot;5&quot; name=&quot;expirationDate&quot; mandatory=&quot;0&quot; type=&quot;Date (YYYY-MM)&quot; size=&quot;0&quot;/&gt;
 * &lt;/dto&gt;
 * &lt;/list&gt;
 * &lt;/dto&gt;
 * &lt;/paramsOut&gt;
 * &lt;description&gt;Training Transaction&lt;/description&gt;
 * &lt;/transaction&gt;
</pre></code>
 * 
 * @see ResponseTransactionAaaat001_1
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "AAAAT001",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_apx",
	respuesta = ResponseTransactionAaaat001_1.class,
	atributos = {@Atributo(nombre = "country", valor = "AR")},
	inputMapper = InputMapperAAAAT.class,
	outputMapper = OutputMapperAAAAT.class
)
@Getter
@Setter
public class RequestTransactionAaaat001_1 {
		
		/**
	 * <p>Campo <code>customerId</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "customerId", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 8, signo = true, obligatorio = true)
	private String customerId;
	
}