import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class am5 {
   private final aj0 if = new aj0();
   private final File a;
   private boolean do = true;

   public am5(File var1) {
      this.a = var1;
   }

   public boolean int() {
      return this.do;
   }

   public void if(boolean var1) {
      this.do = var1;
   }

   public Map for() {
      this.do();
      return this.if;
   }

   public boolean if(String var1) {
      if (!this.int()) {
         return false;
      } else {
         this.do();
         return this.if.containsKey(var1);
      }
   }

   public void a(am6 var1) {
      this.if.a(var1.try(), var1);
      this.a();
   }

   public void a(String var1) {
      this.if.remove(var1);
      this.a();
   }

   public void do() {
      Iterator var1 = this.if.values().iterator();

      while(var1.hasNext()) {
         am6 var2 = (am6)var1.next();
         if (var2.if()) {
            var1.remove();
         }
      }

   }

   public void if() {
      if (this.a.isFile()) {
         BufferedReader var1;
         try {
            var1 = new BufferedReader(new FileReader(this.a));
         } catch (FileNotFoundException var4) {
            throw new Error();
         }

         String var2;
         try {
            while((var2 = var1.readLine()) != null) {
               if (!var2.startsWith("#")) {
                  am6 var3 = am6.a(var2);
                  if (var3 != null) {
                     this.if.a(var3.try(), var3);
                  }
               }
            }
         } catch (IOException var5) {
            net.minecraft.a.a.g2().a().a("Could not load ban list", (Throwable)var5);
         }

      }
   }

   public void a() {
      this.a(true);
   }

   public void a(boolean var1) {
      this.do();

      try {
         PrintWriter var2 = new PrintWriter(new FileWriter(this.a, false));
         if (var1) {
            var2.println("# Updated " + (new SimpleDateFormat()).format(new Date()) + " by Minecraft " + "1.5.1");
            var2.println("# victim name | ban date | banned by | banned until | reason");
            var2.println();
         }

         Iterator var3 = this.if.values().iterator();

         while(var3.hasNext()) {
            am6 var4 = (am6)var3.next();
            var2.println(var4.for());
         }

         var2.close();
      } catch (IOException var5) {
         net.minecraft.a.a.g2().a().a("Could not save ban list", (Throwable)var5);
      }

   }
}
