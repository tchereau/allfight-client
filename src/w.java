import java.io.IOException;

class w extends Thread {
   // $FF: synthetic field
   final aqy if;
   // $FF: synthetic field
   final int a;
   // $FF: synthetic field
   final int for;
   // $FF: synthetic field
   final x do;

   w(x var1, aqy var2, int var3, int var4) {
      this.do = var1;
      this.if = var2;
      this.a = var3;
      this.for = var4;
   }

   public void run() {
      gv var1 = new gv(x.a(this.do).vg);
      boolean var2 = false;

      for(int var3 = 0; var3 < 3; ++var3) {
         try {
            Boolean var4 = var1.do();
            if (var4) {
               x.a(this.do, this.if, this.a, this.for);
            }

            x.n(var4);
         } catch (gi var6) {
            var2 = true;
         } catch (gj var7) {
         } catch (IOException var8) {
         }

         if (!var2) {
            break;
         }

         try {
            Thread.sleep(10000L);
         } catch (InterruptedException var5) {
            Thread.currentThread().interrupt();
         }
      }

   }
}
