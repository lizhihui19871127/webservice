
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OrgTreeDataServiceImplService", targetNamespace = "http://xinwis/", wsdlLocation = "http://localhost:9000/OrgTreeData?wsdl")
public class OrgTreeDataServiceImplService
    extends Service
{

    private final static URL ORGTREEDATASERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORGTREEDATASERVICEIMPLSERVICE_EXCEPTION;
    private final static QName ORGTREEDATASERVICEIMPLSERVICE_QNAME = new QName("http://xinwis/", "OrgTreeDataServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9000/OrgTreeData?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORGTREEDATASERVICEIMPLSERVICE_WSDL_LOCATION = url;
        ORGTREEDATASERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public OrgTreeDataServiceImplService() {
        super(__getWsdlLocation(), ORGTREEDATASERVICEIMPLSERVICE_QNAME);
    }

    public OrgTreeDataServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORGTREEDATASERVICEIMPLSERVICE_QNAME, features);
    }

    public OrgTreeDataServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, ORGTREEDATASERVICEIMPLSERVICE_QNAME);
    }

    public OrgTreeDataServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORGTREEDATASERVICEIMPLSERVICE_QNAME, features);
    }

    public OrgTreeDataServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrgTreeDataServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OrgTreeDataService
     */
    @WebEndpoint(name = "OrgTreeDataServiceImplPort")
    public OrgTreeDataService getOrgTreeDataServiceImplPort() {
        return super.getPort(new QName("http://xinwis/", "OrgTreeDataServiceImplPort"), OrgTreeDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrgTreeDataService
     */
    @WebEndpoint(name = "OrgTreeDataServiceImplPort")
    public OrgTreeDataService getOrgTreeDataServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://xinwis/", "OrgTreeDataServiceImplPort"), OrgTreeDataService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORGTREEDATASERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw ORGTREEDATASERVICEIMPLSERVICE_EXCEPTION;
        }
        return ORGTREEDATASERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
