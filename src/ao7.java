import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ao7 implements ar1 {
   private final Map if = new HashMap();
   private final Set a = new HashSet();

   public int a(ar0 var1, String var2) {
      var2 = var2.trim();
      if (var2.startsWith("/")) {
         var2 = var2.substring(1);
      }

      String[] var3 = var2.split(" ");
      String var4 = var3[0];
      var3 = a(var3);
      ao6 var5 = (ao6)this.if.get(var4);
      int var6 = this.a(var5, var3);
      int var7 = 0;

      try {
         if (var5 == null) {
            throw new are();
         }

         if (var5.a(var1)) {
            if (var6 > -1) {
               ak2[] var8 = arz.a(var1, var3[var6]);
               String var9 = var3[var6];
               ak2[] var10 = var8;
               int var11 = var8.length;

               for(int var12 = 0; var12 < var11; ++var12) {
                  ak2 var13 = var10[var12];
                  var3[var6] = var13.aB();

                  try {
                     var5.if(var1, var3);
                     ++var7;
                  } catch (ari var15) {
                     var1.a(aqj.d + var1.a(var15.getMessage(), var15.a()));
                  }
               }

               var3[var6] = var9;
            } else {
               var5.if(var1, var3);
               ++var7;
            }
         } else {
            var1.a("" + aqj.d + "You do not have permission to use this command.");
         }
      } catch (ard var16) {
         var1.a(aqj.d + var1.a("commands.generic.usage", var1.a(var16.getMessage(), var16.a())));
      } catch (ari var17) {
         var1.a(aqj.d + var1.a(var17.getMessage(), var17.a()));
      } catch (Throwable var18) {
         var1.a(aqj.d + var1.a("commands.generic.exception"));
         var18.printStackTrace();
      }

      return var7;
   }

   public ao6 a(ao6 var1) {
      List var2 = var1.a();
      this.if.put(var1.if(), var1);
      this.a.add(var1);
      if (var2 != null) {
         Iterator var3 = var2.iterator();

         while(true) {
            String var4;
            ao6 var5;
            do {
               if (!var3.hasNext()) {
                  return var1;
               }

               var4 = (String)var3.next();
               var5 = (ao6)this.if.get(var4);
            } while(var5 != null && var5.if().equals(var4));

            this.if.put(var4, var1);
         }
      } else {
         return var1;
      }
   }

   private static String[] a(String[] var0) {
      String[] var1 = new String[var0.length - 1];

      for(int var2 = 1; var2 < var0.length; ++var2) {
         var1[var2 - 1] = var0[var2];
      }

      return var1;
   }

   public List if(ar0 var1, String var2) {
      String[] var3 = var2.split(" ", -1);
      String var4 = var3[0];
      if (var3.length == 1) {
         ArrayList var8 = new ArrayList();
         Iterator var6 = this.if.entrySet().iterator();

         while(var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            if (ao8.a(var4, (String)var7.getKey()) && ((ao6)var7.getValue()).a(var1)) {
               var8.add(var7.getKey());
            }
         }

         return var8;
      } else {
         if (var3.length > 1) {
            ao6 var5 = (ao6)this.if.get(var4);
            if (var5 != null) {
               return var5.a(var1, a(var3));
            }
         }

         return null;
      }
   }

   public List a(ar0 var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.a.iterator();

      while(var3.hasNext()) {
         ao6 var4 = (ao6)var3.next();
         if (var4.a(var1)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public Map a() {
      return this.if;
   }

   private int a(ao6 var1, String[] var2) {
      if (var1 == null) {
         return -1;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var1.a(var2, var3) && arz.new(var2[var3])) {
               return var3;
            }
         }

         return -1;
      }
   }
}
