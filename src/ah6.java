public enum ah6 {
   w("Kebab", 16, 16, 0, 0),
   v("Aztec", 16, 16, 16, 0),
   u("Alban", 16, 16, 32, 0),
   s("Aztec2", 16, 16, 48, 0),
   r("Bomb", 16, 16, 64, 0),
   q("Plant", 16, 16, 80, 0),
   p("Wasteland", 16, 16, 96, 0),
   o("Pool", 32, 16, 0, 32),
   n("Courbet", 32, 16, 32, 32),
   m("Sea", 32, 16, 64, 32),
   l("Sunset", 32, 16, 96, 32),
   k("Creebet", 32, 16, 128, 32),
   j("Wanderer", 16, 32, 0, 64),
   i("Graham", 16, 32, 16, 64),
   h("Match", 32, 32, 0, 128),
   g("Bust", 32, 32, 32, 128),
   f("Stage", 32, 32, 64, 128),
   e("Void", 32, 32, 96, 128),
   d("SkullAndRoses", 32, 32, 128, 128),
   c("Wither", 32, 32, 160, 128),
   b("Fighters", 64, 32, 0, 96),
   void("Pointer", 64, 64, 0, 192),
   long("Pigscene", 64, 64, 64, 192),
   goto("BurningSkull", 64, 64, 128, 192),
   byte("RAM", 64, 64, 192, 192),
   else("DaftPunk", 64, 48, 128, 64),
   t("AllFight", 64, 80, 64, 48),
   char("Skeleton", 64, 48, 192, 64),
   case("DonkeyKong", 64, 48, 192, 112);

   public static final int try = "SkullAndRoses".length();
   public final String new;
   public final int int;
   public final int for;
   public final int do;
   public final int if;

   public static ah6[] a() {
      return (ah6[])a.clone();
   }

   private ah6(String var3, int var4, int var5, int var6, int var7) {
      this.new = var3;
      this.int = var4;
      this.for = var5;
      this.do = var6;
      this.if = var7;
   }
}
