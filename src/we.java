import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class we {
   private final List if = new ArrayList();
   private final Map a = new HashMap();
   private int do = 0;

   public int int() {
      return this.do;
   }

   public void a(int var1) {
      this.do = var1;
   }

   public Map if() {
      return this.a;
   }

   public List a() {
      return this.if;
   }

   public void for() {
      int var1 = 0;

      wd var3;
      for(Iterator var2 = this.if.iterator(); var2.hasNext(); var1 += var3.do()) {
         var3 = (wd)var2.next();
         var3.a(var1);
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(2);
      var1.append(";");

      int var2;
      for(var2 = 0; var2 < this.if.size(); ++var2) {
         if (var2 > 0) {
            var1.append(",");
         }

         var1.append(((wd)this.if.get(var2)).toString());
      }

      var1.append(";");
      var1.append(this.do);
      if (!this.a.isEmpty()) {
         var1.append(";");
         var2 = 0;
         Iterator var3 = this.a.entrySet().iterator();

         while(true) {
            Map var5;
            do {
               if (!var3.hasNext()) {
                  return var1.toString();
               }

               Entry var4 = (Entry)var3.next();
               if (var2++ > 0) {
                  var1.append(",");
               }

               var1.append(((String)var4.getKey()).toLowerCase());
               var5 = (Map)var4.getValue();
            } while(var5.isEmpty());

            var1.append("(");
            int var6 = 0;
            Iterator var7 = var5.entrySet().iterator();

            while(var7.hasNext()) {
               Entry var8 = (Entry)var7.next();
               if (var6++ > 0) {
                  var1.append(" ");
               }

               var1.append((String)var8.getKey());
               var1.append("=");
               var1.append((String)var8.getValue());
            }

            var1.append(")");
         }
      } else {
         var1.append(";");
         return var1.toString();
      }
   }

   private static wd a(String var0, int var1) {
      String[] var2 = var0.split("x", 2);
      int var3 = 1;
      int var5 = 0;
      if (var2.length == 2) {
         try {
            var3 = Integer.parseInt(var2[0]);
            if (var1 + var3 >= 256) {
               var3 = 256 - var1;
            }

            if (var3 < 0) {
               var3 = 0;
            }
         } catch (Throwable var7) {
            return null;
         }
      }

      int var4;
      try {
         String var6 = var2[var2.length - 1];
         var2 = var6.split(":", 2);
         var4 = Integer.parseInt(var2[0]);
         if (var2.length > 1) {
            var5 = Integer.parseInt(var2[1]);
         }

         if (pa.x[var4] == null) {
            var4 = 0;
            var5 = 0;
         }

         if (var5 < 0 || var5 > 15) {
            var5 = 0;
         }
      } catch (Throwable var8) {
         return null;
      }

      wd var9 = new wd(var3, var4, var5);
      var9.a(var1);
      return var9;
   }

   private static List if(String var0) {
      if (var0 != null && var0.length() >= 1) {
         ArrayList var1 = new ArrayList();
         String[] var2 = var0.split(",");
         int var3 = 0;
         String[] var4 = var2;
         int var5 = var2.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            wd var8 = a(var7, var3);
            if (var8 == null) {
               return null;
            }

            var1.add(var8);
            var3 += var8.do();
         }

         return var1;
      } else {
         return null;
      }
   }

   public static we a(String var0) {
      if (var0 == null) {
         return do();
      } else {
         String[] var1 = var0.split(";", -1);
         int var2 = var1.length == 1 ? 0 : ajs.a(var1[0], 0);
         if (var2 >= 0 && var2 <= 2) {
            we var3 = new we();
            int var4 = var1.length == 1 ? 0 : 1;
            List var5 = if(var1[var4++]);
            if (var5 != null && !var5.isEmpty()) {
               var3.a().addAll(var5);
               var3.for();
               int var6 = yn.E.try;
               if (var2 > 0 && var1.length > var4) {
                  var6 = ajs.a(var1[var4++], var6);
               }

               var3.a(var6);
               if (var2 > 0 && var1.length > var4) {
                  String[] var7 = var1[var4++].toLowerCase().split(",");
                  String[] var8 = var7;
                  int var9 = var7.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     String var11 = var8[var10];
                     String[] var12 = var11.split("\\(", 2);
                     HashMap var13 = new HashMap();
                     if (var12[0].length() > 0) {
                        var3.if().put(var12[0], var13);
                        if (var12.length > 1 && var12[1].endsWith(")") && var12[1].length() > 1) {
                           String[] var14 = var12[1].substring(0, var12[1].length() - 1).split(" ");

                           for(int var15 = 0; var15 < var14.length; ++var15) {
                              String[] var16 = var14[var15].split("=", 2);
                              if (var16.length == 2) {
                                 var13.put(var16[0], var16[1]);
                              }
                           }
                        }
                     }
                  }
               } else {
                  var3.if().put("village", new HashMap());
               }

               return var3;
            } else {
               return do();
            }
         } else {
            return do();
         }
      }
   }

   public static we do() {
      we var0 = new we();
      var0.a(yn.E.try);
      var0.a().add(new wd(1, pa.bc.void));
      var0.a().add(new wd(2, pa.g.void));
      var0.a().add(new wd(1, pa.i.void));
      var0.for();
      var0.if().put("village", new HashMap());
      return var0;
   }
}
