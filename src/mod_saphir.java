import java.util.Random;

public class mod_saphir extends xu {
   public static final pa I;
   public static final pa C;
   public static final abr L;
   public static final abr K;
   public static final abr D;
   public static final abr A;
   public static final abr B;
   public static final abr J;
   public static final abr F;
   public static final abr z;
   public static final abr E;
   public static final abr H;
   public static final l G;

   public void if() {
      ModLoader.a(I);
      ModLoader.a(C);
      ModLoader.a(new abp(L, 9), "#", '#', I);
      ModLoader.a(new abp(I, 1), "###", "###", "###", '#', L);
      ModLoader.a(new abp(K, 1), "###", " X ", " X ", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(D, 1), "#", "#", "X", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(B, 1), "#", "X", "X", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(A, 1), "##", "#X ", " X", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(A, 1), "##", "X#", "X ", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(J, 1), "##", " X", " X", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(J, 1), "##", "X ", "X ", '#', L, 'X', abr.a9);
      ModLoader.a(new abp(F, 1), "###", "# #", '#', L);
      ModLoader.a(new abp(z, 1), "# #", "###", "###", '#', L);
      ModLoader.a(new abp(E, 1), "###", "# #", "# #", '#', L);
      ModLoader.a(new abp(H, 1), "# #", "# #", '#', L);
      ModLoader.a(new abp(G, 1), " XY", "# Y", " XY", '#', L, 'Y', abr.aW, 'X', abr.a9);
      ModLoader.a((Object)L, (String)"Saphir");
      ModLoader.a((Object)I, (String)"Bloc Saphir");
      ModLoader.a((Object)C, (String)"Saphir Ore");
      ModLoader.a((Object)D, (String)"Épée Saphir");
      ModLoader.a((Object)K, (String)"Pioche Saphir");
      ModLoader.a((Object)A, (String)"Hache Saphir");
      ModLoader.a((Object)B, (String)"Pelle Saphir");
      ModLoader.a((Object)J, (String)"Houe Saphir");
      ModLoader.a((Object)z, (String)"Plastron Saphir");
      ModLoader.a((Object)F, (String)"Casque Saphir");
      ModLoader.a((Object)E, (String)"Jambières Saphir");
      ModLoader.a((Object)H, (String)"Bottes Saphir");
      ModLoader.a((Object)G, (String)"Arc Saphir");
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      for(int var5 = 0; var5 < 7; ++var5) {
         int var6 = var3 + var2.nextInt(4);
         int var7 = var4 + var2.nextInt(4);
         var1.a(var6, var7);
         (new wq(C.void, 2)).a(var1, var2, var6, 20, var7);
      }

   }

   public void goto() {
   }

   public String do() {
      return "1.5";
   }

   static {
      I = (new pa(183, ts.v)).if(5.0F).a(10.0F).a(pa.N).a("SaphirBlock").a(acn.d);
      C = (new p9(184)).if(3.0F).a(5.0F).a(pa.N).a("SaphirOre").a(acn.d);
      L = (new abr(1036)).if("Saphir").a(acn.try);
      K = (new abg(1037, abq.long)).if("SaphirPickaxe");
      D = (new aav(1038, abq.long)).if("SaphirSword");
      A = (new abt(1039, abq.long)).if("SaphirAxe");
      B = (new aa6(1040, abq.long)).if("SaphirShovel");
      J = (new abs(1041, abq.long)).if("SaphirHoe");
      F = (new ac4(1042, ac1.char, ModLoader.do("saphir"), 0)).if("SaphirHelmet");
      z = (new ac4(1043, ac1.char, ModLoader.do("saphir"), 1)).if("SaphirChestplate");
      E = (new ac4(1044, ac1.char, ModLoader.do("saphir"), 2)).if("SaphirLeggings");
      H = (new ac4(1045, ac1.char, ModLoader.do("saphir"), 3)).if("SaphirBoots");
      G = (l)(new l(1046)).if("SaphirBow");
   }
}
