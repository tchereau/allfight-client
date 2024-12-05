public class iv extends i5 {
   private i5 lm;
   protected String ln = "Video Settings";
   private ke ls;
   private boolean lp = false;
   private static kc[] lr;
   private int ll = 0;
   private int lq = 0;
   private long lo = 0L;

   public iv(i5 var1, ke var2) {
      this.lm = var1;
      this.ls = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.ln = var1.a("options.videoTitle");
      int var2 = 0;
      kc[] var3 = lr;
      int var4 = var3.length;

      int var5;
      int var7;
      for(var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         var7 = this.hV / 2 - 155 + var5 % 2 * 160;
         int var8 = this.hU / 6 + 21 * (var5 / 2) - 10;
         if (var6.if()) {
            this.hT.add(new iz(var6.a(), var7, var8, var6, this.ls.do(var6), this.ls.a(var6)));
         } else {
            this.hT.add(new iy(var6.a(), var7, var8, var6, this.ls.do(var6)));
         }

         ++var2;
      }

      int var13 = this.hU / 6 + 21 * (var5 / 2) - 10;
      boolean var14 = false;
      var7 = this.hV / 2 - 155 + 160;
      this.hT.add(new iy(102, var7, var13, "Quality..."));
      var13 += 21;
      var7 = this.hV / 2 - 155 + 0;
      this.hT.add(new iy(101, var7, var13, "Details..."));
      var7 = this.hV / 2 - 155 + 160;
      this.hT.add(new iy(112, var7, var13, "Performance..."));
      var13 += 21;
      var7 = this.hV / 2 - 155 + 0;
      this.hT.add(new iy(111, var7, var13, "Animations..."));
      var7 = this.hV / 2 - 155 + 160;
      this.hT.add(new iy(122, var7, var13, "Other..."));
      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168 + 11, var1.a("gui.done")));
      this.lp = false;
      String[] var15 = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};
      String[] var9 = var15;
      var5 = var15.length;

      for(int var10 = 0; var10 < var5; ++var10) {
         String var11 = var9[var10];
         String var12 = System.getProperty(var11);
         if (var12 != null && var12.contains("64")) {
            this.lp = true;
            break;
         }
      }

   }

   protected void a(j6 var1) {
      if (var1.hu) {
         int var2 = this.ls.ba;
         if (var1.hv < 100 && var1 instanceof iy) {
            this.ls.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.ls.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.lm);
         }

         if (this.ls.ba != var2) {
            i4 var3 = new i4(this.hW.u1, this.hW.vo, this.hW.vn);
            int var4 = var3.int();
            int var5 = var3.if();
            this.for(this.hW, var4, var5);
         }

         if (var1.hv == 101) {
            this.hW.u1.new();
            n var6 = new n(this, this.ls);
            this.hW.a((i5)var6);
         }

         if (var1.hv == 102) {
            this.hW.u1.new();
            zh var7 = new zh(this, this.ls);
            this.hW.a((i5)var7);
         }

         if (var1.hv == 111) {
            this.hW.u1.new();
            aqg var8 = new aqg(this, this.ls);
            this.hW.a((i5)var8);
         }

         if (var1.hv == 112) {
            this.hW.u1.new();
            aqn var9 = new aqn(this, this.ls);
            this.hW.a((i5)var9);
         }

         if (var1.hv == 122) {
            this.hW.u1.new();
            zc var10 = new zc(this, this.ls);
            this.hW.a((i5)var10);
         }

         if (var1.hv == kc.e.ordinal()) {
            return;
         }
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.ln, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (Math.abs(var1 - this.ll) <= 5 && Math.abs(var2 - this.lq) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.lo + (long)var4) {
            int var5 = this.hV / 2 - 150;
            int var6 = this.hU / 6 - 5;
            if (var2 <= var6 + 98) {
               var6 += 105;
            }

            int var7 = var5 + 150 + 150;
            int var8 = var6 + 84 + 10;
            j6 var9 = this.b(var1, var2);
            if (var9 != null) {
               String var10 = this.j(var9.hw);
               String[] var11 = this.k(var10);
               if (var11 == null) {
                  return;
               }

               this.a(var5, var6, var7, var8, -536870912, -536870912);

               for(int var12 = 0; var12 < var11.length; ++var12) {
                  String var13 = var11[var12];
                  this.hR.a(var13, var5 + 5, var6 + 5 + var12 * 11, 14540253);
               }
            }

         }
      } else {
         this.ll = var1;
         this.lq = var2;
         this.lo = System.currentTimeMillis();
      }
   }

   private String[] k(String var1) {
      if (var1.equals("Graphics")) {
         return new String[]{"Visual quality", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Changes the appearance of clouds, leaves, water,", "shadows and grass sides."};
      } else if (var1.equals("Render Distance")) {
         return new String[]{"Visible distance", "  Tiny - 32m (fastest)", "  Short - 64m (faster)", "  Normal - 128m", "  Far - 256m (slower)", "  Extreme - 512m (slowest!)", "The Extreme view distance is very resource demanding!"};
      } else if (var1.equals("Smooth Lighting")) {
         return new String[]{"Smooth lighting", "  OFF - no smooth lighting (faster)", "  1% - light smooth lighting (slower)", "  100% - dark smooth lighting (slower)"};
      } else if (var1.equals("Performance")) {
         return new String[]{"FPS Limit", "  Max FPS - no limit (fastest)", "  Balanced - limit 120 FPS (slower)", "  Power saver - limit 40 FPS (slowest)", "  VSync - limit to monitor framerate (60, 30, 20)", "Balanced and Power saver decrease the FPS even if", "the limit value is not reached."};
      } else if (var1.equals("3D Anaglyph")) {
         return new String[]{"3D mode used with red-cyan 3D glasses."};
      } else if (var1.equals("View Bobbing")) {
         return new String[]{"More realistic movement.", "When using mipmaps set it to OFF for best results."};
      } else if (var1.equals("GUI Scale")) {
         return new String[]{"GUI Scale", "Smaller GUI might be faster"};
      } else if (var1.equals("Advanced OpenGL")) {
         return new String[]{"Detect and render only visible geometry", "  OFF - all geometry is rendered (slower)", "  Fast - only visible geometry is rendered (fastest)", "  Fancy - conservative, avoids visual artifacts (faster)", "The option is available only if it is supported by the ", "graphic card."};
      } else if (var1.equals("Fog")) {
         return new String[]{"Fog type", "  Fast - faster fog", "  Fancy - slower fog, looks better", "  OFF - no fog, fastest", "The fancy fog is available only if it is supported by the ", "graphic card."};
      } else if (var1.equals("Fog Start")) {
         return new String[]{"Fog start", "  0.2 - the fog starts near the player", "  0.8 - the fog starts far from the player", "This option usually does not affect the performance."};
      } else if (var1.equals("Brightness")) {
         return new String[]{"Increases the brightness of darker objects", "  OFF - standard brightness", "  100% - maximum brightness for darker objects", "This options does not change the brightness of ", "fully black objects"};
      } else {
         return var1.equals("Chunk Loading") ? new String[]{"Chunk Loading", "  Default - unstable FPS when loading chunks", "  Smooth - stable FPS", "  Multi-Core - stable FPS, 3x faster world loading", "Smooth and Multi-Core remove the stuttering and freezes", "caused by chunk loading.", "Multi-Core can speed up 3x the world loading and", "increase FPS by using a second CPU core."} : null;
      }
   }

   private String j(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0 ? var1 : var1.substring(0, var2);
   }

   private j6 b(int var1, int var2) {
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
      lr = new kc[]{kc.D, kc.x, kc.C, kc.ar, kc.e, kc.J, kc.A, kc.H, kc.L, kc.void, kc.Y, kc.ai, kc.q};
   }
}
