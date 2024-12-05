import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class abe extends abr {
   private HashMap c8 = new HashMap();
   private static final Map c7 = new LinkedHashMap();
   private ajd db;
   private ajd da;
   private ajd c9;

   public abe(int var1) {
      super(var1);
      this.if(1);
      this.a(true);
      this.for(0);
      this.a((acn)acn.byte);
   }

   public List goto(abp var1) {
      if (var1.a() && var1.b().try("CustomPotionEffects")) {
         ArrayList var6 = new ArrayList();
         aqm var3 = var1.b().void("CustomPotionEffects");

         for(int var4 = 0; var4 < var3.for(); ++var4) {
            aqv var5 = (aqv)var3.a(var4);
            var6.add(aiz.a(var5));
         }

         return var6;
      } else {
         List var2 = (List)this.c8.get(var1.new());
         if (var2 == null) {
            var2 = aas.a(var1.new(), false);
            this.c8.put(var1.new(), var2);
         }

         return var2;
      }
   }

   public List case(int var1) {
      List var2 = (List)this.c8.get(var1);
      if (var2 == null) {
         var2 = aas.a(var1, false);
         this.c8.put(var1, var2);
      }

      return var2;
   }

   public abp do(abp var1, y6 var2, aek var3) {
      if (!var3.fY.new) {
         --var1.if;
      }

      if (!var2.goto) {
         List var4 = this.goto(var1);
         if (var4 != null) {
            Iterator var5 = var4.iterator();

            while(var5.hasNext()) {
               aiz var6 = (aiz)var5.next();
               var3.for(new aiz(var6));
            }
         }
      }

      if (!var3.fY.new) {
         if (var1.if <= 0) {
            return new abp(abr.at);
         }

         var3.fR.new(new abp(abr.at));
      }

      return var1;
   }

   public int a(abp var1) {
      return 32;
   }

   public aax else(abp var1) {
      return aax.try;
   }

   public abp a(abp var1, y6 var2, aek var3) {
      if (try(var1.new())) {
         if (!var3.fY.new) {
            --var1.if;
         }

         var2.a((aiw)var3, "random.bow", 0.5F, 0.4F / (aj.nextFloat() * 0.4F + 0.8F));
         if (!var2.goto) {
            var2.new(new ad4(var2, var3, var1));
         }

         return var1;
      } else {
         var3.do(var1, this.a(var1));
         return var1;
      }
   }

   public boolean a(abp var1, aek var2, y6 var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   public ajd a(int var1) {
      return try(var1) ? this.db : this.da;
   }

   public ajd a(int var1, int var2) {
      return var2 == 0 ? this.c9 : super.a(var1, var2);
   }

   public static boolean try(int var0) {
      return (var0 & 16384) != 0;
   }

   public int new(int var1) {
      return aas.if(var1, false);
   }

   public int a(abp var1, int var2) {
      return var2 > 0 ? 16777215 : this.new(var1.new());
   }

   public boolean do() {
      return true;
   }

   public boolean byte(int var1) {
      List var2 = this.case(var1);
      if (var2 != null && !var2.isEmpty()) {
         Iterator var3 = var2.iterator();

         aiz var4;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            var4 = (aiz)var3.next();
         } while(!ai0.A[var4.byte()].case());

         return true;
      } else {
         return false;
      }
   }

   public String if(abp var1) {
      if (var1.new() == 0) {
         return aqz.if("item.emptyPotion.name").trim();
      } else {
         String var2 = "";
         if (try(var1.new())) {
            var2 = aqz.if("potion.prefix.grenade").trim() + " ";
         }

         List var3 = abr.av.goto(var1);
         String var4;
         if (var3 != null && !var3.isEmpty()) {
            var4 = ((aiz)var3.get(0)).try();
            var4 = var4 + ".postfix";
            return var2 + aqz.if(var4).trim();
         } else {
            var4 = aas.if(var1.new());
            return aqz.if(var4).trim() + " " + super.if(var1);
         }
      }
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      if (var1.new() != 0) {
         List var5 = abr.av.goto(var1);
         if (var5 != null && !var5.isEmpty()) {
            Iterator var9 = var5.iterator();

            while(var9.hasNext()) {
               aiz var7 = (aiz)var9.next();
               String var8 = aqz.if(var7.try()).trim();
               if (var7.int() > 0) {
                  var8 = var8 + " " + aqz.if("potion.potency." + var7.int()).trim();
               }

               if (var7.do() > 20) {
                  var8 = var8 + " (" + ai0.a(var7) + ")";
               }

               if (ai0.A[var7.byte()].new()) {
                  var3.add(aqj.d + var8);
               } else {
                  var3.add(aqj.i + var8);
               }
            }
         } else {
            String var6 = aqz.if("potion.empty").trim();
            var3.add(aqj.i + var6);
         }

      }
   }

   public boolean do(abp var1) {
      List var2 = this.goto(var1);
      return var2 != null && !var2.isEmpty();
   }

   public void a(int var1, acn var2, List var3) {
      super.a(var1, var2, var3);
      int var5;
      if (c7.isEmpty()) {
         for(int var4 = 0; var4 <= 15; ++var4) {
            for(var5 = 0; var5 <= 1; ++var5) {
               int var6;
               if (var5 == 0) {
                  var6 = var4 | 8192;
               } else {
                  var6 = var4 | 16384;
               }

               for(int var7 = 0; var7 <= 2; ++var7) {
                  int var8 = var6;
                  if (var7 != 0) {
                     if (var7 == 1) {
                        var8 = var6 | 32;
                     } else if (var7 == 2) {
                        var8 = var6 | 64;
                     }
                  }

                  List var9 = aas.a(var8, false);
                  if (var9 != null && !var9.isEmpty()) {
                     c7.put(var9, var8);
                  }
               }
            }
         }
      }

      Iterator var10 = c7.values().iterator();

      while(var10.hasNext()) {
         var5 = (Integer)var10.next();
         var3.add(new abp(var1, 1, var5));
      }

   }

   public void a(ajc var1) {
      this.da = var1.a("potion");
      this.db = var1.a("potion_splash");
      this.c9 = var1.a("potion_contents");
   }

   public static ajd for(String var0) {
      if (var0 == "potion") {
         return abr.av.da;
      } else if (var0 == "potion_splash") {
         return abr.av.db;
      } else {
         return var0 == "potion_contents" ? abr.av.c9 : null;
      }
   }
}
