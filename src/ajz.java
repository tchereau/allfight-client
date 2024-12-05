import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ajz extends Thread {
   public void run() {
      HttpURLConnection var1 = null;

      try {
         qs.for("Checking for new version");
         URL var2 = new URL("http://optifine.net/version/1.5.1/HD_U.txt");
         var1 = (HttpURLConnection)var2.openConnection();
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();

         try {
            InputStream var3 = var1.getInputStream();
            String var4 = qs.a(var3);
            var3.close();
            String[] var5 = qs.if(var4, "\n\r");
            if (var5.length < 1) {
               return;
            }

            String var6 = var5[0];
            qs.for("Version found: " + var6);
            if (qs.a(var6, "B1") > 0) {
               qs.int(var6);
               return;
            }
         } finally {
            if (var1 != null) {
               var1.disconnect();
            }

         }

      } catch (Exception var11) {
         var11.printStackTrace();
      }
   }
}
