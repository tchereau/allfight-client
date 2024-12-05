import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class gt {
   protected HttpURLConnection if;
   private boolean do;
   protected String a;

   public gt(String var1, int var2, int var3) {
      try {
         this.a = var1;
         this.if = (HttpURLConnection)(new URL(var1)).openConnection();
         this.if.setConnectTimeout(var2);
         this.if.setReadTimeout(var3);
      } catch (Exception var5) {
         throw new gu("Failed URL: " + var1, var5);
      }
   }

   public void a(String var1, String var2) {
      String var3 = this.if.getRequestProperty("Cookie");
      if (var3 == null) {
         this.if.setRequestProperty("Cookie", var1 + "=" + var2);
      } else {
         this.if.setRequestProperty("Cookie", var3 + ";" + var1 + "=" + var2);
      }

   }

   public int new() {
      try {
         this.do();
         return this.if.getResponseCode();
      } catch (Exception var2) {
         throw new gu("Failed URL: " + this.a, var2);
      }
   }

   public gf if() {
      String var1 = this.if.getHeaderField("Set-Cookie");
      if (var1 != null) {
         String var2 = var1.substring(0, var1.indexOf("="));
         String var3 = var1.substring(var1.indexOf("=") + 1, var1.indexOf(";"));
         return gf.a(gc.a(var2, var3));
      } else {
         return gf.if();
      }
   }

   public String for() {
      try {
         this.do();
         String var1 = this.new() >= 400 ? this.a(this.if.getErrorStream()) : this.a(this.if.getInputStream());
         this.int();
         return var1;
      } catch (IOException var2) {
         throw new gu("Failed URL: " + this.a, var2);
      }
   }

   private String a(InputStream var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("input stream cannot be null");
      } else {
         StringBuilder var2 = new StringBuilder();

         for(int var3 = var1.read(); var3 != -1; var3 = var1.read()) {
            var2.append((char)var3);
         }

         return var2.toString();
      }
   }

   private void int() {
      byte[] var1 = new byte[1024];

      InputStream var3;
      try {
         boolean var2 = false;
         var3 = this.if.getInputStream();

         while(true) {
            if (var3.read(var1) <= 0) {
               var3.close();
               break;
            }
         }
      } catch (Exception var6) {
         try {
            var3 = this.if.getErrorStream();
            boolean var4 = false;

            while(true) {
               if (var3.read(var1) <= 0) {
                  var3.close();
                  break;
               }
            }
         } catch (IOException var5) {
         }
      }

   }

   protected gt do() {
      if (!this.do) {
         gt var1 = this.a();
         this.do = true;
         return var1;
      } else {
         return this;
      }
   }

   protected abstract gt a();

   public static gt if(String var0) {
      return new gr(var0, 5000, 5000);
   }

   public static gt do(String var0, String var1) {
      return new gq(var0, var1.getBytes(), 5000, 5000);
   }

   public static gt a(String var0) {
      return new gs(var0, 5000, 5000);
   }

   public static gt if(String var0, String var1) {
      return new gp(var0, var1.getBytes(), 5000, 5000);
   }

   public static gt a(String var0, String var1, int var2, int var3) {
      return new gp(var0, var1.getBytes(), var2, var3);
   }
}
