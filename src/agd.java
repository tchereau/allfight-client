import java.util.Iterator;
import java.util.List;

public class agd {
   private y6 case;
   private boolean byte = false;
   private int try = -1;
   private int new;
   private int int;
   private agf for;
   private int do;
   private int if;
   private int a;

   public agd(y6 var1) {
      this.case = var1;
   }

   public void a() {
      boolean var1 = false;
      if (var1) {
         if (this.try == 2) {
            this.new = 100;
            return;
         }
      } else {
         if (this.case.j()) {
            this.try = 0;
            return;
         }

         if (this.try == 2) {
            return;
         }

         if (this.try == 0) {
            float var2 = this.case.try(0.0F);
            if ((double)var2 < 0.5D || (double)var2 > 0.501D) {
               return;
            }

            this.try = this.case.o.nextInt(10) == 0 ? 1 : 2;
            this.byte = false;
            if (this.try == 2) {
               return;
            }
         }
      }

      if (!this.byte) {
         if (!this.do()) {
            return;
         }

         this.byte = true;
      }

      if (this.int > 0) {
         --this.int;
      } else {
         this.int = 2;
         if (this.new > 0) {
            this.if();
            --this.new;
         } else {
            this.try = 2;
         }

      }
   }

   private boolean do() {
      List var1 = this.case.z;
      Iterator var2 = var1.iterator();

      nr var10;
      do {
         do {
            do {
               do {
                  do {
                     if (!var2.hasNext()) {
                        return false;
                     }

                     aek var3 = (aek)var2.next();
                     this.for = this.case.g.a((int)var3.al, (int)var3.ak, (int)var3.aj, 1);
                  } while(this.for == null);
               } while(this.for.int() < 10);
            } while(this.for.try() < 20);
         } while(this.for.char() < 20);

         apg var4 = this.for.void();
         float var5 = (float)this.for.if();
         boolean var6 = false;

         for(int var7 = 0; var7 < 10; ++var7) {
            this.do = var4.if + (int)((double)(ajs.for(this.case.o.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
            this.if = var4.a;
            this.a = var4.do + (int)((double)(ajs.try(this.case.o.nextFloat() * 3.1415927F * 2.0F) * var5) * 0.9D);
            var6 = false;
            Iterator var8 = this.case.g.try().iterator();

            while(var8.hasNext()) {
               agf var9 = (agf)var8.next();
               if (var9 != this.for && var9.a(this.do, this.if, this.a)) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               break;
            }
         }

         if (var6) {
            return false;
         }

         var10 = this.a(this.do, this.if, this.a);
      } while(var10 == null);

      this.int = 0;
      this.new = 20;
      return true;
   }

   private boolean if() {
      nr var1 = this.a(this.do, this.if, this.a);
      if (var1 == null) {
         return false;
      } else {
         aes var2;
         try {
            var2 = new aes(this.case);
            var2.bO();
            var2.q(false);
         } catch (Exception var4) {
            var4.printStackTrace();
            return false;
         }

         var2.if(var1.int, var1.for, var1.do, this.case.o.nextFloat() * 360.0F, 0.0F);
         this.case.new(var2);
         apg var3 = this.for.void();
         var2.if(var3.if, var3.a, var3.do, this.for.if());
         return true;
      }
   }

   private nr a(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < 10; ++var4) {
         int var5 = var1 + this.case.o.nextInt(16) - 8;
         int var6 = var2 + this.case.o.nextInt(6) - 3;
         int var7 = var3 + this.case.o.nextInt(16) - 8;
         if (this.for.a(var5, var6, var7) && yv.a(ah9.char, this.case, var5, var6, var7)) {
            this.case.do().a((double)var5, (double)var6, (double)var7);
         }
      }

      return null;
   }
}
