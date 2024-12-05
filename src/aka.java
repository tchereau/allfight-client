import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class aka {
   protected static Map u = new HashMap();
   public static List t = new ArrayList();
   public static List s = new ArrayList();
   public static List r = new ArrayList();
   public static List q = new ArrayList();
   public static akf p = (new aki(1000, "stat.startGame")).if().new();
   public static akf o = (new aki(1001, "stat.createWorld")).if().new();
   public static akf n = (new aki(1002, "stat.loadWorld")).if().new();
   public static akf m = (new aki(1003, "stat.joinMultiplayer")).if().new();
   public static akf l = (new aki(1004, "stat.leaveGame")).if().new();
   public static akf k;
   public static akf j;
   public static akf i;
   public static akf h;
   public static akf g;
   public static akf f;
   public static akf d;
   public static akf b;
   public static akf long;
   public static akf else;
   public static akf case;
   public static akf try;
   public static akf int;
   public static akf do;
   public static akf if;
   public static akf a;
   public static akf e;
   public static akf c;
   public static akf[] void;
   public static akf[] goto;
   public static akf[] char;
   public static akf[] byte;
   private static boolean new;
   private static boolean for;

   public static void if() {
   }

   public static void a() {
      char = a(char, "stat.useItem", 16908288, 0, 256);
      byte = if(byte, "stat.breakItem", 16973824, 0, 256);
      new = true;
      do();
   }

   public static void for() {
      char = a(char, "stat.useItem", 16908288, 256, 32000);
      byte = if(byte, "stat.breakItem", 16973824, 256, 32000);
      for = true;
      do();
   }

   public static void do() {
      if (new && for) {
         HashSet var0 = new HashSet();
         Iterator var1 = aai.if().a().iterator();

         while(var1.hasNext()) {
            aag var2 = (aag)var1.next();
            if (var2.a() != null) {
               var0.add(var2.a().new);
            }
         }

         var1 = aam.if().a().values().iterator();

         while(var1.hasNext()) {
            abp var4 = (abp)var1.next();
            var0.add(var4.new);
         }

         goto = new akf[32000];
         var1 = var0.iterator();

         while(var1.hasNext()) {
            Integer var5 = (Integer)var1.next();
            if (abr.ai[var5] != null) {
               String var3 = aqz.a("stat.craftItem", abr.ai[var5].new());
               goto[var5] = (new akh(16842752 + var5, var3, var5)).new();
            }
         }

         a(goto);
      }
   }

   private static akf[] a(String var0, int var1) {
      akf[] var2 = new akf[256];

      for(int var3 = 0; var3 < 256; ++var3) {
         if (pa.x[var3] != null && pa.x[var3].byte()) {
            String var4 = aqz.a(var0, pa.x[var3].p());
            var2[var3] = (new akh(var1 + var3, var4, var3)).new();
            q.add((akh)var2[var3]);
         }
      }

      a(var2);
      return var2;
   }

   private static akf[] a(akf[] var0, String var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0 = new akf[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if (abr.ai[var5] != null) {
            String var6 = aqz.a(var1, abr.ai[var5].new());
            var0[var5] = (new akh(var2 + var5, var6, var5)).new();
            if (var5 >= 256) {
               r.add((akh)var0[var5]);
            }
         }
      }

      a(var0);
      return var0;
   }

   private static akf[] if(akf[] var0, String var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0 = new akf[32000];
      }

      for(int var5 = var3; var5 < var4; ++var5) {
         if (abr.ai[var5] != null && abr.ai[var5].char()) {
            String var6 = aqz.a(var1, abr.ai[var5].new());
            var0[var5] = (new akh(var2 + var5, var6, var5)).new();
         }
      }

      a(var0);
      return var0;
   }

   private static void a(akf[] var0) {
      a(var0, pa.ba.void, pa.bb.void);
      a(var0, pa.a4.void, pa.a4.void);
      a(var0, pa.aH.void, pa.aW.void);
      a(var0, pa.cq.void, pa.cr.void);
      a(var0, pa.ce.void, pa.cf.void);
      a(var0, pa.ay.void, pa.aB.void);
      a(var0, pa.cc.void, pa.cd.void);
      a(var0, pa.bL.void, pa.bN.void);
      a(var0, pa.bF.void, pa.bD.void);
      a(var0, pa.by.void, pa.bw.void);
      a(var0, pa.i.void, pa.g.void);
      a(var0, pa.cs.void, pa.g.void);
   }

   private static void a(akf[] var0, int var1, int var2) {
      if (var0[var1] != null && var0[var2] == null) {
         var0[var2] = var0[var1];
      } else {
         t.remove(var0[var1]);
         q.remove(var0[var1]);
         s.remove(var0[var1]);
         var0[var1] = var0[var2];
      }
   }

   public static akf a(int var0) {
      return (akf)u.get(var0);
   }

   static {
      k = (new aki(1100, "stat.playOneMinute", akf.if)).if().new();
      j = (new aki(2000, "stat.walkOneCm", akf.a)).if().new();
      i = (new aki(2001, "stat.swimOneCm", akf.a)).if().new();
      h = (new aki(2002, "stat.fallOneCm", akf.a)).if().new();
      g = (new aki(2003, "stat.climbOneCm", akf.a)).if().new();
      f = (new aki(2004, "stat.flyOneCm", akf.a)).if().new();
      d = (new aki(2005, "stat.diveOneCm", akf.a)).if().new();
      b = (new aki(2006, "stat.minecartOneCm", akf.a)).if().new();
      long = (new aki(2007, "stat.boatOneCm", akf.a)).if().new();
      else = (new aki(2008, "stat.pigOneCm", akf.a)).if().new();
      case = (new aki(2010, "stat.jump")).if().new();
      try = (new aki(2011, "stat.drop")).if().new();
      int = (new aki(2020, "stat.damageDealt")).new();
      do = (new aki(2021, "stat.damageTaken")).new();
      if = (new aki(2022, "stat.deaths")).new();
      a = (new aki(2023, "stat.mobKills")).new();
      e = (new aki(2024, "stat.playerKills")).new();
      c = (new aki(2025, "stat.fishCaught")).new();
      void = a("stat.mineBlock", 16777216);
      akk.a();
      new = false;
      for = false;
   }
}
