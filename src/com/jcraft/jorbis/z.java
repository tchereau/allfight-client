package com.jcraft.jorbis;

public class z {
   float[][] if = new float[0][];
   com.jcraft.a.e void = new com.jcraft.a.e();
   int char;
   int int;
   int b;
   int else;
   int try;
   int goto;
   long long;
   long new;
   com.jcraft.jorbis.k case;
   int for;
   int do;
   int byte;
   int a;

   public z(com.jcraft.jorbis.k var1) {
      this.case = var1;
      if (var1.e != 0) {
         this.void.int();
      }

   }

   public void a(com.jcraft.jorbis.k var1) {
      this.case = var1;
   }

   public int a() {
      if (this.case != null && this.case.e != 0) {
         this.void.byte();
      }

      return 0;
   }

   public int a(com.jcraft.a.d var1) {
      com.jcraft.jorbis.f var2 = this.case.p;
      this.void.a(var1.do, var1.new, var1.a);
      if (this.void.for(1) != 0) {
         return -1;
      } else {
         int var3 = this.void.for(this.case.if);
         if (var3 == -1) {
            return -1;
         } else {
            this.try = var3;
            this.int = var2.int[this.try].if;
            if (this.int != 0) {
               this.char = this.void.for(1);
               this.b = this.void.for(1);
               if (this.b == -1) {
                  return -1;
               }
            } else {
               this.char = 0;
               this.b = 0;
            }

            this.long = var1.if;
            this.new = var1.int - 3L;
            this.goto = var1.for;
            this.else = var2.q[this.int];
            if (this.if.length < var2.u) {
               this.if = new float[var2.u][];
            }

            int var4;
            for(var4 = 0; var4 < var2.u; ++var4) {
               if (this.if[var4] != null && this.if[var4].length >= this.else) {
                  for(int var5 = 0; var5 < this.else; ++var5) {
                     this.if[var4][var5] = 0.0F;
                  }
               } else {
                  this.if[var4] = new float[this.else];
               }
            }

            var4 = var2.d[var2.int[this.try].a];
            return com.jcraft.jorbis.v.a[var4].a(this, this.case.goto[this.try]);
         }
      }
   }
}
