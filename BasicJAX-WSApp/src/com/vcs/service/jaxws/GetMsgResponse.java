
package com.vcs.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMsgResponse", namespace = "http://vcs.com/msg/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMsgResponse", namespace = "http://vcs.com/msg/wsdl")
public class GetMsgResponse {

    @XmlElement(name = "return", namespace = "http://vcs.com/msg/wsdl/types")
    private String _return;

    /**
     * 
     * @return
     *     returns String
     */
    public String getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(String _return) {
        this._return = _return;
    }

}
