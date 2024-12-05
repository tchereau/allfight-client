public class zc extends i5 {
   private i5 n3;
   protected String n7 = "Other Settings";
   private ke n4;
   private static kc[] n5;
   private int n2 = 0;
   private int n8 = 0;
   private long n6 = 0L;

   public zc(i5 var1, ke var2) {
      this.n3 = var1;
      this.n4 = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      kc[] var3 = n5;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         int var7 = this.hV / 2 - 155 + var2 % 2 * 160;
         int var8 = this.hU / 6 + 21 * (var2 / 2) - 10;
         if (!var6.if()) {
            this.hT.add(new iy(var6.a(), var7, var8, var6, this.n4.do(var6)));
         } else {
            this.hT.add(new iz(var6.a(), var7, var8, var6, this.n4.do(var6), this.n4.a(var6)));
         }

         ++var2;
      }

      this.hT.add(new j6(210, this.hV / 2 - 100, this.hU / 6 + 168 + 11 - 22, "Reset Video Settings..."));
      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168 + 11, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.n4.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.n4.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.n3);
         }

         if (var1.hv == 210) {
            this.hW.u1.new();
            j2 var2 = new j2(this, "Reset all video settings to their default values?", "", 9999);
            this.hW.a((i5)var2);
         }

         if (var1.hv != kc.long.ordinal()) {
            i4 var5 = new i4(this.hW.u1, this.hW.vo, this.hW.vn);
            int var3 = var5.int();
            int var4 = var5.if();
            this.for(this.hW, var3, var4);
         }

      }
   }

   public void do(boolean var1, int var2) {
      if (var1) {
         this.hW.u1.do();
      }

      this.hW.a((i5)this);
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.n7, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (Math.abs(var1 - this.n2) <= 5 && Math.abs(var2 - this.n8) <= 5) {
         short var4 = 700;
         if (System.currentTimeMillis() >= this.n6 + (long)var4) {
            int var5 = this.hV / 2 - 150;
            int var6 = this.hU / 6 - 5;
            if (var2 <= var6 + 98) {
               var6 += 105;
            }

            int var7 = var5 + 150 + 150;
            int var8 = var6 + 84 + 10;
            j6 var9 = this.c(var1, var2);
            if (var9 != null) {
               String var10 = this.q(var9.hw);
               String[] var11 = this.r(var10);
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
         this.n2 = var1;
         this.n8 = var2;
         this.n6 = System.currentTimeMillis();
      }
   }

   private String[] r(String var1) {
      if (var1.equals("Autosave")) {
         return new String[]{"Autosave interval", "Default autosave interval (2s) is NOT RECOMMENDED.", "Autosave causes the famous Lag Spike of Death."};
      } else if (var1.equals("Lagometer")) {
         return new String[]{"Lagometer", " OFF - no lagometer, faster", " ON - debug screen with lagometer, slower", "Shows the lagometer on the debug screen (F3).", "* White - tick", "* Red - chunk loading", "* Green - frame rendering + internal server"};
      } else if (var1.equals("Debug Profiler")) {
         return new String[]{"Debug Profiler", "  ON - debug profiler is active, slower", "  OFF - debug profiler is not active, faster", "The debug profiler collects and shows debug information", "when the debug screen is open (F3)"};
      } else if (var1.equals("Time")) {
         return new String[]{"Time", " Default - normal day/night cycles", " Day Only - day only", " Night Only - night only", "The time setting is only effective in CREATIVE mode."};
      } else if (var1.equals("Weather")) {
         return new String[]{"Weather", "  ON - weather is active, slower", "  OFF - weather is not active, faster", "The weather controls rain, snow and thunderstorms."};
      } else {
         return var1.equals("Fullscreen") ? new String[]{"Fullscreen resolution", "  Default - use desktop screen resolution, slower", "  WxH - use custom screen resolution, may be faster", "The selected resolution is used in fullscreen mode (F11)."} : null;
      }
   }

   private String q(String var1) {
      int var2 = var1.indexOf(58);
      return var2 < 0 ? var1 : var1.substring(0, var2);
   }

   private j6 c(int var1, int var2) {
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
      n5 = new kc[]{kc.ad, kc.au, kc.k, kc.do, kc.m, kc.c, kc.I, kc.g};
   }
}
