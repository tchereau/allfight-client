import java.util.Calendar;

public class aes extends ae0 {
   private int qf = 0;

   public aes(y6 var1) {
      super(var1);
      this.ft = "/mob/zombie.png";
      this.e2 = 0.23F;
      this.bl().if(true);
      this.er.a(0, new aho(this));
      this.er.a(1, new ahu(this));
      this.er.a(2, new ahc(this, aek.class, this.e2, false));
      this.er.a(3, new ahc(this, aep.class, this.e2, true));
      this.er.a(4, new ag9(this, this.e2));
      this.er.a(5, new aha(this, this.e2, false));
      this.er.a(6, new ag0(this, this.e2));
      this.er.a(7, new ahf(this, aek.class, 8.0F));
      this.er.a(7, new ag1(this));
      this.eq.a(1, new agq(this, true));
      this.eq.a(2, new agp(this, aek.class, 16.0F, 0, true));
      this.eq.a(2, new agp(this, aep.class, 16.0F, 0, false));
   }

   protected int cq() {
      return 40;
   }

   public float bM() {
      return super.bM() * (this.bG() ? 1.5F : 1.0F);
   }

   protected void X() {
      super.X();
      this.ab().a(12, (byte)0);
      this.ab().a(13, (byte)0);
      this.ab().a(14, (byte)0);
   }

   public String W() {
      return this.e1() ? "/mob/zombie_villager.png" : "/mob/zombie.png";
   }

   public int b0() {
      return 20;
   }

   public int by() {
      int var1 = super.by() + 2;
      if (var1 > 20) {
         var1 = 20;
      }

      return var1;
   }

   protected boolean co() {
      return true;
   }

   public boolean bG() {
      return this.ab().for(12) == 1;
   }

   public void r(boolean var1) {
      this.ab().if(12, (byte)1);
   }

   public boolean e1() {
      return this.ab().for(13) == 1;
   }

   public void q(boolean var1) {
      this.ab().if(13, (byte)(var1 ? 1 : 0));
   }

   public void bU() {
      if (this.ap.j() && !this.ap.goto && !this.bG()) {
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

      super.bU();
   }

   public void aC() {
      if (!this.ap.goto && this.e2()) {
         int var1 = this.e0();
         this.qf -= var1;
         if (this.qf <= 0) {
            this.e3();
         }
      }

      super.aC();
   }

   public boolean long(aiw var1) {
      boolean var2 = super.long(var1);
      if (var2 && this.bW() == null && this.aP() && this.bm.nextFloat() < (float)this.ap.p * 0.3F) {
         var1.e(2 * this.ap.p);
      }

      return var2;
   }

   public int h(aiw var1) {
      abp var2 = this.bW();
      float var3 = (float)(this.b0() - this.cd()) / (float)this.b0();
      int var4 = 3 + ajs.new(var3 * 4.0F);
      if (var2 != null) {
         var4 += var2.a((aiw)this);
      }

      return var4;
   }

   protected String b2() {
      return "mob.zombie.say";
   }

   protected String bX() {
      return "mob.zombie.hurt";
   }

   protected String bS() {
      return "mob.zombie.death";
   }

   protected void a(int var1, int var2, int var3, int var4) {
      this.a("mob.zombie.step", 0.15F, 1.0F);
   }

   protected int bI() {
      return abr.aH.A;
   }

   public ah8 cn() {
      return ah8.a;
   }

   protected void u(int var1) {
      switch(this.bm.nextInt(3)) {
      case 0:
         this.new(abr.N.A, 1);
         break;
      case 1:
         this.new(abr.bJ.A, 1);
         break;
      case 2:
         this.new(abr.bG.A, 1);
      }

   }

   protected void bk() {
      super.bk();
      if (this.bm.nextFloat() < (this.ap.p == 3 ? 0.05F : 0.01F)) {
         int var1 = this.bm.nextInt(3);
         if (var1 == 0) {
            this.do(0, new abp(abr.J));
         } else {
            this.do(0, new abp(abr.ag));
         }
      }

   }

   public void for(aqv var1) {
      super.for(var1);
      if (this.bG()) {
         var1.a("IsBaby", true);
      }

      if (this.e1()) {
         var1.a("IsVillager", true);
      }

      var1.a("ConversionTime", this.e2() ? this.qf : -1);
   }

   public void try(aqv var1) {
      super.try(var1);
      if (var1.if("IsBaby")) {
         this.r(true);
      }

      if (var1.if("IsVillager")) {
         this.q(true);
      }

      if (var1.try("ConversionTime") && var1.goto("ConversionTime") > -1) {
         this.ah(var1.goto("ConversionTime"));
      }

   }

   public void a(aig var1) {
      super.a(var1);
      if (this.ap.p >= 2 && var1 instanceof aep) {
         if (this.ap.p == 2 && this.bm.nextBoolean()) {
            return;
         }

         aes var2 = new aes(this.ap);
         var2.if(var1);
         this.ap.a((aiw)var1);
         var2.bO();
         var2.q(true);
         if (var1.bG()) {
            var2.r(true);
         }

         this.ap.new(var2);
         this.ap.a((aek)null, 1016, (int)this.al, (int)this.ak, (int)this.aj, 0);
      }

   }

   public void bO() {
      this.d(this.bm.nextFloat() < eP[this.ap.p]);
      if (this.ap.o.nextFloat() < 0.05F) {
         this.q(true);
      }

      this.bk();
      this.bz();
      if (this.A(4) == null) {
         Calendar var1 = this.ap.k();
         if (var1.get(2) + 1 == 10 && var1.get(5) == 31 && this.bm.nextFloat() < 0.25F) {
            this.do(4, new abp(this.bm.nextFloat() < 0.1F ? pa.aH : pa.aW));
            this.ep[4] = 0.0F;
         }
      }

   }

   public boolean for(aek var1) {
      abp var2 = var1.cD();
      if (var2 != null && var2.d() == abr.bo && var2.new() == 0 && this.e1() && this.if(ai0.h)) {
         if (!var1.fY.new) {
            --var2.if;
         }

         if (var2.if <= 0) {
            var1.fR.if(var1.fR.aa, (abp)null);
         }

         if (!this.ap.goto) {
            this.ah(this.bm.nextInt(2401) + 3600);
         }

         return true;
      } else {
         return false;
      }
   }

   protected void ah(int var1) {
      this.qf = var1;
      this.ab().if(14, (byte)1);
      this.v(ai0.h.try);
      this.for((aiz)(new aiz(ai0.u.try, var1, Math.min(this.ap.p - 1, 0))));
      this.ap.a((aiw)this, (byte)16);
   }

   public void a(byte var1) {
      if (var1 == 16) {
         this.ap.a(this.al + 0.5D, this.ak + 0.5D, this.aj + 0.5D, "mob.zombie.remedy", 1.0F + this.bm.nextFloat(), this.bm.nextFloat() * 0.7F + 0.3F, false);
      } else {
         super.a(var1);
      }

   }

   public boolean e2() {
      return this.ab().for(14) == 1;
   }

   protected void e3() {
      aep var1 = new aep(this.ap);
      var1.if((aiw)this);
      var1.bO();
      var1.fM();
      if (this.bG()) {
         var1.at(-24000);
      }

      this.ap.a((aiw)this);
      this.ap.new(var1);
      var1.for((aiz)(new aiz(ai0.q.try, 200, 0)));
      this.ap.a((aek)null, 1017, (int)this.al, (int)this.ak, (int)this.aj, 0);
   }

   protected int e0() {
      int var1 = 1;
      if (this.bm.nextFloat() < 0.01F) {
         int var2 = 0;

         for(int var3 = (int)this.al - 4; var3 < (int)this.al + 4 && var2 < 14; ++var3) {
            for(int var4 = (int)this.ak - 4; var4 < (int)this.ak + 4 && var2 < 14; ++var4) {
               for(int var5 = (int)this.aj - 4; var5 < (int)this.aj + 4 && var2 < 14; ++var5) {
                  int var6 = this.ap.new(var3, var4, var5);
                  if (var6 == pa.ag.void || var6 == pa.al.void) {
                     if (this.bm.nextFloat() < 0.3F) {
                        ++var1;
                     }

                     ++var2;
                  }
               }
            }
         }
      }

      return var1;
   }
}
