package com.jcraft.jorbis;

public class f {
   private static final int n = -136;
   private static final int long = -135;
   private static byte[] g = "vorbis".getBytes();
   private static final int p = 1;
   private static final int i = 2;
   private static final int k = 3;
   private static final int for = 1;
   private static final int e = 1;
   public int s;
   public int u;
   public int f;
   int if;
   int goto;
   int try;
   int[] q = new int[2];
   int v;
   int h;
   int c;
   int byte;
   int do;
   int j;
   int t;
   com.jcraft.jorbis.d[] int = null;
   int[] d = null;
   Object[] void = null;
   int[] a = null;
   Object[] o = null;
   int[] w = null;
   Object[] char = null;
   int[] case = null;
   Object[] b = null;
   com.jcraft.jorbis.l[] m = null;
   com.jcraft.jorbis.j[] new = new com.jcraft.jorbis.j[64];
   int else;
   float l;
   float r;

   public void if() {
      this.f = 0;
   }

   public void a() {
      int var1;
      for(var1 = 0; var1 < this.v; ++var1) {
         this.int[var1] = null;
      }

      this.int = null;

      for(var1 = 0; var1 < this.h; ++var1) {
         com.jcraft.jorbis.v.a[this.d[var1]].if(this.void[var1]);
      }

      this.void = null;

      for(var1 = 0; var1 < this.c; ++var1) {
         com.jcraft.jorbis.b.a[this.a[var1]].if(this.o[var1]);
      }

      this.o = null;

      for(var1 = 0; var1 < this.byte; ++var1) {
         com.jcraft.jorbis.h.a[this.w[var1]].if(this.char[var1]);
      }

      this.char = null;

      for(var1 = 0; var1 < this.do; ++var1) {
         com.jcraft.jorbis.i.a[this.case[var1]].if(this.b[var1]);
      }

      this.b = null;

      for(var1 = 0; var1 < this.j; ++var1) {
         if (this.m[var1] != null) {
            this.m[var1].a();
            this.m[var1] = null;
         }
      }

      this.m = null;

      for(var1 = 0; var1 < this.t; ++var1) {
         this.new[var1].a();
      }

   }

   int a(com.jcraft.a.e var1) {
      this.s = var1.for(32);
      if (this.s != 0) {
         return -1;
      } else {
         this.u = var1.for(8);
         this.f = var1.for(32);
         this.if = var1.for(32);
         this.goto = var1.for(32);
         this.try = var1.for(32);
         this.q[0] = 1 << var1.for(4);
         this.q[1] = 1 << var1.for(4);
         if (this.f >= 1 && this.u >= 1 && this.q[0] >= 8 && this.q[1] >= this.q[0] && var1.for(1) == 1) {
            return 0;
         } else {
            this.a();
            return -1;
         }
      }
   }

   int for(com.jcraft.a.e var1) {
      this.j = var1.for(8) + 1;
      if (this.m == null || this.m.length != this.j) {
         this.m = new com.jcraft.jorbis.l[this.j];
      }

      int var2;
      for(var2 = 0; var2 < this.j; ++var2) {
         this.m[var2] = new com.jcraft.jorbis.l();
         if (this.m[var2].if(var1) != 0) {
            this.a();
            return -1;
         }
      }

      this.c = var1.for(6) + 1;
      if (this.a == null || this.a.length != this.c) {
         this.a = new int[this.c];
      }

      if (this.o == null || this.o.length != this.c) {
         this.o = new Object[this.c];
      }

      for(var2 = 0; var2 < this.c; ++var2) {
         this.a[var2] = var1.for(16);
         if (this.a[var2] < 0 || this.a[var2] >= 1) {
            this.a();
            return -1;
         }

         this.o[var2] = com.jcraft.jorbis.b.a[this.a[var2]].a(this, var1);
         if (this.o[var2] == null) {
            this.a();
            return -1;
         }
      }

      this.byte = var1.for(6) + 1;
      if (this.w == null || this.w.length != this.byte) {
         this.w = new int[this.byte];
      }

      if (this.char == null || this.char.length != this.byte) {
         this.char = new Object[this.byte];
      }

      for(var2 = 0; var2 < this.byte; ++var2) {
         this.w[var2] = var1.for(16);
         if (this.w[var2] < 0 || this.w[var2] >= 2) {
            this.a();
            return -1;
         }

         this.char[var2] = com.jcraft.jorbis.h.a[this.w[var2]].a(this, var1);
         if (this.char[var2] == null) {
            this.a();
            return -1;
         }
      }

      this.do = var1.for(6) + 1;
      if (this.case == null || this.case.length != this.do) {
         this.case = new int[this.do];
      }

      if (this.b == null || this.b.length != this.do) {
         this.b = new Object[this.do];
      }

      for(var2 = 0; var2 < this.do; ++var2) {
         this.case[var2] = var1.for(16);
         if (this.case[var2] < 0 || this.case[var2] >= 3) {
            this.a();
            return -1;
         }

         this.b[var2] = com.jcraft.jorbis.i.a[this.case[var2]].a(this, var1);
         if (this.b[var2] == null) {
            this.a();
            return -1;
         }
      }

      this.h = var1.for(6) + 1;
      if (this.d == null || this.d.length != this.h) {
         this.d = new int[this.h];
      }

      if (this.void == null || this.void.length != this.h) {
         this.void = new Object[this.h];
      }

      for(var2 = 0; var2 < this.h; ++var2) {
         this.d[var2] = var1.for(16);
         if (this.d[var2] < 0 || this.d[var2] >= 1) {
            this.a();
            return -1;
         }

         this.void[var2] = com.jcraft.jorbis.v.a[this.d[var2]].a(this, var1);
         if (this.void[var2] == null) {
            this.a();
            return -1;
         }
      }

      this.v = var1.for(6) + 1;
      if (this.int == null || this.int.length != this.v) {
         this.int = new com.jcraft.jorbis.d[this.v];
      }

      for(var2 = 0; var2 < this.v; ++var2) {
         this.int[var2] = new com.jcraft.jorbis.d();
         this.int[var2].if = var1.for(1);
         this.int[var2].do = var1.for(16);
         this.int[var2].for = var1.for(16);
         this.int[var2].a = var1.for(8);
         if (this.int[var2].do >= 1 || this.int[var2].for >= 1 || this.int[var2].a >= this.h) {
            this.a();
            return -1;
         }
      }

      if (var1.for(1) != 1) {
         this.a();
         return -1;
      } else {
         return 0;
      }
   }

   public int a(com.jcraft.jorbis.y var1, com.jcraft.a.d var2) {
      com.jcraft.a.e var3 = new com.jcraft.a.e();
      if (var2 != null) {
         var3.a(var2.do, var2.new, var2.a);
         byte[] var4 = new byte[6];
         int var5 = var3.for(8);
         var3.a(var4, 6);
         if (var4[0] != 118 || var4[1] != 111 || var4[2] != 114 || var4[3] != 98 || var4[4] != 105 || var4[5] != 115) {
            return -1;
         }

         switch(var5) {
         case 1:
            if (var2.try == 0) {
               return -1;
            }

            if (this.f != 0) {
               return -1;
            }

            return this.a(var3);
         case 2:
         case 4:
         default:
            break;
         case 3:
            if (this.f == 0) {
               return -1;
            }

            return var1.if(var3);
         case 5:
            if (this.f != 0 && var1.try != null) {
               return this.for(var3);
            }

            return -1;
         }
      }

      return -1;
   }

   int do(com.jcraft.a.e var1) {
      var1.a(1, 8);
      var1.a(g);
      var1.a(0, 32);
      var1.a(this.u, 8);
      var1.a(this.f, 32);
      var1.a(this.if, 32);
      var1.a(this.goto, 32);
      var1.a(this.try, 32);
      var1.a(com.jcraft.jorbis.m.a(this.q[0]), 4);
      var1.a(com.jcraft.jorbis.m.a(this.q[1]), 4);
      var1.a(1, 1);
      return 0;
   }

   int if(com.jcraft.a.e var1) {
      var1.a(5, 8);
      var1.a(g);
      var1.a(this.j - 1, 8);

      int var2;
      for(var2 = 0; var2 < this.j; ++var2) {
         if (this.m[var2].a(var1) != 0) {
            return -1;
         }
      }

      var1.a(this.c - 1, 6);

      for(var2 = 0; var2 < this.c; ++var2) {
         var1.a(this.a[var2], 16);
         com.jcraft.jorbis.b.a[this.a[var2]].a(this.o[var2], var1);
      }

      var1.a(this.byte - 1, 6);

      for(var2 = 0; var2 < this.byte; ++var2) {
         var1.a(this.w[var2], 16);
         com.jcraft.jorbis.h.a[this.w[var2]].a(this.char[var2], var1);
      }

      var1.a(this.do - 1, 6);

      for(var2 = 0; var2 < this.do; ++var2) {
         var1.a(this.case[var2], 16);
         com.jcraft.jorbis.i.a[this.case[var2]].a(this.b[var2], var1);
      }

      var1.a(this.h - 1, 6);

      for(var2 = 0; var2 < this.h; ++var2) {
         var1.a(this.d[var2], 16);
         com.jcraft.jorbis.v.a[this.d[var2]].a(this, this.void[var2], var1);
      }

      var1.a(this.v - 1, 6);

      for(var2 = 0; var2 < this.v; ++var2) {
         var1.a(this.int[var2].if, 1);
         var1.a(this.int[var2].do, 16);
         var1.a(this.int[var2].for, 16);
         var1.a(this.int[var2].a, 8);
      }

      var1.a(1, 1);
      return 0;
   }

   public int a(com.jcraft.a.d var1) {
      com.jcraft.a.e var2 = new com.jcraft.a.e();
      var2.a(var1.do, var1.new, var1.a);
      if (var2.for(1) != 0) {
         return -135;
      } else {
         int var4 = 0;

         for(int var5 = this.v; var5 > 1; var5 >>>= 1) {
            ++var4;
         }

         int var3 = var2.for(var4);
         return var3 == -1 ? -136 : this.q[this.int[var3].if];
      }
   }

   public String toString() {
      return "version:" + new Integer(this.s) + ", channels:" + new Integer(this.u) + ", rate:" + new Integer(this.f) + ", bitrate:" + new Integer(this.if) + "," + new Integer(this.goto) + "," + new Integer(this.try);
   }
}
