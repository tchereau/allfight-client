import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aj3 {
   public static String a(Map var0) {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = var0.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (var1.length() > 0) {
            var1.append('&');
         }

         try {
            var1.append(URLEncoder.encode((String)var3.getKey(), "UTF-8"));
         } catch (UnsupportedEncodingException var6) {
            var6.printStackTrace();
         }

         if (var3.getValue() != null) {
            var1.append('=');

            try {
               var1.append(URLEncoder.encode(var3.getValue().toString(), "UTF-8"));
            } catch (UnsupportedEncodingException var5) {
               var5.printStackTrace();
            }
         }
      }

      return var1.toString();
   }

   public static String a(ajw var0, URL var1, Map var2, boolean var3) {
      return a(var0, var1, a(var2), var3);
   }

   public static String a(ajw var0, URL var1, String var2, boolean var3) {
      try {
         HttpURLConnection var4 = (HttpURLConnection)var1.openConnection();
         var4.setRequestMethod("POST");
         var4.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
         var4.setRequestProperty("Content-Length", "" + var2.getBytes().length);
         var4.setRequestProperty("Content-Language", "en-US");
         var4.setUseCaches(false);
         var4.setDoInput(true);
         var4.setDoOutput(true);
         DataOutputStream var5 = new DataOutputStream(var4.getOutputStream());
         var5.writeBytes(var2);
         var5.flush();
         var5.close();
         BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
         StringBuffer var8 = new StringBuffer();

         String var7;
         while((var7 = var6.readLine()) != null) {
            var8.append(var7);
            var8.append('\r');
         }

         var6.close();
         return var8.toString();
      } catch (Exception var9) {
         if (!var3) {
            if (var0 != null) {
               var0.a("Could not post to " + var1, (Throwable)var9);
            } else {
               Logger.getAnonymousLogger().log(Level.SEVERE, "Could not post to " + var1, var9);
            }
         }

         return "";
      }
   }

   public static void a(File var0, String var1, aj1 var2, Map var3, int var4, ajo var5) {
      Thread var6 = new Thread(new aj2(var5, var1, var3, var0, var2, var4));
      var6.setDaemon(true);
      var6.start();
   }

   public static int a() {
      ServerSocket var0 = null;
      boolean var1 = true;

      int var10;
      try {
         var0 = new ServerSocket(0);
         var10 = var0.getLocalPort();
      } finally {
         try {
            if (var0 != null) {
               var0.close();
            }
         } catch (IOException var8) {
         }

      }

      return var10;
   }

   public static String[] a(ajw var0, String var1, String var2) {
      HashMap var3 = new HashMap();
      var3.put("user", var1);
      var3.put("password", var2);
      var3.put("version", 13);

      String var4;
      try {
         var4 = a(var0, new URL("http://login.minecraft.net/"), (Map)var3, false);
      } catch (MalformedURLException var6) {
         var6.printStackTrace();
         return null;
      }

      if (var4 != null && var4.length() != 0) {
         if (!var4.contains(":")) {
            if (var0 == null) {
               System.out.println("Failed to authenticate: " + var4);
            } else {
               var0.if("Failed to authenticae: " + var4);
            }

            return null;
         } else {
            String[] var5 = var4.split(":");
            return new String[]{var5[2], var5[3]};
         }
      } else {
         if (var0 == null) {
            System.out.println("Failed to authenticate: Can't connect to minecraft.net");
         } else {
            var0.if("Failed to authenticate: Can't connect to minecraft.net");
         }

         return null;
      }
   }
}
