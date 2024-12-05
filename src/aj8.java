import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aj8 implements ajw {
   private final Logger if;
   private final String a;
   private final String for;
   private final String do;

   public aj8(String var1, String var2, String var3) {
      this.if = Logger.getLogger(var1);
      this.for = var1;
      this.do = var2;
      this.a = var3;
      this.a();
   }

   private void a() {
      this.if.setUseParentHandlers(false);
      Handler[] var1 = this.if.getHandlers();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         Handler var4 = var1[var3];
         this.if.removeHandler(var4);
      }

      aj6 var6 = new aj6(this, (aj7)null);
      ConsoleHandler var7 = new ConsoleHandler();
      var7.setFormatter(var6);
      this.if.addHandler(var7);

      try {
         FileHandler var8 = new FileHandler(this.a, true);
         var8.setFormatter(var6);
         this.if.addHandler(var8);
      } catch (Exception var5) {
         this.if.log(Level.WARNING, "Failed to log " + this.for + " to " + this.a, var5);
      }

   }

   public void a(String var1) {
      this.if.log(Level.INFO, var1);
   }

   public void if(String var1) {
      this.if.log(Level.WARNING, var1);
   }

   public void a(String var1, Object... var2) {
      this.if.log(Level.WARNING, var1, var2);
   }

   public void if(String var1, Throwable var2) {
      this.if.log(Level.WARNING, var1, var2);
   }

   public void do(String var1) {
      this.if.log(Level.SEVERE, var1);
   }

   public void a(String var1, Throwable var2) {
      this.if.log(Level.SEVERE, var1, var2);
   }

   public void for(String var1) {
      this.if.log(Level.FINE, var1);
   }

   // $FF: synthetic method
   static String a(aj8 var0) {
      return var0.do;
   }
}
