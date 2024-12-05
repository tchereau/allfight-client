import java.util.List;

public abstract class af9 extends aiy implements aix {
   private int rk;
   private int rj = 0;

   public af9(y6 var1) {
      super(var1);
   }

   protected void b8() {
      if (this.fr() != 0) {
         this.rk = 0;
      }

      super.b8();
   }

   public void bU() {
      super.bU();
      if (this.fr() != 0) {
         this.rk = 0;
      }

      if (this.rk > 0) {
         --this.rk;
         String var1 = "heart";
         if (this.rk % 10 == 0) {
            double var2 = this.bm.nextGaussian() * 0.02D;
            double var4 = this.bm.nextGaussian() * 0.02D;
            double var6 = this.bm.nextGaussian() * 0.02D;
            this.ap.a(var1, this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + 0.5D + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, var2, var4, var6);
         }
      } else {
         this.rj = 0;
      }

   }

   protected void a(aiw var1, float var2) {
      if (var1 instanceof aek) {
         if (var2 < 3.0F) {
            double var3 = var1.al - this.al;
            double var5 = var1.aj - this.aj;
            this.a5 = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
            this.pW = true;
         }

         aek var7 = (aek)var1;
         if (var7.cD() == null || !this.long(var7.cD())) {
            this.pZ = null;
         }
      } else if (var1 instanceof af9) {
         af9 var8 = (af9)var1;
         if (this.fr() > 0 && var8.fr() < 0) {
            if ((double)var2 < 2.5D) {
               this.pW = true;
            }
         } else if (this.rk > 0 && var8.rk > 0) {
            if (var8.pZ == null) {
               var8.pZ = this;
            }

            if (var8.pZ == this && (double)var2 < 3.5D) {
               ++var8.rk;
               ++this.rk;
               ++this.rj;
               if (this.rj % 4 == 0) {
                  this.ap.a("heart", this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + 0.5D + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, 0.0D, 0.0D, 0.0D);
               }

               if (this.rj == 60) {
                  this.a((af9)var1);
               }
            } else {
               this.rj = 0;
            }
         } else {
            this.rj = 0;
            this.pZ = null;
         }
      }

   }

   private void a(af9 var1) {
      aiy var2 = this.a(var1);
      if (var2 != null) {
         this.at(6000);
         var1.at(6000);
         this.rk = 0;
         this.rj = 0;
         this.pZ = null;
         var1.pZ = null;
         var1.rj = 0;
         var1.rk = 0;
         var2.at(-24000);
         var2.if(this.al, this.ak, this.aj, this.a5, this.a4);

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.bm.nextGaussian() * 0.02D;
            double var6 = this.bm.nextGaussian() * 0.02D;
            double var8 = this.bm.nextGaussian() * 0.02D;
            this.ap.a("heart", this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + 0.5D + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, var4, var6, var8);
         }

         this.ap.new(var2);
      }

   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         this.pY = 60;
         this.pZ = null;
         this.rk = 0;
         return super.a(var1, var2);
      }
   }

   public float long(int var1, int var2, int var3) {
      return this.ap.new(var1, var2 - 1, var3) == pa.i.void ? 10.0F : this.ap.int(var1, var2, var3) - 0.5F;
   }

   public void for(aqv var1) {
      super.for(var1);
      var1.a("InLove", this.rk);
   }

   public void try(aqv var1) {
      super.try(var1);
      this.rk = var1.goto("InLove");
   }

   protected aiw eM() {
      if (this.pY > 0) {
         return null;
      } else {
         float var1 = 8.0F;
         List var2;
         int var3;
         af9 var4;
         if (this.rk > 0) {
            var2 = this.ap.a(this.getClass(), this.aZ.do((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               var4 = (af9)var2.get(var3);
               if (var4 != this && var4.rk > 0) {
                  return var4;
               }
            }
         } else if (this.fr() == 0) {
            var2 = this.ap.a(aek.class, this.aZ.do((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               aek var5 = (aek)var2.get(var3);
               if (var5.cD() != null && this.long(var5.cD())) {
                  return var5;
               }
            }
         } else if (this.fr() > 0) {
            var2 = this.ap.a(this.getClass(), this.aZ.do((double)var1, (double)var1, (double)var1));

            for(var3 = 0; var3 < var2.size(); ++var3) {
               var4 = (af9)var2.get(var3);
               if (var4 != this && var4.fr() < 0) {
                  return var4;
               }
            }
         }

         return null;
      }
   }

   public boolean bj() {
      int var1 = ajs.a(this.al);
      int var2 = ajs.a(this.aZ.a);
      int var3 = ajs.a(this.aj);
      return this.ap.new(var1, var2 - 1, var3) == pa.i.void && this.ap.m(var1, var2, var3) > 8 && super.bj();
   }

   public int bE() {
      return 120;
   }

   protected boolean bn() {
      return false;
   }

   protected int new(aek var1) {
      return 1 + this.ap.o.nextInt(3);
   }

   public boolean long(abp var1) {
      return var1.new == abr.aE.A;
   }

   public boolean for(aek var1) {
      abp var2 = var1.fR.L();
      if (var2 != null && this.long(var2) && this.fr() == 0 && this.rk <= 0) {
         if (!var1.fY.new) {
            --var2.if;
            if (var2.if <= 0) {
               var1.fR.if(var1.fR.aa, (abp)null);
            }
         }

         this.rk = 600;
         this.pZ = null;

         for(int var3 = 0; var3 < 7; ++var3) {
            double var4 = this.bm.nextGaussian() * 0.02D;
            double var6 = this.bm.nextGaussian() * 0.02D;
            double var8 = this.bm.nextGaussian() * 0.02D;
            this.ap.a("heart", this.al + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, this.ak + 0.5D + (double)(this.bm.nextFloat() * this.aO), this.aj + (double)(this.bm.nextFloat() * this.aP * 2.0F) - (double)this.aP, var4, var6, var8);
         }

         return true;
      } else {
         return super.for(var1);
      }
   }

   public boolean fs() {
      return this.rk > 0;
   }

   public void ft() {
      this.rk = 0;
   }

   public boolean if(af9 var1) {
      if (var1 == this) {
         return false;
      } else if (var1.getClass() != this.getClass()) {
         return false;
      } else {
         return this.fs() && var1.fs();
      }
   }
}
