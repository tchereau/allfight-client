import java.util.ArrayList;
import java.util.List;

public class abz extends abr {
   public abz(int var1) {
      super(var1);
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      if (!var3.goto) {
         aef var11 = new aef(var3, (double)((float)var4 + var8), (double)((float)var5 + var9), (double)((float)var6 + var10), var1);
         var3.new(var11);
         if (!var2.fY.new) {
            --var1.if;
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      if (var1.a()) {
         aqv var5 = var1.b().char("Fireworks");
         if (var5 != null) {
            if (var5.try("Flight")) {
               var3.add(aqz.if("item.fireworks.flight") + " " + var5.else("Flight"));
            }

            aqm var6 = var5.void("Explosions");
            if (var6 != null && var6.for() > 0) {
               for(int var7 = 0; var7 < var6.for(); ++var7) {
                  aqv var8 = (aqv)var6.a(var7);
                  ArrayList var9 = new ArrayList();
                  ab0.a((aqv)var8, (List)var9);
                  if (var9.size() > 0) {
                     for(int var10 = 1; var10 < var9.size(); ++var10) {
                        var9.set(var10, "  " + (String)var9.get(var10));
                     }

                     var3.addAll(var9);
                  }
               }
            }

         }
      }
   }
}
