package com.jcraft.jorbis;

class n$d {
   static final int char = 63;
   static final int else = 16;
   static final int b = 31;
   int case;
   int[] int;
   int[] e;
   int[] goto;
   int[] new;
   int[][] if;
   int try;
   int[] f;
   float do;
   float d;
   float byte;
   int for;
   int h;
   int void;
   float a;
   int g;
   int long;
   int c;
   // $FF: synthetic field
   final com.jcraft.jorbis.n i;

   n$d(com.jcraft.jorbis.n var1) {
      this.i = var1;
      this.int = new int[31];
      this.e = new int[16];
      this.goto = new int[16];
      this.new = new int[16];
      this.if = new int[16][];
      this.f = new int[65];

      for(int var2 = 0; var2 < this.if.length; ++var2) {
         this.if[var2] = new int[8];
      }

   }

   void if() {
      this.int = null;
      this.e = null;
      this.goto = null;
      this.new = null;
      this.if = (int[][])null;
      this.f = null;
   }

   Object a() {
      n$d var1 = this;
      n$d var2 = new n$d(this.i);
      var2.case = this.case;
      System.arraycopy(this.int, 0, var2.int, 0, 31);
      System.arraycopy(this.e, 0, var2.e, 0, 16);
      System.arraycopy(this.goto, 0, var2.goto, 0, 16);
      System.arraycopy(this.new, 0, var2.new, 0, 16);

      for(int var3 = 0; var3 < 16; ++var3) {
         System.arraycopy(var1.if[var3], 0, var2.if[var3], 0, 8);
      }

      var2.try = var1.try;
      System.arraycopy(var1.f, 0, var2.f, 0, 65);
      var2.do = var1.do;
      var2.d = var1.d;
      var2.byte = var1.byte;
      var2.for = var1.for;
      var2.h = var1.h;
      var2.void = var1.void;
      var2.a = var1.a;
      var2.g = var1.g;
      var2.long = var1.long;
      var2.c = var1.c;
      return var2;
   }
}
