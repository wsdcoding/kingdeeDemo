package com.kingdee.controller.customer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-23T14:23:58.013+08:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://www.kingdee.com/Customer", name = "CustomerServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerServiceSoap {

    @WebMethod(operationName = "Query", action = "http://www.kingdee.com/Customer/Query")
    @RequestWrapper(localName = "Query", targetNamespace = "http://www.kingdee.com/Customer", className = "com.kingdee.customer.Query")
    @ResponseWrapper(localName = "QueryResponse", targetNamespace = "http://www.kingdee.com/Customer", className = "com.kingdee.customer.QueryResponse")
    public void query(
            @WebParam(name = "iAisID", targetNamespace = "http://www.kingdee.com/Customer")
                    int iAisID,
            @WebParam(name = "strUser", targetNamespace = "http://www.kingdee.com/Customer")
                    String strUser,
            @WebParam(name = "strPassword", targetNamespace = "http://www.kingdee.com/Customer")
                    String strPassword,
            @WebParam(name = "iPerCount", targetNamespace = "http://www.kingdee.com/Customer")
                    int iPerCount,
            @WebParam(name = "strFilter", targetNamespace = "http://www.kingdee.com/Customer")
                    String strFilter,
            @WebParam(mode = WebParam.Mode.INOUT, name = "strTimeStamp", targetNamespace = "http://www.kingdee.com/Customer")
                    javax.xml.ws.Holder<String> strTimeStamp,
            @WebParam(mode = WebParam.Mode.OUT, name = "QueryResult", targetNamespace = "http://www.kingdee.com/Customer")
                    javax.xml.ws.Holder<ArrayOfCustomer> queryResult,
            @WebParam(mode = WebParam.Mode.OUT, name = "strMaxTimeStamp", targetNamespace = "http://www.kingdee.com/Customer")
                    javax.xml.ws.Holder<String> strMaxTimeStamp,
            @WebParam(mode = WebParam.Mode.OUT, name = "strError", targetNamespace = "http://www.kingdee.com/Customer")
                    javax.xml.ws.Holder<String> strError
    );

    @WebMethod(operationName = "Update", action = "http://www.kingdee.com/Customer/Update")
    @RequestWrapper(localName = "Update", targetNamespace = "http://www.kingdee.com/Customer", className = "com.kingdee.customer.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://www.kingdee.com/Customer", className = "com.kingdee.customer.UpdateResponse")
    public void update(
            @WebParam(name = "iAisID", targetNamespace = "http://www.kingdee.com/Customer")
                    int iAisID,
            @WebParam(name = "strUser", targetNamespace = "http://www.kingdee.com/Customer")
                    String strUser,
            @WebParam(name = "strPassword", targetNamespace = "http://www.kingdee.com/Customer")
                    String strPassword,
            @WebParam(name = "Data", targetNamespace = "http://www.kingdee.com/Customer")
                    ArrayOfCustomer data,
            @WebParam(name = "bCheckByUUID", targetNamespace = "http://www.kingdee.com/Customer")
                    boolean bCheckByUUID,
            @WebParam(name = "bAddNewOnly", targetNamespace = "http://www.kingdee.com/Customer")
                    boolean bAddNewOnly,
            @WebParam(mode = WebParam.Mode.OUT, name = "UpdateResult", targetNamespace = "http://www.kingdee.com/Customer")
                    javax.xml.ws.Holder<Boolean> updateResult,
            @WebParam(mode = WebParam.Mode.OUT, name = "strError", targetNamespace = "http://www.kingdee.com/Customer")
                    javax.xml.ws.Holder<String> strError
    );
}
