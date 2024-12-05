public class nw {
   private static final ThreadLocal do = new nv();
   public double if;
   public double a;
   public double try;
   public double new;
   public double int;
   public double for;

   public static nw if(double var0, double var2, double var4, double var6, double var8, double var10) {
      return new nw(var0, var2, var4, var6, var8, var10);
   }

   public static nu if() {
      return (nu)do.get();
   }

   protected nw(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.if = var1;
      this.a = var3;
      this.try = var5;
      this.new = var7;
      this.int = var9;
      this.for = var11;
   }

   public nw a(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.if = var1;
      this.a = var3;
      this.try = var5;
      this.new = var7;
      this.int = var9;
      this.for = var11;
      return this;
   }

   public nw a(double var1, double var3, double var5) {
      double var7 = this.if;
      double var9 = this.a;
      double var11 = this.try;
      double var13 = this.new;
      double var15 = this.int;
      double var17 = this.for;
      if (var1 < 0.0D) {
         var7 += var1;
      }

      if (var1 > 0.0D) {
         var13 += var1;
      }

      if (var3 < 0.0D) {
         var9 += var3;
      }

      if (var3 > 0.0D) {
         var15 += var3;
      }

      if (var5 < 0.0D) {
         var11 += var5;
      }

      if (var5 > 0.0D) {
         var17 += var5;
      }

      return if().a(var7, var9, var11, var13, var15, var17);
   }

   public nw do(double var1, double var3, double var5) {
      double var7 = this.if - var1;
      double var9 = this.a - var3;
      double var11 = this.try - var5;
      double var13 = this.new + var1;
      double var15 = this.int + var3;
      double var17 = this.for + var5;
      return if().a(var7, var9, var11, var13, var15, var17);
   }

   public nw int(double var1, double var3, double var5) {
      return if().a(this.if + var1, this.a + var3, this.try + var5, this.new + var1, this.int + var3, this.for + var5);
   }

   public double do(nw var1, double var2) {
      if (!(var1.int <= this.a) && !(var1.a >= this.int)) {
         if (!(var1.for <= this.try) && !(var1.try >= this.for)) {
            double var4;
            if (var2 > 0.0D && var1.new <= this.if) {
               var4 = this.if - var1.new;
               if (var4 < var2) {
                  var2 = var4;
               }
            }

            if (var2 < 0.0D && var1.if >= this.new) {
               var4 = this.new - var1.if;
               if (var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double a(nw var1, double var2) {
      if (!(var1.new <= this.if) && !(var1.if >= this.new)) {
         if (!(var1.for <= this.try) && !(var1.try >= this.for)) {
            double var4;
            if (var2 > 0.0D && var1.int <= this.a) {
               var4 = this.a - var1.int;
               if (var4 < var2) {
                  var2 = var4;
               }
            }

            if (var2 < 0.0D && var1.a >= this.int) {
               var4 = this.int - var1.a;
               if (var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public double if(nw var1, double var2) {
      if (!(var1.new <= this.if) && !(var1.if >= this.new)) {
         if (!(var1.int <= this.a) && !(var1.a >= this.int)) {
            double var4;
            if (var2 > 0.0D && var1.for <= this.try) {
               var4 = this.try - var1.for;
               if (var4 < var2) {
                  var2 = var4;
               }
            }

            if (var2 < 0.0D && var1.try >= this.for) {
               var4 = this.for - var1.try;
               if (var4 > var2) {
                  var2 = var4;
               }
            }

            return var2;
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   public boolean a(nw var1) {
      if (!(var1.new <= this.if) && !(var1.if >= this.new)) {
         if (!(var1.int <= this.a) && !(var1.a >= this.int)) {
            return !(var1.for <= this.try) && !(var1.try >= this.for);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public nw if(double var1, double var3, double var5) {
      this.if += var1;
      this.a += var3;
      this.try += var5;
      this.new += var1;
      this.int += var3;
      this.for += var5;
      return this;
   }

   public boolean for(nr var1) {
      if (!(var1.int <= this.if) && !(var1.int >= this.new)) {
         if (!(var1.for <= this.a) && !(var1.for >= this.int)) {
            return !(var1.do <= this.try) && !(var1.do >= this.for);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public double a() {
      double var1 = this.new - this.if;
      double var3 = this.int - this.a;
      double var5 = this.for - this.try;
      return (var1 + var3 + var5) / 3.0D;
   }

   public nw for(double var1, double var3, double var5) {
      double var7 = this.if + var1;
      double var9 = this.a + var3;
      double var11 = this.try + var5;
      double var13 = this.new - var1;
      double var15 = this.int - var3;
      double var17 = this.for - var5;
      return if().a(var7, var9, var11, var13, var15, var17);
   }

   public nw do() {
      return if().a(this.if, this.a, this.try, this.new, this.int, this.for);
   }

   public nt a(nr var1, nr var2) {
      nr var3 = var1.if(var2, this.if);
      nr var4 = var1.if(var2, this.new);
      nr var5 = var1.do(var2, this.a);
      nr var6 = var1.do(var2, this.int);
      nr var7 = var1.a(var2, this.try);
      nr var8 = var1.a(var2, this.for);
      if (!this.a(var3)) {
         var3 = null;
      }

      if (!this.a(var4)) {
         var4 = null;
      }

      if (!this.do(var5)) {
         var5 = null;
      }

      if (!this.do(var6)) {
         var6 = null;
      }

      if (!this.if(var7)) {
         var7 = null;
      }

      if (!this.if(var8)) {
         var8 = null;
      }

      nr var9 = null;
      if (var3 != null && (var9 == null || var1.for(var3) < var1.for(var9))) {
         var9 = var3;
      }

      if (var4 != null && (var9 == null || var1.for(var4) < var1.for(var9))) {
         var9 = var4;
      }

      if (var5 != null && (var9 == null || var1.for(var5) < var1.for(var9))) {
         var9 = var5;
      }

      if (var6 != null && (var9 == null || var1.for(var6) < var1.for(var9))) {
         var9 = var6;
      }

      if (var7 != null && (var9 == null || var1.for(var7) < var1.for(var9))) {
         var9 = var7;
      }

      if (var8 != null && (var9 == null || var1.for(var8) < var1.for(var9))) {
         var9 = var8;
      }

      if (var9 == null) {
         return null;
      } else {
         byte var10 = -1;
         if (var9 == var3) {
            var10 = 4;
         }

         if (var9 == var4) {
            var10 = 5;
         }

         if (var9 == var5) {
            var10 = 0;
         }

         if (var9 == var6) {
            var10 = 1;
         }

         if (var9 == var7) {
            var10 = 2;
         }

         if (var9 == var8) {
            var10 = 3;
         }

         return new nt(0, 0, 0, var10, var9);
      }
   }

   private boolean a(nr var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.for >= this.a && var1.for <= this.int && var1.do >= this.try && var1.do <= this.for;
      }
   }

   private boolean do(nr var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.int >= this.if && var1.int <= this.new && var1.do >= this.try && var1.do <= this.for;
      }
   }

   private boolean if(nr var1) {
      if (var1 == null) {
         return false;
      } else {
         return var1.int >= this.if && var1.int <= this.new && var1.for >= this.a && var1.for <= this.int;
      }
   }

   public void if(nw var1) {
      this.if = var1.if;
      this.a = var1.a;
      this.try = var1.try;
      this.new = var1.new;
      this.int = var1.int;
      this.for = var1.for;
   }

   public String toString() {
      return "box[" + this.if + ", " + this.a + ", " + this.try + " -> " + this.new + ", " + this.int + ", " + this.for + "]";
   }
}
