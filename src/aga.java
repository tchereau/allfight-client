import java.util.Calendar;

public class aga extends agb {
   private apg rW;

   public aga(y6 var1) {
      super(var1);
      this.ft = "/mob/bat.png";
      this.if(0.5F, 0.9F);
      this.I(true);
   }

   protected void X() {
      super.X();
      this.bg.a(16, new Byte((byte)0));
   }

   protected float bR() {
      return 0.1F;
   }

   protected float bp() {
      return super.bp() * 0.95F;
   }

   protected String b2() {
      return this.fP() && this.bm.nextInt(4) != 0 ? null : "mob.bat.idle";
   }

   protected String bX() {
      return "mob.bat.hurt";
   }

   protected String bS() {
      return "mob.bat.death";
   }

   public boolean ax() {
      return false;
   }

   protected void else(aiw var1) {
   }

   protected void cb() {
   }

   public int b0() {
      return 6;
   }

   public boolean fP() {
      return (this.bg.for(16) & 1) != 0;
   }

   public void I(boolean var1) {
      byte var2 = this.bg.for(16);
      if (var1) {
         this.bg.if(16, (byte)(var2 | 1));
      } else {
         this.bg.if(16, (byte)(var2 & -2));
      }

   }

   protected boolean co() {
      return true;
   }

   public void aC() {
      super.aC();
      if (this.fP()) {
         this.ai = this.ah = this.ag = 0.0D;
         this.ak = (double)ajs.a(this.ak) + 1.0D - (double)this.aO;
      } else {
         this.ah *= 0.6000000238418579D;
      }

   }

   protected void bQ() {
      super.bQ();
      if (this.fP()) {
         if (!this.ap.try(ajs.a(this.al), (int)this.ak + 1, ajs.a(this.aj))) {
            this.I(false);
            this.ap.a((aek)null, 1015, (int)this.al, (int)this.ak, (int)this.aj, 0);
         } else {
            if (this.bm.nextInt(200) == 0) {
               this.fA = (float)this.bm.nextInt(360);
            }

            if (this.ap.if(this, 4.0D) != null) {
               this.I(false);
               this.ap.a((aek)null, 1015, (int)this.al, (int)this.ak, (int)this.aj, 0);
            }
         }
      } else {
         if (this.rW != null && (!this.ap.a(this.rW.if, this.rW.a, this.rW.do) || this.rW.a < 1)) {
            this.rW = null;
         }

         if (this.rW == null || this.bm.nextInt(30) == 0 || this.rW.if((int)this.al, (int)this.ak, (int)this.aj) < 4.0F) {
            this.rW = new apg((int)this.al + this.bm.nextInt(7) - this.bm.nextInt(7), (int)this.ak + this.bm.nextInt(6) - 2, (int)this.aj + this.bm.nextInt(7) - this.bm.nextInt(7));
         }

         double var1 = (double)this.rW.if + 0.5D - this.al;
         double var3 = (double)this.rW.a + 0.1D - this.ak;
         double var5 = (double)this.rW.do + 0.5D - this.aj;
         this.ai += (Math.signum(var1) * 0.5D - this.ai) * 0.10000000149011612D;
         this.ah += (Math.signum(var3) * 0.699999988079071D - this.ah) * 0.10000000149011612D;
         this.ag += (Math.signum(var5) * 0.5D - this.ag) * 0.10000000149011612D;
         float var7 = (float)(Math.atan2(this.ag, this.ai) * 180.0D / 3.1415927410125732D) - 90.0F;
         float var8 = ajs.int(var7 - this.a5);
         this.e6 = 0.5F;
         this.a5 += var8;
         if (this.bm.nextInt(100) == 0 && this.ap.try(ajs.a(this.al), (int)this.ak + 1, ajs.a(this.aj))) {
            this.I(true);
         }
      }

   }

   protected boolean aK() {
      return false;
   }

   protected void try(float var1) {
   }

   protected void a(double var1, boolean var3) {
   }

   public boolean ah() {
      return true;
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         if (!this.ap.goto && this.fP()) {
            this.I(false);
         }

         return super.a(var1, var2);
      }
   }

   public void try(aqv var1) {
      super.try(var1);
      this.bg.if(16, var1.else("BatFlags"));
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("BatFlags", this.bg.for(16));
   }

   public boolean bj() {
      int var1 = ajs.a(this.aZ.a);
      if (var1 >= 63) {
         return false;
      } else {
         int var2 = ajs.a(this.al);
         int var3 = ajs.a(this.aj);
         int var4 = this.ap.h(var2, var1, var3);
         byte var5 = 4;
         Calendar var6 = this.ap.k();
         if (var6.get(2) + 1 == 10 && var6.get(5) >= 20 || var6.get(2) + 1 == 11 && var6.get(5) <= 3) {
            var5 = 7;
         } else if (this.bm.nextBoolean()) {
            return false;
         }

         return var4 > this.bm.nextInt(var5) ? false : super.bj();
      }
   }

   public void bO() {
   }
}
