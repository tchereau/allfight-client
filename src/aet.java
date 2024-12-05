import java.util.Iterator;
import java.util.List;

public class aet extends ae0 implements aey {
   private static final int[] qR;
   private int qQ = 0;

   public aet(y6 var1) {
      super(var1);
      this.ft = "/mob/villager/witch.png";
      this.e2 = 0.25F;
      this.er.a(1, new aho(this));
      this.er.a(2, new agz(this, this.e2, 60, 10.0F));
      this.er.a(2, new ag0(this, this.e2));
      this.er.a(3, new ahf(this, aek.class, 8.0F));
      this.er.a(3, new ag1(this));
      this.eq.a(1, new agq(this, false));
      this.eq.a(2, new agp(this, aek.class, 16.0F, 0, true));
   }

   protected void X() {
      super.X();
      this.ab().a(21, (byte)0);
   }

   protected String b2() {
      return "mob.witch.idle";
   }

   protected String bX() {
      return "mob.witch.hurt";
   }

   protected String bS() {
      return "mob.witch.death";
   }

   public void u(boolean var1) {
      this.ab().if(21, Byte.valueOf((byte)(var1 ? 1 : 0)));
   }

   public boolean fh() {
      return this.ab().for(21) == 1;
   }

   public int b0() {
      return 26;
   }

   public boolean co() {
      return true;
   }

   public void bU() {
      if (!this.ap.goto) {
         if (this.fh()) {
            if (this.qQ-- <= 0) {
               this.u(false);
               abp var5 = this.bW();
               this.do(0, (abp)null);
               if (var5 != null && var5.new == abr.av.A) {
                  List var2 = abr.av.goto(var5);
                  if (var2 != null) {
                     Iterator var3 = var2.iterator();

                     while(var3.hasNext()) {
                        aiz var4 = (aiz)var3.next();
                        this.for(new aiz(var4));
                     }
                  }
               }
            }
         } else {
            short var1 = -1;
            if (this.bm.nextFloat() < 0.15F && this.aP() && !this.if(ai0.n)) {
               var1 = 16307;
            } else if (this.bm.nextFloat() < 0.05F && this.fi < this.b0()) {
               var1 = 16341;
            } else if (this.bm.nextFloat() < 0.25F && this.bB() != null && !this.if(ai0.y) && this.bB().for((aiw)this) > 121.0D) {
               var1 = 16274;
            } else if (this.bm.nextFloat() < 0.25F && this.bB() != null && !this.if(ai0.y) && this.bB().for((aiw)this) > 121.0D) {
               var1 = 16274;
            }

            if (var1 > -1) {
               this.do(0, new abp(abr.av, 1, var1));
               this.qQ = this.bW().long();
               this.u(true);
            }
         }

         if (this.bm.nextFloat() < 7.5E-4F) {
            this.ap.a((aiw)this, (byte)15);
         }
      }

      super.bU();
   }

   public void a(byte var1) {
      if (var1 == 15) {
         for(int var2 = 0; var2 < this.bm.nextInt(35) + 10; ++var2) {
            this.ap.a("witchMagic", this.al + this.bm.nextGaussian() * 0.12999999523162842D, this.aZ.int + 0.5D + this.bm.nextGaussian() * 0.12999999523162842D, this.aj + this.bm.nextGaussian() * 0.12999999523162842D, 0.0D, 0.0D, 0.0D);
         }
      } else {
         super.a(var1);
      }

   }

   protected int do(ai4 var1, int var2) {
      var2 = super.do(var1, var2);
      if (var1.new() == this) {
         var2 = 0;
      }

      if (var1.e()) {
         var2 = (int)((double)var2 * 0.15D);
      }

      return var2;
   }

   public float bM() {
      float var1 = super.bM();
      if (this.fh()) {
         var1 *= 0.75F;
      }

      return var1;
   }

   protected void a(boolean var1, int var2) {
      int var3 = this.bm.nextInt(3) + 1;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.bm.nextInt(3);
         int var6 = qR[this.bm.nextInt(qR.length)];
         if (var2 > 0) {
            var5 += this.bm.nextInt(var2 + 1);
         }

         for(int var7 = 0; var7 < var5; ++var7) {
            this.new(var6, 1);
         }
      }

   }

   public void a(aig var1, float var2) {
      if (!this.fh()) {
         ad4 var3 = new ad4(this.ap, this, 32732);
         var3.a4 -= -20.0F;
         double var4 = var1.al + var1.ai - this.al;
         double var6 = var1.ak + (double)var1.af() - 1.100000023841858D - this.ak;
         double var8 = var1.aj + var1.ag - this.aj;
         float var10 = ajs.int(var4 * var4 + var8 * var8);
         if (var10 >= 8.0F && !var1.if(ai0.x)) {
            var3.m(32698);
         } else if (var1.cd() >= 8 && !var1.if(ai0.g)) {
            var3.m(32660);
         } else if (var10 <= 3.0F && !var1.if(ai0.h) && this.bm.nextFloat() < 0.25F) {
            var3.m(32696);
         }

         var3.do(var4, var6 + (double)(var10 * 0.2F), var8, 0.75F, 8.0F);
         this.ap.new(var3);
      }
   }

   static {
      qR = new int[]{abr.cc.A, abr.b7.A, abr.cv.A, abr.as.A, abr.at.A, abr.aS.A, abr.a9.A, abr.a9.A};
   }
}
