import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class arx extends ak5 {
   private q4 Z = null;
   private TreeSet Y = null;

   public arx(net.minecraft.a.a var1, si var2, String var3, int var4, y0 var5, ajq var6, ajw var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.L();
   }

   private void L() {
      try {
         Field[] var1 = ak5.class.getDeclaredFields();
         if (var1.length > 5) {
            Field var2 = var1[3];
            var2.setAccessible(true);
            if (var2.getType() == Set.class) {
               Set var3 = (Set)var2.get(this);
               q4 var4 = new q4(var3);
               var2.set(this, var4);
               Field var5 = var1[4];
               var5.setAccessible(true);
               this.Y = (TreeSet)var5.get(this);
               this.Z = var4;
            }
         }
      } catch (Exception var6) {
         qs.for("Error setting WorldServer.nextTickSet: " + var6.getMessage());
      }

   }

   public List a(xx var1, boolean var2) {
      if (this.Z != null && this.Y != null) {
         ArrayList var3 = null;
         zi var4 = var1.void();
         int var5 = var4.if << 4;
         int var6 = var5 + 16;
         int var7 = var4.a << 4;
         int var8 = var7 + 16;
         Iterator var9 = this.Z.a(var4.if, var4.a);

         while(true) {
            while(var9.hasNext()) {
               yr var10 = (yr)var9.next();
               if (var10.if >= var5 && var10.if < var6 && var10.byte >= var7 && var10.byte < var8) {
                  if (var2) {
                     this.Y.remove(var10);
                     var9.remove();
                  }

                  if (var3 == null) {
                     var3 = new ArrayList();
                  }

                  var3.add(var10);
               } else {
                  qs.for("Not matching: " + var5 + "," + var7);
               }
            }

            return var3;
         }
      } else {
         return super.a(var1, var2);
      }
   }
}
