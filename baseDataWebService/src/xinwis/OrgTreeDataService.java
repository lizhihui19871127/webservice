package xinwis;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.Date;

/**
 * 芯智慧-组织架构树接口
 * 2017/6/20 9:58
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface OrgTreeDataService {
    /**
     * 执行测试的WebService方法
     */
    @WebMethod
    void SayHiDefault();

    /**
     * 执行测试的WebService方法(有参)
     *
     * @param name
     */
    @WebMethod
    void SayHi(@WebParam(name = "name") String name);

    /**
     * 执行测试的WebService方法(用于时间校验)
     *
     * @param clientTime 客户端时间
     * @return 0表示时间校验失败 1表示校验成功
     */
    @WebMethod
    @WebResult(name = "valid")
    int CheckTime(@WebParam(name = "clientTime") Date clientTime);
}
