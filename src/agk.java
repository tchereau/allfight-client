public abstract class agk extends ahk {
   protected aig b1;
   protected float b0;
   protected boolean bZ;
   private boolean bX;
   private int bW;
   private int b2;
   private int bY;

   public agk(aig var1, float var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public agk(aig var1, float var2, boolean var3, boolean var4) {
      this.bW = 0;
      this.b2 = 0;
      this.bY = 0;
      this.b1 = var1;
      this.b0 = var2;
      this.bZ = var3;
      this.bX = var4;
   }

   public boolean try() {
      aig var1 = this.b1.bB();
      if (var1 == null) {
         return false;
      } else if (!var1.aA()) {
         return false;
      } else if (this.b1.for((aiw)var1) > (double)(this.b0 * this.b0)) {
         return false;
      } else {
         if (this.bZ) {
            if (this.b1.ci().a(var1)) {
               this.bY = 0;
            } else if (++this.bY > 60) {
               return false;
            }
         }

         return true;
      }
   }

   public void a() {
      this.bW = 0;
      this.b2 = 0;
      this.bY = 0;
   }

   public void new() {
      this.b1.do((aig)null);
   }

   protected boolean a(aig var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1 == this.b1) {
         return false;
      } else if (!var1.aA()) {
         return false;
      } else if (!this.b1.a(var1.getClass())) {
         return false;
      } else {
         if (this.b1 instanceof ah2 && ((ah2)this.b1).fy()) {
            if (var1 instanceof ah2 && ((ah2)var1).fy()) {
               return false;
            }

            if (var1 == ((ah2)this.b1).fC()) {
               return false;
            }
         } else if (var1 instanceof aek && !var2 && ((aek)var1).fY.if) {
            return false;
         }

         if (!this.b1.do(ajs.a(var1.al), ajs.a(var1.ak), ajs.a(var1.aj))) {
            return false;
         } else if (this.bZ && !this.b1.ci().a(var1)) {
            return false;
         } else {
            if (this.bX) {
               if (--this.b2 <= 0) {
                  this.bW = 0;
               }

               if (this.bW == 0) {
                  this.bW = this.a(var1) ? 1 : 2;
               }

               if (this.bW == 2) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean a(aig var1) {
      this.b2 = 10 + this.b1.bq().nextInt(5);
      s5 var2 = this.b1.bl().a(var1);
      if (var2 == null) {
         return false;
      } else {
         s6 var3 = var2.do();
         if (var3 == null) {
            return false;
         } else {
            int var4 = var3.char - ajs.a(var1.al);
            int var5 = var3.byte - ajs.a(var1.aj);
            return (double)(var4 * var4 + var5 * var5) <= 2.25D;
         }
      }
   }
}
