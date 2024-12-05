public class mod_recettes extends xu {
   public static final pa x;
   public static final pa w;
   public static final pa y;

   public void if() {
      ModLoader.a(x);
      ModLoader.a(y);
      ModLoader.a(w);
      ModLoader.a(new abp(pa.bs, 9), "#", '#', w);
      ModLoader.a(new abp(x, 1), "###", "###", "###", '#', abr.R);
      ModLoader.a(new abp(w, 1), "###", "###", "###", '#', pa.bs);
      ModLoader.a((Object)x, (String)"Bloc Charbon");
      ModLoader.a((Object)w, (String)"Bloc Obsidian");
      ModLoader.a((Object)y, (String)"Bloc Invisible");
   }

   public int a(int var1, int var2) {
      return var1 == x.void ? 16000 : 0;
   }

   public void else() {
   }

   public String do() {
      return "1.4.6";
   }

   static {
      x = (new pa(201, ts.v)).if(5.0F).a(10.0F).a(pa.N).a("CharbonBlock").a(acn.d);
      w = (new pa(203, ts.v)).if(5.0F).a(10.0F).a(pa.N).a("ObsidianBlock").a(acn.d);
      y = (new k(204)).if(5.0F).a(10.0F).a("InvisiBlock");
   }
}
