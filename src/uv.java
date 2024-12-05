import java.util.Random;

class uv extends uj {
   private uv() {
   }

   public void a(Random var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.if = pa.am.void;
         float var6 = var1.nextFloat();
         if (var6 < 0.2F) {
            this.a = 2;
         } else if (var6 < 0.5F) {
            this.a = 1;
         } else if (var6 < 0.55F) {
            this.if = pa.ap.void;
            this.a = 2;
         } else {
            this.a = 0;
         }
      } else {
         this.if = 0;
         this.a = 0;
      }

   }

   // $FF: synthetic method
   uv(u8 var1) {
      this();
   }
}
