import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;

class aky extends Thread {
   final akz a;

   aky(akz var1) {
      this.a = var1;
   }

   public void run() {
      try {
         String var1 = (new BigInteger(aj5.a(akz.do(this.a), akz.for(this.a).g9().getPublic(), akz.if(this.a)))).toString(16);
         URL var2 = new URL("http://allfightpvp.com/lanceur/checkserveur?user=" + URLEncoder.encode(akz.a(this.a), "UTF-8") + "&serverId=" + URLEncoder.encode(var1, "UTF-8"));
         BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
         String var4 = var3.readLine();
         var3.close();
         if (!"YES".equals(var4)) {
            this.a.do("Failed to verify username!");
            return;
         }

         akz.a(this.a, true);
      } catch (Exception var5) {
         this.a.do("Failed to verify username! [internal error " + var5 + "]");
         var5.printStackTrace();
      }

   }
}
