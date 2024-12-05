public class mod_ninja extends xu {
   public static final abr t;
   public static final abr u;
   public static final abr s;
   public static final abr v;

   public void if() {
      ModLoader.a((Object)u, (String)"Haut du Ninja");
      ModLoader.a((Object)t, (String)"Bandeau du Ninja");
      ModLoader.a((Object)s, (String)"Pantalon du Ninja");
      ModLoader.a((Object)v, (String)"Chaussures du Ninja");
   }

   public void char() {
   }

   public String do() {
      return "1.5";
   }

   static {
      t = (new ac4(1067, ac1.long, ModLoader.do("ninja"), 0)).if("NinjaHelmet").a((acn)null);
      u = (new ac4(1068, ac1.long, ModLoader.do("ninja"), 1)).if("NinjaChest").a((acn)null);
      s = (new ac4(1069, ac1.long, ModLoader.do("ninja"), 2)).if("NinjaLegs").a((acn)null);
      v = (new ac4(1070, ac1.long, ModLoader.do("ninja"), 3)).if("NinjaBoots").a((acn)null);
   }
}
