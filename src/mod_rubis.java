import java.util.Random;

public class mod_rubis extends xu {
   public static final pa an;
   public static final pa av;
   public static final abr ao;
   public static final abr am;
   public static final abr au;
   public static final abr as;
   public static final abr aw;
   public static final abr aq;
   public static final abr al;
   public static final abr at;
   public static final abr ar;
   public static final abr ak;
   public static final ac8 ap;

   public void if() {
      ModLoader.a(an);
      ModLoader.a(av);
      ModLoader.a(new abp(ao, 9), "#", '#', an);
      ModLoader.a(new abp(an, 1), "###", "###", "###", '#', ao);
      ModLoader.a(new abp(am, 1), "###", " X ", " X ", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(au, 1), "#", "#", "X", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(aw, 1), "#", "X", "X", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(as, 1), "##", "#X ", " X", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(as, 1), "##", "X#", "X ", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(aq, 1), "##", " X", " X", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(aq, 1), "##", "X ", "X ", '#', ao, 'X', abr.a9);
      ModLoader.a(new abp(al, 1), "###", "# #", '#', ao);
      ModLoader.a(new abp(at, 1), "# #", "###", "###", '#', ao);
      ModLoader.a(new abp(ar, 1), "###", "# #", "# #", '#', ao);
      ModLoader.a(new abp(ak, 1), "# #", "# #", '#', ao);
      ModLoader.a(new abp(ap, 1), " XY", "# Y", " XY", '#', ao, 'Y', abr.aW, 'X', abr.a9);
      ModLoader.a((Object)ao, (String)"Rubis");
      ModLoader.a((Object)an, (String)"Bloc Rubis");
      ModLoader.a((Object)av, (String)"Rubis Ore");
      ModLoader.a((Object)au, (String)"Épée Rubis");
      ModLoader.a((Object)am, (String)"Pioche Rubis");
      ModLoader.a((Object)as, (String)"Hache Rubis");
      ModLoader.a((Object)aw, (String)"Pelle Rubis");
      ModLoader.a((Object)aq, (String)"Houe Rubis");
      ModLoader.a((Object)at, (String)"Plastron Rubis");
      ModLoader.a((Object)al, (String)"Casque Rubis");
      ModLoader.a((Object)ar, (String)"Jambières Rubis");
      ModLoader.a((Object)ak, (String)"Bottes Rubis");
      ModLoader.a((Object)ap, (String)"Arc Rubis");
   }

   public void a(y6 var1, Random var2, int var3, int var4) {
      for(int var5 = 0; var5 < 8; ++var5) {
         int var6 = var3 + var2.nextInt(8);
         int var7 = var4 + var2.nextInt(4);
         var1.a(var6, var7);
         (new wq(av.void, 2)).a(var1, var2, var6, 20, var7);
      }

   }

   public void void() {
   }

   public String do() {
      return "1.5";
   }

   static {
      an = (new pa(181, ts.v)).if(5.0F).a(10.0F).a(pa.N).a("RubisBlock").a(acn.d);
      av = (new p9(182)).if(3.0F).a(5.0F).a(pa.N).a("RubisOre").a(acn.d);
      ao = (new abr(1015)).if("Rubis").a(acn.try);
      am = (new abg(1016, abq.a)).if("RubisPickaxe");
      au = (new aav(1017, abq.a)).if("RubisSword");
      as = (new abt(1018, abq.a)).if("RubisAxe");
      aw = (new aa6(1019, abq.a)).if("RubisShovel");
      aq = (new abs(1020, abq.a)).if("RubisHoe");
      al = (new ac4(1021, ac1.a, ModLoader.do("rubis"), 0)).if("RubisHelmet");
      at = (new ac4(1022, ac1.a, ModLoader.do("rubis"), 1)).if("RubisChestplate");
      ar = (new ac4(1023, ac1.a, ModLoader.do("rubis"), 2)).if("RubisLeggings");
      ak = (new ac4(1024, ac1.a, ModLoader.do("rubis"), 3)).if("RubisBoots");
      ap = (ac8)(new ac8(1025)).if("RubisBow");
   }
}
