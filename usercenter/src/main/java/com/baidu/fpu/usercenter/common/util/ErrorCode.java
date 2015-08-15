package com.baidu.fpu.usercenter.common.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shawn on 8/12/15.
 */

public class ErrorCode {
    public static final int E_OK = 0;
    public static final int E_INVALID_PARAM = 10000;
    public static final int E_INTERNAL = 20000;
    public static final int E_USER_NOT_FOUND = 30000;

    private static final Map<Integer, String> errMap = new HashMap<Integer, String>(){{
        put(new Integer(E_OK), "Success");
        put(new Integer(E_INVALID_PARAM), "Invalid parameter");
        put(new Integer(E_INTERNAL), "Internal error");
    }};

    public static String getMessage(int errCode){
        return errMap.get(new Integer(errCode));
    }
}
