
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoDocumento.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDocumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Factura"/>
 *     &lt;enumeration value="Boleta"/>
 *     &lt;enumeration value="NotaCredito"/>
 *     &lt;enumeration value="NotaDebito"/>
 *     &lt;enumeration value="ConsolidadoBoletas"/>
 *     &lt;enumeration value="NumeradoNoEmitido"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumento")
@XmlEnum
public enum TipoDocumento {

    @XmlEnumValue("Factura")
    FACTURA("Factura"),
    @XmlEnumValue("Boleta")
    BOLETA("Boleta"),
    @XmlEnumValue("NotaCredito")
    NOTA_CREDITO("NotaCredito"),
    @XmlEnumValue("NotaDebito")
    NOTA_DEBITO("NotaDebito"),
    @XmlEnumValue("ConsolidadoBoletas")
    CONSOLIDADO_BOLETAS("ConsolidadoBoletas"),
    @XmlEnumValue("NumeradoNoEmitido")
    NUMERADO_NO_EMITIDO("NumeradoNoEmitido");
    private final String value;

    TipoDocumento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumento fromValue(String v) {
        for (TipoDocumento c: TipoDocumento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
