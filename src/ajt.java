import java.util.List;

public class ajt {
   private static p a = null;

   public static void a(p var0) {
      if (a != null) {
         a.a();
      }

      a = var0;
      if (a != null) {
         try {
            a.for();
         } catch (Exception var2) {
            a = null;
            var2.printStackTrace();
         }
      }

   }

   public static boolean int() {
      return a != null;
   }

   public static p new() {
      return a;
   }

   public static dm a(y6 var0, List var1, int var2, int var3, int var4, int var5) {
      return a == null ? new dm(var0, var1, var2, var3, var4, var5) : a.a(var0, var1, var2, var3, var4, var5);
   }

   public static boolean a(c9 var0, aig var1, boolean var2) {
      try {
         return a.a(var0, var1, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         a((p)null);
         return false;
      }
   }

   public static void do() {
      if (a != null) {
         a.int();
      }

   }

   public static void a() {
      if (a != null) {
         a.if();
      }

   }

   public static void for() {
      if (a != null) {
         a.new();
      }

   }

   public static void a(c9 var0, aig var1) {
      if (a != null) {
         a.a(var0, var1);
      }

   }

   public static void if() {
      if (a != null) {
         a.do();
      }

   }
}
