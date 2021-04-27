package com.huazheng.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghuazheng
 * @date 2021/4/25 16:04
 **/
public class HashMapTest {
    public static final Map<String,Object> map = new HashMap<>();
    static {
        map.put("name","zhz");
        map.put("age",12);
        map.put("hobby",new String[]{"singer","dancer","paint","driver"});
        map.put("job","leader");
        map.put("address","The SHANXI of china");
        map.put("phoneNo","18600100010");
    }

    @Test
    public void getUser() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("user",map);
        System.out.println(jsonObject);
        System.out.println(map);
    }
}
