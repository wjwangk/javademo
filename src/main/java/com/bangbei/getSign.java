package com.bangbei;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class getSign {

    public static void main(String[] args) throws Exception {
        Map map = new HashMap();
        map.put("name","xiaomaing");
        map.put("age","20");
        String str = generateSignSrc(map);
        System.out.println("=============="+str);
        String str1 = EncoderByMd5(str);
        System.out.println(">>>>>>>>>>>>>>"+str1);
    }

    private static String generateSignSrc(Map<String, String> map) {
        Map<String, String> sortMap = new TreeMap<String, String>();
        sortMap.putAll(map);
        // 以k1=v1&k2=v2...方式拼接参数
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> s : sortMap.entrySet()) {
            String k = s.getKey();
            String v = s.getValue();
            if (v==null) {// 过滤空值
                continue;
            }
            builder.append(k).append("=").append(v).append("&");
        }
        if (!sortMap.isEmpty()) {
            builder.deleteCharAt(builder.length() - 1);
        }

        System.out.println(builder.toString());
        return builder.toString();
    }

    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }
}
