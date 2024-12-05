import java.util.List;

public class arw extends ao8 {
   public String if() {
      return "effect";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.effect.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length >= 2) {
         ak2 var3 = do(var1, var2[0]);
         int var4 = a(var1, var2[1], 1);
         int var5 = 600;
         int var6 = 30;
         int var7 = 0;
         if (var4 >= 0 && var4 < ai0.A.length && ai0.A[var4] != null) {
            if (var2.length >= 3) {
               var6 = a(var1, var2[2], 0, 1000000);
               if (ai0.A[var4].case()) {
                  var5 = var6;
               } else {
                  var5 = var6 * 20;
               }
            } else if (ai0.A[var4].case()) {
               var5 = 1;
            }

            if (var2.length >= 4) {
               var7 = a(var1, var2[3], 0, 255);
            }

            if (var6 == 0) {
               if (!var3.r(var4)) {
                  throw new ari("commands.effect.failure.notActive", new Object[]{aqz.if(ai0.A[var4].byte()), var3.aB()});
               }

               var3.v(var4);
               a(var1, "commands.effect.success.removed", new Object[]{aqz.if(ai0.A[var4].byte()), var3.aB()});
            } else {
               aiz var8 = new aiz(var4, var5, var7);
               var3.for(var8);
               a(var1, "commands.effect.success", new Object[]{aqz.if(var8.try()), var4, var7, var3.aB(), var6});
            }

         } else {
            throw new arh("commands.effect.notFound", new Object[]{var4});
         }
      } else {
         throw new ard("commands.effect.usage", new Object[0]);
      }
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length == 1 ? a(var2, this.void()) : null;
   }

   protected String[] void() {
      return net.minecraft.a.a.g2().hs();
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
