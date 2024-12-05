import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class vk extends uo {
   private static List void;
   private List long;
   private int goto;
   private int else;

   public vk() {
      this.long = new ArrayList();
      this.goto = 32;
      this.else = 8;
      this.long.add(new ym(aet.class, 1, 1, 1));
   }

   public vk(Map var1) {
      this();
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (((String)var3.getKey()).equals("distance")) {
            this.goto = ajs.a((String)var3.getValue(), this.goto, this.else + 1);
         }
      }

   }

   protected boolean if(int var1, int var2) {
      int var3 = var1;
      int var4 = var2;
      if (var1 < 0) {
         var1 -= this.goto - 1;
      }

      if (var2 < 0) {
         var2 -= this.goto - 1;
      }

      int var5 = var1 / this.goto;
      int var6 = var2 / this.goto;
      Random var7 = this.do.s(var5, var6, 14357617);
      var5 *= this.goto;
      var6 *= this.goto;
      var5 += var7.nextInt(this.goto - this.else);
      var6 += var7.nextInt(this.goto - this.else);
      if (var3 == var5 && var4 == var6) {
         yn var8 = this.do.void().a(var3 * 16 + 8, var4 * 16 + 8);
         Iterator var9 = void.iterator();

         while(var9.hasNext()) {
            yn var10 = (yn)var9.next();
            if (var8 == var10) {
               return true;
            }
         }
      }

      return false;
   }

   protected ui a(int var1, int var2) {
      return new vj(this.do, this.a, var1, var2);
   }

   public List if() {
      return this.long;
   }

   static {
      void = Arrays.asList(yn.D, yn.o, yn.k, yn.j, yn.z);
   }
}
