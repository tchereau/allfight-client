public abstract class afh extends afj implements ajg {
   private abp[] su = new abp[36];
   private boolean st = true;

   public afh(y6 var1) {
      super(var1);
   }

   public afh(y6 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public void if(ai4 var1) {
      super.if(var1);

      for(int var2 = 0; var2 < this.r(); ++var2) {
         abp var3 = this.do(var2);
         if (var3 != null) {
            float var4 = this.bm.nextFloat() * 0.8F + 0.1F;
            float var5 = this.bm.nextFloat() * 0.8F + 0.1F;
            float var6 = this.bm.nextFloat() * 0.8F + 0.1F;

            while(var3.if > 0) {
               int var7 = this.bm.nextInt(21) + 10;
               if (var7 > var3.if) {
                  var7 = var3.if;
               }

               var3.if -= var7;
               afk var8 = new afk(this.ap, this.al + (double)var4, this.ak + (double)var5, this.aj + (double)var6, new abp(var3.new, var7, var3.new()));
               float var9 = 0.05F;
               var8.ai = (double)((float)this.bm.nextGaussian() * var9);
               var8.ah = (double)((float)this.bm.nextGaussian() * var9 + 0.2F);
               var8.ag = (double)((float)this.bm.nextGaussian() * var9);
               this.ap.new(var8);
            }
         }
      }

   }

   public abp do(int var1) {
      return this.su[var1];
   }

   public abp if(int var1, int var2) {
      if (this.su[var1] != null) {
         abp var3;
         if (this.su[var1].if <= var2) {
            var3 = this.su[var1];
            this.su[var1] = null;
            return var3;
         } else {
            var3 = this.su[var1].a(var2);
            if (this.su[var1].if == 0) {
               this.su[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (this.su[var1] != null) {
         abp var2 = this.su[var1];
         this.su[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.su[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

   }

   public void case() {
   }

   public boolean a(aek var1) {
      if (this.aR) {
         return false;
      } else {
         return !(var1.for(this) > 64.0D);
      }
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return true;
   }

   public String t() {
      return this.s() ? this.ga() : "container.minecart";
   }

   public int q() {
      return 64;
   }

   public void f(int var1) {
      this.st = false;
      super.f(var1);
   }

   public void az() {
      if (this.st) {
         for(int var1 = 0; var1 < this.r(); ++var1) {
            abp var2 = this.do(var1);
            if (var2 != null) {
               float var3 = this.bm.nextFloat() * 0.8F + 0.1F;
               float var4 = this.bm.nextFloat() * 0.8F + 0.1F;
               float var5 = this.bm.nextFloat() * 0.8F + 0.1F;

               while(var2.if > 0) {
                  int var6 = this.bm.nextInt(21) + 10;
                  if (var6 > var2.if) {
                     var6 = var2.if;
                  }

                  var2.if -= var6;
                  afk var7 = new afk(this.ap, this.al + (double)var3, this.ak + (double)var4, this.aj + (double)var5, new abp(var2.new, var6, var2.new()));
                  if (var2.a()) {
                     var7.ba().do((aqv)var2.b().do());
                  }

                  float var8 = 0.05F;
                  var7.ai = (double)((float)this.bm.nextGaussian() * var8);
                  var7.ah = (double)((float)this.bm.nextGaussian() * var8 + 0.2F);
                  var7.ag = (double)((float)this.bm.nextGaussian() * var8);
                  this.ap.new(var7);
               }
            }
         }
      }

      super.az();
   }

   protected void for(aqv var1) {
      super.for(var1);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.su.length; ++var3) {
         if (this.su[var3] != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var3);
            this.su[var3].if(var4);
            var2.a((aqd)var4);
         }
      }

      var1.a("Items", (aqd)var2);
   }

   protected void try(aqv var1) {
      super.try(var1);
      aqm var2 = var1.void("Items");
      this.su = new abp[this.r()];

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         int var5 = var4.else("Slot") & 255;
         if (var5 >= 0 && var5 < this.su.length) {
            this.su[var5] = abp.for(var4);
         }
      }

   }

   public boolean for(aek var1) {
      if (!this.ap.goto) {
         var1.a((ajg)this);
      }

      return true;
   }

   protected void f8() {
      int var1 = 15 - ad1.a((ajg)this);
      float var2 = 0.98F + (float)var1 * 0.001F;
      this.ai *= (double)var2;
      this.ah *= 0.0D;
      this.ag *= (double)var2;
   }
}
