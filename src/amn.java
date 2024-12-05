public class amn implements ajo {
   private long l3;
   // $FF: synthetic field
   final net.minecraft.a.a l4;

   public amn(net.minecraft.a.a var1) {
      this.l4 = var1;
      this.l3 = System.currentTimeMillis();
   }

   public void l(String var1) {
   }

   public void m(String var1) {
   }

   public void ac(int var1) {
      if (System.currentTimeMillis() - this.l3 >= 1000L) {
         this.l3 = System.currentTimeMillis();
         this.l4.a().a("Converting... " + var1 + "%");
      }

   }

   public void d6() {
   }

   public void n(String var1) {
   }
}
