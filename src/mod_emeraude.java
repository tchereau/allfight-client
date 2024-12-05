public class mod_emeraude extends xu {
   public static final abr long;
   public static final abr char;
   public static final abr byte;
   public static final abr try;
   public static final abr new;
   public static final abr else;
   public static final abr b;
   public static final abr case;
   public static final abr goto;
   public static final ahm void;

   public void if() {
      ModLoader.a(new abp(long, 1), "###", " X ", " X ", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(char, 1), "#", "#", "X", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(try, 1), "#", "X", "X", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(byte, 1), "##", "#X ", " X", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(byte, 1), "##", "X#", "X ", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(new, 1), "##", " X", " X", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(new, 1), "##", "X ", "X ", '#', abr.bP, 'X', abr.a9);
      ModLoader.a(new abp(else, 1), "###", "# #", '#', abr.bP);
      ModLoader.a(new abp(b, 1), "# #", "###", "###", '#', abr.bP);
      ModLoader.a(new abp(case, 1), "###", "# #", "# #", '#', abr.bP);
      ModLoader.a(new abp(goto, 1), "# #", "# #", '#', abr.bP);
      ModLoader.a(new abp(void, 1), " XY", "# Y", " XY", '#', abr.bP, 'Y', abr.aW, 'X', abr.a9);
      ModLoader.a((Object)char, (String)"Épée Émeraude");
      ModLoader.a((Object)long, (String)"Pioche Émeraude");
      ModLoader.a((Object)byte, (String)"Hache Émeraude");
      ModLoader.a((Object)try, (String)"Pelle Émeraude");
      ModLoader.a((Object)new, (String)"Houe Émeraude");
      ModLoader.a((Object)b, (String)"Plastron Émeraude");
      ModLoader.a((Object)else, (String)"Casque Émeraude");
      ModLoader.a((Object)case, (String)"Jambières Émeraude");
      ModLoader.a((Object)goto, (String)"Bottes Émeraude");
      ModLoader.a((Object)void, (String)"Arc Émeraude");
   }

   public void try() {
   }

   public String do() {
      return "1.5";
   }

   static {
      long = (new abg(1026, abq.if)).if("EmeraudePickaxe");
      char = (new aav(1027, abq.if)).if("EmeraudeSword");
      byte = (new abt(1028, abq.if)).if("EmeraudeAxe");
      try = (new aa6(1029, abq.if)).if("EmeraudeShovel");
      new = (new abs(1030, abq.if)).if("EmeraudeHoe");
      else = (new ac4(1031, ac1.if, ModLoader.do("emeraude"), 0)).if("EmeraudeHelmet");
      b = (new ac4(1032, ac1.if, ModLoader.do("emeraude"), 1)).if("EmeraudeChestplate");
      case = (new ac4(1033, ac1.if, ModLoader.do("emeraude"), 2)).if("EmeraudeLeggings");
      goto = (new ac4(1034, ac1.if, ModLoader.do("emeraude"), 3)).if("EmeraudeBoots");
      void = (ahm)(new ahm(1035)).if("EmeraudeBow");
   }
}
