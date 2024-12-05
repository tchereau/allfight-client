public class mod_gladiateur extends xu {
   public static final abr f;
   public static final abr d;
   public static final abr e;
   public static final abr c;

   public void if() {
      ModLoader.a((Object)d, (String)"Plastron du Gladiateur");
      ModLoader.a((Object)f, (String)"Casque du Gladiateur");
      ModLoader.a((Object)e, (String)"Jambières du Gladiateur");
      ModLoader.a((Object)c, (String)"Bottes du Gladiateur");
   }

   public void byte() {
   }

   public String do() {
      return "1.5";
   }

   static {
      f = (new ac4(1047, ac1.void, ModLoader.do("gladiateur"), 0)).if("GladiateurHelmet");
      d = (new ac4(1048, ac1.void, ModLoader.do("gladiateur"), 1)).if("GladiateurChestplate");
      e = (new ac4(1049, ac1.void, ModLoader.do("gladiateur"), 2)).if("GladiateurLeggings");
      c = (new ac4(1050, ac1.void, ModLoader.do("gladiateur"), 3)).if("GladiateurBoots");
   }
}
