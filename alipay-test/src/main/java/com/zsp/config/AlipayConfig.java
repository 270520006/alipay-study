package com.zsp.config;


import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,
    // 开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String App_ID="2021000117643786";
    // 存在本地的私钥
    public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC4ZN2y4aW12CSuMWXt6KKqUd+FnWE0VxzOBM4U9vCsfEAUNgWSk0EjRlM36UCy91riILJ2OhLfdZBQPsnq0nj2DTHyjFgAYdaVofpQbrJclkIBy6VJE4YXre0wOKOalwbgW/KY+xsbKn1b166peNavXB6atMW+7lHOpLQBKCPZlT3mqu2ZHQHxfBfq2IBFla0xq+N6XJaVYKrk/hPZgyQxNyFhSbGbtUNfru8xOQJEvz6VXoDqmj0DBezRD5qR6MfofKVo88+mtik3pUwtRErfE5IdUigPIHoGyHYWOf0KQzpCeUE+X/gWdAmGLl17WZxJDWGzlHUxqFtQdluMZEjfAgMBAAECggEAExWleIEwRHzldv333cLJKzWkG9EpIWCuw4ftyG+ygzes7iqVMxF4mW0K6euDXcKKLoNR1Ti3gVdKo3OMNHiqOlUtSTxLU2bM7dnA7Zg3b6vBkyv/pGuX4lWHCgmirTpaZNg/aKP8rzgbl2jgU/wExEuVg0+Yc+V4pBmZ49DCvR8vOnz7afFu7jv1cYIlM42N1LtsDLcFA7zaXgjZCiPR7nhuvZVnREFhpEDCJQEj+KBTP4UZp3LJ7mFOr9Lr42B5UH8mWeSdCKdw0FLwGMge+trkEzljm8vacWFPnNm7Cip3ofHhDn1MJz8cJ6vx1L5q66DDaNOp55ABvola8sz+IQKBgQDZq3Yn9S0cxTfQs0nYOr30cet0setx25psQMGeob7n1WcxNG1bLeAu4mMdugUXqicgnVk9ydRRsuz3Wb1Djg+NGZ0ko1LBijZxv9NmayiScqiKSO1idboSlskNIxC6ZIdfCGZyS1GWveGgmi15o5zASOUfvVck1BElpiEV/7sWkQKBgQDY3VXWUy0d1dfSUHHB6BeQzs0L7twwNU6Ztz/tYw+tnBJ35IrvXr/CkQ681H0iu/JJOfEQYgLlHe4erL2S+ZG4rUQDnq5rGJf3fIJcRt/VcpMm/+4Bhoyz2uQCjSIX9zxy7oiZaw98/WqdgQC4VrDBzm0PEG3lsydeyHJtb62AbwKBgCLY7GWhPsOoXzMuQNg5L0f/JO7dvQ/RVHuYMmcvBd0fsRGTjx5VzdozrCKKMV6EgxcZmbvmn/MkbgN7fm1eROcV/q5q50jM08KKL1HqPeiUKp9Y5YgpyMxJD47m2jq89V8lfSE3Jay4YXLQvA8JPoMaKHRYX6cpvEUGv61B77XBAoGBAIPZRcfRuBtsmRPYLuGKn1E+OjIoHhz9O/V/EVHdqXmO6zeTbtkLzSCZGtG5iv8kL7FPlf206Tetk8l4kqWaMHuMdE6TGk4onLQuMf+yY4Idb9QFRAoPaNosmfXnIrRZb5oc5lYIXllKpZhvByYMJtkeDPZcscQ2wRgCXHemr2DnAoGAB7iBE9dAb1F8nv8+7aJUEZR1iPkaAgnfalx3yAHzYkCsfBcmdvIer8M0/XaNMPjmq5zYCAl/WsM4Rvi9Ggj2KzYRx50ka+P6wJJGUyDYLoG1nv3lcJy+D/8x8pJp1uqOkaebeIDB/PEbUVLCIHQQIXuyUo8GXw6Dl+WkiA1Aw+0=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
    // 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/Alipay/notifyUrl";
//    签名方式
    public static String sign_type = "RSA";
    // 字符编码格式
    public static String CHARSET = "UTF-8";
//    返回地址
    public static String return_url = "http://localhost:8080/Alipay/returnUrl";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do"; //测试

    public static String log_path = "E:\\";

    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}




