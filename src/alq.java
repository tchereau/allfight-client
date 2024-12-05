import java.util.List;

public class alq extends ao8 {
   public String if() {
      return "tp";
   }

   public int do() {
      return 2;
   }

   public String if(ar0 var1) {
      return var1.a("commands.tp.usage");
   }

   public void if(ar0 var1, String[] var2) {
      if (var2.length < 1) {
         throw new ard("commands.tp.usage", new Object[0]);
      } else {
         ak2 var3;
         if (var2.length != 2 && var2.length != 4) {
            var3 = do(var1);
         } else {
            var3 = do(var1, var2[0]);
            if (var3 == null) {
               throw new arf();
            }
         }

         if (var2.length != 3 && var2.length != 4) {
            if (var2.length == 1 || var2.length == 2) {
               ak2 var11 = do(var1, var2[var2.length - 1]);
               if (var11 == null) {
                  throw new arf();
               }

               if (var11.ap != var3.ap) {
                  a(var1, "commands.tp.notSameDimension", new Object[0]);
                  return;
               }

               var3.int((aiw)null);
               var3.pV.a(var11.al, var11.ak, var11.aj, var11.a5, var11.a4);
               a(var1, "commands.tp.success", new Object[]{var3.aB(), var11.aB()});
            }
         } else if (var3.ap != null) {
            int var4 = var2.length - 3;
            double var5 = this.a(var1, var3.al, var2[var4++]);
            double var7 = this.a(var1, var3.ak, var2[var4++], 0, 0);
            double var9 = this.a(var1, var3.aj, var2[var4++]);
            var3.int((aiw)null);
            var3.char(var5, var7, var9);
            a(var1, "commands.tp.success.coordinates", new Object[]{var3.aB(), var5, var7, var9});
         }

      }
   }

   private double a(ar0 var1, double var2, String var4) {
      return this.a(var1, var2, var4, -30000000, 30000000);
   }

   private double a(ar0 var1, double var2, String var4, int var5, int var6) {
      boolean var7 = var4.startsWith("~");
      double var8 = var7 ? var2 : 0.0D;
      if (!var7 || var4.length() > 1) {
         boolean var10 = var4.contains(".");
         if (var7) {
            var4 = var4.substring(1);
         }

         var8 += if(var1, var4);
         if (!var10 && !var7) {
            var8 += 0.5D;
         }
      }

      if (var5 != 0 || var6 != 0) {
         if (var8 < (double)var5) {
            throw new arh("commands.generic.double.tooSmall", new Object[]{var8, var5});
         }

         if (var8 > (double)var6) {
            throw new arh("commands.generic.double.tooBig", new Object[]{var8, var6});
         }
      }

      return var8;
   }

   public List a(ar0 var1, String[] var2) {
      return var2.length != 1 && var2.length != 2 ? null : a(var2, net.minecraft.a.a.g2().hs());
   }

   public boolean a(String[] var1, int var2) {
      return var2 == 0;
   }
}
