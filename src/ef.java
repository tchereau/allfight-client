import net.minecraft.client.Minecraft;

public class ef extends d7 {
   private int b9 = 0;
   private final d6 b8;
   private aqm b7;
   boolean b6;

   public ef(y6 var1, double var2, double var4, double var6, double var8, double var10, double var12, d6 var14, aqv var15) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.ai = var8;
      this.ah = var10;
      this.ag = var12;
      this.b8 = var14;
      this.bw = 8;
      if (var15 != null) {
         this.b7 = var15.void("Explosions");
         if (this.b7.for() == 0) {
            this.b7 = null;
         } else {
            this.bw = this.b7.for() * 2 - 1;

            for(int var16 = 0; var16 < this.b7.for(); ++var16) {
               aqv var17 = (aqv)this.b7.a(var16);
               if (var17.if("Flicker")) {
                  this.b6 = true;
                  this.bw += 15;
                  break;
               }
            }
         }
      }

   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
   }

   public void aC() {
      boolean var1;
      if (this.b9 == 0 && this.b7 != null) {
         var1 = this.aX();
         boolean var2 = false;
         if (this.b7.for() >= 3) {
            var2 = true;
         } else {
            for(int var3 = 0; var3 < this.b7.for(); ++var3) {
               aqv var4 = (aqv)this.b7.a(var3);
               if (var4.else("Type") == 1) {
                  var2 = true;
                  break;
               }
            }
         }

         String var15 = "fireworks." + (var2 ? "largeBlast" : "blast") + (var1 ? "_far" : "");
         this.ap.a(this.al, this.ak, this.aj, var15, 20.0F, 0.95F + this.bm.nextFloat() * 0.1F, true);
      }

      if (this.b9 % 2 == 0 && this.b7 != null && this.b9 / 2 < this.b7.for()) {
         int var13 = this.b9 / 2;
         aqv var14 = (aqv)this.b7.a(var13);
         byte var17 = var14.else("Type");
         boolean var18 = var14.if("Trail");
         boolean var5 = var14.if("Flicker");
         int[] var6 = var14.for("Colors");
         int[] var7 = var14.for("FadeColors");
         if (var17 == 1) {
            this.a(0.5D, 4, var6, var7, var18, var5);
         } else if (var17 == 2) {
            this.a(0.5D, new double[][]{{0.0D, 1.0D}, {0.3455D, 0.309D}, {0.9511D, 0.309D}, {0.3795918367346939D, -0.12653061224489795D}, {0.6122448979591837D, -0.8040816326530612D}, {0.0D, -0.35918367346938773D}}, var6, var7, var18, var5, false);
         } else if (var17 == 3) {
            this.a(0.5D, new double[][]{{0.0D, 0.2D}, {0.2D, 0.2D}, {0.2D, 0.6D}, {0.6D, 0.6D}, {0.6D, 0.2D}, {0.2D, 0.2D}, {0.2D, 0.0D}, {0.4D, 0.0D}, {0.4D, -0.6D}, {0.2D, -0.6D}, {0.2D, -0.4D}, {0.0D, -0.4D}}, var6, var7, var18, var5, true);
         } else if (var17 == 4) {
            this.a(var6, var7, var18, var5);
         } else {
            this.a(0.25D, 2, var6, var7, var18, var5);
         }

         int var8 = var6[0];
         float var9 = (float)((var8 & 16711680) >> 16) / 255.0F;
         float var10 = (float)((var8 & '\uff00') >> 8) / 255.0F;
         float var11 = (float)((var8 & 255) >> 0) / 255.0F;
         eh var12 = new eh(this.ap, this.al, this.ak, this.aj);
         var12.if(var9, var10, var11);
         this.b8.a((d7)var12);
      }

      ++this.b9;
      if (this.b9 > this.bw) {
         if (this.b6) {
            var1 = this.aX();
            String var16 = "fireworks." + (var1 ? "twinkle_far" : "twinkle");
            this.ap.a(this.al, this.ak, this.aj, var16, 20.0F, 0.9F + this.bm.nextFloat() * 0.15F, true);
         }

         this.az();
      }

   }

   private boolean aX() {
      Minecraft var1 = Minecraft.ih();
      return var1 == null || var1.vj == null || !(var1.vj.if(this.al, this.ak, this.aj) < 256.0D);
   }

   private void a(double var1, double var3, double var5, double var7, double var9, double var11, int[] var13, int[] var14, boolean var15, boolean var16) {
      eg var17 = new eg(this.ap, var1, var3, var5, var7, var9, var11, this.b8);
      var17.try(var15);
      var17.new(var16);
      int var18 = this.bm.nextInt(var13.length);
      var17.k(var13[var18]);
      if (var14 != null && var14.length > 0) {
         var17.j(var14[this.bm.nextInt(var14.length)]);
      }

      this.b8.a((d7)var17);
   }

   private void a(double var1, int var3, int[] var4, int[] var5, boolean var6, boolean var7) {
      double var8 = this.al;
      double var10 = this.ak;
      double var12 = this.aj;

      for(int var14 = -var3; var14 <= var3; ++var14) {
         for(int var15 = -var3; var15 <= var3; ++var15) {
            for(int var16 = -var3; var16 <= var3; ++var16) {
               double var17 = (double)var15 + (this.bm.nextDouble() - this.bm.nextDouble()) * 0.5D;
               double var19 = (double)var14 + (this.bm.nextDouble() - this.bm.nextDouble()) * 0.5D;
               double var21 = (double)var16 + (this.bm.nextDouble() - this.bm.nextDouble()) * 0.5D;
               double var23 = (double)ajs.int(var17 * var17 + var19 * var19 + var21 * var21) / var1 + this.bm.nextGaussian() * 0.05D;
               this.a(var8, var10, var12, var17 / var23, var19 / var23, var21 / var23, var4, var5, var6, var7);
               if (var14 != -var3 && var14 != var3 && var15 != -var3 && var15 != var3) {
                  var16 += var3 * 2 - 1;
               }
            }
         }
      }

   }

   private void a(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var9 = var3[0][0];
      double var11 = var3[0][1];
      this.a(this.al, this.ak, this.aj, var9 * var1, var11 * var1, 0.0D, var4, var5, var6, var7);
      float var13 = this.bm.nextFloat() * 3.1415927F;
      double var14 = var8 ? 0.034D : 0.34D;

      for(int var16 = 0; var16 < 3; ++var16) {
         double var17 = (double)var13 + (double)((float)var16 * 3.1415927F) * var14;
         double var19 = var9;
         double var21 = var11;

         for(int var23 = 1; var23 < var3.length; ++var23) {
            double var24 = var3[var23][0];
            double var26 = var3[var23][1];

            for(double var28 = 0.25D; var28 <= 1.0D; var28 += 0.25D) {
               double var30 = (var19 + (var24 - var19) * var28) * var1;
               double var32 = (var21 + (var26 - var21) * var28) * var1;
               double var34 = var30 * Math.sin(var17);
               var30 *= Math.cos(var17);

               for(double var36 = -1.0D; var36 <= 1.0D; var36 += 2.0D) {
                  this.a(this.al, this.ak, this.aj, var30 * var36, var32, var34 * var36, var4, var5, var6, var7);
               }
            }

            var19 = var24;
            var21 = var26;
         }
      }

   }

   private void a(int[] var1, int[] var2, boolean var3, boolean var4) {
      double var5 = this.bm.nextGaussian() * 0.05D;
      double var7 = this.bm.nextGaussian() * 0.05D;

      for(int var9 = 0; var9 < 70; ++var9) {
         double var10 = this.ai * 0.5D + this.bm.nextGaussian() * 0.15D + var5;
         double var12 = this.ag * 0.5D + this.bm.nextGaussian() * 0.15D + var7;
         double var14 = this.ah * 0.5D + this.bm.nextDouble() * 0.5D;
         this.a(this.al, this.ak, this.aj, var10, var14, var12, var1, var2, var3, var4);
      }

   }

   public int aS() {
      return 0;
   }
}
