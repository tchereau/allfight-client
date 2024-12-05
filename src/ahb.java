public class ahb extends ahk {
   private ah5 ax;
   private agg aw;
   private int az = -1;
   private int ay = -1;

   public ahb(ah5 var1) {
      this.ax = var1;
      this.a(1);
   }

   public boolean do() {
      if ((!this.ax.ap.j() || this.ax.ap.goto()) && !this.ax.ap.n.for) {
         if (this.ax.bq().nextInt(50) != 0) {
            return false;
         } else if (this.az != -1 && this.ax.if((double)this.az, this.ax.ak, (double)this.ay) < 4.0D) {
            return false;
         } else {
            agf var1 = this.ax.ap.g.a(ajs.a(this.ax.al), ajs.a(this.ax.ak), ajs.a(this.ax.aj), 14);
            if (var1 == null) {
               return false;
            } else {
               this.aw = var1.for(ajs.a(this.ax.al), ajs.a(this.ax.ak), ajs.a(this.ax.aj));
               return this.aw != null;
            }
         }
      } else {
         return false;
      }
   }

   public boolean try() {
      return !this.ax.bl().new();
   }

   public void a() {
      this.az = -1;
      if (this.ax.if((double)this.aw.new(), (double)this.aw.a, (double)this.aw.if()) > 256.0D) {
         nr var1 = agh.if(this.ax, 14, 3, this.ax.ap.do().a((double)this.aw.new() + 0.5D, (double)this.aw.int(), (double)this.aw.if() + 0.5D));
         if (var1 != null) {
            this.ax.bl().a(var1.int, var1.for, var1.do, 0.3F);
         }
      } else {
         this.ax.bl().a((double)this.aw.new() + 0.5D, (double)this.aw.int(), (double)this.aw.if() + 0.5D, 0.3F);
      }

   }

   public void new() {
      this.az = this.aw.new();
      this.ay = this.aw.if();
      this.aw = null;
   }
}
