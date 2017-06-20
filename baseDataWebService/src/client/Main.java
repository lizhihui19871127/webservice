package client;

import javax.xml.datatype.DatatypeConfigurationException;

/**
 * webService客户端
 * 2017/6/20 10:22
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws DatatypeConfigurationException {
        // 获取service
        OrgTreeDataService service = new OrgTreeDataServiceImplService().getOrgTreeDataServiceImplPort();
        service.sayHiDefault();
        service.sayHi("Ahe");
    }
}
