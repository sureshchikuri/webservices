
package com.vcs.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMsg", namespace = "http://vcs.com/msg/wsdl")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMsg", namespace = "http://vcs.com/msg/wsdl")
public class GetMsg {

    @XmlElement(name = "msg", namespace = "http://vcs.com/msg/wsdl/types")
    private String msg;

    /**
     * 
     * @return
     *     returns String
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * 
     * @param msg
     *     the value for the msg property
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
