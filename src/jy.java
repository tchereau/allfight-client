import java.util.Random;
import org.lwjgl.input.Keyboard;

public class jy extends i5 {
   private i5 nl;
   private ju nk;
   private ju nj;
   private String ni;
   private String nh = "survival";
   private boolean ng = true;
   private boolean ne = false;
   private boolean nc = false;
   private boolean na = false;
   private boolean m8 = false;
   private boolean m6;
   private boolean m4;
   private j6 m2;
   private j6 m0;
   private j6 mY;
   private j6 mX;
   private j6 nf;
   private j6 nd;
   private j6 nb;
   private String m9;
   private String m7;
   private String m5;
   private String m3;
   private int m1 = 0;
   public String nm = "";
   private static final String[] mZ = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

   public jy(i5 var1) {
      this.nl = var1;
      this.m5 = "";
      this.m3 = aqz.if("selectWorld.newWorld");
   }

   public void dG() {
      this.nk.de();
      this.nj.de();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(new j6(0, this.hV / 2 - 155, this.hU - 28, 150, 20, var1.a("selectWorld.create")));
      this.hT.add(new j6(1, this.hV / 2 + 5, this.hU - 28, 150, 20, var1.a("gui.cancel")));
      this.hT.add(this.m2 = new j6(2, this.hV / 2 - 75, 115, 150, 20, var1.a("selectWorld.gameMode")));
      this.hT.add(this.m0 = new j6(3, this.hV / 2 - 75, 187, 150, 20, var1.a("selectWorld.moreWorldOptions")));
      this.hT.add(this.mY = new j6(4, this.hV / 2 - 155, 100, 150, 20, var1.a("selectWorld.mapFeatures")));
      this.mY.ht = false;
      this.hT.add(this.mX = new j6(7, this.hV / 2 + 5, 151, 150, 20, var1.a("selectWorld.bonusItems")));
      this.mX.ht = false;
      this.hT.add(this.nf = new j6(5, this.hV / 2 + 5, 100, 150, 20, var1.a("selectWorld.mapType")));
      this.nf.ht = false;
      this.hT.add(this.nd = new j6(6, this.hV / 2 - 155, 151, 150, 20, var1.a("selectWorld.allowCommands")));
      this.nd.ht = false;
      this.hT.add(this.nb = new j6(8, this.hV / 2 + 5, 120, 150, 20, var1.a("selectWorld.customizeType")));
      this.nb.ht = false;
      this.nk = new ju(this.hR, this.hV / 2 - 100, 60, 200, 20);
      this.nk.h(true);
      this.nk.case(this.m3);
      this.nj = new ju(this.hR, this.hV / 2 - 100, 60, 200, 20);
      this.nj.case(this.m5);
      this.p(this.m4);
      this.ei();
      this.eh();
   }

   private void ei() {
      this.ni = this.nk.dc().trim();
      char[] var1 = apc.a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var4 = var1[var3];
         this.ni = this.ni.replace(var4, '_');
      }

      if (ajs.a(this.ni)) {
         this.ni = "World";
      }

      this.ni = a(this.hW.im(), this.ni);
   }

   private void eh() {
      aqy var1 = aqy.if();
      this.m2.hw = var1.a("selectWorld.gameMode") + " " + var1.a("selectWorld.gameMode." + this.nh);
      this.m9 = var1.a("selectWorld.gameMode." + this.nh + ".line1");
      this.m7 = var1.a("selectWorld.gameMode." + this.nh + ".line2");
      this.mY.hw = var1.a("selectWorld.mapFeatures") + " ";
      StringBuilder var10000;
      j6 var10002;
      if (this.ng) {
         var10000 = new StringBuilder();
         var10002 = this.mY;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.on")).toString();
      } else {
         var10000 = new StringBuilder();
         var10002 = this.mY;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.off")).toString();
      }

      this.mX.hw = var1.a("selectWorld.bonusItems") + " ";
      if (this.na && !this.m8) {
         var10000 = new StringBuilder();
         var10002 = this.mX;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.on")).toString();
      } else {
         var10000 = new StringBuilder();
         var10002 = this.mX;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.off")).toString();
      }

      this.nf.hw = var1.a("selectWorld.mapType") + " " + var1.a(yx.char[this.m1].try());
      this.nd.hw = var1.a("selectWorld.allowCommands") + " ";
      if (this.ne && !this.m8) {
         var10000 = new StringBuilder();
         var10002 = this.nd;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.on")).toString();
      } else {
         var10000 = new StringBuilder();
         var10002 = this.nd;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.off")).toString();
      }

   }

   public static String a(sg var0, String var1) {
      var1 = var1.replaceAll("[\\./\"]", "_");
      String[] var2 = mZ;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var2[var4];
         if (var1.equalsIgnoreCase(var5)) {
            var1 = "_" + var1 + "_";
         }
      }

      while(var0.a(var1) != null) {
         var1 = var1 + "-";
      }

      return var1;
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.hW.a(this.nl);
         } else if (var1.hv == 0) {
            this.hW.a((i5)null);
            if (this.m6) {
               return;
            }

            this.m6 = true;
            long var2 = (new Random()).nextLong();
            String var4 = this.nj.dc();
            if (!ajs.a(var4)) {
               try {
                  long var5 = Long.parseLong(var4);
                  if (var5 != 0L) {
                     var2 = var5;
                  }
               } catch (NumberFormatException var7) {
                  var2 = (long)var4.hashCode();
               }
            }

            yz var8 = yz.a(this.nh);
            y0 var6 = new y0(var2, var8, this.ng, this.m8, yx.char[this.m1]);
            var6.a(this.nm);
            if (this.na && !this.m8) {
               var6.try();
            }

            if (this.ne && !this.m8) {
               var6.for();
            }

            this.hW.a(this.ni, this.nk.dc().trim(), var6);
         } else if (var1.hv == 3) {
            this.eg();
         } else if (var1.hv == 2) {
            if (this.nh.equals("survival")) {
               if (!this.nc) {
                  this.ne = false;
               }

               this.m8 = false;
               this.nh = "hardcore";
               this.m8 = true;
               this.nd.hu = false;
               this.mX.hu = false;
               this.eh();
            } else if (this.nh.equals("hardcore")) {
               if (!this.nc) {
                  this.ne = true;
               }

               this.m8 = false;
               this.nh = "creative";
               this.eh();
               this.m8 = false;
               this.nd.hu = true;
               this.mX.hu = true;
            } else {
               if (!this.nc) {
                  this.ne = false;
               }

               this.nh = "survival";
               this.eh();
               this.nd.hu = true;
               this.mX.hu = true;
               this.m8 = false;
            }

            this.eh();
         } else if (var1.hv == 4) {
            this.ng = !this.ng;
            this.eh();
         } else if (var1.hv == 7) {
            this.na = !this.na;
            this.eh();
         } else if (var1.hv == 5) {
            ++this.m1;
            if (this.m1 >= yx.char.length) {
               this.m1 = 0;
            }

            while(yx.char[this.m1] == null || !yx.char[this.m1].if()) {
               ++this.m1;
               if (this.m1 >= yx.char.length) {
                  this.m1 = 0;
               }
            }

            this.nm = "";
            this.eh();
            this.p(this.m4);
         } else if (var1.hv == 6) {
            this.nc = true;
            this.ne = !this.ne;
            this.eh();
         } else if (var1.hv == 8) {
            this.hW.a((i5)(new j0(this, this.nm)));
         }

      }
   }

   private void eg() {
      this.p(!this.m4);
   }

   private void p(boolean var1) {
      this.m4 = var1;
      this.m2.ht = !this.m4;
      this.mY.ht = this.m4;
      this.mX.ht = this.m4;
      this.nf.ht = this.m4;
      this.nd.ht = this.m4;
      this.nb.ht = this.m4 && yx.char[this.m1] == yx.byte;
      aqy var2;
      if (this.m4) {
         var2 = aqy.if();
         this.m0.hw = var2.a("gui.done");
      } else {
         var2 = aqy.if();
         this.m0.hw = var2.a("selectWorld.moreWorldOptions");
      }

   }

   protected void if(char var1, int var2) {
      if (this.nk.c9() && !this.m4) {
         this.nk.a(var1, var2);
         this.m3 = this.nk.dc();
      } else if (this.nj.c9() && this.m4) {
         this.nj.a(var1, var2);
         this.m5 = this.nj.dc();
      }

      if (var1 == '\r') {
         this.a((j6)this.hT.get(0));
      }

      ((j6)this.hT.get(0)).hu = this.nk.dc().length() > 0;
      this.ei();
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      if (this.m4) {
         this.nj.case(var1, var2, var3);
      } else {
         this.nk.case(var1, var2, var3);
      }

   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("selectWorld.create"), this.hV / 2, 20, 16777215);
      if (this.m4) {
         this.if(this.hR, var4.a("selectWorld.enterSeed"), this.hV / 2 - 100, 47, 10526880);
         this.if(this.hR, var4.a("selectWorld.seedInfo"), this.hV / 2 - 100, 85, 10526880);
         this.if(this.hR, var4.a("selectWorld.mapFeatures.info"), this.hV / 2 - 150, 122, 10526880);
         this.if(this.hR, var4.a("selectWorld.allowCommands.info"), this.hV / 2 - 150, 172, 10526880);
         this.nj.db();
      } else {
         this.if(this.hR, var4.a("selectWorld.enterName"), this.hV / 2 - 100, 47, 10526880);
         this.if(this.hR, var4.a("selectWorld.resultFolder") + " " + this.ni, this.hV / 2 - 100, 85, 10526880);
         this.nk.db();
         this.if(this.hR, this.m9, this.hV / 2 - 100, 137, 10526880);
         this.if(this.hR, this.m7, this.hV / 2 - 100, 149, 10526880);
      }

      super.if(var1, var2, var3);
   }

   public void a(ss var1) {
      this.m3 = aqz.a("selectWorld.newWorld.copyOf", var1.l());
      this.m5 = var1.case() + "";
      this.m1 = var1.new().int();
      this.nm = var1.d();
      this.ng = var1.for();
      this.ne = var1.char();
      if (var1.void()) {
         this.nh = "hardcore";
      } else if (var1.f().if()) {
         this.nh = "survival";
      } else if (var1.f().do()) {
         this.nh = "creative";
      }

   }
}
