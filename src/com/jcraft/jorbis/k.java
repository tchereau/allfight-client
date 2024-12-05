package com.jcraft.jorbis;

public class k {
   static final float f = 3.1415927F;
   static final int h = 1;
   static final int void = 1;
   int e;
   com.jcraft.jorbis.f p;
   int if;
   float[][] int;
   int g;
   int r;
   int a;
   float[] do;
   int q;
   int k;
   int l;
   int o;
   int for;
   int long;
   int byte;
   long d;
   long try;
   long c;
   long m;
   long j;
   long n;
   float[][][][][] new;
   Object[][] char;
   com.jcraft.jorbis.e[] b;
   Object[] goto;
   byte[] i;
   byte[] else;
   byte[] case;

   public k() {
      this.char = new Object[2][];
      this.new = new float[2][][][][];
      this.new[0] = new float[2][][][];
      this.new[0][0] = new float[2][][];
      this.new[0][1] = new float[2][][];
      this.new[0][0][0] = new float[2][];
      this.new[0][0][1] = new float[2][];
      this.new[0][1][0] = new float[2][];
      this.new[0][1][1] = new float[2][];
      this.new[1] = new float[2][][][];
      this.new[1][0] = new float[2][][];
      this.new[1][1] = new float[2][][];
      this.new[1][0][0] = new float[2][];
      this.new[1][0][1] = new float[2][];
      this.new[1][1][0] = new float[2][];
      this.new[1][1][1] = new float[2][];
   }

   static float[] a(int var0, int var1, int var2, int var3) {
      float[] var4 = new float[var1];
      switch(var0) {
      case 0:
         int var5 = var1 / 4 - var2 / 2;
         int var6 = var1 - var1 / 4 - var3 / 2;

         int var7;
         float var8;
         for(var7 = 0; var7 < var2; ++var7) {
            var8 = (float)(((double)var7 + 0.5D) / (double)var2 * 3.1415927410125732D / 2.0D);
            var8 = (float)Math.sin((double)var8);
            var8 *= var8;
            var8 = (float)((double)var8 * 1.5707963705062866D);
            var8 = (float)Math.sin((double)var8);
            var4[var7 + var5] = var8;
         }

         for(var7 = var5 + var2; var7 < var6; ++var7) {
            var4[var7] = 1.0F;
         }

         for(var7 = 0; var7 < var3; ++var7) {
            var8 = (float)(((double)(var3 - var7) - 0.5D) / (double)var3 * 3.1415927410125732D / 2.0D);
            var8 = (float)Math.sin((double)var8);
            var8 *= var8;
            var8 = (float)((double)var8 * 1.5707963705062866D);
            var8 = (float)Math.sin((double)var8);
            var4[var7 + var6] = var8;
         }

         return var4;
      default:
         return null;
      }
   }

   int a(com.jcraft.jorbis.f var1, boolean var2) {
      this.p = var1;
      this.if = com.jcraft.jorbis.m.a(var1.v);
      this.char[0] = new Object[1];
      this.char[1] = new Object[1];
      this.char[0][0] = new com.jcraft.jorbis.a();
      this.char[1][0] = new com.jcraft.jorbis.a();
      ((com.jcraft.jorbis.a)this.char[0][0]).a(var1.q[0]);
      ((com.jcraft.jorbis.a)this.char[1][0]).a(var1.q[1]);
      this.new[0][0][0] = new float[1][];
      this.new[0][0][1] = this.new[0][0][0];
      this.new[0][1][0] = this.new[0][0][0];
      this.new[0][1][1] = this.new[0][0][0];
      this.new[1][0][0] = new float[1][];
      this.new[1][0][1] = new float[1][];
      this.new[1][1][0] = new float[1][];
      this.new[1][1][1] = new float[1][];

      int var3;
      for(var3 = 0; var3 < 1; ++var3) {
         this.new[0][0][0][var3] = a(var3, var1.q[0], var1.q[0] / 2, var1.q[0] / 2);
         this.new[1][0][0][var3] = a(var3, var1.q[1], var1.q[0] / 2, var1.q[0] / 2);
         this.new[1][0][1][var3] = a(var3, var1.q[1], var1.q[0] / 2, var1.q[1] / 2);
         this.new[1][1][0][var3] = a(var3, var1.q[1], var1.q[1] / 2, var1.q[0] / 2);
         this.new[1][1][1][var3] = a(var3, var1.q[1], var1.q[1] / 2, var1.q[1] / 2);
      }

      this.b = new com.jcraft.jorbis.e[var1.j];

      for(var3 = 0; var3 < var1.j; ++var3) {
         this.b[var3] = new com.jcraft.jorbis.e();
         this.b[var3].a(var1.m[var3]);
      }

      this.g = 8192;
      this.int = new float[var1.u][];

      for(var3 = 0; var3 < var1.u; ++var3) {
         this.int[var3] = new float[this.g];
      }

      this.o = 0;
      this.for = 0;
      this.byte = var1.q[1] / 2;
      this.r = this.byte;
      this.goto = new Object[var1.v];

      for(var3 = 0; var3 < var1.v; ++var3) {
         int var4 = var1.int[var3].a;
         int var5 = var1.d[var4];
         this.goto[var3] = com.jcraft.jorbis.v.a[var5].a(this, var1.int[var3], var1.void[var4]);
      }

      return 0;
   }

   public int a(com.jcraft.jorbis.f var1) {
      this.a(var1, false);
      this.a = this.byte;
      this.byte -= var1.q[this.for] / 4 + var1.q[this.o] / 4;
      this.d = -1L;
      this.try = -1L;
      return 0;
   }

   k(com.jcraft.jorbis.f var1) {
      this();
      this.a(var1, false);
      this.a = this.byte;
      this.byte -= var1.q[this.for] / 4 + var1.q[this.o] / 4;
      this.d = -1L;
      this.try = -1L;
   }

   public int a(com.jcraft.jorbis.z var1) {
      int var2;
      int var3;
      if (this.byte > this.p.q[1] / 2 && this.a > 8192) {
         var2 = this.byte - this.p.q[1] / 2;
         var2 = this.a < var2 ? this.a : var2;
         this.r -= var2;
         this.byte -= var2;
         this.a -= var2;
         if (var2 != 0) {
            for(var3 = 0; var3 < this.p.u; ++var3) {
               System.arraycopy(this.int[var3], var2, this.int[var3], 0, this.r);
            }
         }
      }

      this.o = this.for;
      this.for = var1.int;
      this.long = -1;
      this.c += (long)var1.for;
      this.m += (long)var1.do;
      this.j += (long)var1.byte;
      this.n += (long)var1.a;
      if (this.try + 1L != var1.new) {
         this.d = -1L;
      }

      this.try = var1.new;
      var2 = this.p.q[this.for];
      var3 = this.byte + this.p.q[this.o] / 4 + var2 / 4;
      int var4 = var3 - var2 / 2;
      int var5 = var4 + var2;
      int var6 = 0;
      int var7 = 0;
      int var8;
      if (var5 > this.g) {
         this.g = var5 + this.p.q[1];

         for(var8 = 0; var8 < this.p.u; ++var8) {
            float[] var9 = new float[this.g];
            System.arraycopy(this.int[var8], 0, var9, 0, this.int[var8].length);
            this.int[var8] = var9;
         }
      }

      switch(this.for) {
      case 0:
         var6 = 0;
         var7 = this.p.q[0] / 2;
         break;
      case 1:
         var6 = this.p.q[1] / 4 - this.p.q[this.o] / 4;
         var7 = var6 + this.p.q[this.o] / 2;
      }

      for(var8 = 0; var8 < this.p.u; ++var8) {
         int var11 = var4;
         boolean var10 = false;

         int var12;
         for(var12 = var6; var12 < var7; ++var12) {
            float[] var10000 = this.int[var8];
            var10000[var11 + var12] += var1.if[var8][var12];
         }

         while(var12 < var2) {
            this.int[var8][var11 + var12] = var1.if[var8][var12];
            ++var12;
         }
      }

      if (this.d == -1L) {
         this.d = var1.long;
      } else {
         this.d += (long)(var3 - this.byte);
         if (var1.long != -1L && this.d != var1.long) {
            if (this.d > var1.long && var1.goto != 0) {
               var3 = (int)((long)var3 - (this.d - var1.long));
            }

            this.d = var1.long;
         }
      }

      this.byte = var3;
      this.r = var5;
      if (var1.goto != 0) {
         this.l = 1;
      }

      return 0;
   }

   public int a(float[][][] var1, int[] var2) {
      if (this.a >= this.byte) {
         return 0;
      } else {
         if (var1 != null) {
            for(int var3 = 0; var3 < this.p.u; ++var3) {
               var2[var3] = this.a;
            }

            var1[0] = this.int;
         }

         return this.byte - this.a;
      }
   }

   public int a(int var1) {
      if (var1 != 0 && this.a + var1 > this.byte) {
         return -1;
      } else {
         this.a += var1;
         return 0;
      }
   }

   public void a() {
   }
}
