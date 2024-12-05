public class agw extends ahk {
   private ah2 j;
   private boolean i = false;

   public agw(ah2 var1) {
      this.j = var1;
      this.a(5);
   }

   public boolean do() {
      if (!this.j.fy()) {
         return false;
      } else if (this.j.ap()) {
         return false;
      } else if (!this.j.aY) {
         return false;
      } else {
         aig var1 = this.j.fC();
         if (var1 == null) {
            return true;
         } else {
            return this.j.for(var1) < 144.0D && var1.bD() != null ? false : this.i;
         }
      }
   }

   public void a() {
      this.j.bl().case();
      this.j.B(true);
   }

   public void new() {
      this.j.B(false);
   }

   public void a(boolean var1) {
      this.i = var1;
   }
}
