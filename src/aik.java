public class aik extends aiw {
   public int r5;
   public int r4 = 0;
   public int sa;
   private int r9 = 5;
   private int r8;
   private aek r7;
   private int r6;

   public aik(y6 var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.if(0.5F, 0.5F);
      this.aQ = this.aO / 2.0F;
      this.try(var2, var4, var6);
      this.a5 = (float)(Math.random() * 360.0D);
      this.ai = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.ah = (double)((float)(Math.random() * 0.2D) * 2.0F);
      this.ag = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
      this.r8 = var8;
   }

   protected boolean aK() {
      return false;
   }

   public aik(y6 var1) {
      super(var1);
      this.if(0.25F, 0.25F);
      this.aQ = this.aO / 2.0F;
   }

   protected void X() {
   }

   public int new(float var1) {
      float var2 = 0.5F;
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var3 = super.new(var1);
      int var4 = var3 & 255;
      int var5 = var3 >> 16 & 255;
      var4 += (int)(var2 * 15.0F * 16.0F);
      if (var4 > 240) {
         var4 = 240;
      }

      return var4 | var5 << 16;
   }

   public void aC() {
      super.aC();
      if (this.sa > 0) {
         --this.sa;
      }

      this.ao = this.al;
      this.an = this.ak;
      this.am = this.aj;
      this.ah -= 0.029999999329447746D;
      if (this.ap.byte(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj)) == ts.r) {
         this.ah = 0.20000000298023224D;
         this.ai = (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F);
         this.ag = (double)((this.bm.nextFloat() - this.bm.nextFloat()) * 0.2F);
         this.a("random.fizz", 0.4F, 2.0F + this.bm.nextFloat() * 0.4F);
      }

      this.for(this.al, (this.aZ.a + this.aZ.int) / 2.0D, this.aj);
      double var1 = 8.0D;
      if (this.r6 < this.r5 - 20 + this.av % 100) {
         if (this.r7 == null || this.r7.for(this) > var1 * var1) {
            this.r7 = this.ap.if(this, var1);
         }

         this.r6 = this.r5;
      }

      if (this.r7 != null) {
         double var3 = (this.r7.al - this.al) / var1;
         double var5 = (this.r7.ak + (double)this.r7.af() - this.ak) / var1;
         double var7 = (this.r7.aj - this.aj) / var1;
         double var9 = Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
         double var11 = 1.0D - var9;
         if (var11 > 0.0D) {
            var11 *= var11;
            this.ai += var3 / var9 * var11 * 0.1D;
            this.ah += var5 / var9 * var11 * 0.1D;
            this.ag += var7 / var9 * var11 * 0.1D;
         }
      }

      this.do(this.ai, this.ah, this.ag);
      float var13 = 0.98F;
      if (this.aY) {
         var13 = 0.58800006F;
         int var4 = this.ap.new(ajs.a(this.al), ajs.a(this.aZ.a) - 1, ajs.a(this.aj));
         if (var4 > 0) {
            var13 = pa.x[var4].aq * 0.98F;
         }
      }

      this.ai *= (double)var13;
      this.ah *= 0.9800000190734863D;
      this.ag *= (double)var13;
      if (this.aY) {
         this.ah *= -0.8999999761581421D;
      }

      ++this.r5;
      ++this.r4;
      if (this.r4 >= 6000) {
         this.az();
      }

   }

   public boolean aq() {
      return this.ap.a((nw)this.aZ, (ts)ts.s, (aiw)this);
   }

   protected void d(int var1) {
      this.a(ai4.j, var1);
   }

   public boolean a(ai4 var1, int var2) {
      if (this.ac()) {
         return false;
      } else {
         this.av();
         this.r9 -= var2;
         if (this.r9 <= 0) {
            this.az();
         }

         return false;
      }
   }

   public void for(aqv var1) {
      var1.a("Health", (short)((byte)this.r9));
      var1.a("Age", (short)this.r4);
      var1.a("Value", (short)this.r8);
   }

   public void try(aqv var1) {
      this.r9 = var1.case("Health") & 255;
      this.r4 = var1.case("Age");
      this.r8 = var1.case("Value");
   }

   public void do(aek var1) {
      if (!this.ap.goto) {
         if (this.sa == 0 && var1.fI == 0) {
            var1.fI = 2;
            this.a("random.orb", 0.1F, 0.5F * ((this.bm.nextFloat() - this.bm.nextFloat()) * 0.7F + 1.8F));
            var1.if(this, 1);
            var1.C(this.r8);
            this.az();
         }

      }
   }

   public int fX() {
      return this.r8;
   }

   public int fW() {
      if (this.r8 >= 2477) {
         return 10;
      } else if (this.r8 >= 1237) {
         return 9;
      } else if (this.r8 >= 617) {
         return 8;
      } else if (this.r8 >= 307) {
         return 7;
      } else if (this.r8 >= 149) {
         return 6;
      } else if (this.r8 >= 73) {
         return 5;
      } else if (this.r8 >= 37) {
         return 4;
      } else if (this.r8 >= 17) {
         return 3;
      } else if (this.r8 >= 7) {
         return 2;
      } else {
         return this.r8 >= 3 ? 1 : 0;
      }
   }

   public static int aC(int var0) {
      if (var0 >= 2477) {
         return 2477;
      } else if (var0 >= 1237) {
         return 1237;
      } else if (var0 >= 617) {
         return 617;
      } else if (var0 >= 307) {
         return 307;
      } else if (var0 >= 149) {
         return 149;
      } else if (var0 >= 73) {
         return 73;
      } else if (var0 >= 37) {
         return 37;
      } else if (var0 >= 17) {
         return 17;
      } else if (var0 >= 7) {
         return 7;
      } else {
         return var0 >= 3 ? 3 : 1;
      }
   }

   public boolean aa() {
      return false;
   }
}
