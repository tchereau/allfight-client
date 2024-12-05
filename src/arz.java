import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class arz {
   private static final Pattern if = Pattern.compile("^@([parf])(?:\\[([\\w=,!-]*)\\])?$");
   private static final Pattern a = Pattern.compile("\\G([-!]?\\w*)(?:$|,)");
   private static final Pattern do = Pattern.compile("\\G(\\w+)=([-!]?\\w*)(?:$|,)");

   public static ak2 if(ar0 var0, String var1) {
      ak2[] var2 = a(var0, var1);
      return var2 != null && var2.length == 1 ? var2[0] : null;
   }

   public static String do(ar0 var0, String var1) {
      ak2[] var2 = a(var0, var1);
      if (var2 != null && var2.length != 0) {
         String[] var3 = new String[var2.length];

         for(int var4 = 0; var4 < var3.length; ++var4) {
            var3[var4] = var2[var4].at();
         }

         return ao8.a((Object[])var3);
      } else {
         return null;
      }
   }

   public static ak2[] a(ar0 var0, String var1) {
      Matcher var2 = if.matcher(var1);
      if (var2.matches()) {
         Map var3 = do(var2.group(2));
         String var4 = var2.group(1);
         int var5 = byte(var4);
         int var6 = int(var4);
         int var7 = a(var4);
         int var8 = if(var4);
         int var9 = try(var4);
         int var10 = yz.if.new();
         apg var11 = var0.for();
         Map var12 = a(var3);
         String var13 = null;
         String var14 = null;
         if (var3.containsKey("rm")) {
            var5 = ajs.a((String)var3.get("rm"), var5);
         }

         if (var3.containsKey("r")) {
            var6 = ajs.a((String)var3.get("r"), var6);
         }

         if (var3.containsKey("lm")) {
            var7 = ajs.a((String)var3.get("lm"), var7);
         }

         if (var3.containsKey("l")) {
            var8 = ajs.a((String)var3.get("l"), var8);
         }

         if (var3.containsKey("x")) {
            var11.if = ajs.a((String)var3.get("x"), var11.if);
         }

         if (var3.containsKey("y")) {
            var11.a = ajs.a((String)var3.get("y"), var11.a);
         }

         if (var3.containsKey("z")) {
            var11.do = ajs.a((String)var3.get("z"), var11.do);
         }

         if (var3.containsKey("m")) {
            var10 = ajs.a((String)var3.get("m"), var10);
         }

         if (var3.containsKey("c")) {
            var9 = ajs.a((String)var3.get("c"), var9);
         }

         if (var3.containsKey("team")) {
            var14 = (String)var3.get("team");
         }

         if (var3.containsKey("name")) {
            var13 = (String)var3.get("name");
         }

         List var15;
         if (!var4.equals("p") && !var4.equals("a")) {
            if (!var4.equals("r")) {
               return null;
            } else {
               var15 = net.minecraft.a.a.g2().g6().a(var11, var5, var6, 0, var10, var7, var8, var12, var13, var14);
               Collections.shuffle(var15);
               var15 = var15.subList(0, Math.min(var9, var15.size()));
               return var15 != null && !var15.isEmpty() ? (ak2[])var15.toArray(new ak2[0]) : new ak2[0];
            }
         } else {
            var15 = net.minecraft.a.a.g2().g6().a(var11, var5, var6, var9, var10, var7, var8, var12, var13, var14);
            return var15 != null && !var15.isEmpty() ? (ak2[])var15.toArray(new ak2[0]) : new ak2[0];
         }
      } else {
         return null;
      }
   }

   public static Map a(Map var0) {
      HashMap var1 = new HashMap();
      Iterator var2 = var0.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         if (var3.startsWith("score_") && var3.length() > "score_".length()) {
            String var4 = var3.substring("score_".length());
            var1.put(var4, ajs.a((String)var0.get(var3), 1));
         }
      }

      return var1;
   }

   public static boolean new(String var0) {
      Matcher var1 = if.matcher(var0);
      if (var1.matches()) {
         Map var2 = do(var1.group(2));
         String var3 = var1.group(1);
         int var4 = try(var3);
         if (var2.containsKey("c")) {
            var4 = ajs.a((String)var2.get("c"), var4);
         }

         return var4 != 1;
      } else {
         return false;
      }
   }

   public static boolean a(String var0, String var1) {
      Matcher var2 = if.matcher(var0);
      if (var2.matches()) {
         String var3 = var2.group(1);
         return var1 == null || var1.equals(var3);
      } else {
         return false;
      }
   }

   public static boolean for(String var0) {
      return a((String)var0, (String)null);
   }

   private static final int byte(String var0) {
      return 0;
   }

   private static final int int(String var0) {
      return 0;
   }

   private static final int if(String var0) {
      return Integer.MAX_VALUE;
   }

   private static final int a(String var0) {
      return 0;
   }

   private static final int try(String var0) {
      return var0.equals("a") ? 0 : 1;
   }

   private static Map do(String var0) {
      HashMap var1 = new HashMap();
      if (var0 == null) {
         return var1;
      } else {
         Matcher var2 = a.matcher(var0);
         int var3 = 0;

         int var4;
         for(var4 = -1; var2.find(); var4 = var2.end()) {
            String var5 = null;
            switch(var3++) {
            case 0:
               var5 = "x";
               break;
            case 1:
               var5 = "y";
               break;
            case 2:
               var5 = "z";
               break;
            case 3:
               var5 = "r";
            }

            if (var5 != null && var2.group(1).length() > 0) {
               var1.put(var5, var2.group(1));
            }
         }

         if (var4 < var0.length()) {
            var2 = do.matcher(var4 == -1 ? var0 : var0.substring(var4));

            while(var2.find()) {
               var1.put(var2.group(1), var2.group(2));
            }
         }

         return var1;
      }
   }
}
