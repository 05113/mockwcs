/*
package com.quicktron.wcsmock;

public class AnHuiPost {
    public static void main(String[] args) {
        for( int i=0 ;i<2;i++){
        String body = "{\n" +
                "  \"header\": {\n" +
                "    \"appkey\": \"youzheng\",\n" +
                "    \"appsecret\": \"IVxJA2hJ18IezusdUKHW2w==\",\n" +
                "    \"requestid\": "+System.currentTimeMillis()+",\n" +
                "    \"timestamp\": \"2018-04-0220:00:00.000\"\n" +
                "  },\n" +
                "  \"body\": {\n" +
                "    \"data\": [{\n" +
                "      \"billNumber\": \"test"+i+"\",\n" +
                "      \"billType\": \"PICKING\",\n" +
                "      \"billDate\": \"2016-08-22 20:00:00.000\",\n" +
                "      \"Lottat03\": \"04-20\",\n" +
                "      \"ownerCode\": \"BHSM\",\n" +
                "      \"ownerName\": \"KC\",\n" +
                "      \"remark\": \"\",\n" +
                "      \"udf1\": \"aaaa\",\n" +
                "      \"udf2\": \"\",\n" +
                "      \"udf3\": \"\",\n" +
                "      \"details\": [{\n" +
                "        \"skuCode\": \"N15037\",\n" +
                "        \"quantity\": \"20000000\",\n" +
                "        \"udf1\": \"3\",\n" +
                "        \"udf2\": \"3\",\n" +
                "        \"udf3\": \"\"\n" +
                "      }]\n" +
                "    \n" +
                " \n" +
                " \n" +
                "    }\n" +
                "    \n" +
                "    ]\n" +
                "  }\n" +
                "}";
            String url = "http://192.168.21.115:8010/api/kc/yz/kc.pickingBill.create";
            System.out.println("请求消息："+body);
            String sb = HttpUtil.doPost(url,body,2000);

            System.out.println("响应消息："+sb);
        }



    }
}
*/
