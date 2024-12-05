import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.HashSet;
import java.util.Set;

public class ct {
   public static final String e = "grass_top";
   public static final String j = "stone";
   public static final String U = "dirt";
   public static final String if = "grass_side";
   public static final String A = "stoneslab_side";
   public static final String x = "stoneslab_top";
   public static final String W = "bedrock";
   public static final String t = "sand";
   public static final String byte = "gravel";
   public static final String h = "tree_side";
   public static final String c = "tree_top";
   public static final String S = "oreGold";
   public static final String f = "oreIron";
   public static final String G = "oreCoal";
   public static final String P = "obsidian";
   public static final String n = "grass_side_overlay";
   public static final String r = "snow";
   public static final String v = "snow_side";
   public static final String N = "mycel_side";
   public static final String H = "mycel_top";
   public static final String J = "oreDiamond";
   public static final String R = "oreRedstone";
   public static final String V = "oreLapis";
   public static final String else = "leaves";
   public static final String ab = "leaves_opaque";
   public static final String u = "leaves_jungle";
   public static final String o = "leaves_jungle_opaque";
   public static final String y = "cactus_side";
   public static final String D = "clay";
   public static final String T = "farmland_wet";
   public static final String L = "farmland_dry";
   public static final String i = "hellrock";
   public static final String O = "hellsand";
   public static final String d = "lightgem";
   public static final String l = "tree_spruce";
   public static final String for = "tree_birch";
   public static final String s = "leaves_spruce";
   public static final String long = "leaves_spruce_opaque";
   public static final String k = "tree_jungle";
   public static final String b = "whiteStone";
   public static final String int = "sandstone_top";
   public static final String goto = "sandstone_bottom";
   public static final String Y = "redstoneLight";
   public static final String Z = "redstoneLight_lit";
   public static final String E = "water";
   public static final String char = "water_flow";
   public static final String a = "lava";
   public static final String new = "lava_flow";
   public static final String B = "fire_0";
   public static final String z = "fire_1";
   public static final String case = "portal";
   public static ajd void;
   public static ajd I;
   public static ajd p;
   public static ajd w;
   public static ajd q;
   public static ajd C;
   public static ajd F;
   public static ajd X;
   public static ajd Q;
   public static ajd try;
   public static ajd do;
   public static ajd m;
   public static ajd M;
   public static ajd K;
   private static Set g = a();
   private static Set aa = new HashSet();

   private static Set a() {
      HashSet var0 = new HashSet();
      var0.add("/terrain.png");
      var0.add("/gui/items.png");
      var0.add("/ctm.png");
      var0.add("/eloraam/world/world1.png");
      var0.add("/gfx/buildcraft/blocks/blocks.png");
      return var0;
   }

   public static void a(c3 var0) {
      bb var1 = var0.int;
      void = var1.a("grass_top");
      I = var1.a("grass_side");
      p = var1.a("grass_side_overlay");
      w = var1.a("snow");
      q = var1.a("snow_side");
      C = var1.a("mycel_side");
      F = var1.a("mycel_top");
      X = var1.a("water");
      Q = var1.a("water_flow");
      try = var1.a("lava");
      do = var1.a("lava_flow");
      M = var1.a("fire_0");
      K = var1.a("fire_1");
      m = var1.a("portal");
   }

   public static void a(String var0, int var1) {
      if (g.contains(var0)) {
         aa.add(var1);
      }

   }

   public static void if(String var0) {
      if (var0 != null) {
         g.add(var0);
         qs.for("TextureAtlas: " + var0);
      }
   }

   public static boolean if(int var0) {
      return aa.contains(var0);
   }

   public static boolean a(String var0) {
      return g.contains(var0);
   }

   public static BufferedImage a(String var0, BufferedImage var1) {
      if (var0.startsWith("/mob/zombie") || var0.startsWith("/mob/pigzombie")) {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         if (var2 == var3 * 2) {
            BufferedImage var4 = new BufferedImage(var2, var3 * 2, 2);
            Graphics2D var5 = var4.createGraphics();
            var5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            var5.drawImage(var1, 0, 0, var2, var3, (ImageObserver)null);
            return var4;
         }
      }

      return var1;
   }

   public static bh a(ajd var0) {
      return var0 instanceof bh ? (bh)var0 : null;
   }

   public static int for(int var0) {
      int var1;
      for(var1 = 1; var1 < var0; var1 *= 2) {
      }

      return var1;
   }

   public static int do(int var0) {
      int var1 = 1;

      int var2;
      for(var2 = 0; var1 < var0; ++var2) {
         var1 *= 2;
      }

      return var2;
   }

   public static int a(int var0) {
      int var1 = 1;

      for(int var2 = 0; var2 < var0; ++var2) {
         var1 *= 2;
      }

      return var1;
   }
}
