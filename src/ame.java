import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ame {
   private final Properties if = new Properties();
   private final ajw a;
   private final File do;

   public ame(File var1, ajw var2) {
      this.do = var1;
      this.a = var2;
      if (var1.exists()) {
         FileInputStream var3 = null;

         try {
            var3 = new FileInputStream(var1);
            this.if.load(var3);
         } catch (Exception var13) {
            var2.if("Failed to load " + var1, var13);
            this.do();
         } finally {
            if (var3 != null) {
               try {
                  var3.close();
               } catch (IOException var12) {
               }
            }

         }
      } else {
         var2.if(var1 + " does not exist");
         this.do();
      }

   }

   public void do() {
      this.a.a("Generating new properties file");
      this.if();
   }

   public void if() {
      FileOutputStream var1 = null;

      try {
         var1 = new FileOutputStream(this.do);
         this.if.store(var1, "Minecraft server properties");
      } catch (Exception var11) {
         this.a.if("Failed to save " + this.do, var11);
         this.do();
      } finally {
         if (var1 != null) {
            try {
               var1.close();
            } catch (IOException var10) {
            }
         }

      }

   }

   public File a() {
      return this.do;
   }

   public String a(String var1, String var2) {
      if (!this.if.containsKey(var1)) {
         this.if.setProperty(var1, var2);
         this.if();
      }

      return this.if.getProperty(var1, var2);
   }

   public int a(String var1, int var2) {
      try {
         return Integer.parseInt(this.a(var1, "" + var2));
      } catch (Exception var4) {
         this.if.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public boolean a(String var1, boolean var2) {
      try {
         return Boolean.parseBoolean(this.a(var1, "" + var2));
      } catch (Exception var4) {
         this.if.setProperty(var1, "" + var2);
         return var2;
      }
   }

   public void a(String var1, Object var2) {
      this.if.setProperty(var1, "" + var2);
   }
}
