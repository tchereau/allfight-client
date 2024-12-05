public enum kc {
   S("options.music", true, false),
   Q("options.sound", true, false),
   P("options.invertMouse", false, true),
   O("options.sensitivity", true, false),
   M("options.fov", true, false),
   L("options.gamma", true, false),
   K("options.renderDistance", false, false),
   J("options.viewBobbing", false, true),
   I("options.anaglyph", false, true),
   H("options.advancedOpengl", false, true),
   G("options.framerateLimit", false, false),
   F("options.difficulty", false, false),
   D("options.graphics", false, false),
   C("options.ao", false, false),
   A("options.guiScale", false, false),
   z("options.renderClouds", false, true),
   y("options.particles", false, false),
   w("options.chat.visibility", false, false),
   v("options.chat.color", false, true),
   t("options.chat.links", false, true),
   s("options.chat.opacity", true, false),
   r("options.chat.links.prompt", false, true),
   q("options.serverTextures", false, true),
   o("options.snooper", false, true),
   m("options.fullscreen", false, true),
   l("options.vsync", false, true),
   ao("options.showCape", false, true),
   an("options.touchscreen", false, true),
   am("options.chat.scale", true, false),
   al("options.chat.width", true, false),
   ak("options.chat.height.focused", true, false),
   ah("options.chat.height.unfocused", true, false),
   Y("Fog", false, false),
   ai("Fog Start", false, false),
   aq("Mipmap Level", false, false),
   E("Mipmap Type", false, false),
   aG("Load Far", false, false),
   R("Preloaded Chunks", false, false),
   else("Smooth FPS", false, false),
   byte("Clouds", false, false),
   long("Cloud Height", true, false),
   U("Trees", false, false),
   aw("Grass", false, false),
   az("Rain & Snow", false, false),
   a("Water", false, false),
   h("Water Animated", false, false),
   ax("Lava Animated", false, false),
   if("Fire Animated", false, false),
   j("Portal Animated", false, false),
   e("Smooth Lighting Level", true, false),
   ad("Lagometer", false, false),
   g("Autosave", false, false),
   aF("Better Grass", false, false),
   aC("Redstone Animated", false, false),
   X("Explosion Animated", false, false),
   goto("Flame Animated", false, false),
   aj("Smoke Animated", false, false),
   k("Weather", false, false),
   as("Sky", false, false),
   at("Stars", false, false),
   case("Sun & Moon", false, false),
   try("Chunk Updates per Frame", false, false),
   aH("Dynamic Updates", false, false),
   do("Time", false, false),
   aa("Clear Water", false, false),
   Z("Smooth World", false, false),
   T("Depth Fog", false, false),
   d("Void Particles", false, false),
   new("Water Particles", false, false),
   B("Rain Splash", false, false),
   p("Portal Particles", false, false),
   au("Debug Profiler", false, false),
   ay("Dripping Water/Lava", false, false),
   char("Better Snow", false, false),
   c("Fullscreen Mode", false, false),
   W("Terrain Animated", false, false),
   af("Items Animated", false, false),
   u("Swamp Colors", false, false),
   N("Random Mobs", false, false),
   i("Smooth Biomes", false, false),
   b("Custom Fonts", false, false),
   V("Custom Colors", false, false),
   ap("Show Capes", false, false),
   aB("Connected Textures", false, false),
   av("Antialiasing", false, false),
   aD("Anisotropic Filtering", false, false),
   x("Render Distance", true, false),
   for("Textures Animated", false, false),
   f("Natural Textures", false, false),
   void("Chunk Loading", false, false),
   ar("Performance", true, false),
   aA("Held Item Tooltips", false, false),
   aE("Dropped Items", false, false),
   n("Lazy Chunk Loading", false, false),
   int("Custom Sky", false, false);

   private final boolean ag;
   private final boolean ae;
   private final String ac;

   public static kc[] do() {
      return (kc[])ab.clone();
   }

   public static kc a(int var0) {
      kc[] var1 = do();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         kc var4 = var1[var3];
         if (var4.a() == var0) {
            return var4;
         }
      }

      return null;
   }

   private kc(String var3, boolean var4, boolean var5) {
      this.ac = var3;
      this.ag = var4;
      this.ae = var5;
   }

   public boolean if() {
      return this.ag;
   }

   public boolean int() {
      return this.ae;
   }

   public int a() {
      return this.ordinal();
   }

   public String for() {
      return this.ac;
   }
}
