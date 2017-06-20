package xinwis;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件功能描述
 * 2017/6/20 10:02
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
@WebService(endpointInterface = "xinwis.OrgTreeDataService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class OrgTreeDataServiceImpl implements OrgTreeDataService {
    @Override
    public void SayHiDefault() {
        System.out.println("Hi, Johness!");
    }

    @Override
    public void SayHi(String name) {
        System.out.println("Hi, " + name + "!");
    }

    @Override
    public int CheckTime(Date clientTime) {
        // 精确到秒
        String dateServer = new java.sql.Date(System.currentTimeMillis())
                .toString()
                + " "
                + new java.sql.Time(System.currentTimeMillis());
        String dateClient = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(clientTime);
        return dateServer.equals(dateClient) ? 1 : 0;
    }
}
