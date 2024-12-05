public class aaf implements aag {
   private int a;
   private int new;
   private abp[] int;
   private abp for;
   public final int if;
   private boolean do = false;

   public aaf(int var1, int var2, abp[] var3, abp var4) {
      this.if = var4.new;
      this.a = var1;
      this.new = var2;
      this.int = var3;
      this.for = var4;
   }

   public abp a() {
      return this.for;
   }

   public boolean a(adt var1, y6 var2) {
      for(int var3 = 0; var3 <= 3 - this.a; ++var3) {
         for(int var4 = 0; var4 <= 3 - this.new; ++var4) {
            if (this.a(var1, var3, var4, true)) {
               return true;
            }

            if (this.a(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean a(adt var1, int var2, int var3, boolean var4) {
      for(int var5 = 0; var5 < 3; ++var5) {
         for(int var6 = 0; var6 < 3; ++var6) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            abp var9 = null;
            if (var7 >= 0 && var8 >= 0 && var7 < this.a && var8 < this.new) {
               if (var4) {
                  var9 = this.int[this.a - var7 - 1 + var8 * this.a];
               } else {
                  var9 = this.int[var7 + var8 * this.a];
               }
            }

            abp var10 = var1.do(var5, var6);
            if (var10 != null || var9 != null) {
               if (var10 == null && var9 != null || var10 != null && var9 == null) {
                  return false;
               }

               if (var9.new != var10.new) {
                  return false;
               }

               if (var9.new() != 32767 && var9.new() != var10.new()) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   public abp a(adt var1) {
      abp var2 = this.a().n();
      if (this.do) {
         for(int var3 = 0; var3 < var1.r(); ++var3) {
            abp var4 = var1.do(var3);
            if (var4 != null && var4.a()) {
               var2.do((aqv)var4.int.do());
            }
         }
      }

      return var2;
   }

   public int if() {
      return this.a * this.new;
   }

   public aaf do() {
      this.do = true;
      return this;
   }
}
