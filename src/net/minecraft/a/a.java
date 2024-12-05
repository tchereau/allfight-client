package net.minecraft.a;

import java.awt.GraphicsEnvironment;
import java.io.File;
import java.security.KeyPair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class a implements .ar0, Runnable, .ai8 {
   private static net.minecraft.a.a tV = null;
   private final .sg tU;
   private final .aja tT = new .aja("server", this);
   private final File tS;
   private final List tR = new ArrayList();
   private final .ar1 tQ;
   public final .ajq t5 = new .ajq();
   private String tP;
   private int tO = -1;
   public .ak5[] t4;
   private .amh tN;
   private boolean tM = true;
   private boolean tL = false;
   private int tK = 0;
   public String t3;
   public int t2;
   private boolean tJ;
   private boolean tI;
   private boolean tH;
   private boolean tG;
   private boolean tF;
   private String tE;
   private int tD;
   private long tC;
   private long tB;
   private long tA;
   private long tz;
   public final long[] t1 = new long[100];
   public final long[] t0 = new long[100];
   public final long[] tZ = new long[100];
   public final long[] tY = new long[100];
   public final long[] tX = new long[100];
   public long[][] tW;
   private KeyPair ty;
   private String tx;
   private String tw;
   private String tv;
   private boolean tu;
   private boolean tt;
   private boolean ts;
   private String tr = "";
   private boolean tq = false;
   private long tp;
   private String to;
   private boolean tn;

   public a(File var1) {
      tV = this;
      this.tS = var1;
      this.tQ = new .alt();
      this.tU = new .sy(var1);
      this.gR();
   }

   private void gR() {
      .am3.a();
   }

   protected abstract boolean gQ();

   protected void R(String var1) {
      if (this.gP().do(var1)) {
         this.a().a("Converting map!");
         this.P("menu.convertingLevel");
         this.gP().a(var1, (.ajo)(new .amn(this)));
      }

   }

   protected synchronized void P(String var1) {
      this.to = var1;
   }

   public synchronized String hm() {
      return this.to;
   }

   protected void a(String var1, String var2, long var3, .yx var5, String var6) {
      this.R(var1);
      this.P("menu.loadingLevel");
      this.t4 = new .ak5[3];
      this.tW = new long[this.t4.length][100];
      .si var7 = this.tU.a(var1, true);
      .ss var9 = var7.int();
      .y0 var8;
      if (var9 == null) {
         var8 = new .y0(var3, this.gK(), this.gX(), this.g0(), var5);
         var8.a(var6);
      } else {
         var8 = new .y0(var9);
      }

      if (this.tt) {
         var8.try();
      }

      for(int var10 = 0; var10 < this.t4.length; ++var10) {
         byte var11 = 0;
         if (var10 == 1) {
            var11 = -1;
         }

         if (var10 == 2) {
            var11 = 1;
         }

         if (var10 == 0) {
            if (this.hk()) {
               this.t4[var10] = new .ale(this, var7, var2, var11, this.t5, this.a());
            } else {
               this.t4[var10] = new .ak5(this, var7, var2, var11, var8, this.t5, this.a());
            }
         } else {
            this.t4[var10] = new .alc(this, var7, var2, var11, var8, this.t4[0], this.t5, this.a());
         }

         this.t4[var10].a((.y1)(new .ak9(this, this.t4[var10])));
         if (!this.hb()) {
            this.t4[var10].l().a(this.gK());
         }

         this.tN.a(this.t4);
      }

      this.aU(this.g5());
      this.gW();
   }

   protected void gW() {
      int var5 = 0;
      this.P("menu.generatingTerrain");
      byte var6 = 0;
      this.a().a("Preparing start region for level " + var6);
      .ak5 var7 = this.t4[var6];
      .apg var8 = var7.long();
      long var9 = System.currentTimeMillis();

      for(int var11 = -192; var11 <= 192 && this.g8(); var11 += 16) {
         for(int var12 = -192; var12 <= 192 && this.g8(); var12 += 16) {
            long var13 = System.currentTimeMillis();
            if (var13 - var9 > 1000L) {
               this.int("Preparing spawn area", var5 * 100 / 625);
               var9 = var13;
            }

            ++var5;
            var7.T.if(var8.if + var11 >> 4, var8.do + var12 >> 4);
         }
      }

      this.g3();
   }

   public abstract boolean gX();

   public abstract .yz gK();

   public abstract int g5();

   public abstract boolean g0();

   protected void int(String var1, int var2) {
      this.t3 = var1;
      this.t2 = var2;
      this.a().a(var1 + ": " + var2 + "%");
   }

   protected void g3() {
      this.t3 = null;
      this.t2 = 0;
   }

   protected void S(boolean var1) {
      if (!this.ts) {
         .ak5[] var2 = this.t4;
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            .ak5 var5 = var2[var4];
            if (var5 != null) {
               if (!var1) {
                  this.a().a("Saving chunks for level '" + var5.l().l() + "'/" + var5.n.try());
               }

               try {
                  var5.a(true, (.ajo)null);
               } catch (.y2 var7) {
                  this.a().if(var7.getMessage());
               }
            }
         }

      }
   }

   public void g7() {
      if (!this.ts) {
         this.a().a("Stopping server");
         if (this.ho() != null) {
            this.ho().do();
         }

         if (this.tN != null) {
            this.a().a("Saving players");
            this.tN.byte();
            this.tN.c();
         }

         this.a().a("Saving worlds");
         this.S(false);

         for(int var1 = 0; var1 < this.t4.length; ++var1) {
            .ak5 var2 = this.t4[var1];
            var2.J();
         }

         if (this.tT != null && this.tT.int()) {
            this.tT.do();
         }

      }
   }

   public String gY() {
      return this.tP;
   }

   public void N(String var1) {
      this.tP = var1;
   }

   public boolean g8() {
      return this.tM;
   }

   public void ha() {
      this.tM = false;
   }

   public void run() {
      try {
         if (this.gQ()) {
            long var1 = System.currentTimeMillis();

            for(long var50 = 0L; this.tM; this.tq = true) {
               long var5 = System.currentTimeMillis();
               long var7 = var5 - var1;
               if (var7 > 2000L && var1 - this.tp >= 15000L) {
                  this.a().if("Can't keep up! Did the system time change, or is the server overloaded?");
                  var7 = 2000L;
                  this.tp = var1;
               }

               if (var7 < 0L) {
                  this.a().if("Time ran backwards! Did the system time change?");
                  var7 = 0L;
               }

               var50 += var7;
               var1 = var5;
               if (this.t4[0].H()) {
                  this.hf();
                  var50 = 0L;
               } else {
                  while(var50 > 50L) {
                     var50 -= 50L;
                     this.hf();
                  }
               }

               Thread.sleep(1L);
            }
         } else {
            this.a((.aqh)null);
         }
      } catch (Throwable var48) {
         var48.printStackTrace();
         this.a().a("Encountered an unexpected exception " + var48.getClass().getSimpleName(), var48);
         .aqh var2 = null;
         if (var48 instanceof .ape) {
            var2 = this.if(((.ape)var48).a());
         } else {
            var2 = this.if(new .aqh("Exception in server tick loop", var48));
         }

         File var3 = new File(new File(this.g4(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
         if (var2.a(var3, this.a())) {
            this.a().do("This crash report has been saved to: " + var3.getAbsolutePath());
         } else {
            this.a().do("We were unable to save this crash report to disk.");
         }

         this.a(var2);
      } finally {
         try {
            this.g7();
            this.tL = true;
         } catch (Throwable var46) {
            var46.printStackTrace();
         } finally {
            this.he();
         }

      }

   }

   protected File g4() {
      return new File(".");
   }

   protected void a(.aqh var1) {
   }

   protected void he() {
   }

   public void hf() {
      long var1 = System.nanoTime();
      .nw.if().do();
      ++this.tK;
      if (this.tn) {
         this.tn = false;
         this.t5.else = true;
         this.t5.do();
      }

      this.t5.a("root");
      this.hh();
      if (this.tK % 900 == 0) {
         this.t5.a("save");
         this.tN.byte();
         this.S(true);
         this.t5.if();
      }

      this.t5.a("tallying");
      this.tX[this.tK % 100] = System.nanoTime() - var1;
      this.t1[this.tK % 100] = .an7.if - this.tC;
      this.tC = .an7.if;
      this.t0[this.tK % 100] = .an7.a - this.tB;
      this.tB = .an7.a;
      this.tZ[this.tK % 100] = .an7.for - this.tA;
      this.tA = .an7.for;
      this.tY[this.tK % 100] = .an7.do - this.tz;
      this.tz = .an7.do;
      this.t5.if();
      this.t5.a("snooper");
      if (!this.tT.int() && this.tK > 100) {
         this.tT.for();
      }

      if (this.tK % 6000 == 0) {
         this.tT.a();
      }

      this.t5.if();
      this.t5.if();
   }

   public void hh() {
      this.t5.a("levels");

      int var1;
      for(var1 = 0; var1 < this.t4.length; ++var1) {
         long var2 = System.nanoTime();
         if (var1 == 0 || this.hj()) {
            .ak5 var4 = this.t4[var1];
            this.t5.a(var4.l().l());
            this.t5.a("pools");
            var4.do().for();
            this.t5.if();
            if (this.tK % 20 == 0) {
               this.t5.a("timeSync");
               this.tN.a((.an7)(new .ani(var4.m(), var4.t())), var4.n.if);
               this.t5.if();
            }

            this.t5.a("tick");

            .aqh var6;
            try {
               var4.d();
            } catch (Throwable var8) {
               var6 = .aqh.a(var8, "Exception ticking world");
               var4.a((.aqh)var6);
               throw new .ape(var6);
            }

            try {
               var4.p();
            } catch (Throwable var7) {
               var6 = .aqh.a(var7, "Exception ticking world entities");
               var4.a((.aqh)var6);
               throw new .ape(var6);
            }

            this.t5.if();
            this.t5.a("tracker");
            var4.D().a();
            this.t5.if();
            this.t5.if();
         }

         this.tW[var1][this.tK % 100] = System.nanoTime() - var2;
      }

      this.t5.do("connection");
      this.ho().a();
      this.t5.do("players");
      this.tN.new();
      this.t5.do("tickables");

      for(var1 = 0; var1 < this.tR.size(); ++var1) {
         ((.amd)this.tR.get(var1)).a();
      }

      this.t5.if();
   }

   public boolean hj() {
      return true;
   }

   public void hn() {
      (new .amm(this, "Server thread")).start();
   }

   public File M(String var1) {
      return new File(this.g4(), var1);
   }

   public void J(String var1) {
      this.a().a(var1);
   }

   public void I(String var1) {
      this.a().if(var1);
   }

   public .ak5 aS(int var1) {
      if (var1 == -1) {
         return this.t4[1];
      } else {
         return var1 == 1 ? this.t4[2] : this.t4[0];
      }
   }

   public String hl() {
      return this.tP;
   }

   public int hr() {
      return this.tO;
   }

   public String gL() {
      return this.tE;
   }

   public String hq() {
      return "1.5.1";
   }

   public int hw() {
      return this.tN.if();
   }

   public int hz() {
      return this.tN.else();
   }

   public String[] hs() {
      return this.tN.try();
   }

   public String hi() {
      return "";
   }

   public String H(String var1) {
      .akr.tm.gG();
      this.tQ.a(.akr.tm, var1);
      return .akr.tm.gH();
   }

   public boolean g1() {
      return false;
   }

   public void G(String var1) {
      this.a().do(var1);
   }

   public void F(String var1) {
      if (this.g1()) {
         this.a().a(var1);
      }

   }

   public String hd() {
      return "vanilla";
   }

   public .aqh if(.aqh var1) {
      var1.for().a((String)"Profiler Position", (Callable)(new .aml(this)));
      if (this.t4 != null && this.t4.length > 0 && this.t4[0] != null) {
         var1.for().a((String)"Vec3 Pool Size", (Callable)(new .amk(this)));
      }

      if (this.tN != null) {
         var1.for().a((String)"Player Count", (Callable)(new .amj(this)));
      }

      return var1;
   }

   public List a(.ar0 var1, String var2) {
      ArrayList var3 = new ArrayList();
      if (var2.startsWith("/")) {
         var2 = var2.substring(1);
         boolean var10 = !var2.contains(" ");
         List var11 = this.tQ.if(var1, var2);
         if (var11 != null) {
            Iterator var12 = var11.iterator();

            while(var12.hasNext()) {
               String var13 = (String)var12.next();
               if (var10) {
                  var3.add("/" + var13);
               } else {
                  var3.add(var13);
               }
            }
         }

         return var3;
      } else {
         String[] var4 = var2.split(" ", -1);
         String var5 = var4[var4.length - 1];
         String[] var6 = this.tN.try();
         int var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            if (.ao8.a(var5, var9)) {
               var3.add(var9);
            }
         }

         return var3;
      }
   }

   public static net.minecraft.a.a g2() {
      return tV;
   }

   public String do() {
      return "Server";
   }

   public void a(String var1) {
      this.a().a(.ajm.a(var1));
   }

   public boolean a(int var1, String var2) {
      return true;
   }

   public String a(String var1, Object... var2) {
      return .aqy.if().a(var1, var2);
   }

   public .ar1 gM() {
      return this.tQ;
   }

   public KeyPair g9() {
      return this.ty;
   }

   public int hc() {
      return this.tO;
   }

   public void aR(int var1) {
      this.tO = var1;
   }

   public String hC() {
      return this.tx;
   }

   public void S(String var1) {
      this.tx = var1;
   }

   public boolean hb() {
      return this.tx != null;
   }

   public String gT() {
      return this.tw;
   }

   public void Q(String var1) {
      this.tw = var1;
   }

   public void O(String var1) {
      this.tv = var1;
   }

   public String hE() {
      return this.tv;
   }

   public void a(KeyPair var1) {
      this.ty = var1;
   }

   public void aU(int var1) {
      for(int var2 = 0; var2 < this.t4.length; ++var2) {
         .ak5 var3 = this.t4[var2];
         if (var3 != null) {
            if (var3.l().void()) {
               var3.p = 3;
               var3.a(true, true);
            } else if (this.hb()) {
               var3.p = var1;
               var3.a(var3.p > 0, true);
            } else {
               var3.p = var1;
               var3.a(this.hg(), this.tI);
            }
         }
      }

   }

   protected boolean hg() {
      return true;
   }

   public boolean hk() {
      return this.tu;
   }

   public void Q(boolean var1) {
      this.tu = var1;
   }

   public void O(boolean var1) {
      this.tt = var1;
   }

   public .sg gP() {
      return this.tU;
   }

   public void hp() {
      this.ts = true;
      this.gP().a();

      for(int var1 = 0; var1 < this.t4.length; ++var1) {
         .ak5 var2 = this.t4[var1];
         if (var2 != null) {
            var2.J();
         }
      }

      this.gP().for(this.t4[0].x().if());
      this.ha();
   }

   public String gU() {
      return this.tr;
   }

   public void L(String var1) {
      this.tr = var1;
   }

   public void if(.aja var1) {
      var1.a("whitelist_enabled", false);
      var1.a("whitelist_count", 0);
      var1.a("players_current", this.hw());
      var1.a("players_max", this.hz());
      var1.a("players_seen", this.tN.d().length);
      var1.a("uses_auth", this.tJ);
      var1.a("gui_state", this.gJ() ? "enabled" : "disabled");
      var1.a("avg_tick_ms", (int)(.ajs.a(this.tX) * 1.0E-6D));
      var1.a("avg_sent_packet_count", (int).ajs.a(this.t1));
      var1.a("avg_sent_packet_size", (int).ajs.a(this.t0));
      var1.a("avg_rec_packet_count", (int).ajs.a(this.tZ));
      var1.a("avg_rec_packet_size", (int).ajs.a(this.tY));
      int var2 = 0;

      for(int var3 = 0; var3 < this.t4.length; ++var3) {
         if (this.t4[var3] != null) {
            .ak5 var4 = this.t4[var3];
            .ss var5 = var4.l();
            var1.a("world[" + var2 + "][dimension]", var4.n.if);
            var1.a("world[" + var2 + "][mode]", var5.f());
            var1.a("world[" + var2 + "][difficulty]", var4.p);
            var1.a("world[" + var2 + "][hardcore]", var5.void());
            var1.a("world[" + var2 + "][generator_name]", var5.new().byte());
            var1.a("world[" + var2 + "][generator_version]", var5.new().do());
            var1.a("world[" + var2 + "][height]", this.tD);
            var1.a("world[" + var2 + "][chunks_loaded]", var4.new().do());
            ++var2;
         }
      }

      var1.a("worlds", var2);
   }

   public void a(.aja var1) {
      var1.a("singleplayer", this.hb());
      var1.a("server_brand", this.hd());
      var1.a("gui_supported", GraphicsEnvironment.isHeadless() ? "headless" : "supported");
      var1.a("dedicated", this.ht());
   }

   public boolean if() {
      return true;
   }

   public int hx() {
      return 16;
   }

   public abstract boolean ht();

   public boolean hu() {
      return this.tJ;
   }

   public void N(boolean var1) {
      this.tJ = var1;
   }

   public boolean hv() {
      return this.tI;
   }

   public void M(boolean var1) {
      this.tI = var1;
   }

   public boolean hy() {
      return this.tH;
   }

   public void T(boolean var1) {
      this.tH = var1;
   }

   public boolean hA() {
      return this.tG;
   }

   public void R(boolean var1) {
      this.tG = var1;
   }

   public boolean hD() {
      return this.tF;
   }

   public void P(boolean var1) {
      this.tF = var1;
   }

   public abstract boolean hF();

   public String gV() {
      return this.tE;
   }

   public void K(String var1) {
      this.tE = var1;
   }

   public int hG() {
      return this.tD;
   }

   public void aT(int var1) {
      this.tD = var1;
   }

   public boolean hB() {
      return this.tL;
   }

   public .amh g6() {
      return this.tN;
   }

   public void a(.amh var1) {
      this.tN = var1;
   }

   public void if(.yz var1) {
      for(int var2 = 0; var2 < this.t4.length; ++var2) {
         g2().t4[var2].l().a(var1);
      }

   }

   public abstract .aku ho();

   public boolean gI() {
      return this.tq;
   }

   public boolean gJ() {
      return false;
   }

   public abstract String a(.yz var1, boolean var2);

   public int gO() {
      return this.tK;
   }

   public void gN() {
      this.tn = true;
   }

   public .aja gZ() {
      return this.tT;
   }

   public .apg for() {
      return new .apg(0, 0, 0);
   }

   public int gS() {
      return 16;
   }

   public boolean a(.y6 var1, int var2, int var3, int var4, .aek var5) {
      return false;
   }

   public abstract .ajw a();

   // $FF: synthetic method
   public static .amh a(net.minecraft.a.a var0) {
      return var0.tN;
   }
}
