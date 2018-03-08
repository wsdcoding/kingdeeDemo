package com.kingdee.controller.kingdee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-07T18:17:57.671+08:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://www.kingdee.com/VoucherData", name = "VoucherServicesSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface VoucherServicesSoap {

    @WebMethod(operationName = "Query", action = "http://www.kingdee.com/VoucherData/Query")
    @RequestWrapper(localName = "Query", targetNamespace = "http://www.kingdee.com/VoucherData", className = "com.kingdee.voucherdata.Query")
    @ResponseWrapper(localName = "QueryResponse", targetNamespace = "http://www.kingdee.com/VoucherData", className = "com.kingdee.voucherdata.QueryResponse")
    public void query(
            @WebParam(name = "iAisID", targetNamespace = "http://www.kingdee.com/VoucherData")
                    int iAisID,
            @WebParam(name = "strUser", targetNamespace = "http://www.kingdee.com/VoucherData")
                    String strUser,
            @WebParam(name = "strPassword", targetNamespace = "http://www.kingdee.com/VoucherData")
                    String strPassword,
            @WebParam(name = "iPerCount", targetNamespace = "http://www.kingdee.com/VoucherData")
                    int iPerCount,
            @WebParam(name = "strFilter", targetNamespace = "http://www.kingdee.com/VoucherData")
                    String strFilter,
            @WebParam(mode = WebParam.Mode.INOUT, name = "strTimeStamp", targetNamespace = "http://www.kingdee.com/VoucherData")
                    javax.xml.ws.Holder<String> strTimeStamp,
            @WebParam(mode = WebParam.Mode.OUT, name = "QueryResult", targetNamespace = "http://www.kingdee.com/VoucherData")
                    javax.xml.ws.Holder<ArrayOfVoucher> queryResult,
            @WebParam(mode = WebParam.Mode.OUT, name = "strMaxTimeStamp", targetNamespace = "http://www.kingdee.com/VoucherData")
                    javax.xml.ws.Holder<String> strMaxTimeStamp,
            @WebParam(mode = WebParam.Mode.OUT, name = "strError", targetNamespace = "http://www.kingdee.com/VoucherData")
                    javax.xml.ws.Holder<String> strError
    );

    @WebMethod(operationName = "Update", action = "http://www.kingdee.com/VoucherData/Update")
    @RequestWrapper(localName = "Update", targetNamespace = "http://www.kingdee.com/VoucherData", className = "com.kingdee.voucherdata.Update")
    @ResponseWrapper(localName = "UpdateResponse", targetNamespace = "http://www.kingdee.com/VoucherData", className = "com.kingdee.voucherdata.UpdateResponse")
    public void update(
            @WebParam(name = "iAisID", targetNamespace = "http://www.kingdee.com/VoucherData")
                    int iAisID,
            @WebParam(name = "strUser", targetNamespace = "http://www.kingdee.com/VoucherData")
                    String strUser,
            @WebParam(name = "strPassword", targetNamespace = "http://www.kingdee.com/VoucherData")
                    String strPassword,
            @WebParam(name = "Data", targetNamespace = "http://www.kingdee.com/VoucherData")
                    ArrayOfVoucher data,
            @WebParam(name = "bCheckByUUID", targetNamespace = "http://www.kingdee.com/VoucherData")
                    boolean bCheckByUUID,
            @WebParam(name = "bAddNewOnly", targetNamespace = "http://www.kingdee.com/VoucherData")
                    boolean bAddNewOnly,
            @WebParam(name = "iBillClassTypeID", targetNamespace = "http://www.kingdee.com/VoucherData")
                    int iBillClassTypeID,
            @WebParam(mode = WebParam.Mode.OUT, name = "UpdateResult", targetNamespace = "http://www.kingdee.com/VoucherData")
                    javax.xml.ws.Holder<Boolean> updateResult,
            @WebParam(mode = WebParam.Mode.OUT, name = "strError", targetNamespace = "http://www.kingdee.com/VoucherData")
                    javax.xml.ws.Holder<String> strError
    );
}
