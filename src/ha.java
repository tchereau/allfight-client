import java.io.IOException;

public class ha extends hg {
   private e5 if;
   private final gm for;
   private final i5 do;

   public ha(i5 var1, gm var2) {
      this.do = var1;
      this.for = var2;
   }

   public void run() {
      this.if(aqy.if().a("mco.connect.connecting"));
      gv var1 = new gv(this.a().vg);
      boolean var2 = false;
      boolean var3 = false;
      gl var4 = null;

      for(int var5 = 0; var5 < 10 && !this.do(); ++var5) {
         try {
            var4 = var1.for(this.for.g);
            var2 = true;
         } catch (gi var7) {
         } catch (gj var8) {
            var3 = true;
            this.a(var8.getLocalizedMessage());
            break;
         } catch (IOException var9) {
         } catch (Exception var10) {
            var3 = true;
            this.a(var10.getLocalizedMessage());
         }

         if (var2) {
            break;
         }

         this.int();
      }

      if (!this.do() && !var3) {
         if (var2) {
            er var11 = er.if(var4.for);
            this.a(var11.if(), var11.a());
         } else {
            this.a().a(this.do);
         }
      }

   }

   private void int() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
         System.err.println(var2);
      }

   }

   private void a(String var1, int var2) {
      (new g9(this, var1, var2)).start();
   }

   public void if() {
      if (this.if != null) {
         this.if.char();
      }

   }

   // $FF: synthetic method
   static e5 a(ha var0, e5 var1) {
      return var0.if = var1;
   }

   // $FF: synthetic method
   static i5 a(ha var0) {
      return var0.do;
   }

   // $FF: synthetic method
   static e5 if(ha var0) {
      return var0.if;
   }
}
