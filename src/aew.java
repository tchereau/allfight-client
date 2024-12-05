import java.util.Calendar;

public class aew extends ae0 implements aey {
   private agz qj = new agz(this, 0.25F, 20, 60, 15.0F);
   private ahc qi = new ahc(this, aek.class, 0.31F, false);

   public aew(y6 var1) {
      super(var1);
      this.ft = "/mob/skeleton.png";
      this.e2 = 0.25F;
      this.er.a(1, new aho(this));
      this.er.a(2, new agx(this));
      this.er.a(3, new ahp(this, this.e2));
      this.er.a(5, new ag0(this, this.e2));
      this.er.a(6, new ahf(this, aek.class, 8.0F));
      this.er.a(6, new ag1(this));
      this.eq.a(1, new agq(this, false));
      this.eq.a(2, new agp(this, aek.class, 16.0F, 0, true));
      if (var1 != null && !var1.goto) {
         this.e5();
      }

   }

   protected void X() {
      super.X();
      this.bg.a(13, new Byte((byte)0));
   }

   public boolean co() {
      return true;
   }

   public int b0() {
      return 20;
   }

   protected String b2() {
      return "mob.skeleton.say";
   }

   protected String bX() {
      return "mob.skeleton.hurt";
   }

   protected String bS() {
      return "mob.skeleton.death";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.skeleton.step", 0.15F, 1.0F);
   }

   public boolean long(aiw var1) {
      if (super.long(var1)) {
         if (this.e4() == 1 && var1 instanceof aig) {
            ((aig)var1).for(new aiz(ai0.f.try, 200));
         }

         return true;
      } else {
         return false;
      }
   }

   public int h(aiw var1) {
      if (this.e4() == 1) {
         abp var2 = this.bW();
         int var3 = 4;
         if (var2 != null) {
            var3 += var2.a((aiw)this);
         }

         return var3;
      } else {
         return super.h(var1);
      }
   }

   public ah8 cn() {
      return ah8.a;
   }

   public void bU() {
      if (this.ap.j() && !this.ap.goto) {
         float var1 = this.int(1.0F);
         if (var1 > 0.5F && this.bm.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F && this.ap.j(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj))) {
            boolean var2 = true;
            abp var3 = this.A(4);
            if (var3 != null) {
               if (var3.else()) {
                  var3.do(var3.k() + this.bm.nextInt(2));
                  if (var3.k() >= var3.e()) {
                     this.byte(var3);
                     this.do(4, (abp)null);
                  }
               }

               var2 = false;
            }

            if (var2) {
               this.e(8);
            }
         }
      }

      if (this.ap.goto && this.e4() == 1) {
         this.if(0.72F, 2.34F);
      }

      super.bU();
   }

   public void a(ai4 var1) {
      super.a(var1);
      if (var1.byte() instanceof aei && var1.new() instanceof aek) {
         aek var2 = (aek)var1.new();
         double var3 = var2.al - this.al;
         double var5 = var2.aj - this.aj;
         if (var3 * var3 + var5 * var5 >= 2500.0D) {
            var2.a((akf)akk.int);
         }
      }

   }

   protected int bI() {
      return abr.T.A;
   }

   protected void a(boolean var1, int var2) {
      int var3;
      int var4;
      if (this.e4() == 1) {
         var3 = this.bm.nextInt(3 + var2) - 1;

         for(var4 = 0; var4 < var3; ++var4) {
            this.new(abr.R.A, 1);
         }
      } else {
         var3 = this.bm.nextInt(3 + var2);

         for(var4 = 0; var4 < var3; ++var4) {
            this.new(abr.T.A, 1);
         }
      }

      var3 = this.bm.nextInt(3 + var2);

      for(var4 = 0; var4 < var3; ++var4) {
         this.new(abr.b8.A, 1);
      }

   }

   protected void u(int var1) {
      if (this.e4() == 1) {
         this.a(new abp(abr.bv.A, 1, 1), 0.0F);
      }

   }

   protected void bk() {
      super.bk();
      this.do(0, new abp(abr.W));
   }

   public String W() {
      return this.e4() == 1 ? "/mob/skeleton_wither.png" : super.W();
   }

   public void bO() {
      if (this.ap.n instanceof xk && this.bq().nextInt(5) > 0) {
         this.er.a(4, this.qi);
         this.ai(1);
         this.do(0, new abp(abr.x));
      } else {
         this.er.a(4, this.qj);
         this.bk();
         this.bz();
      }

      this.d(this.bm.nextFloat() < eP[this.ap.p]);
      if (this.A(4) == null) {
         Calendar var1 = this.ap.k();
         if (var1.get(2) + 1 == 10 && var1.get(5) == 31 && this.bm.nextFloat() < 0.25F) {
            this.do(4, new abp(this.bm.nextFloat() < 0.1F ? pa.aH : pa.aW));
            this.ep[4] = 0.0F;
         }
      }

   }

   public void e5() {
      this.er.a((ahk)this.qi);
      this.er.a((ahk)this.qj);
      abp var1 = this.bW();
      if (var1 != null && var1.new == abr.W.A) {
         this.er.a(4, this.qj);
      } else {
         this.er.a(4, this.qi);
      }

   }

   public void a(aig var1, float var2) {
      aei var3 = new aei(this.ap, this, var1, 1.6F, (float)(14 - this.ap.p * 4));
      int var4 = z1.a(z3.int.a, this.bW());
      int var5 = z1.a(z3.for.a, this.bW());
      var3.if((double)(var2 * 2.0F) + this.bm.nextGaussian() * 0.25D + (double)((float)this.ap.p * 0.11F));
      if (var4 > 0) {
         var3.if(var3.aZ() + (double)var4 * 0.5D + 0.5D);
      }

      if (var5 > 0) {
         var3.l(var5);
      }

      if (z1.a(z3.do.a, this.bW()) > 0 || this.e4() == 1) {
         var3.e(100);
      }

      this.a("random.bow", 1.0F, 1.0F / (this.bq().nextFloat() * 0.4F + 0.8F));
      this.ap.new(var3);
   }

   public int e4() {
      return this.bg.for(13);
   }

   public void ai(int var1) {
      this.bg.if(13, (byte)var1);
      this.bh = var1 == 1;
      if (var1 == 1) {
         this.if(0.72F, 2.34F);
      } else {
         this.if(0.6F, 1.8F);
      }

   }

   public void try(aqv var1) {
      super.try(var1);
      if (var1.try("SkeletonType")) {
         byte var2 = var1.else("SkeletonType");
         this.ai(var2);
      }

      this.e5();
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("SkeletonType", (byte)this.e4());
   }

   public void do(int var1, abp var2) {
      super.do(var1, var2);
      if (!this.ap.goto && var1 == 0) {
         this.e5();
      }

   }
}
