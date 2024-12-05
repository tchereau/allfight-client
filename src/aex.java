public class aex extends ae0 {
   private int qS;

   public aex(y6 var1) {
      super(var1);
      this.ft = "/mob/silverfish.png";
      this.if(0.3F, 0.7F);
      this.e2 = 0.6F;
   }

   public int b0() {
      return 8;
   }

   protected boolean aK() {
      return false;
   }

   protected aiw eM() {
      double var1 = 8.0D;
      return this.ap.a(this, var1);
   }

   protected String b2() {
      return "mob.silverfish.say";
   }

   protected String bX() {
      return "mob.silverfish.hit";
   }

   protected String bS() {
      return "mob.silverfish.kill";
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         if (this.qS <= 0 && (var1 instanceof ai3 || var1 == ai4.long)) {
            this.qS = 20;
         }

         return super.a(var1, var2);
      }
   }

   protected void a(aiw var1, float var2) {
      if (this.eF <= 0 && var2 < 1.2F && var1.aZ.int > this.aZ.a && var1.aZ.a < this.aZ.int) {
         this.eF = 20;
         this.long(var1);
      }

   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.silverfish.step", 0.15F, 1.0F);
   }

   protected int bI() {
      return 0;
   }

   public void aC() {
      this.eH = this.a5;
      super.aC();
   }

   protected void cl() {
      super.cl();
      if (!this.ap.goto) {
         int var1;
         int var2;
         int var3;
         int var5;
         if (this.qS > 0) {
            --this.qS;
            if (this.qS == 0) {
               var1 = ajs.a(this.al);
               var2 = ajs.a(this.ak);
               var3 = ajs.a(this.aj);
               boolean var4 = false;

               for(var5 = 0; !var4 && var5 <= 5 && var5 >= -5; var5 = var5 <= 0 ? 1 - var5 : 0 - var5) {
                  for(int var6 = 0; !var4 && var6 <= 10 && var6 >= -10; var6 = var6 <= 0 ? 1 - var6 : 0 - var6) {
                     for(int var7 = 0; !var4 && var7 <= 10 && var7 >= -10; var7 = var7 <= 0 ? 1 - var7 : 0 - var7) {
                        int var8 = this.ap.new(var1 + var6, var2 + var5, var3 + var7);
                        if (var8 == pa.ap.void) {
                           this.ap.int(var1 + var6, var2 + var5, var3 + var7, false);
                           pa.ap.a((y6)this.ap, var1 + var6, var2 + var5, var3 + var7, 0);
                           if (this.bm.nextBoolean()) {
                              var4 = true;
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }

         if (this.pZ == null && !this.eN()) {
            var1 = ajs.a(this.al);
            var2 = ajs.a(this.ak + 0.5D);
            var3 = ajs.a(this.aj);
            int var9 = this.bm.nextInt(6);
            var5 = this.ap.new(var1 + api.a[var9], var2 + api.int[var9], var3 + api.for[var9]);
            if (ph.g(var5)) {
               this.ap.int(var1 + api.a[var9], var2 + api.int[var9], var3 + api.for[var9], pa.ap.void, ph.f(var5), 3);
               this.br();
               this.az();
            } else {
               this.eK();
            }
         } else if (this.pZ != null && !this.eN()) {
            this.pZ = null;
         }

      }
   }

   public float long(int var1, int var2, int var3) {
      return this.ap.new(var1, var2 - 1, var3) == pa.k.void ? 10.0F : super.long(var1, var2, var3);
   }

   protected boolean eZ() {
      return true;
   }

   public boolean bj() {
      if (super.bj()) {
         aek var1 = this.ap.if(this, 5.0D);
         return var1 == null;
      } else {
         return false;
      }
   }

   public int h(aiw var1) {
      return 1;
   }

   public ah8 cn() {
      return ah8.for;
   }
}
