package com.kingdee.controller.kingdee;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-07T18:17:57.687+08:00
 * Generated source version: 3.2.0
 * 
 */
@WebServiceClient(name = "VoucherServices",
                  wsdlLocation = "http://127.0.0.1/KDWEBSERVICE/VoucherData.asmx?wsdl",
                  targetNamespace = "http://www.kingdee.com/VoucherData") 
public class VoucherServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.kingdee.com/VoucherData", "VoucherServices");
    public final static QName VoucherServicesSoap = new QName("http://www.kingdee.com/VoucherData", "VoucherServicesSoap");
    public final static QName VoucherServicesSoap12 = new QName("http://www.kingdee.com/VoucherData", "VoucherServicesSoap12");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1/KDWEBSERVICE/VoucherData.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VoucherServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", url);
        }
        WSDL_LOCATION = url;
    }

    public VoucherServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VoucherServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VoucherServices() {
        super(WSDL_LOCATION, SERVICE);
    }
    




    /**
     *
     * @return
     *     returns VoucherServicesSoap
     */
    @WebEndpoint(name = "VoucherServicesSoap")
    public VoucherServicesSoap getVoucherServicesSoap() {
        return super.getPort(VoucherServicesSoap, VoucherServicesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VoucherServicesSoap
     */
    @WebEndpoint(name = "VoucherServicesSoap")
    public VoucherServicesSoap getVoucherServicesSoap(WebServiceFeature... features) {
        return super.getPort(VoucherServicesSoap, VoucherServicesSoap.class, features);
    }


    /**
     *
     * @return
     *     returns VoucherServicesSoap
     */
    @WebEndpoint(name = "VoucherServicesSoap12")
    public VoucherServicesSoap getVoucherServicesSoap12() {
        return super.getPort(VoucherServicesSoap12, VoucherServicesSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VoucherServicesSoap
     */
    @WebEndpoint(name = "VoucherServicesSoap12")
    public VoucherServicesSoap getVoucherServicesSoap12(WebServiceFeature... features) {
        return super.getPort(VoucherServicesSoap12, VoucherServicesSoap.class, features);
    }

}
