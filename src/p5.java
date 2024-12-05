public class p5 extends r6 {
   protected ajd e8;

   protected p5(int var1) {
      super(var1, true);
   }

   public ajd if(int var1, int var2) {
      return (var2 & 8) == 0 ? this.an : this.e8;
   }

   public void a(ajc var1) {
      super.a(var1);
      this.e8 = var1.a(this.e() + "_powered");
   }

   protected boolean a(y6 var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      if (var7 >= 8) {
         return false;
      } else {
         int var8 = var5 & 7;
         boolean var9 = true;
         switch(var8) {
         case 0:
            if (var6) {
               ++var4;
            } else {
               --var4;
            }
            break;
         case 1:
            if (var6) {
               --var2;
            } else {
               ++var2;
            }
            break;
         case 2:
            if (var6) {
               --var2;
            } else {
               ++var2;
               ++var3;
               var9 = false;
            }

            var8 = 1;
            break;
         case 3:
            if (var6) {
               --var2;
               ++var3;
               var9 = false;
            } else {
               ++var2;
            }

            var8 = 1;
            break;
         case 4:
            if (var6) {
               ++var4;
            } else {
               --var4;
               ++var3;
               var9 = false;
            }

            var8 = 0;
            break;
         case 5:
            if (var6) {
               ++var4;
               ++var3;
               var9 = false;
            } else {
               --var4;
            }

            var8 = 0;
         }

         if (this.a(var1, var2, var3, var4, var6, var7, var8)) {
            return true;
         } else {
            return var9 && this.a(var1, var2, var3 - 1, var4, var6, var7, var8);
         }
      }
   }

   protected boolean a(y6 var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      int var8 = var1.new(var2, var3, var4);
      if (var8 == this.void) {
         int var9 = var1.for(var2, var3, var4);
         int var10 = var9 & 7;
         if (var7 == 1 && (var10 == 0 || var10 == 4 || var10 == 5)) {
            return false;
         }

         if (var7 == 0 && (var10 == 1 || var10 == 2 || var10 == 3)) {
            return false;
         }

         if ((var9 & 8) != 0) {
            if (var1.f(var2, var3, var4)) {
               return true;
            }

            return this.a(var1, var2, var3, var4, var9, var5, var6 + 1);
         }
      }

      return false;
   }

   protected void if(y6 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      boolean var8 = var1.f(var2, var3, var4);
      var8 = var8 || this.a(var1, var2, var3, var4, var5, true, 0) || this.a(var1, var2, var3, var4, var5, false, 0);
      boolean var9 = false;
      if (var8 && (var5 & 8) == 0) {
         var1.do(var2, var3, var4, var6 | 8, 3);
         var9 = true;
      } else if (!var8 && (var5 & 8) != 0) {
         var1.do(var2, var3, var4, var6, 3);
         var9 = true;
      }

      if (var9) {
         var1.for(var2, var3 - 1, var4, this.void);
         if (var6 == 2 || var6 == 3 || var6 == 4 || var6 == 5) {
            var1.for(var2, var3 + 1, var4, this.void);
         }
      }

   }
}
