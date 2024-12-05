import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class dc extends Thread {
   // $FF: synthetic field
   final String if;
   // $FF: synthetic field
   final db a;
   // $FF: synthetic field
   final dd do;

   dc(dd var1, String var2, db var3) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
   }

   public void run() {
      HttpURLConnection var1 = null;

      try {
         URL var2 = new URL(this.if);
         var1 = (HttpURLConnection)var2.openConnection();
         var1.setDoInput(true);
         var1.setDoOutput(false);
         var1.connect();
         if (var1.getResponseCode() / 100 == 4) {
            return;
         }

         if (this.a == null) {
            this.do.if = ImageIO.read(var1.getInputStream());
         } else {
            this.do.if = this.a.a(ImageIO.read(var1.getInputStream()));
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      } finally {
         var1.disconnect();
      }

   }
}
