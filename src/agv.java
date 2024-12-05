public class agv extends ahk {
   ae7 h;
   aig g;

   public agv(ae7 var1) {
      this.h = var1;
      this.a(1);
   }

   public boolean do() {
      aig var1 = this.h.bB();
      return this.h.fo() > 0 || var1 != null && this.h.for(var1) < 9.0D;
   }

   public void a() {
      this.h.bl().case();
      this.g = this.h.bB();
   }

   public void new() {
      this.g = null;
   }

   public void int() {
      if (this.g == null) {
         this.h.as(-1);
      } else if (this.h.for(this.g) > 49.0D) {
         this.h.as(-1);
      } else if (!this.h.ci().a(this.g)) {
         this.h.as(-1);
      } else {
         this.h.as(1);
      }
   }
}
