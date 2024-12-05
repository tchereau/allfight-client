package com.jcraft.jorbis;

import java.io.IOException;
import java.io.InputStream;

public class x {
   static final int n = 8500;
   static final int q = 0;
   static final int long = 1;
   static final int k = 2;
   static final int else = -1;
   static final int r = -2;
   static final int d = -3;
   static final int case = -128;
   static final int new = -129;
   static final int o = -130;
   static final int char = -131;
   static final int int = -132;
   static final int l = -133;
   static final int m = -134;
   static final int h = -135;
   static final int t = -136;
   static final int u = -137;
   static final int if = -138;
   InputStream v;
   boolean try = false;
   long s;
   long goto;
   com.jcraft.a.a i = new com.jcraft.a.a();
   int p;
   long[] g;
   long[] byte;
   int[] z;
   long[] x;
   com.jcraft.jorbis.f[] b;
   com.jcraft.jorbis.y[] e;
   long y;
   boolean do = false;
   int void;
   int w;
   float for;
   float a;
   com.jcraft.a.c j = new com.jcraft.a.c();
   com.jcraft.jorbis.k c = new com.jcraft.jorbis.k();
   com.jcraft.jorbis.z f;

   public x(String var1) {
      this.f = new com.jcraft.jorbis.z(this.c);
      x$a var2 = null;

      try {
         var2 = new x$a(this, var1);
         int var3 = this.a((InputStream)var2, (byte[])null, 0);
         if (var3 == -1) {
            throw new com.jcraft.jorbis.q("VorbisFile: open return -1");
         }
      } catch (Exception var11) {
         throw new com.jcraft.jorbis.q("VorbisFile: " + var11.toString());
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (IOException var10) {
               var10.printStackTrace();
            }
         }

      }

   }

   public x(InputStream var1, byte[] var2, int var3) {
      this.f = new com.jcraft.jorbis.z(this.c);
      int var4 = this.a(var1, var2, var3);
      if (var4 == -1) {
      }

   }

   private int new() {
      int var1 = this.i.a(8500);
      byte[] var2 = this.i.do;
      boolean var3 = false;

      int var6;
      try {
         var6 = this.v.read(var2, var1, 8500);
      } catch (Exception var5) {
         return -128;
      }

      this.i.if(var6);
      if (var6 == -1) {
         var6 = 0;
      }

      return var6;
   }

   private void if(long var1) {
      a(this.v, var1, 0);
      this.s = var1;
      this.i.a();
   }

   private int a(com.jcraft.a.b var1, long var2) {
      if (var2 > 0L) {
         var2 += this.s;
      }

      while(var2 <= 0L || this.s < var2) {
         int var4 = this.i.a(var1);
         if (var4 < 0) {
            this.s -= (long)var4;
         } else {
            int var5;
            if (var4 != 0) {
               var5 = (int)this.s;
               this.s += (long)var4;
               return var5;
            }

            if (var2 == 0L) {
               return -1;
            }

            var5 = this.new();
            if (var5 == 0) {
               return -2;
            }

            if (var5 < 0) {
               return -128;
            }
         }
      }

      return -1;
   }

   private int a(com.jcraft.a.b var1) {
      long var2 = this.s;
      int var5 = -1;

      label37:
      do {
         int var4;
         while(var5 == -1) {
            var2 -= 8500L;
            if (var2 < 0L) {
               var2 = 0L;
            }

            this.if(var2);

            while(this.s < var2 + 8500L) {
               var4 = this.a(var1, var2 + 8500L - this.s);
               if (var4 == -128) {
                  return -128;
               }

               if (var4 < 0) {
                  continue label37;
               }

               var5 = var4;
            }
         }

         this.if((long)var5);
         var4 = this.a(var1, 8500L);
         if (var4 < 0) {
            return -129;
         }

         return var5;
      } while(var5 != -1);

      throw new com.jcraft.jorbis.q();
   }

   int a(long var1, long var3, long var5, int var7, int var8) {
      long var9 = var5;
      long var11 = var5;
      com.jcraft.a.b var13 = new com.jcraft.a.b();

      int var14;
      while(var3 < var9) {
         long var15;
         if (var9 - var3 < 8500L) {
            var15 = var3;
         } else {
            var15 = (var3 + var9) / 2L;
         }

         this.if(var15);
         var14 = this.a(var13, -1L);
         if (var14 == -128) {
            return -128;
         }

         if (var14 >= 0 && var13.for() == var7) {
            var3 = (long)(var14 + var13.if + var13.for);
         } else {
            var9 = var15;
            if (var14 >= 0) {
               var11 = (long)var14;
            }
         }
      }

      this.if(var11);
      var14 = this.a(var13, -1L);
      if (var14 == -128) {
         return -128;
      } else {
         if (var3 < var5 && var14 != -1) {
            var14 = this.a(var11, this.s, var5, var13.for(), var8 + 1);
            if (var14 == -128) {
               return -128;
            }
         } else {
            this.p = var8 + 1;
            this.g = new long[var8 + 2];
            this.g[var8 + 1] = var3;
         }

         this.g[var8] = var1;
         return 0;
      }
   }

   int a(com.jcraft.jorbis.f var1, com.jcraft.jorbis.y var2, int[] var3, com.jcraft.a.b var4) {
      com.jcraft.a.b var5 = new com.jcraft.a.b();
      com.jcraft.a.d var6 = new com.jcraft.a.d();
      if (var4 == null) {
         int var7 = this.a(var5, 8500L);
         if (var7 == -128) {
            return -128;
         }

         if (var7 < 0) {
            return -132;
         }

         var4 = var5;
      }

      if (var3 != null) {
         var3[0] = var4.for();
      }

      this.j.do(var4.for());
      var1.if();
      var2.do();
      int var8 = 0;

      do {
         if (var8 >= 3) {
            return 0;
         }

         this.j.do(var4);

         while(var8 < 3) {
            int var9 = this.j.if(var6);
            if (var9 == 0) {
               break;
            }

            if (var9 == -1) {
               var1.a();
               var2.a();
               this.j.a();
               return -1;
            }

            if (var1.a(var2, var6) != 0) {
               var1.a();
               var2.a();
               this.j.a();
               return -1;
            }

            ++var8;
         }
      } while(var8 >= 3 || this.a(var4, 1L) >= 0);

      var1.a();
      var2.a();
      this.j.a();
      return -1;
   }

   void a(com.jcraft.jorbis.f var1, com.jcraft.jorbis.y var2, int var3) {
      com.jcraft.a.b var4 = new com.jcraft.a.b();
      this.b = new com.jcraft.jorbis.f[this.p];
      this.e = new com.jcraft.jorbis.y[this.p];
      this.byte = new long[this.p];
      this.x = new long[this.p];
      this.z = new int[this.p];

      label38:
      for(int var6 = 0; var6 < this.p; ++var6) {
         if (var1 != null && var2 != null && var6 == 0) {
            this.b[var6] = var1;
            this.e[var6] = var2;
            this.byte[var6] = (long)var3;
         } else {
            this.if(this.g[var6]);
            this.b[var6] = new com.jcraft.jorbis.f();
            this.e[var6] = new com.jcraft.jorbis.y();
            if (this.a(this.b[var6], this.e[var6], (int[])null, (com.jcraft.a.b)null) == -1) {
               this.byte[var6] = -1L;
            } else {
               this.byte[var6] = this.s;
               this.j.a();
            }
         }

         long var7 = this.g[var6 + 1];
         this.if(var7);

         do {
            int var5 = this.a(var4);
            if (var5 == -1) {
               this.b[var6].a();
               this.e[var6].a();
               continue label38;
            }
         } while(var4.int() == -1L);

         this.z[var6] = var4.for();
         this.x[var6] = var4.int();
      }

   }

   private int byte() {
      if (this.do) {
         System.exit(1);
      }

      this.c.a(this.b[0]);
      this.f.a(this.c);
      this.do = true;
      return 0;
   }

   int goto() {
      com.jcraft.jorbis.f var1 = new com.jcraft.jorbis.f();
      com.jcraft.jorbis.y var2 = new com.jcraft.jorbis.y();
      com.jcraft.a.b var8 = new com.jcraft.a.b();
      int[] var9 = new int[1];
      int var6 = this.a(var1, var2, var9, (com.jcraft.a.b)null);
      int var3 = var9[0];
      int var7 = (int)this.s;
      this.j.a();
      if (var6 == -1) {
         return -1;
      } else if (var6 < 0) {
         return var6;
      } else {
         this.try = true;
         a(this.v, 0L, 2);
         this.s = a(this.v);
         long var4 = this.s;
         var4 = (long)this.a(var8);
         if (var8.for() != var3) {
            if (this.a(0L, 0L, var4 + 1L, var3, 0) < 0) {
               this.char();
               return -128;
            }
         } else if (this.a(0L, var4, var4 + 1L, var3, 0) < 0) {
            this.char();
            return -128;
         }

         this.a(var1, var2, var7);
         return 0;
      }
   }

   int do() {
      this.p = 1;
      this.b = new com.jcraft.jorbis.f[this.p];
      this.b[0] = new com.jcraft.jorbis.f();
      this.e = new com.jcraft.jorbis.y[this.p];
      this.e[0] = new com.jcraft.jorbis.y();
      int[] var1 = new int[1];
      if (this.a(this.b[0], this.e[0], var1, (com.jcraft.a.b)null) == -1) {
         return -1;
      } else {
         this.void = var1[0];
         this.byte();
         return 0;
      }
   }

   void else() {
      this.j.a();
      this.c.a();
      this.f.a();
      this.do = false;
      this.for = 0.0F;
      this.a = 0.0F;
   }

   int for(int var1) {
      com.jcraft.a.b var2 = new com.jcraft.a.b();

      while(true) {
         if (this.do) {
            com.jcraft.a.d var3 = new com.jcraft.a.d();
            int var4 = this.j.if(var3);
            if (var4 > 0) {
               long var5 = var3.if;
               if (this.f.a(var3) == 0) {
                  int var7 = this.c.a((float[][][])null, (int[])null);
                  this.c.a(this.f);
                  this.a += (float)(this.c.a((float[][][])null, (int[])null) - var7);
                  this.for += (float)(var3.a * 8);
                  if (var5 != -1L && var3.for == 0) {
                     var7 = this.try ? this.w : 0;
                     int var8 = this.c.a((float[][][])null, (int[])null);
                     var5 -= (long)var8;

                     for(int var9 = 0; var9 < var7; ++var9) {
                        var5 += this.x[var9];
                     }

                     this.y = var5;
                  }

                  return 1;
               }
            }
         }

         if (var1 == 0) {
            return 0;
         }

         if (this.a(var2, -1L) < 0) {
            return 0;
         }

         this.for += (float)(var2.if * 8);
         if (this.do && this.void != var2.for()) {
            this.else();
         }

         if (!this.do) {
            if (!this.try) {
               int[] var12 = new int[1];
               int var13 = this.a(this.b[0], this.e[0], var12, var2);
               this.void = var12[0];
               if (var13 != 0) {
                  return var13;
               }

               ++this.w;
               boolean var11 = false;
            } else {
               this.void = var2.for();

               int var10;
               for(var10 = 0; var10 < this.p && this.z[var10] != this.void; ++var10) {
               }

               if (var10 == this.p) {
                  return -1;
               }

               this.w = var10;
               this.j.do(this.void);
               this.j.do();
            }

            this.byte();
         }

         this.j.do(var2);
      }
   }

   int char() {
      this.f.a();
      this.c.a();
      this.j.a();
      if (this.b != null && this.p != 0) {
         for(int var1 = 0; var1 < this.p; ++var1) {
            this.b[var1].a();
            this.e[var1].a();
         }

         this.b = null;
         this.e = null;
      }

      if (this.byte != null) {
         this.byte = null;
      }

      if (this.x != null) {
         this.x = null;
      }

      if (this.z != null) {
         this.z = null;
      }

      if (this.g != null) {
         this.g = null;
      }

      this.i.int();
      return 0;
   }

   static int a(InputStream var0, long var1, int var3) {
      if (var0 instanceof x$a) {
         x$a var4 = (x$a)var0;

         try {
            if (var3 == 0) {
               var4.a(var1);
            } else if (var3 == 2) {
               var4.a(var4.a() - var1);
            }
         } catch (Exception var6) {
         }

         return 0;
      } else {
         try {
            if (var3 == 0) {
               var0.reset();
            }

            var0.skip(var1);
            return 0;
         } catch (Exception var7) {
            return -1;
         }
      }
   }

   static long a(InputStream var0) {
      try {
         if (var0 instanceof x$a) {
            x$a var1 = (x$a)var0;
            return var1.if();
         }
      } catch (Exception var2) {
      }

      return 0L;
   }

   int a(InputStream var1, byte[] var2, int var3) {
      return this.if(var1, var2, var3);
   }

   int if(InputStream var1, byte[] var2, int var3) {
      this.v = var1;
      this.i.for();
      if (var2 != null) {
         int var5 = this.i.a(var3);
         System.arraycopy(var2, 0, this.i.do, var5, var3);
         this.i.if(var3);
      }

      int var4;
      if (var1 instanceof x$a) {
         var4 = this.goto();
      } else {
         var4 = this.do();
      }

      if (var4 != 0) {
         this.v = null;
         this.char();
      }

      return var4;
   }

   public int a() {
      return this.p;
   }

   public boolean if() {
      return this.try;
   }

   public int a(int var1) {
      if (var1 >= this.p) {
         return -1;
      } else if (!this.try && var1 != 0) {
         return this.a(0);
      } else if (var1 >= 0) {
         if (this.try) {
            return (int)Math.rint((double)((float)((this.g[var1 + 1] - this.byte[var1]) * 8L) / this.if(var1)));
         } else if (this.b[var1].goto > 0) {
            return this.b[var1].goto;
         } else if (this.b[var1].if > 0) {
            return this.b[var1].try > 0 ? (this.b[var1].if + this.b[var1].try) / 2 : this.b[var1].if;
         } else {
            return -1;
         }
      } else {
         long var2 = 0L;

         for(int var4 = 0; var4 < this.p; ++var4) {
            var2 += (this.g[var4 + 1] - this.byte[var4]) * 8L;
         }

         return (int)Math.rint((double)((float)var2 / this.if(-1)));
      }
   }

   public int case() {
      int var1 = this.try ? this.w : 0;
      if (this.a == 0.0F) {
         return -1;
      } else {
         int var2 = (int)((double)(this.for / this.a * (float)this.b[var1].f) + 0.5D);
         this.for = 0.0F;
         this.a = 0.0F;
         return var2;
      }
   }

   public int int(int var1) {
      if (var1 >= this.p) {
         return -1;
      } else if (!this.try && var1 >= 0) {
         return this.int(-1);
      } else {
         return var1 < 0 ? this.void : this.z[var1];
      }
   }

   public long do(int var1) {
      if (this.try && var1 < this.p) {
         if (var1 >= 0) {
            return this.g[var1 + 1] - this.g[var1];
         } else {
            long var2 = 0L;

            for(int var4 = 0; var4 < this.p; ++var4) {
               var2 += this.do(var4);
            }

            return var2;
         }
      } else {
         return -1L;
      }
   }

   public long byte(int var1) {
      if (this.try && var1 < this.p) {
         if (var1 >= 0) {
            return this.x[var1];
         } else {
            long var2 = 0L;

            for(int var4 = 0; var4 < this.p; ++var4) {
               var2 += this.byte(var4);
            }

            return var2;
         }
      } else {
         return -1L;
      }
   }

   public float if(int var1) {
      if (this.try && var1 < this.p) {
         if (var1 >= 0) {
            return (float)this.x[var1] / (float)this.b[var1].f;
         } else {
            float var2 = 0.0F;

            for(int var3 = 0; var3 < this.p; ++var3) {
               var2 += this.if(var3);
            }

            return var2;
         }
      } else {
         return -1.0F;
      }
   }

   public int try(int var1) {
      if (!this.try) {
         return -1;
      } else if (var1 >= 0 && (long)var1 <= this.g[this.p]) {
         this.y = -1L;
         this.else();
         this.if((long)var1);
         switch(this.for(1)) {
         case -1:
            this.y = -1L;
            this.else();
            return -1;
         case 0:
            this.y = this.byte(-1);
            return 0;
         default:
            while(true) {
               switch(this.for(0)) {
               case -1:
                  this.y = -1L;
                  this.else();
                  return -1;
               case 0:
                  return 0;
               }
            }
         }
      } else {
         this.y = -1L;
         this.else();
         return -1;
      }
   }

   public int a(long var1) {
      boolean var3 = true;
      long var4 = this.byte(-1);
      if (!this.try) {
         return -1;
      } else if (var1 >= 0L && var1 <= var4) {
         int var19;
         for(var19 = this.p - 1; var19 >= 0; --var19) {
            var4 -= this.x[var19];
            if (var1 >= var4) {
               break;
            }
         }

         long var6 = var1 - var4;
         long var8 = this.g[var19 + 1];
         long var10 = this.g[var19];
         int var12 = (int)var10;
         com.jcraft.a.b var13 = new com.jcraft.a.b();

         while(var10 < var8) {
            long var14;
            if (var8 - var10 < 8500L) {
               var14 = var10;
            } else {
               var14 = (var8 + var10) / 2L;
            }

            this.if(var14);
            int var16 = this.a(var13, var8 - var14);
            if (var16 == -1) {
               var8 = var14;
            } else {
               long var17 = var13.int();
               if (var17 < var6) {
                  var12 = var16;
                  var10 = this.s;
               } else {
                  var8 = var14;
               }
            }
         }

         if (this.try(var12) != 0) {
            this.y = -1L;
            this.else();
            return -1;
         } else if (this.y >= var1) {
            this.y = -1L;
            this.else();
            return -1;
         } else if (var1 > this.byte(-1)) {
            this.y = -1L;
            this.else();
            return -1;
         } else {
            while(this.y < var1) {
               int var20 = (int)(var1 - this.y);
               float[][][] var7 = new float[1][][];
               int[] var21 = new int[this.case(-1).u];
               int var9 = this.c.a(var7, var21);
               if (var9 > var20) {
                  var9 = var20;
               }

               this.c.a(var9);
               this.y += (long)var9;
               if (var9 < var20 && this.for(1) == 0) {
                  this.y = this.byte(-1);
               }
            }

            return 0;
         }
      } else {
         this.y = -1L;
         this.else();
         return -1;
      }
   }

   int a(float var1) {
      boolean var2 = true;
      long var3 = this.byte(-1);
      float var5 = this.if(-1);
      if (!this.try) {
         return -1;
      } else if (!(var1 < 0.0F) && !(var1 > var5)) {
         int var8;
         for(var8 = this.p - 1; var8 >= 0; --var8) {
            var3 -= this.x[var8];
            var5 -= this.if(var8);
            if (var1 >= var5) {
               break;
            }
         }

         long var6 = (long)((float)var3 + (var1 - var5) * (float)this.b[var8].f);
         return this.a(var6);
      } else {
         this.y = -1L;
         this.else();
         return -1;
      }
   }

   public long try() {
      return this.s;
   }

   public long long() {
      return this.y;
   }

   public float c() {
      int var1 = -1;
      long var2 = 0L;
      float var4 = 0.0F;
      if (this.try) {
         var2 = this.byte(-1);
         var4 = this.if(-1);

         for(var1 = this.p - 1; var1 >= 0; --var1) {
            var2 -= this.x[var1];
            var4 -= this.if(var1);
            if (this.y >= var2) {
               break;
            }
         }
      }

      return var4 + (float)(this.y - var2) / (float)this.b[var1].f;
   }

   public com.jcraft.jorbis.f case(int var1) {
      if (this.try) {
         if (var1 < 0) {
            return this.do ? this.b[this.w] : null;
         } else {
            return var1 >= this.p ? null : this.b[var1];
         }
      } else {
         return this.do ? this.b[0] : null;
      }
   }

   public com.jcraft.jorbis.y new(int var1) {
      if (this.try) {
         if (var1 < 0) {
            return this.do ? this.e[this.w] : null;
         } else {
            return var1 >= this.p ? null : this.e[var1];
         }
      } else {
         return this.do ? this.e[0] : null;
      }
   }

   int for() {
      return 1;
   }

   int a(byte[] var1, int var2, int var3, int var4, int var5, int[] var6) {
      int var7 = this.for();
      int var8 = 0;

      while(true) {
         if (this.do) {
            float[][][] var10 = new float[1][][];
            int[] var11 = new int[this.case(-1).u];
            int var12 = this.c.a(var10, var11);
            float[][] var9 = var10[0];
            if (var12 != 0) {
               int var13 = this.case(-1).u;
               int var14 = var4 * var13;
               if (var12 > var2 / var14) {
                  var12 = var2 / var14;
               }

               int var15;
               int var16;
               int var17;
               int var18;
               if (var4 == 1) {
                  var16 = var5 != 0 ? 0 : 128;

                  for(var17 = 0; var17 < var12; ++var17) {
                     for(var18 = 0; var18 < var13; ++var18) {
                        var15 = (int)((double)var9[var18][var11[var18] + var17] * 128.0D + 0.5D);
                        if (var15 > 127) {
                           var15 = 127;
                        } else if (var15 < -128) {
                           var15 = -128;
                        }

                        var1[var8++] = (byte)(var15 + var16);
                     }
                  }
               } else {
                  var16 = var5 != 0 ? 0 : '耀';
                  if (var7 == var3) {
                     int var19;
                     int var20;
                     if (var5 != 0) {
                        for(var17 = 0; var17 < var13; ++var17) {
                           var18 = var11[var17];
                           var19 = var17;

                           for(var20 = 0; var20 < var12; ++var20) {
                              var15 = (int)((double)var9[var17][var18 + var20] * 32768.0D + 0.5D);
                              if (var15 > 32767) {
                                 var15 = 32767;
                              } else if (var15 < -32768) {
                                 var15 = -32768;
                              }

                              var1[var19] = (byte)(var15 >>> 8);
                              var1[var19 + 1] = (byte)var15;
                              var19 += var13 * 2;
                           }
                        }
                     } else {
                        for(var17 = 0; var17 < var13; ++var17) {
                           float[] var21 = var9[var17];
                           var19 = var17;

                           for(var20 = 0; var20 < var12; ++var20) {
                              var15 = (int)((double)var21[var20] * 32768.0D + 0.5D);
                              if (var15 > 32767) {
                                 var15 = 32767;
                              } else if (var15 < -32768) {
                                 var15 = -32768;
                              }

                              var1[var19] = (byte)(var15 + var16 >>> 8);
                              var1[var19 + 1] = (byte)(var15 + var16);
                              var19 += var13 * 2;
                           }
                        }
                     }
                  } else if (var3 != 0) {
                     for(var17 = 0; var17 < var12; ++var17) {
                        for(var18 = 0; var18 < var13; ++var18) {
                           var15 = (int)((double)var9[var18][var17] * 32768.0D + 0.5D);
                           if (var15 > 32767) {
                              var15 = 32767;
                           } else if (var15 < -32768) {
                              var15 = -32768;
                           }

                           var15 += var16;
                           var1[var8++] = (byte)(var15 >>> 8);
                           var1[var8++] = (byte)var15;
                        }
                     }
                  } else {
                     for(var17 = 0; var17 < var12; ++var17) {
                        for(var18 = 0; var18 < var13; ++var18) {
                           var15 = (int)((double)var9[var18][var17] * 32768.0D + 0.5D);
                           if (var15 > 32767) {
                              var15 = 32767;
                           } else if (var15 < -32768) {
                              var15 = -32768;
                           }

                           var15 += var16;
                           var1[var8++] = (byte)var15;
                           var1[var8++] = (byte)(var15 >>> 8);
                        }
                     }
                  }
               }

               this.c.a(var12);
               this.y += (long)var12;
               if (var6 != null) {
                  var6[0] = this.w;
               }

               return var12 * var14;
            }
         }

         switch(this.for(1)) {
         case -1:
            return -1;
         case 0:
            return 0;
         }
      }
   }

   public com.jcraft.jorbis.f[] void() {
      return this.b;
   }

   public com.jcraft.jorbis.y[] b() {
      return this.e;
   }

   public void int() {
      this.v.close();
   }
}
