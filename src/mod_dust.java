public class mod_dust extends xu {
   public static abr if;
   public static abr do;
   public static abr int;
   public static abr a;
   public static abr for;

   public void if() {
      ModLoader.a(new abp(for, 1), "###", " # ", " # ", '#', mod_saphir.L);
      ModLoader.a(new abp(if, 2), "#", '#', mod_saphir.L);
      ModLoader.a(new abp(do, 2), "#", '#', mod_rubis.ao);
      ModLoader.a(new abp(int, 1), "#X#", '#', do, 'X', new abp(abr.b9, 1, 3));
      ModLoader.a(new abp(a, 1), "#X#", '#', if, 'X', new abp(abr.b9, 1, 3));
      ModLoader.a((Object)do, (String)"Poudre de Rubis");
      ModLoader.a((Object)if, (String)"Poudre de Saphir");
      ModLoader.a((Object)int, (String)"SuperCookie");
      ModLoader.a((Object)a, (String)"SupraCookie");
      ModLoader.a((Object)for, (String)"Sceptre de soin");
   }

   public void new() {
   }

   public String do() {
      return "1.5";
   }

   static {
      if = (new abr(1051)).if("SaphirDust").a(acn.try);
      do = (new abr(1052)).if("RubisDust").a(acn.try);
      int = (new f(1053, 6, 0.1F, false, 1)).B().if("SuperCookie");
      a = (new f(1054, 8, 0.1F, false, 2)).B().if("SupraCookie");
      for = (new abh(1055, abq.long)).if("McScepter");
   }
}
