public class aqn extends i5 {
   private i5 ol;
   protected String op = "Performance Settings";
   private ke om;
   private static kc[] on;
   private int ok = 0;
   private int oq = 0;
   private long oo = 0L;

   public aqn(i5 var1, ke var2) {
      this.ol = var1;
      this.om = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      kc[] var3 = on;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         int var7 = this.hV / 2 - 155 + var2 % 2 * 160;
         int var8 = this.hU / 6 + 21 * (var2 / 2) - 10;
         if (!var6.if()) {
            this.hT.add(new iy(var6.a(), var7, var8, var6, this.om.do(var6)));
         } else {
            this.hT.add(new iz(var6.a(), var7, var8, var6, this.om.do(var6), this.om.a(var6)));
         }

         ++var2;
      }

      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168 + 11, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.om.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.om.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.ol);
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
      this.a(this.hR, this.op, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (Math.abs(var1 - this.ok) <= 5 && Math.abs(var2 - this.oq) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.oo + (long)var4) {
            int var5 = this.hV / 2 - 150;
            int var6 = this.hU / 6 - 5;
            if (var2 <= var6 + 98) {
               var6 += 105;
            }

            int var7 = var5 + 150 + 150;
            int var8 = var6 + 84 + 10;
            j6 var9 = this.e(var1, var2);
            if (var9 != null) {
               String var10 = this.u(var9.hw);
               String[] var11 = this.v(var10);
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
         this.ok = var1;
         this.oq = var2;
         this.oo = System.currentTimeMillis();
      }
   }

   private String[] v(String var1) {
      if (var1.equals("Smooth FPS")) {
         return new String[]{"Stabilizes FPS by flushing the graphic driver buffers", "  OFF - no stabilization, FPS may fluctuate", "  ON - FPS stabilization", "This option is graphic driver dependant and its effect", "is not always visible"};
      } else if (var1.equals("Smooth World")) {
         return new String[]{"Removes lag spikes caused by the internal server.", "  OFF - no stabilization, FPS may fluctuate", "  ON - FPS stabilization", "Stabilizes FPS by distributing the internal server load.", "Effective only for local worlds and single-core CPU."};
      } else if (var1.equals("Load Far")) {
         return new String[]{"Loads the world chunks at distance Far.", "Switching the render distance does not cause all chunks ", "to be loaded again.", "  OFF - world chunks loaded up to render distance", "  ON - world chunks loaded at distance Far, allows", "       fast render distance switching"};
      } else if (var1.equals("Preloaded Chunks")) {
         return new String[]{"Defines an area in which no chunks will be loaded", "  OFF - after 5m new chunks will be loaded", "  2 - after 32m  new chunks will be loaded", "  8 - after 128m new chunks will be loaded", "Higher values need more time to load all the chunks"};
      } else if (var1.equals("Chunk Updates")) {
         return new String[]{"Chunk updates per frame", " 1 - (default) slower world loading, higher FPS", " 3 - faster world loading, lower FPS", " 5 - fastest world loading, lowest FPS"};
      } else if (var1.equals("Dynamic Updates")) {
         return new String[]{"Dynamic chunk updates", " OFF - (default) standard chunk updates per frame", " ON - more updates while the player is standing still", "Dynamic updates force more chunk updates while", "the player is standing still to load the world faster."};
      } else {
         return var1.equals("Lazy Chunk Loading") ? new String[]{"Lazy Chunk Loading", " OFF - default server chunk loading", " ON - lazy server chunk loading (smoother)", "Smooths the integrated server chunk loading by", "distributing the chunks over several ticks.", "Turn it OFF if parts of the world do not load correctly.", "Effective only for local worlds and single-core CPU."} : null;
      }
   }

   private String u(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0 ? var1 : var1.substring(0, var2);
   }

   private j6 e(int var1, int var2) {
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
      on = new kc[]{kc.else, kc.Z, kc.aG, kc.R, kc.try, kc.aH, kc.n};
   }
}
