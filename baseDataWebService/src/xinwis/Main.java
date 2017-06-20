package xinwis;

import javax.xml.ws.Endpoint;

/**
 * 文件功能描述
 * 2017/6/20 10:06
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
public class Main {
    public static void main(String args[]){
        Object implementor = new OrgTreeDataServiceImpl();
        String address = "http://localhost:9000/OrgTreeData";
        Endpoint.publish(address, implementor);
    }
}
