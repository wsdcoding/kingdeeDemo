
package com.kingdee.controller.kingdee;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-07T18:17:57.647+08:00
 * Generated source version: 3.2.0
 * 
 */
public final class VoucherServicesSoap_VoucherServicesSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.kingdee.com/VoucherData", "VoucherServices");

    private VoucherServicesSoap_VoucherServicesSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = VoucherServices.WSDL_LOCATION;
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
      
        VoucherServices ss = new VoucherServices(wsdlURL, SERVICE_NAME);
        VoucherServicesSoap port = ss.getVoucherServicesSoap12();  
        

        {
        System.out.println("Invoking update...");
        int _update_iAisID = 0;
        String _update_strUser = "";
        String _update_strPassword = "";
        ArrayOfVoucher _update_data = null;
        boolean _update_bCheckByUUID = false;
        boolean _update_bAddNewOnly = false;
        int _update_iBillClassTypeID = 0;
        javax.xml.ws.Holder<Boolean> _update_updateResult = new javax.xml.ws.Holder<Boolean>();
        javax.xml.ws.Holder<String> _update_strError = new javax.xml.ws.Holder<String>();
        port.update(_update_iAisID, _update_strUser, _update_strPassword, _update_data, _update_bCheckByUUID, _update_bAddNewOnly, _update_iBillClassTypeID, _update_updateResult, _update_strError);

        System.out.println("update._update_updateResult=" + _update_updateResult.value);
        System.out.println("update._update_strError=" + _update_strError.value);

        }

        System.exit(0);
    }

}
