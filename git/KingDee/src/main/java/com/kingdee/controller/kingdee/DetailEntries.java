
package com.kingdee.controller.kingdee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DetailEntries complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DetailEntries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FDetailUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FDetailName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FDetailNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FTypeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailEntries", propOrder = {
    "fDetailUUID",
    "fDetailName",
    "fDetailNumber",
    "fTypeName",
    "fTypeNumber"
})
public class DetailEntries {

    @XmlElement(name = "FDetailUUID")
    protected String fDetailUUID; //具体 UUID
    @XmlElement(name = "FDetailName")
    protected String fDetailName; //具体名称
    @XmlElement(name = "FDetailNumber")
    protected String fDetailNumber; //具体编号
    @XmlElement(name = "FTypeName")
    protected String fTypeName; //类型名称
    @XmlElement(name = "FTypeNumber")
    protected String fTypeNumber; //类型编号

    /**
     * ��ȡfDetailUUID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDetailUUID() {
        return fDetailUUID;
    }

    /**
     * ����fDetailUUID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDetailUUID(String value) {
        this.fDetailUUID = value;
    }

    /**
     * ��ȡfDetailName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDetailName() {
        return fDetailName;
    }

    /**
     * ����fDetailName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDetailName(String value) {
        this.fDetailName = value;
    }

    /**
     * ��ȡfDetailNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDetailNumber() {
        return fDetailNumber;
    }

    /**
     * ����fDetailNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDetailNumber(String value) {
        this.fDetailNumber = value;
    }

    /**
     * ��ȡfTypeName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTypeName() {
        return fTypeName;
    }

    /**
     * ����fTypeName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTypeName(String value) {
        this.fTypeName = value;
    }

    /**
     * ��ȡfTypeNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTypeNumber() {
        return fTypeNumber;
    }

    /**
     * ����fTypeNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTypeNumber(String value) {
        this.fTypeNumber = value;
    }

}
