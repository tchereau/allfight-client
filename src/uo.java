import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

public abstract class uo extends xd {
   protected Map int = new HashMap();

   protected void a(y6 var1, int var2, int var3, int var4, int var5, byte[] var6) {
      if (!this.int.containsKey(zi.a(var2, var3))) {
         this.a.nextInt();

         try {
            if (this.if(var2, var3)) {
               ui var7 = this.a(var2, var3);
               this.int.put(zi.a(var2, var3), var7);
            }

         } catch (Throwable var10) {
            aqh var8 = aqh.a(var10, "Exception preparing structure feature");
            apu var9 = var8.a("Feature being prepared");
            var9.a((String)"Is feature chunk", (Callable)(new un(this, var2, var3)));
            var9.a((String)"Chunk location", (Object)String.format("%d,%d", var2, var3));
            var9.a((String)"Chunk pos hash", (Callable)(new um(this, var2, var3)));
            var9.a((String)"Structure type", (Callable)(new ul(this)));
            throw new ape(var8);
         }
      }
   }

   public boolean a(y6 var1, Random var2, int var3, int var4) {
      int var5 = (var3 << 4) + 8;
      int var6 = (var4 << 4) + 8;
      boolean var7 = false;
      Iterator var8 = this.int.values().iterator();

      while(var8.hasNext()) {
         ui var9 = (ui)var8.next();
         if (var9.if() && var9.do().a(var5, var6, var5 + 15, var6 + 15)) {
            var9.a(var1, var2, new wc(var5, var6, var5 + 15, var6 + 15));
            var7 = true;
         }
      }

      return var7;
   }

   public boolean a(int var1, int var2, int var3) {
      Iterator var4 = this.int.values().iterator();

      while(true) {
         ui var5;
         do {
            do {
               if (!var4.hasNext()) {
                  return false;
               }

               var5 = (ui)var4.next();
            } while(!var5.if());
         } while(!var5.do().a(var1, var3, var1, var3));

         Iterator var6 = var5.for().iterator();

         while(var6.hasNext()) {
            uk var7 = (uk)var6.next();
            if (var7.do().if(var1, var2, var3)) {
               return true;
            }
         }
      }
   }

   public yp a(y6 var1, int var2, int var3, int var4) {
      this.do = var1;
      this.a.setSeed(var1.b());
      long var5 = this.a.nextLong();
      long var7 = this.a.nextLong();
      long var9 = (long)(var2 >> 4) * var5;
      long var11 = (long)(var4 >> 4) * var7;
      this.a.setSeed(var9 ^ var11 ^ var1.b());
      this.a(var1, var2 >> 4, var4 >> 4, 0, 0, (byte[])null);
      double var13 = Double.MAX_VALUE;
      yp var15 = null;
      Iterator var16 = this.int.values().iterator();

      yp var19;
      int var20;
      int var21;
      int var22;
      double var23;
      while(var16.hasNext()) {
         ui var17 = (ui)var16.next();
         if (var17.if()) {
            uk var18 = (uk)var17.for().get(0);
            var19 = var18.if();
            var20 = var19.if - var2;
            var21 = var19.a - var3;
            var22 = var19.do - var4;
            var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
            if (var23 < var13) {
               var13 = var23;
               var15 = var19;
            }
         }
      }

      if (var15 != null) {
         return var15;
      } else {
         List var25 = this.a();
         if (var25 != null) {
            yp var26 = null;
            Iterator var27 = var25.iterator();

            while(var27.hasNext()) {
               var19 = (yp)var27.next();
               var20 = var19.if - var2;
               var21 = var19.a - var3;
               var22 = var19.do - var4;
               var23 = (double)(var20 + var20 * var21 * var21 + var22 * var22);
               if (var23 < var13) {
                  var13 = var23;
                  var26 = var19;
               }
            }

            return var26;
         } else {
            return null;
         }
      }
   }

   protected List a() {
      return null;
   }

   protected abstract boolean if(int var1, int var2);

   protected abstract ui a(int var1, int var2);
}
