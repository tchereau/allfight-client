import java.util.Random;

public class mod_onyx extends xu {
   public static final pa g;
   public static final pa q;
   public static final abr r;
   public static final abr j;
   public static final abr l;
   public static final abr n;
   public static final abr m;
   public static final abr k;
   public static final abr o;
   public static final abr h;
   public static final abr i;
   public static final abr p;

   public void if() {
      ModLoader.a(g);
      ModLoader.a(q);
      ModLoader.a(new abp(r, 9), "#", '#', g);
      ModLoader.a(new abp(g, 1), "###", "###", "###", '#', r);
      ModLoader.a(new abp(j, 1), "###", " X ", " X ", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(l, 1), "#", "#", "X", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(m, 1), "#", "X", "X", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(n, 1), "##", "#X ", " X", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(n, 1), "##", "X#", "X ", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(k, 1), "##", " X", " X", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(k, 1), "##", "X ", "X ", '#', r, 'X', abr.a9);
      ModLoader.a(new abp(o, 1), "###", "# #", '#', r);
      ModLoader.a(new abp(h, 1), "# #", "###", "###", '#', r);
      ModLoader.a(new abp(i, 1), "###", "# #", "# #", '#', r);
      ModLoader.a(new abp(p, 1), "# #", "# #", '#', r);
      ModLoader.a((Object)r, (String)"Onyx");
      ModLoader.a((Object)g, (String)"Bloc Onyx");
      ModLoader.a((Object)q, (String)"Onyx Ore");
      ModLoader.a((Object)l, (String)"Épée Onyx");
      ModLoader.a((Object)j, (String)"Pioche Onyx");
      ModLoader.a((Object)n, (String)"Hache Onyx");
      ModLoader.a((Object)m, (String)"Pelle Onyx");
      ModLoader.a((Object)k, (String)"Houe Onyx");
      ModLoader.a((Object)h, (String)"Plastron Onyx");
      ModLoader.a((Object)o, (String)"Casque Onyx");
      ModLoader.a((Object)i, (String)"Jambières Onyx");
      ModLoader.a((Object)p, (String)"Bottes Onyx");
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      for(int var5 = 0; var5 < 6; ++var5) {
         int var6 = var3 + var2.nextInt(8);
         int var7 = var4 + var2.nextInt(4);
         var1.a(var6, var7);
         (new wq(q.void, 2)).a(var1, var2, var6, 20, var7);
      }

   }

   public void case() {
   }

   public String do() {
      return "1.5";
   }

   static {
      g = (new pa(213, ts.v)).if(5.0F).a(10.0F).a(pa.N).a("OnyxBlock").a(acn.d);
      q = (new p9(214)).if(3.0F).a(5.0F).a(pa.N).a("OnyxOre").a(acn.d);
      r = (new abr(1057)).if("Onyx").a(acn.try);
      j = (new abg(1058, abq.a)).if("OnyxPickaxe");
      l = (new aav(1059, abq.a)).if("OnyxSword");
      n = (new abt(1060, abq.a)).if("OnyxAxe");
      m = (new aa6(1061, abq.a)).if("OnyxShovel");
      k = (new abs(1062, abq.a)).if("OnyxHoe");
      o = (new ac4(1063, ac1.a, ModLoader.do("onyx"), 0)).if("OnyxHelmet");
      h = (new ac4(1064, ac1.a, ModLoader.do("onyx"), 1)).if("OnyxChestplate");
      i = (new ac4(1065, ac1.a, ModLoader.do("onyx"), 2)).if("OnyxLeggings");
      p = (new ac4(1066, ac1.a, ModLoader.do("onyx"), 3)).if("OnyxBoots");
   }
}
