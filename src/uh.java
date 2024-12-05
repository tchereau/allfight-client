import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class uh extends uo {
   public static final List g;
   private int f;
   private int e;
   private int d;

   public uh() {
      this.f = 0;
      this.e = 32;
      this.d = 8;
   }

   public uh(Map var1) {
      this();
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (((String)var3.getKey()).equals("size")) {
            this.f = ajs.a((String)((String)var3.getValue()), this.f, 0);
         } else if (((String)var3.getKey()).equals("distance")) {
            this.e = ajs.a((String)var3.getValue(), this.e, this.d + 1);
         }
      }

   }

   protected boolean if(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if (var1 < 0) {
         var1 -= this.e - 1;
      }

      if (var2 < 0) {
         var2 -= this.e - 1;
      }

      int var5 = var1 / this.e;
      int var6 = var2 / this.e;
      Random var7 = this.do.s(var5, var6, 10387312);
      var5 *= this.e;
      var6 *= this.e;
      var5 += var7.nextInt(this.e - this.d);
      var6 += var7.nextInt(this.e - this.d);
      if (var3 == var5 && var4 == var6) {
         boolean var8 = this.do.void().a(var3 * 16 + 8, var4 * 16 + 8, 0, g);
         if (var8) {
            return true;
         }
      }

      return false;
   }

   protected ui a(int var1, int var2) {
      return new ug(this.do, this.a, var1, var2, this.f);
   }

   static {
      g = Arrays.asList(yn.E, yn.D);
   }
}
