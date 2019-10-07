package com.quicktron.wcsmock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HttpUtil {
    //protected final static Logger logger = LoggerFactory.getLogger(HttpClient.class);

    public static final String METHOD_POST = "POST";
    public static final String METHOD_GET = "GET";

    public static String getHttpContent(String url, String method, String postData, Map<String, String> header, int timeout) {

        BufferedReader reader = null;
        try {
			/*if (StringUtils.isBlank(url)) {
				throw new IllegalArgumentException("url cannot be null");
			}*/
            if (!METHOD_POST.equalsIgnoreCase(method) && !METHOD_GET.equalsIgnoreCase(method)) {
                throw new IllegalArgumentException("method must be one of Post or Get");
            }
            URL address = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) address.openConnection();
            conn.setAllowUserInteraction(false);
            conn.setDoOutput(true);
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);
            conn.setRequestMethod(method);
            conn.setUseCaches(false);
            conn.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.2;SV1)");
            conn.addRequestProperty("Accept", "*/*");
            conn.addRequestProperty("Connection", "Keep-Alive");
            conn.addRequestProperty("Content-Type", "application/json;charset=UTF-8");
            if (header != null && !header.isEmpty()) {
                Set<String> key = header.keySet();
                for (Iterator<String> it = key.iterator(); it.hasNext();) {
                    String s = (String) it.next();
                    conn.addRequestProperty(s, (String) header.get(s));
                }
            }
            if (METHOD_POST.equalsIgnoreCase(method)) {
                //	postData = StringUtils.trimToEmpty(postData);
                conn.getOutputStream().write(postData.getBytes("UTF-8"));
                conn.getOutputStream().flush();
                conn.getOutputStream().close();
            }
            if(conn.getResponseCode() != 200){
                //throw new HttpStatusException(conn.getResponseCode(), conn.getResponseMessage());
                System.out.println("请求失败");
            }
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            StringBuffer sb = new StringBuffer();
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                sb.append(inputLine).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }  catch (RuntimeException e) {
            throw e;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String doGet(String url, int timeout) {
        return getHttpContent(url, METHOD_GET, null, null, timeout);
    }

    public static String doPost(String url, String postData, int timeout) {
        return getHttpContent(url, METHOD_POST, postData, null, timeout);
    }
}
