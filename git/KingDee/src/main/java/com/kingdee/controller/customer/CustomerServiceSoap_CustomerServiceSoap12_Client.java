
package com.kingdee.controller.customer;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-23T14:23:58+08:00
 * Generated source version: 3.2.0
 * 
 */
public final class CustomerServiceSoap_CustomerServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.kingdee.com/Customer", "CustomerService");

    private CustomerServiceSoap_CustomerServiceSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = CustomerService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CustomerService ss = new CustomerService(wsdlURL, SERVICE_NAME);
        CustomerServiceSoap port = ss.getCustomerServiceSoap12();  
        
        {
        System.out.println("Invoking query...");
        int _query_iAisID = 0;
        String _query_strUser = "";
        String _query_strPassword = "";
        int _query_iPerCount = 0;
        String _query_strFilter = "";
        String _query_strTimeStampVal = "";
        javax.xml.ws.Holder<String> _query_strTimeStamp = new javax.xml.ws.Holder<String>(_query_strTimeStampVal);
        javax.xml.ws.Holder<ArrayOfCustomer> _query_queryResult = new javax.xml.ws.Holder<ArrayOfCustomer>();
        javax.xml.ws.Holder<String> _query_strMaxTimeStamp = new javax.xml.ws.Holder<String>();
        javax.xml.ws.Holder<String> _query_strError = new javax.xml.ws.Holder<String>();
        port.query(_query_iAisID, _query_strUser, _query_strPassword, _query_iPerCount, _query_strFilter, _query_strTimeStamp, _query_queryResult, _query_strMaxTimeStamp, _query_strError);

        System.out.println("query._query_strTimeStamp=" + _query_strTimeStamp.value);
        System.out.println("query._query_queryResult=" + _query_queryResult.value);
        System.out.println("query._query_strMaxTimeStamp=" + _query_strMaxTimeStamp.value);
        System.out.println("query._query_strError=" + _query_strError.value);

        }
        {
        System.out.println("Invoking update...");
        int _update_iAisID = 0;
        String _update_strUser = "";
        String _update_strPassword = "";
        ArrayOfCustomer _update_data = null;
        boolean _update_bCheckByUUID = false;
        boolean _update_bAddNewOnly = false;
        javax.xml.ws.Holder<Boolean> _update_updateResult = new javax.xml.ws.Holder<Boolean>();
        javax.xml.ws.Holder<String> _update_strError = new javax.xml.ws.Holder<String>();
        port.update(_update_iAisID, _update_strUser, _update_strPassword, _update_data, _update_bCheckByUUID, _update_bAddNewOnly, _update_updateResult, _update_strError);

        System.out.println("update._update_updateResult=" + _update_updateResult.value);
        System.out.println("update._update_strError=" + _update_strError.value);

        }

        System.exit(0);
    }

}
