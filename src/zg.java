import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class zg {
   public boolean goto = false;
   public boolean else = true;
   private int for = 16;
   private Random do = new Random();
   private y6 if;
   public double char;
   public double case;
   public double byte;
   public aiw try;
   public float new;
   public List int = new ArrayList();
   private Map a = new HashMap();

   public zg(y6 var1, aiw var2, double var3, double var5, double var7, float var9) {
      this.if = var1;
      this.try = var2;
      this.new = var9;
      this.char = var3;
      this.case = var5;
      this.byte = var7;
   }

   public void if() {
      float var1 = this.new;
      HashSet var2 = new HashSet();

      int var3;
      int var4;
      int var5;
      double var15;
      double var17;
      double var19;
      for(var3 = 0; var3 < this.for; ++var3) {
         for(var4 = 0; var4 < this.for; ++var4) {
            for(var5 = 0; var5 < this.for; ++var5) {
               if (var3 == 0 || var3 == this.for - 1 || var4 == 0 || var4 == this.for - 1 || var5 == 0 || var5 == this.for - 1) {
                  double var6 = (double)((float)var3 / ((float)this.for - 1.0F) * 2.0F - 1.0F);
                  double var8 = (double)((float)var4 / ((float)this.for - 1.0F) * 2.0F - 1.0F);
                  double var10 = (double)((float)var5 / ((float)this.for - 1.0F) * 2.0F - 1.0F);
                  double var12 = Math.sqrt(var6 * var6 + var8 * var8 + var10 * var10);
                  var6 /= var12;
                  var8 /= var12;
                  var10 /= var12;
                  float var14 = this.new * (0.7F + this.if.o.nextFloat() * 0.6F);
                  var15 = this.char;
                  var17 = this.case;
                  var19 = this.byte;

                  for(float var21 = 0.3F; var14 > 0.0F; var14 -= var21 * 0.75F) {
                     int var22 = ajs.a(var15);
                     int var23 = ajs.a(var17);
                     int var24 = ajs.a(var19);
                     int var25 = this.if.new(var22, var23, var24);
                     if (var25 > 0) {
                        pa var26 = pa.x[var25];
                        float var27 = this.try != null ? this.try.a(this, this.if, var22, var23, var24, var26) : var26.a(this.try);
                        var14 -= (var27 + 0.3F) * var21;
                     }

                     if (var14 > 0.0F && (this.try == null || this.try.a(this, this.if, var22, var23, var24, var25, var14))) {
                        var2.add(new yp(var22, var23, var24));
                     }

                     var15 += var6 * (double)var21;
                     var17 += var8 * (double)var21;
                     var19 += var10 * (double)var21;
                  }
               }
            }
         }
      }

      this.int.addAll(var2);
      this.new *= 2.0F;
      var3 = ajs.a(this.char - (double)this.new - 1.0D);
      var4 = ajs.a(this.char + (double)this.new + 1.0D);
      var5 = ajs.a(this.case - (double)this.new - 1.0D);
      int var29 = ajs.a(this.case + (double)this.new + 1.0D);
      int var7 = ajs.a(this.byte - (double)this.new - 1.0D);
      int var30 = ajs.a(this.byte + (double)this.new + 1.0D);
      List var9 = this.if.a(this.try, nw.if().a((double)var3, (double)var5, (double)var7, (double)var4, (double)var29, (double)var30));
      nr var31 = this.if.do().a(this.char, this.case, this.byte);

      for(int var11 = 0; var11 < var9.size(); ++var11) {
         aiw var32 = (aiw)var9.get(var11);
         double var13 = var32.case(this.char, this.case, this.byte) / (double)this.new;
         if (var13 <= 1.0D) {
            var15 = var32.al - this.char;
            var17 = var32.ak + (double)var32.af() - this.case;
            var19 = var32.aj - this.byte;
            double var33 = (double)ajs.int(var15 * var15 + var17 * var17 + var19 * var19);
            if (var33 != 0.0D) {
               var15 /= var33;
               var17 /= var33;
               var19 /= var33;
               double var34 = (double)this.if.a(var31, var32.aZ);
               double var35 = (1.0D - var13) * var34;
               var32.a(ai4.a(this), (int)((var35 * var35 + var35) / 2.0D * 8.0D * (double)this.new + 1.0D));
               double var36 = zr.a(var32, var35);
               var32.ai += var15 * var36;
               var32.ah += var17 * var36;
               var32.ag += var19 * var36;
               if (var32 instanceof aek) {
                  this.a.put((aek)var32, this.if.do().a(var15 * var35, var17 * var35, var19 * var35));
               }
            }
         }
      }

      this.new = var1;
   }

   public void a(boolean var1) {
      this.if.a(this.char, this.case, this.byte, "random.explode", 4.0F, (1.0F + (this.if.o.nextFloat() - this.if.o.nextFloat()) * 0.2F) * 0.7F);
      if (!(this.new < 2.0F) && this.else) {
         this.if.a("hugeexplosion", this.char, this.case, this.byte, 1.0D, 0.0D, 0.0D);
      } else {
         this.if.a("largeexplode", this.char, this.case, this.byte, 1.0D, 0.0D, 0.0D);
      }

      Iterator var2;
      yp var3;
      int var4;
      int var5;
      int var6;
      int var7;
      if (this.else) {
         var2 = this.int.iterator();

         while(var2.hasNext()) {
            var3 = (yp)var2.next();
            var4 = var3.if;
            var5 = var3.a;
            var6 = var3.do;
            var7 = this.if.new(var4, var5, var6);
            if (var1) {
               double var8 = (double)((float)var4 + this.if.o.nextFloat());
               double var10 = (double)((float)var5 + this.if.o.nextFloat());
               double var12 = (double)((float)var6 + this.if.o.nextFloat());
               double var14 = var8 - this.char;
               double var16 = var10 - this.case;
               double var18 = var12 - this.byte;
               double var20 = (double)ajs.int(var14 * var14 + var16 * var16 + var18 * var18);
               var14 /= var20;
               var16 /= var20;
               var18 /= var20;
               double var22 = 0.5D / (var20 / (double)this.new + 0.1D);
               var22 *= (double)(this.if.o.nextFloat() * this.if.o.nextFloat() + 0.3F);
               var14 *= var22;
               var16 *= var22;
               var18 *= var22;
               this.if.a("explode", (var8 + this.char * 1.0D) / 2.0D, (var10 + this.case * 1.0D) / 2.0D, (var12 + this.byte * 1.0D) / 2.0D, var14, var16, var18);
               this.if.a("smoke", var8, var10, var12, var14, var16, var18);
            }

            if (var7 > 0) {
               pa var24 = pa.x[var7];
               if (var24.a(this)) {
                  var24.a(this.if, var4, var5, var6, this.if.for(var4, var5, var6), 1.0F / this.new, 0);
               }

               this.if.int(var4, var5, var6, 0, 0, 3);
               var24.a(this.if, var4, var5, var6, this);
            }
         }
      }

      if (this.goto) {
         var2 = this.int.iterator();

         while(var2.hasNext()) {
            var3 = (yp)var2.next();
            var4 = var3.if;
            var5 = var3.a;
            var6 = var3.do;
            var7 = this.if.new(var4, var5, var6);
            int var25 = this.if.new(var4, var5 - 1, var6);
            if (var7 == 0 && pa.v[var25] && this.do.nextInt(3) == 0) {
               this.if.int(var4, var5, var6, pa.bo.void);
            }
         }
      }

   }

   public Map a() {
      return this.a;
   }

   public aig do() {
      if (this.try == null) {
         return null;
      } else if (this.try instanceof afa) {
         return ((afa)this.try).a8();
      } else {
         return this.try instanceof aig ? (aig)this.try : null;
      }
   }
}
