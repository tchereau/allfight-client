public class n extends i5 {
   private i5 h3;
   protected String h7 = "Detail Settings";
   private ke h4;
   private static kc[] h5;
   private int h2 = 0;
   private int h8 = 0;
   private long h6 = 0L;

   public n(i5 var1, ke var2) {
      this.h3 = var1;
      this.h4 = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      kc[] var3 = h5;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         int var7 = this.hV / 2 - 155 + var2 % 2 * 160;
         int var8 = this.hU / 6 + 21 * (var2 / 2) - 10;
         if (!var6.if()) {
            this.hT.add(new iy(var6.a(), var7, var8, var6, this.h4.do(var6)));
         } else {
            this.hT.add(new iz(var6.a(), var7, var8, var6, this.h4.do(var6), this.h4.a(var6)));
         }

         ++var2;
      }

      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168 + 11, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.h4.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.h4.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.h3);
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
      this.a(this.hR, this.h7, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (Math.abs(var1 - this.h2) <= 5 && Math.abs(var2 - this.h8) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.h6 + (long)var4) {
            int var5 = this.hV / 2 - 150;
            int var6 = this.hU / 6 - 5;
            if (var2 <= var6 + 98) {
               var6 += 105;
            }

            int var7 = var5 + 150 + 150;
            int var8 = var6 + 84 + 10;
            j6 var9 = this.long(var1, var2);
            if (var9 != null) {
               String var10 = this.b(var9.hw);
               String[] var11 = this.c(var10);
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
         this.h2 = var1;
         this.h8 = var2;
         this.h6 = System.currentTimeMillis();
      }
   }

   private String[] c(String var1) {
      if (var1.equals("Clouds")) {
         return new String[]{"Clouds", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "  OFF - no clouds, fastest", "Fast clouds are rendered 2D.", "Fancy clouds are rendered 3D."};
      } else if (var1.equals("Cloud Height")) {
         return new String[]{"Cloud Height", "  OFF - default height", "  100% - above world height limit"};
      } else if (var1.equals("Trees")) {
         return new String[]{"Trees", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "Fast trees have opaque leaves.", "Fancy trees have transparent leaves."};
      } else if (var1.equals("Grass")) {
         return new String[]{"Grass", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "Fast grass uses default side texture.", "Fancy grass uses biome side texture."};
      } else if (var1.equals("Dropped Items")) {
         return new String[]{"Dropped Items", "  Default - as set by setting Graphics", "  Fast - 2D dropped items, faster", "  Fancy - 3D dropped items, slower"};
      } else if (var1.equals("Water")) {
         return new String[]{"Water", "  Default - as set by setting Graphics", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Fast water (1 pass) has some visual artifacts", "Fancy water (2 pass) has no visual artifacts"};
      } else if (var1.equals("Rain & Snow")) {
         return new String[]{"Rain & Snow", "  Default - as set by setting Graphics", "  Fast  - light rain/snow, faster", "  Fancy - heavy rain/snow, slower", "  OFF - no rain/snow, fastest", "When rain is OFF the splashes and rain sounds", "are still active."};
      } else if (var1.equals("Sky")) {
         return new String[]{"Sky", "  ON - sky is visible, slower", "  OFF  - sky is not visible, faster", "When sky is OFF the moon and sun are still visible."};
      } else if (var1.equals("Stars")) {
         return new String[]{"Stars", "  ON - stars are visible, slower", "  OFF  - stars are not visible, faster"};
      } else if (var1.equals("Depth Fog")) {
         return new String[]{"Depth Fog", "  ON - fog moves closer at bedrock levels (default)", "  OFF - same fog at all levels"};
      } else {
         return var1.equals("Show Capes") ? new String[]{"Show Capes", "  ON - show player capes (default)", "  OFF - do not show player capes"} : null;
      }
   }

   private String b(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0 ? var1 : var1.substring(0, var2);
   }

   private j6 long(int var1, int var2) {
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
      h5 = new kc[]{kc.byte, kc.long, kc.U, kc.aw, kc.a, kc.az, kc.as, kc.at, kc.case, kc.ap, kc.T, kc.aA, kc.aE};
   }
}
