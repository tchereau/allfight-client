public class agz extends ahk {
   private final aig w;
   private final aey v;
   private aig u;
   private int t;
   private float s;
   private int r;
   private int q;
   private int p;
   private float o;
   private float n;

   public agz(aey var1, float var2, int var3, float var4) {
      this(var1, var2, var3, var3, var4);
   }

   public agz(aey var1, float var2, int var3, int var4, float var5) {
      this.t = -1;
      this.r = 0;
      if (!(var1 instanceof aig)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.v = var1;
         this.w = (aig)var1;
         this.s = var2;
         this.q = var3;
         this.p = var4;
         this.o = var5;
         this.n = var5 * var5;
         this.a(3);
      }
   }

   public boolean do() {
      aig var1 = this.w.bB();
      if (var1 == null) {
         return false;
      } else {
         this.u = var1;
         return true;
      }
   }

   public boolean try() {
      return this.do() || !this.w.bl().new();
   }

   public void new() {
      this.u = null;
      this.r = 0;
      this.t = -1;
   }

   public void int() {
      double var1 = this.w.if(this.u.al, this.u.aZ.a, this.u.aj);
      boolean var3 = this.w.ci().a(this.u);
      if (var3) {
         ++this.r;
      } else {
         this.r = 0;
      }

      if (!(var1 > (double)this.n) && this.r >= 20) {
         this.w.bl().case();
      } else {
         this.w.bl().a(this.u, this.s);
      }

      this.w.b9().a(this.u, 30.0F, 30.0F);
      float var4;
      if (--this.t == 0) {
         if (var1 > (double)this.n || !var3) {
            return;
         }

         var4 = ajs.int(var1) / this.o;
         float var5 = var4;
         if (var4 < 0.1F) {
            var5 = 0.1F;
         }

         if (var5 > 1.0F) {
            var5 = 1.0F;
         }

         this.v.a(this.u, var5);
         this.t = ajs.new(var4 * (float)(this.p - this.q) + (float)this.q);
      } else if (this.t < 0) {
         var4 = ajs.int(var1) / this.o;
         this.t = ajs.new(var4 * (float)(this.p - this.q) + (float)this.q);
      }

   }
}
