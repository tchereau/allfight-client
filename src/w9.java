import java.util.Random;

public class w9 extends w2 {
   static final byte[] E = new byte[]{2, 0, 0, 1, 2, 1};
   Random D = new Random();
   y6 C;
   int[] B = new int[]{0, 0, 0};
   int A = 0;
   int z;
   double y = 0.618D;
   double x = 1.0D;
   double w = 0.381D;
   double v = 1.0D;
   double u = 1.0D;
   int t = 1;
   int s = 12;
   int r = 4;
   int[][] q;

   public w9(boolean var1) {
      super(var1);
   }

   void do() {
      this.z = (int)((double)this.A * this.y);
      if (this.z >= this.A) {
         this.z = this.A - 1;
      }

      int var1 = (int)(1.382D + Math.pow(this.u * (double)this.A / 13.0D, 2.0D));
      if (var1 < 1) {
         var1 = 1;
      }

      int[][] var2 = new int[var1 * this.A][4];
      int var3 = this.B[1] + this.A - this.r;
      int var4 = 1;
      int var5 = this.B[1] + this.z;
      int var6 = var3 - this.B[1];
      var2[0][0] = this.B[0];
      var2[0][1] = var3;
      var2[0][2] = this.B[2];
      var2[0][3] = var5;
      --var3;

      while(true) {
         while(var6 >= 0) {
            int var7 = 0;
            float var8 = this.do(var6);
            if (var8 < 0.0F) {
               --var3;
               --var6;
            } else {
               for(double var9 = 0.5D; var7 < var1; ++var7) {
                  double var11 = this.v * (double)var8 * ((double)this.D.nextFloat() + 0.328D);
                  double var13 = (double)this.D.nextFloat() * 2.0D * 3.14159D;
                  int var15 = ajs.a(var11 * Math.sin(var13) + (double)this.B[0] + var9);
                  int var16 = ajs.a(var11 * Math.cos(var13) + (double)this.B[2] + var9);
                  int[] var17 = new int[]{var15, var3, var16};
                  int[] var18 = new int[]{var15, var3 + this.r, var16};
                  if (this.a(var17, var18) == -1) {
                     int[] var19 = new int[]{this.B[0], this.B[1], this.B[2]};
                     double var20 = Math.sqrt(Math.pow((double)Math.abs(this.B[0] - var17[0]), 2.0D) + Math.pow((double)Math.abs(this.B[2] - var17[2]), 2.0D));
                     double var22 = var20 * this.w;
                     if ((double)var17[1] - var22 > (double)var5) {
                        var19[1] = var5;
                     } else {
                        var19[1] = (int)((double)var17[1] - var22);
                     }

                     if (this.a(var19, var17) == -1) {
                        var2[var4][0] = var15;
                        var2[var4][1] = var3;
                        var2[var4][2] = var16;
                        var2[var4][3] = var19[1];
                        ++var4;
                     }
                  }
               }

               --var3;
               --var6;
            }
         }

         this.q = new int[var4][4];
         System.arraycopy(var2, 0, this.q, 0, var4);
         return;
      }
   }

   void a(int var1, int var2, int var3, float var4, byte var5, int var6) {
      int var7 = (int)((double)var4 + 0.618D);
      byte var8 = E[var5];
      byte var9 = E[var5 + 3];
      int[] var10 = new int[]{var1, var2, var3};
      int[] var11 = new int[]{0, 0, 0};
      int var12 = -var7;
      int var13 = -var7;

      label32:
      for(var11[var5] = var10[var5]; var12 <= var7; ++var12) {
         var11[var8] = var10[var8] + var12;
         var13 = -var7;

         while(true) {
            while(true) {
               if (var13 > var7) {
                  continue label32;
               }

               double var15 = Math.pow((double)Math.abs(var12) + 0.5D, 2.0D) + Math.pow((double)Math.abs(var13) + 0.5D, 2.0D);
               if (var15 > (double)(var4 * var4)) {
                  ++var13;
               } else {
                  var11[var9] = var10[var9] + var13;
                  int var14 = this.C.new(var11[0], var11[1], var11[2]);
                  if (var14 != 0 && var14 != pa.aJ.void) {
                     ++var13;
                  } else {
                     this.a(this.C, var11[0], var11[1], var11[2], var6, 0);
                     ++var13;
                  }
               }
            }
         }
      }

   }

   float do(int var1) {
      if ((double)var1 < (double)((float)this.A) * 0.3D) {
         return -1.618F;
      } else {
         float var2 = (float)this.A / 2.0F;
         float var3 = (float)this.A / 2.0F - (float)var1;
         float var4;
         if (var3 == 0.0F) {
            var4 = var2;
         } else if (Math.abs(var3) >= var2) {
            var4 = 0.0F;
         } else {
            var4 = (float)Math.sqrt(Math.pow((double)Math.abs(var2), 2.0D) - Math.pow((double)Math.abs(var3), 2.0D));
         }

         var4 *= 0.5F;
         return var4;
      }
   }

   float a(int var1) {
      if (var1 >= 0 && var1 < this.r) {
         return var1 != 0 && var1 != this.r - 1 ? 3.0F : 2.0F;
      } else {
         return -1.0F;
      }
   }

   void a(int var1, int var2, int var3) {
      int var4 = var2;

      for(int var5 = var2 + this.r; var4 < var5; ++var4) {
         float var6 = this.a(var4 - var2);
         this.a(var1, var4, var3, var6, (byte)1, pa.aJ.void);
      }

   }

   void a(int[] var1, int[] var2, int var3) {
      int[] var4 = new int[]{0, 0, 0};
      byte var5 = 0;

      byte var6;
      for(var6 = 0; var5 < 3; ++var5) {
         var4[var5] = var2[var5] - var1[var5];
         if (Math.abs(var4[var5]) > Math.abs(var4[var6])) {
            var6 = var5;
         }
      }

      if (var4[var6] != 0) {
         byte var7 = E[var6];
         byte var8 = E[var6 + 3];
         byte var9;
         if (var4[var6] > 0) {
            var9 = 1;
         } else {
            var9 = -1;
         }

         double var10 = (double)var4[var7] / (double)var4[var6];
         double var12 = (double)var4[var8] / (double)var4[var6];
         int[] var14 = new int[]{0, 0, 0};
         int var15 = 0;

         for(int var16 = var4[var6] + var9; var15 != var16; var15 += var9) {
            var14[var6] = ajs.a((double)(var1[var6] + var15) + 0.5D);
            var14[var7] = ajs.a((double)var1[var7] + (double)var15 * var10 + 0.5D);
            var14[var8] = ajs.a((double)var1[var8] + (double)var15 * var12 + 0.5D);
            byte var17 = 0;
            int var18 = Math.abs(var14[0] - var1[0]);
            int var19 = Math.abs(var14[2] - var1[2]);
            int var20 = Math.max(var18, var19);
            if (var20 > 0) {
               if (var18 == var20) {
                  var17 = 4;
               } else if (var19 == var20) {
                  var17 = 8;
               }
            }

            this.a(this.C, var14[0], var14[1], var14[2], var3, var17);
         }

      }
   }

   void a() {
      int var1 = 0;

      for(int var2 = this.q.length; var1 < var2; ++var1) {
         int var3 = this.q[var1][0];
         int var4 = this.q[var1][1];
         int var5 = this.q[var1][2];
         this.a(var3, var4, var5);
      }

   }

   boolean if(int var1) {
      return !((double)var1 < (double)this.A * 0.2D);
   }

   void int() {
      int var1 = this.B[0];
      int var2 = this.B[1];
      int var3 = this.B[1] + this.z;
      int var4 = this.B[2];
      int[] var5 = new int[]{var1, var2, var4};
      int[] var6 = new int[]{var1, var3, var4};
      this.a(var5, var6, pa.aM.void);
      if (this.t == 2) {
         int var10002 = var5[0]++;
         var10002 = var6[0]++;
         this.a(var5, var6, pa.aM.void);
         var10002 = var5[2]++;
         var10002 = var6[2]++;
         this.a(var5, var6, pa.aM.void);
         var5[0] += -1;
         var6[0] += -1;
         this.a(var5, var6, pa.aM.void);
      }

   }

   void for() {
      int var1 = 0;
      int var2 = this.q.length;

      for(int[] var3 = new int[]{this.B[0], this.B[1], this.B[2]}; var1 < var2; ++var1) {
         int[] var4 = this.q[var1];
         int[] var5 = new int[]{var4[0], var4[1], var4[2]};
         var3[1] = var4[3];
         int var6 = var3[1] - this.B[1];
         if (this.if(var6)) {
            this.a(var3, var5, (byte)pa.aM.void);
         }
      }

   }

   int a(int[] var1, int[] var2) {
      int[] var3 = new int[]{0, 0, 0};
      byte var4 = 0;

      byte var5;
      for(var5 = 0; var4 < 3; ++var4) {
         var3[var4] = var2[var4] - var1[var4];
         if (Math.abs(var3[var4]) > Math.abs(var3[var5])) {
            var5 = var4;
         }
      }

      if (var3[var5] == 0) {
         return -1;
      } else {
         byte var6 = E[var5];
         byte var7 = E[var5 + 3];
         byte var8;
         if (var3[var5] > 0) {
            var8 = 1;
         } else {
            var8 = -1;
         }

         double var9 = (double)var3[var6] / (double)var3[var5];
         double var11 = (double)var3[var7] / (double)var3[var5];
         int[] var13 = new int[]{0, 0, 0};
         int var14 = 0;

         int var15;
         for(var15 = var3[var5] + var8; var14 != var15; var14 += var8) {
            var13[var5] = var1[var5] + var14;
            var13[var6] = ajs.a((double)var1[var6] + (double)var14 * var9);
            var13[var7] = ajs.a((double)var1[var7] + (double)var14 * var11);
            int var16 = this.C.new(var13[0], var13[1], var13[2]);
            if (var16 != 0 && var16 != pa.aJ.void) {
               break;
            }
         }

         return var14 == var15 ? -1 : Math.abs(var14);
      }
   }

   boolean if() {
      int[] var1 = new int[]{this.B[0], this.B[1], this.B[2]};
      int[] var2 = new int[]{this.B[0], this.B[1] + this.A - 1, this.B[2]};
      int var3 = this.C.new(this.B[0], this.B[1] - 1, this.B[2]);
      if (var3 != 2 && var3 != 3) {
         return false;
      } else {
         int var4 = this.a(var1, var2);
         if (var4 == -1) {
            return true;
         } else if (var4 < 6) {
            return false;
         } else {
            this.A = var4;
            return true;
         }
      }
   }

   public void a(double var1, double var3, double var5) {
      this.s = (int)(var1 * 12.0D);
      if (var1 > 0.5D) {
         this.r = 5;
      }

      this.v = var3;
      this.u = var5;
   }

   public boolean a(y6 var1, Random var2, int var3, int var4, int var5) {
      this.C = var1;
      long var6 = var2.nextLong();
      this.D.setSeed(var6);
      this.B[0] = var3;
      this.B[1] = var4;
      this.B[2] = var5;
      if (this.A == 0) {
         this.A = 5 + this.D.nextInt(this.s);
      }

      if (!this.if()) {
         return false;
      } else {
         this.do();
         this.a();
         this.int();
         this.for();
         return true;
      }
   }
}
