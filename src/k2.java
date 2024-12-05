import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class k2 {
   public static List if = new ArrayList();
   public static ajy a = new ajy();
   public String new;
   public int int;
   public boolean for;
   public int do = 0;

   public static void a(int var0) {
      k2 var1 = (k2)a.for(var0);
      if (var1 != null) {
         ++var1.do;
      }

   }

   public static void a(int var0, boolean var1) {
      k2 var2 = (k2)a.for(var0);
      if (var2 != null) {
         var2.for = var1;
      }

   }

   public static void if() {
      Iterator var0 = if.iterator();

      while(var0.hasNext()) {
         k2 var1 = (k2)var0.next();
         var1.for();
      }

   }

   public static void a() {
      a.if();
      Iterator var0 = if.iterator();

      while(var0.hasNext()) {
         k2 var1 = (k2)var0.next();
         a.a(var1.int, var1);
      }

   }

   public k2(String var1, int var2) {
      this.new = var1;
      this.int = var2;
      if.add(this);
      a.a(var2, this);
   }

   public boolean do() {
      if (this.do == 0) {
         return false;
      } else {
         --this.do;
         return true;
      }
   }

   private void for() {
      this.do = 0;
      this.for = false;
   }
}
