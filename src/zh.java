public class zh extends i5 {
   private i5 oa;
   protected String oe = "Quality Settings";
   private ke ob;
   private static kc[] oc;
   private int n9 = 0;
   private int of = 0;
   private long od = 0L;

   public zh(i5 var1, ke var2) {
      this.oa = var1;
      this.ob = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      kc[] var3 = oc;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         int var7 = this.hV / 2 - 155 + var2 % 2 * 160;
         int var8 = this.hU / 6 + 21 * (var2 / 2) - 10;
         if (!var6.if()) {
            this.hT.add(new iy(var6.a(), var7, var8, var6, this.ob.do(var6)));
         } else {
            this.hT.add(new iz(var6.a(), var7, var8, var6, this.ob.do(var6), this.ob.a(var6)));
         }

         ++var2;
      }

      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168 + 11, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.ob.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.ob.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.oa);
         }

         if (var1.hv != kc.long.ordinal()) {
            i4 var2 = new i4(this.hW.u1, this.hW.vo, this.hW.vn);
            int var3 = var2.int();
            int var4 = var2.if();
            this.for(this.hW, var3, var4);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.oe, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (Math.abs(var1 - this.n9) <= 5 && Math.abs(var2 - this.of) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.od + (long)var4) {
            int var5 = this.hV / 2 - 150;
            int var6 = this.hU / 6 - 5;
            if (var2 <= var6 + 98) {
               var6 += 105;
            }

            int var7 = var5 + 150 + 150;
            int var8 = var6 + 84 + 10;
            j6 var9 = this.d(var1, var2);
            if (var9 != null) {
               String var10 = this.s(var9.hw);
               String[] var11 = this.t(var10);
               if (var11 == null) {
                  return;
               }

               this.a(var5, var6, var7, var8, -536870912, -536870912);

               for(int var12 = 0; var12 < var11.length; ++var12) {
                  String var13 = var11[var12];
                  int var14 = 14540253;
                  if (var13.endsWith("!")) {
                     var14 = 16719904;
                  }

                  this.hR.a(var13, var5 + 5, var6 + 5 + var12 * 11, var14);
               }
            }

         }
      } else {
         this.n9 = var1;
         this.of = var2;
         this.od = System.currentTimeMillis();
      }
   }

   private String[] t(String var1) {
      if (var1.equals("Mipmap Level")) {
         return new String[]{"Visual effect which makes distant objects look better", "by smoothing the texture details", "  OFF - no smoothing", "  1 - minimum smoothing", "  4 - maximum smoothing", "This option usually does not affect the performance."};
      } else if (var1.equals("Mipmap Type")) {
         return new String[]{"Visual effect which makes distant objects look better", "by smoothing the texture details", "  Nearest - rough smoothing", "  Linear - fine smoothing", "This option usually does not affect the performance."};
      } else if (var1.equals("Anisotropic Filtering")) {
         return new String[]{"Anisotropic Filtering", " OFF - (default) standard texture detail (faster)", " 2-16 - finer details in mipmapped textures (slower)", "The Anisotropic Filtering restores details in mipmapped", "textures. Higher values may decrease the FPS."};
      } else if (var1.equals("Antialiasing")) {
         return new String[]{"Antialiasing", " OFF - (default) no antialiasing (faster)", " 2-16 - antialiased lines and edges (slower)", "The Antialiasing smooths jagged lines and ", "sharp color transitions.", "Higher values may substantially decrease the FPS.", "Not all levels are supported by all graphics cards.", "Effective after a RESTART!"};
      } else if (var1.equals("Clear Water")) {
         return new String[]{"Clear Water", "  ON - clear, transparent water", "  OFF - default water"};
      } else if (var1.equals("Better Grass")) {
         return new String[]{"Better Grass", "  OFF - default side grass texture, fastest", "  Fast - full side grass texture, slower", "  Fancy - dynamic side grass texture, slowest"};
      } else if (var1.equals("Better Snow")) {
         return new String[]{"Better Snow", "  OFF - default snow, faster", "  ON - better snow, slower", "Shows snow under transparent blocks (fence, tall grass)", "when bordering with snow blocks"};
      } else if (var1.equals("Random Mobs")) {
         return new String[]{"Random Mobs", "  OFF - no random mobs, faster", "  ON - random mobs, slower", "Random mobs uses random textures for the game creatures.", "It needs a texture pack which has multiple mob textures."};
      } else if (var1.equals("Swamp Colors")) {
         return new String[]{"Swamp Colors", "  ON - use swamp colors (default), slower", "  OFF - do not use swamp colors, faster", "The swamp colors affect grass, leaves, vines and water."};
      } else if (var1.equals("Smooth Biomes")) {
         return new String[]{"Smooth Biomes", "  ON - smoothing of biome borders (default), slower", "  OFF - no smoothing of biome borders, faster", "The smoothing of biome borders is done by sampling and", "averaging the color of all surrounding blocks.", "Affected are grass, leaves, vines and water."};
      } else if (var1.equals("Custom Fonts")) {
         return new String[]{"Custom Fonts", "  ON - uses custom fonts (default), slower", "  OFF - uses default font, faster", "The custom fonts are supplied by the current", "texture pack"};
      } else if (var1.equals("Custom Colors")) {
         return new String[]{"Custom Colors", "  ON - uses custom colors (default), slower", "  OFF - uses default colors, faster", "The custom colors are supplied by the current", "texture pack"};
      } else if (var1.equals("Show Capes")) {
         return new String[]{"Show Capes", "  ON - show player capes (default)", "  OFF - do not show player capes"};
      } else if (var1.equals("Connected Textures")) {
         return new String[]{"Connected Textures", "  OFF - no connected textures (default)", "  Fast - fast connected textures", "  Fancy - fancy connected textures", "Connected textures joins the textures of glass,", "sandstone and bookshelves when placed next to", "each other. The connected textures are supplied", "by the current texture pack."};
      } else if (var1.equals("Far View")) {
         return new String[]{"Far View", " OFF - (default) standard view distance", " ON - 3x view distance", "Far View is very resource demanding!", "3x view distance => 9x chunks to be loaded => FPS / 9", "Standard view distances: 32, 64, 128, 256", "Far view distances: 96, 192, 384, 512"};
      } else if (var1.equals("Natural Textures")) {
         return new String[]{"Natural Textures", "  OFF - no natural textures (default)", "  ON - use natural textures", "Natural textures remove the gridlike pattern", "created by repeating blocks of the same type.", "It uses rotated and flipped variants of the base", "block texture. The configuration for the natural", "textures is supplied by the current texture pack"};
      } else {
         return var1.equals("Custom Sky") ? new String[]{"Custom Sky", "  ON - custom sky textures (default), slow", "  OFF - default sky, faster", "The custom sky textures are supplied by the current", "texture pack"} : null;
      }
   }

   private String s(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0 ? var1 : var1.substring(0, var2);
   }

   private j6 d(int var1, int var2) {
      for(int var3 = 0; var3 < this.hT.size(); ++var3) {
         j6 var4 = (j6)this.hT.get(var3);
         boolean var5 = var1 >= var4.hy && var2 >= var4.hx && var1 < var4.hy + var4.hA && var2 < var4.hx + var4.hz;
         if (var5) {
            return var4;
         }
      }

      return null;
   }

   static {
      oc = new kc[]{kc.aq, kc.E, kc.aD, kc.av, kc.aa, kc.N, kc.aF, kc.char, kc.b, kc.V, kc.u, kc.i, kc.aB, kc.f, kc.int};
   }
}
