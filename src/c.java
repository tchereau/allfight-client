import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class c {
   private static Map for = new HashMap();
   private static c9 if = null;
   private static boolean int = false;
   private static Random do = new Random();
   private static boolean a = false;

   public static void a(aiw var0) {
      if (var0 instanceof aig) {
         if (!(var0 instanceof aek)) {
            aig var1 = (aig)var0;
            ak5 var2 = qs.v();
            if (var2 != null) {
               aiw var3 = var2.a(var0.av);
               if (var3 instanceof aig) {
                  aig var4 = (aig)var3;
                  int var5 = var4.d6;
                  var1.d6 = var5;
               }
            }
         }
      }
   }

   public static void a(y6 var0, y6 var1) {
      if (var1 != null) {
         List var2 = var1.int();

         for(int var3 = 0; var3 < var2.size(); ++var3) {
            aiw var4 = (aiw)var2.get(var3);
            a(var4);
         }
      }

   }

   public static String a(String var0) {
      if (a) {
         return var0;
      } else {
         String var1;
         try {
            a = true;
            if (!int) {
               if();
            }

            if (if != null) {
               aiw var7 = if.m;
               String var8;
               if (var7 == null) {
                  var8 = var0;
                  return var8;
               }

               if (!(var7 instanceof aig)) {
                  var8 = var0;
                  return var8;
               }

               aig var2 = (aig)var7;
               String var3;
               if (!var0.startsWith("/mob/")) {
                  var3 = var0;
                  return var3;
               }

               var3 = a(var0, var2.d6);
               return var3;
            }

            var1 = var0;
         } finally {
            a = false;
         }

         return var1;
      }
   }

   private static String a(String var0, int var1) {
      if (var1 <= 0) {
         return var0;
      } else {
         String[] var2 = (String[])((String[])for.get(var0));
         if (var2 == null) {
            var2 = if(var0);
            for.put(var0, var2);
         }

         if (var2 != null && var2.length > 0) {
            int var3 = var1 % var2.length;
            String var4 = var2[var3];
            return var4;
         } else {
            return var0;
         }
      }
   }

   private static String[] if(String var0) {
      c3 var1 = qs.q();
      var1.new(var0);
      String[] var2 = new String[0];
      int var3 = var0.lastIndexOf(46);
      if (var3 < 0) {
         return var2;
      } else {
         String var4 = var0.substring(0, var3);
         String var5 = var0.substring(var3);
         int var6 = a(var0, var4, var5);
         if (var6 <= 1) {
            return var2;
         } else {
            var2 = new String[var6];
            var2[0] = var0;

            for(int var7 = 1; var7 < var2.length; ++var7) {
               int var8 = var7 + 1;
               String var9 = var4 + var8 + var5;
               var2[var7] = var9;
               var1.new(var9);
            }

            qs.for("RandomMobs: " + var0 + ", variants: " + var2.length);
            return var2;
         }
      }
   }

   private static int a(String var0, String var1, String var2) {
      c3 var3 = qs.q();
      short var4 = 1000;

      for(int var5 = 2; var5 < var4; ++var5) {
         String var6 = var1 + var5 + var2;

         try {
            InputStream var7 = var3.try.int().a(var6);
            if (var7 == null) {
               return var5 - 1;
            }

            var7.close();
         } catch (IOException var8) {
            return var5 - 1;
         }
      }

      return var4;
   }

   public static void a() {
      for.clear();
      if (qs.w()) {
         if();
      }

   }

   private static void if() {
      if = qs.int();
      if (if != null) {
         int = true;
         ArrayList var0 = new ArrayList();
         var0.add("bat");
         var0.add("cat_black");
         var0.add("cat_red");
         var0.add("cat_siamese");
         var0.add("cavespider");
         var0.add("chicken");
         var0.add("cow");
         var0.add("creeper");
         var0.add("enderman");
         var0.add("enderman_eyes");
         var0.add("fire");
         var0.add("ghast");
         var0.add("ghast_fire");
         var0.add("lava");
         var0.add("ozelot");
         var0.add("pig");
         var0.add("pigman");
         var0.add("pigzombie");
         var0.add("redcow");
         var0.add("saddle");
         var0.add("sheep");
         var0.add("sheep_fur");
         var0.add("silverfish");
         var0.add("skeleton");
         var0.add("skeleton_wither");
         var0.add("slime");
         var0.add("snowman");
         var0.add("spider");
         var0.add("spider_eyes");
         var0.add("squid");
         var0.add("villager");
         var0.add("villager_golem");
         var0.add("wither");
         var0.add("wither_invul");
         var0.add("wolf");
         var0.add("wolf_angry");
         var0.add("wolf_collar");
         var0.add("wolf_tame");
         var0.add("zombie");
         var0.add("zombie_villager");

         for(int var1 = 0; var1 < var0.size(); ++var1) {
            String var2 = (String)var0.get(var1);
            String var3 = "/mob/" + var2 + ".png";
            a(var3, 100);
         }

      }
   }
}
