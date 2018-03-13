
package com.kingdee.controller.customer;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.UUID;

import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-23T14:23:57.836+08:00
 * Generated source version: 3.2.0
 * 
 */
public final class CustomerServiceSoap_CustomerServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.kingdee.com/Customer", "CustomerService");

    private CustomerServiceSoap_CustomerServiceSoap_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = CustomerService.WSDL_LOCATION;
      
        CustomerService ss = new CustomerService(wsdlURL, SERVICE_NAME);
        CustomerServiceSoap port = ss.getCustomerServiceSoap();  
        
      
        {
        System.out.println("Invoking update...");
        ArrayOfCustomer av = new ArrayOfCustomer();
        Customer customer = new Customer();
        customer.setNumber("1500026");
        customer.setName("样岳涛");
        String uuId = UUID.randomUUID().toString();
        customer.setUUID(uuId);
        
        
        av.getCustomer().add(customer);
        
        int _update_iAisID = 2;
        String _update_strUser = "administrator";
        String _update_strPassword = "";
        ArrayOfCustomer _update_data = av;
        boolean _update_bCheckByUUID = false;
        boolean _update_bAddNewOnly = true;
        javax.xml.ws.Holder<Boolean> _update_updateResult = new javax.xml.ws.Holder<Boolean>();
        javax.xml.ws.Holder<String> _update_strError = new javax.xml.ws.Holder<String>();
        port.update(_update_iAisID, _update_strUser, _update_strPassword, _update_data, _update_bCheckByUUID, _update_bAddNewOnly, _update_updateResult, _update_strError);

        System.out.println("update._update_updateResult=" + _update_updateResult.value);
        System.out.println("update._update_strError=" + _update_strError.value);

        }

        System.exit(0);
    }

}
