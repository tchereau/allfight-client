import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class r {
   private static c3 if = null;
   private static za[] a = new za[0];

   public static void a(c3 var0) {
      a = new za[0];
      if = var0;
      if (qs.al()) {
         String var1 = "/natural.properties";

         try {
            InputStream var2 = var0.try.int().a(var1);
            if (var2 == null) {
               qs.for("NaturalTextures: configuration \"" + var1 + "\" not found");
               a = a();
               return;
            }

            ArrayList var3 = new ArrayList(256);
            String var4 = qs.a(var2);
            var2.close();
            String[] var5 = qs.if(var4, "\n\r");
            qs.for("Natural Textures: Parsing configuration \"" + var1 + "\"");

            for(int var6 = 0; var6 < var5.length; ++var6) {
               String var7 = var5[var6].trim();
               if (!var7.startsWith("#")) {
                  String[] var8 = qs.if(var7, "=");
                  if (var8.length != 2) {
                     qs.for("Natural Textures: Invalid \"" + var1 + "\" line: " + var7);
                  } else {
                     String var9 = var8[0].trim();
                     String var10 = var8[1].trim();
                     bh var12 = var0.int.if(var9);
                     if (var12 == null) {
                        qs.for("Natural Textures: Texture not found: \"" + var1 + "\" line: " + var7);
                     } else {
                        int var13 = var12.goto();
                        if (var13 < 0) {
                           qs.for("Natural Textures: Invalid \"" + var1 + "\" line: " + var7);
                        } else {
                           za var14 = new za(var10);
                           if (var14.a()) {
                              while(var3.size() <= var13) {
                                 var3.add((Object)null);
                              }

                              var3.set(var13, var14);
                           }
                        }
                     }
                  }
               }
            }

            a = (za[])((za[])var3.toArray(new za[var3.size()]));
         } catch (FileNotFoundException var15) {
            qs.for("NaturalTextures: configuration \"" + var1 + "\" not found");
            a = a();
            return;
         } catch (Exception var16) {
            var16.printStackTrace();
         }

      }
   }

   public static za a(ajd var0) {
      if (!(var0 instanceof bh)) {
         return null;
      } else {
         bh var1 = (bh)var0;
         int var2 = var1.goto();
         if (var2 >= 0 && var2 < a.length) {
            za var3 = a[var2];
            return var3;
         } else {
            return null;
         }
      }
   }

   private static za[] a() {
      if (!(if.try.int() instanceof am)) {
         qs.for("NaturalTextures: Texture pack is not default, ignoring default configuration.");
         return new za[0];
      } else {
         qs.for("Natural Textures: Using default configuration.");
         ArrayList var0 = new ArrayList();
         a(var0, "grass_top", "4F");
         a(var0, "stone", "2F");
         a(var0, "dirt", "4F");
         a(var0, "grass_side", "F");
         a(var0, "grass_side_overlay", "F");
         a(var0, "stoneslab_top", "F");
         a(var0, "bedrock", "2F");
         a(var0, "sand", "4F");
         a(var0, "gravel", "2");
         a(var0, "tree_side", "2F");
         a(var0, "tree_top", "4F");
         a(var0, "oreGold", "2F");
         a(var0, "oreIron", "2F");
         a(var0, "oreCoal", "2F");
         a(var0, "oreDiamond", "2F");
         a(var0, "oreRedstone", "2F");
         a(var0, "oreLapis", "2F");
         a(var0, "obsidian", "4F");
         a(var0, "leaves", "2F");
         a(var0, "leaves_opaque", "2F");
         a(var0, "leaves_jungle", "2");
         a(var0, "leaves_jungle_opaque", "2");
         a(var0, "snow", "4F");
         a(var0, "snow_side", "F");
         a(var0, "cactus_side", "2F");
         a(var0, "clay", "4F");
         a(var0, "mycel_side", "F");
         a(var0, "mycel_top", "4F");
         a(var0, "farmland_wet", "2F");
         a(var0, "farmland_dry", "2F");
         a(var0, "hellrock", "4F");
         a(var0, "hellsand", "4F");
         a(var0, "lightgem", "4");
         a(var0, "tree_spruce", "2F");
         a(var0, "tree_birch", "F");
         a(var0, "leaves_spruce", "2F");
         a(var0, "leaves_spruce_opaque", "2F");
         a(var0, "tree_jungle", "2F");
         a(var0, "whiteStone", "4");
         a(var0, "sandstone_top", "4");
         a(var0, "sandstone_bottom", "4F");
         a(var0, "redstoneLight_lit", "4F");
         za[] var1 = (za[])((za[])var0.toArray(new za[var0.size()]));
         return var1;
      }
   }

   private static void a(List var0, String var1, String var2) {
      bb var3 = if.int;
      ajd var4 = var3.a(var1);
      if (var4 == null) {
         qs.for("*** NaturalProperties: Icon not found: " + var1 + " ***");
      } else if (!(var4 instanceof bh)) {
         qs.for("*** NaturalProperties: Icon is not IconStitched: " + var1 + ": " + var4.getClass().getName() + " ***");
      } else {
         bh var5 = (bh)var4;
         int var6 = var5.goto();
         if (var6 < 0) {
            qs.for("*** NaturalProperties: Invalid index for icon: " + var1 + ": " + var6 + " ***");
         } else {
            while(var6 >= var0.size()) {
               var0.add((Object)null);
            }

            za var7 = new za(var2);
            var0.set(var6, var7);
         }
      }
   }

   public static void a(bb var0) {
   }
}
