import java.util.Iterator;

public class ot extends r7 {
   private final int fb;

   protected ot(int var1, String var2, ts var3, int var4) {
      super(var1, var2, var3);
      this.fb = var4;
   }

   protected int Y(y6 var1, int var2, int var3, int var4) {
      int var5 = 0;
      Iterator var6 = var1.a(afk.class, this.if(var2, var3, var4)).iterator();

      while(var6.hasNext()) {
         afk var7 = (afk)var6.next();
         var5 += var7.ba().if;
         if (var5 >= this.fb) {
            break;
         }
      }

      if (var5 <= 0) {
         return 0;
      } else {
         float var8 = (float)Math.min(this.fb, var5) / (float)this.fb;
         return ajs.a(var8 * 15.0F);
      }
   }

   protected int O(int var1) {
      return var1;
   }

   protected int N(int var1) {
      return var1;
   }

   public int a(y6 var1) {
      return 10;
   }
}
