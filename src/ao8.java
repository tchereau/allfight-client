import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class ao8 implements ao6 {
   private static apa a = null;

   public int do() {
      return 4;
   }

   public String if(ar0 var1) {
      return "/" + this.if();
   }

   public List a() {
      return null;
   }

   public boolean a(ar0 var1) {
      return var1.a(this.do(), this.if());
   }

   public List a(ar0 var1, String[] var2) {
      return null;
   }

   public static int a(ar0 var0, String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException var3) {
         throw new arh("commands.generic.num.invalid", new Object[]{var1});
      }
   }

   public static int a(ar0 var0, String var1, int var2) {
      return a(var0, var1, var2, Integer.MAX_VALUE);
   }

   public static int a(ar0 var0, String var1, int var2, int var3) {
      int var4 = a(var0, var1);
      if (var4 < var2) {
         throw new arh("commands.generic.num.tooSmall", new Object[]{var4, var2});
      } else if (var4 > var3) {
         throw new arh("commands.generic.num.tooBig", new Object[]{var4, var3});
      } else {
         return var4;
      }
   }

   public static double if(ar0 var0, String var1) {
      try {
         return Double.parseDouble(var1);
      } catch (NumberFormatException var3) {
         throw new arh("commands.generic.double.invalid", new Object[]{var1});
      }
   }

   public static ak2 do(ar0 var0) {
      if (var0 instanceof ak2) {
         return (ak2)var0;
      } else {
         throw new arf("You must specify which player you wish to perform this action on.", new Object[0]);
      }
   }

   public static ak2 do(ar0 var0, String var1) {
      ak2 var2 = arz.if(var0, var1);
      if (var2 != null) {
         return var2;
      } else {
         var2 = net.minecraft.a.a.g2().g6().char(var1);
         if (var2 == null) {
            throw new arf();
         } else {
            return var2;
         }
      }
   }

   public static String for(ar0 var0, String var1) {
      ak2 var2 = arz.if(var0, var1);
      if (var2 != null) {
         return var2.aB();
      } else if (arz.for(var1)) {
         throw new arf();
      } else {
         return var1;
      }
   }

   public static String a(ar0 var0, String[] var1, int var2) {
      return a(var0, var1, var2, false);
   }

   public static String a(ar0 var0, String[] var1, int var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = var2; var5 < var1.length; ++var5) {
         if (var5 > var2) {
            var4.append(" ");
         }

         String var6 = var1[var5];
         if (var3) {
            String var7 = arz.do(var0, var6);
            if (var7 != null) {
               var6 = var7;
            } else if (arz.for(var6)) {
               throw new arf();
            }
         }

         var4.append(var6);
      }

      return var4.toString();
   }

   public static String a(Object[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         String var3 = var0[var2].toString();
         if (var2 > 0) {
            if (var2 == var0.length - 1) {
               var1.append(" and ");
            } else {
               var1.append(", ");
            }
         }

         var1.append(var3);
      }

      return var1.toString();
   }

   public static String a(Collection var0) {
      return a(var0.toArray(new String[0]));
   }

   public static boolean a(String var0, String var1) {
      return var1.regionMatches(true, 0, var0, 0, var0.length());
   }

   public static List a(String[] var0, String... var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = new ArrayList();
      String[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if (a(var2, var7)) {
            var3.add(var7);
         }
      }

      return var3;
   }

   public static List a(String[] var0, Iterable var1) {
      String var2 = var0[var0.length - 1];
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         if (a(var2, var5)) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public boolean a(String[] var1, int var2) {
      return false;
   }

   public static void a(ar0 var0, String var1, Object... var2) {
      a(var0, 0, var1, var2);
   }

   public static void a(ar0 var0, int var1, String var2, Object... var3) {
      if (a != null) {
         a.a(var0, var1, var2, var3);
      }

   }

   public static void a(apa var0) {
      a = var0;
   }

   public int a(ao6 var1) {
      return this.if().compareTo(var1.if());
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((ao6)var1);
   }
}
