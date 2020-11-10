package com.xiaowenzi.demo.base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * 来自于 imooc.com的 java 实现base 64加密
 *
 *
 */
public class imoocBase64 {

    private static String src = "imooc security base64";

    public static void main(String[] args) {

        jdkBase64();
        codesBase64();
    }
        public static void jdkBase64(){

           try {
               // 编码
               BASE64Encoder encoder = new BASE64Encoder();
               String encode = encoder.encode(src.getBytes());
               System.out.println("encode:" + encode);

               // 解码
               BASE64Decoder decoder = new BASE64Decoder();
               System.out.println("decode:" + new String(decoder.decodeBuffer(encode)));
           }catch (IOException e){
               e.printStackTrace();
           }
        }

        public static void codesBase64(){

        try {
            // 编码
            BASE64Encoder encoder = new BASE64Encoder();
            String encoderResult = encoder.encode(src.getBytes());
            System.out.println("编码后的结果为：" + encoderResult);

            // 解码
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] decoderresult = decoder.decodeBuffer(encoderResult);
            String de = new String(decoderresult);
            System.out.println("解码后的结果为：" + de);
        }catch (Exception e){
            e.printStackTrace();
        }

        }

}
