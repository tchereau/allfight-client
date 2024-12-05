public class ag6 extends ahk {
   private final af4 T;
   private final float S;
   private int Z = 0;
   private int Y = 0;
   private int X = 0;
   private int W = 0;
   private int V = 0;
   private int U = 0;

   public ag6(af4 var1, float var2) {
      this.T = var1;
      this.S = var2;
      this.a(5);
   }

   public boolean do() {
      return this.T.fy() && !this.T.fB() && this.T.bq().nextDouble() <= 0.006500000134110451D && this.case();
   }

   public boolean try() {
      return this.Z <= this.X && this.Y <= 60 && this.a(this.T.ap, this.W, this.V, this.U);
   }

   public void a() {
      this.T.bl().a((double)((float)this.W) + 0.5D, (double)(this.V + 1), (double)((float)this.U) + 0.5D, this.S);
      this.Z = 0;
      this.Y = 0;
      this.X = this.T.bq().nextInt(this.T.bq().nextInt(1200) + 1200) + 1200;
      this.T.fA().a(false);
   }

   public void new() {
      this.T.B(false);
   }

   public void int() {
      ++this.Z;
      this.T.fA().a(false);
      if (this.T.if((double)this.W, (double)(this.V + 1), (double)this.U) > 1.0D) {
         this.T.B(false);
         this.T.bl().a((double)((float)this.W) + 0.5D, (double)(this.V + 1), (double)((float)this.U) + 0.5D, this.S);
         ++this.Y;
      } else if (!this.T.fB()) {
         this.T.B(true);
      } else {
         --this.Y;
      }

   }

   private boolean case() {
      int var1 = (int)this.T.ak;
      double var2 = 2.147483647E9D;

      for(int var4 = (int)this.T.al - 8; (double)var4 < this.T.al + 8.0D; ++var4) {
         for(int var5 = (int)this.T.aj - 8; (double)var5 < this.T.aj + 8.0D; ++var5) {
            if (this.a(this.T.ap, var4, var1, var5) && this.T.ap.a(var4, var1 + 1, var5)) {
               double var6 = this.T.if((double)var4, (double)var1, (double)var5);
               if (var6 < var2) {
                  this.W = var4;
                  this.V = var1;
                  this.U = var5;
                  var2 = var6;
               }
            }
         }
      }

      return var2 < 2.147483647E9D;
   }

   private boolean a(y6 var1, int var2, int var3, int var4) {
      int var5 = var1.new(var2, var3, var4);
      int var6 = var1.for(var2, var3, var4);
      if (var5 == pa.bi.void) {
         om var7 = (om)var1.if(var2, var3, var4);
         if (var7.t < 1) {
            return true;
         }
      } else {
         if (var5 == pa.cq.void) {
            return true;
         }

         if (var5 == pa.al.void && !r3.F(var6)) {
            return true;
         }
      }

      return false;
   }
}
