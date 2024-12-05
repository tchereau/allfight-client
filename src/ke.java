import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class ke {
   private static final String[] a7 = new String[]{"options.renderDistance.far", "options.renderDistance.normal", "options.renderDistance.short", "options.renderDistance.tiny"};
   private static final String[] a5 = new String[]{"options.difficulty.peaceful", "options.difficulty.easy", "options.difficulty.normal", "options.difficulty.hard"};
   private static final String[] a3 = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
   private static final String[] a1 = new String[]{"options.chat.visibility.full", "options.chat.visibility.system", "options.chat.visibility.hidden"};
   private static final String[] a0 = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
   private static final String[] aZ = new String[]{"performance.max", "performance.balanced", "performance.powersaver"};
   private static final String[] aY = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
   public float ar = 1.0F;
   public float ap = 1.0F;
   public float ao = 0.5F;
   public boolean am = false;
   public int al = 0;
   public boolean ak = true;
   public boolean aj = false;
   public boolean ai = false;
   public int ah = 1;
   public boolean ag = true;
   public int af = 2;
   public boolean ad = true;
   public int B = 128;
   public int long = 0;
   public int case = 1;
   public float char = 0.8F;
   public int z = 0;
   public boolean do = false;
   public boolean e = false;
   public int r = 0;
   public boolean for = false;
   public boolean x = false;
   public boolean aa = qs.aB();
   public boolean i = qs.aB();
   public float br = 1.0F;
   public int k = 0;
   public int H = 1;
   public int bv = 0;
   public float int = 1.0F;
   public int bk = 0;
   public int t = 0;
   public int s = 0;
   public int ae = 0;
   public int g = 0;
   public int aW = 3;
   public int an = 4000;
   public boolean D = false;
   public boolean bi = false;
   public boolean j = true;
   public boolean E = true;
   public boolean G = true;
   public boolean bw = true;
   public int f = 1;
   public int I = 0;
   public boolean aO = false;
   public int y = 0;
   public boolean m = false;
   public boolean b = true;
   public boolean h = false;
   public String d = "Default";
   public boolean X = true;
   public boolean l = true;
   public boolean o = true;
   public boolean K = true;
   public boolean bt = true;
   public boolean byte = true;
   public boolean a2 = true;
   public int u = 2;
   public boolean if = false;
   public int A = 0;
   public int R = 0;
   public boolean J = true;
   public boolean aq = true;
   public boolean p = true;
   public boolean bg = true;
   public boolean av = true;
   public boolean n = true;
   public boolean v = true;
   public boolean a4 = true;
   public boolean a = true;
   public boolean void = true;
   public boolean try = true;
   public boolean C = true;
   public boolean F = true;
   public boolean c = true;
   public static final int bq = 0;
   public static final int else = 1;
   public static final int bu = 2;
   public static final int bs = 3;
   public static final int aQ = 0;
   public static final int q = 1;
   public static final int w = 2;
   public static final int bp = 0;
   public static final int goto = 1;
   public static final int L = 2;
   public static final String aI = "Default";
   public k2 a6;
   public String ac = "Default";
   public int ab = 0;
   public boolean Z = true;
   public boolean Y = true;
   public boolean W = true;
   public float V = 1.0F;
   public boolean U = true;
   public boolean T = true;
   public boolean S = false;
   public boolean Q = true;
   public boolean P = false;
   public boolean O = false;
   public boolean N = true;
   public boolean M = true;
   public boolean aV = false;
   public int aU = 0;
   public int aT = 0;
   public boolean aS = true;
   public float aR = 1.0F;
   public float aP = 1.0F;
   public float aN = 0.44366196F;
   public float aM = 1.0F;
   public k2 aL = new k2("key.forward", 17);
   public k2 aK = new k2("key.left", 30);
   public k2 aJ = new k2("key.back", 31);
   public k2 aH = new k2("key.right", 32);
   public k2 aG = new k2("key.jump", 57);
   public k2 aF = new k2("key.inventory", 18);
   public k2 aE = new k2("key.drop", 16);
   public k2 aD = new k2("key.chat", 20);
   public k2 aC = new k2("key.sneak", 42);
   public k2 aB = new k2("key.attack", -100);
   public k2 aA = new k2("key.use", -99);
   public k2 az = new k2("key.playerlist", 15);
   public k2 ay = new k2("key.pickItem", -98);
   public k2 ax = new k2("key.command", 53);
   public k2[] aw;
   protected Minecraft au;
   private File aX;
   public int at;
   public boolean as;
   public int bo;
   public boolean bn;
   public boolean bm;
   public String bl;
   public boolean bj;
   public boolean bh;
   public boolean bf;
   public float be;
   public float bd;
   public float bc;
   public float bb;
   public int ba;
   public int a9;
   public String a8;
   private File new;

   public ke(Minecraft var1, File var2) {
      this.al = 1;
      this.ah = 0;
      this.a6 = new k2("Zoom", 29);
      this.aw = new k2[]{this.aB, this.aA, this.aL, this.aK, this.aJ, this.aH, this.aG, this.aC, this.aE, this.aF, this.aD, this.az, this.ay, this.a6, this.ax};
      this.at = 2;
      this.as = false;
      this.bo = 0;
      this.bn = false;
      this.bm = false;
      this.bl = "";
      this.bj = false;
      this.bh = false;
      this.bf = false;
      this.be = 1.0F;
      this.bd = 1.0F;
      this.bc = 0.0F;
      this.bb = 0.0F;
      this.ba = 0;
      this.a9 = 0;
      this.a8 = "en_US";
      this.au = var1;
      this.aX = new File(var2, "options.txt");
      this.new = new File(var2, "optionsof.txt");
      this.int();
      qs.a(this);
   }

   public ke() {
      this.al = 1;
      this.ah = 0;
      this.a6 = new k2("Zoom", 29);
      this.aw = new k2[]{this.aB, this.aA, this.aL, this.aK, this.aJ, this.aH, this.aG, this.aC, this.aE, this.aF, this.aD, this.az, this.ay, this.a6, this.ax};
      this.at = 2;
      this.as = false;
      this.bo = 0;
      this.bn = false;
      this.bm = false;
      this.bl = "";
      this.bj = false;
      this.bh = false;
      this.bf = false;
      this.be = 1.0F;
      this.bd = 1.0F;
      this.bc = 0.0F;
      this.bb = 0.0F;
      this.ba = 0;
      this.a9 = 0;
      this.a8 = "en_US";
   }

   public String a(int var1) {
      aqy var2 = aqy.if();
      return var2.a(this.aw[var1].new);
   }

   public String if(int var1) {
      int var2 = this.aw[var1].int;
      return new(var2);
   }

   public static String new(int var0) {
      return var0 < 0 ? aqz.a("key.mouseButton", var0 + 101) : Keyboard.getKeyName(var0);
   }

   public static boolean a(k2 var0) {
      return var0.int < 0 ? Mouse.isButtonDown(var0.int + 100) : Keyboard.isKeyDown(var0.int);
   }

   public void a(int var1, int var2) {
      this.aw[var1].int = var2;
      this.new();
   }

   public void a(kc var1, float var2) {
      if (var1 == kc.S) {
         this.ar = var2;
         this.au.uX.int();
      }

      if (var1 == kc.Q) {
         this.ap = var2;
         this.au.uX.int();
      }

      if (var1 == kc.O) {
         this.ao = var2;
      }

      if (var1 == kc.M) {
         this.bc = var2;
      }

      if (var1 == kc.L) {
         this.bb = var2;
      }

      if (var1 == kc.long) {
         this.int = var2;
      }

      if (var1 == kc.e) {
         this.br = var2;
         this.au.vl.case();
      }

      if (var1 == kc.x) {
         int var3 = this.B;
         this.B = 32 + (int)(var2 * 480.0F);
         this.B = this.B >> 4 << 4;
         this.B = qs.if(this.B, 32, 512);
         this.al = int(this.B);
         if (this.B != var3) {
            this.au.vl.case();
         }
      }

      if (var1 == kc.ar) {
         this.long = (int)(var2 * 200.0F);
         this.Q = false;
         if (this.long < 5) {
            this.Q = true;
            this.long = 0;
         }

         if (this.long > 199) {
            this.Q = false;
            this.long = 0;
         }

         if (this.long > 30) {
            this.long = this.long / 5 * 5;
         }

         if (this.long > 100) {
            this.long = this.long / 10 * 10;
         }

         this.ah = do(this.long);
         this.try();
      }

      if (var1 == kc.s) {
         this.V = var2;
         this.au.u4.c5().dr();
      }

      if (var1 == kc.ak) {
         this.aM = var2;
         this.au.u4.c5().dr();
      }

      if (var1 == kc.ah) {
         this.aN = var2;
         this.au.u4.c5().dr();
      }

      if (var1 == kc.al) {
         this.aP = var2;
         this.au.u4.c5().dr();
      }

      if (var1 == kc.am) {
         this.aR = var2;
         this.au.u4.c5().dr();
      }

   }

   private void if() {
      byte var1 = 3;
      if (this.m) {
         var1 = 1;
      }

      pa.ba.new(var1);
      pa.bb.new(var1);
      if (this.au.vm != null) {
         x0 var2 = this.au.vm.l;
         if (var2 != null) {
            for(int var3 = -512; var3 < 512; ++var3) {
               for(int var4 = -512; var4 < 512; ++var4) {
                  if (var2.for(var3, var4)) {
                     xx var5 = var2.do(var3, var4);
                     if (var5 != null && !(var5 instanceof xy)) {
                        xw[] var6 = var5.else();

                        for(int var7 = 0; var7 < var6.length; ++var7) {
                           xw var8 = var6[var7];
                           if (var8 != null) {
                              xz var9 = var8.byte();
                              if (var9 != null) {
                                 byte[] var10 = var9.if;

                                 for(int var11 = 0; var11 < var10.length; ++var11) {
                                    var10[var11] = 0;
                                 }
                              }
                           }
                        }

                        var5.for();
                     }
                  }
               }
            }

            this.au.vl.case();
         }
      }

   }

   public void for() {
      switch(this.I) {
      case 1:
         ajt.a(new dk());
         break;
      case 2:
         ajt.a(new yc());
         break;
      default:
         ajt.a((p)null);
      }

      if (this.au.vl != null) {
         this.au.vl.case();
      }

   }

   public void a(boolean var1) {
      int var2 = var1 ? 0 : 2;
      this.A = var2;
      this.R = var2;
      this.J = var1;
      this.aq = var1;
      this.p = var1;
      this.bg = var1;
      this.av = var1;
      this.n = var1;
      this.v = var1;
      this.a4 = var1;
      this.a = var1;
      this.void = var1;
      this.a9 = var1 ? 0 : 2;
      this.try = var1;
      this.C = var1;
      this.F = var1;
      this.c = var1;
      this.au.vb.new();
   }

   public void a(kc var1, int var2) {
      if (var1 == kc.P) {
         this.am = !this.am;
      }

      if (var1 == kc.K) {
         this.al = this.al + var2 & 3;
         this.B = try(this.al);
      }

      if (var1 == kc.A) {
         this.ba = this.ba + var2 & 3;
      }

      if (var1 == kc.y) {
         this.a9 = (this.a9 + var2) % 3;
      }

      if (var1 == kc.J) {
         this.ak = !this.ak;
      }

      if (var1 == kc.z) {
         this.ad = !this.ad;
      }

      if (var1 == kc.H) {
         if (!qs.H()) {
            this.for = false;
            this.ai = false;
         } else if (!this.ai) {
            this.ai = true;
            this.for = false;
         } else if (!this.for) {
            this.for = true;
         } else {
            this.for = false;
            this.ai = false;
         }

         this.au.vl.new();
      }

      if (var1 == kc.I) {
         this.aj = !this.aj;
         this.au.vb.new();
      }

      if (var1 == kc.G) {
         this.ah = (this.ah + var2 + 3) % 3;
         this.long = for(this.ah);
      }

      if (var1 == kc.F) {
         this.at = this.at + var2 & 3;
      }

      if (var1 == kc.D) {
         this.ag = !this.ag;
         this.au.vl.case();
      }

      if (var1 == kc.C) {
         this.af = (this.af + var2) % 3;
         this.au.vl.case();
      }

      if (var1 == kc.Y) {
         switch(this.case) {
         case 1:
            this.case = 2;
            if (!qs.h()) {
               this.case = 3;
            }
            break;
         case 2:
            this.case = 3;
            break;
         case 3:
            this.case = 1;
            break;
         default:
            this.case = 1;
         }
      }

      if (var1 == kc.ai) {
         this.char += 0.2F;
         if (this.char > 0.81F) {
            this.char = 0.2F;
         }
      }

      if (var1 == kc.aq) {
         ++this.z;
         if (this.z > 4) {
            this.z = 0;
         }

         this.au.vb.new();
      }

      if (var1 == kc.E) {
         this.do = !this.do;
         this.au.vb.new();
      }

      if (var1 == kc.aG) {
         this.e = !this.e;
         this.au.vl.case();
      }

      if (var1 == kc.R) {
         this.r += 2;
         if (this.r > 8) {
            this.r = 0;
         }

         this.au.vl.case();
      }

      if (var1 == kc.else) {
         this.x = !this.x;
      }

      if (var1 == kc.Z) {
         this.aa = !this.aa;
         qs.t();
      }

      if (var1 == kc.byte) {
         ++this.bv;
         if (this.bv > 3) {
            this.bv = 0;
         }
      }

      if (var1 == kc.U) {
         ++this.bk;
         if (this.bk > 2) {
            this.bk = 0;
         }

         this.au.vl.case();
      }

      if (var1 == kc.aw) {
         ++this.t;
         if (this.t > 2) {
            this.t = 0;
         }

         c2.n = qs.X();
         this.au.vl.case();
      }

      if (var1 == kc.aE) {
         ++this.g;
         if (this.g > 2) {
            this.g = 0;
         }
      }

      if (var1 == kc.az) {
         ++this.s;
         if (this.s > 3) {
            this.s = 0;
         }
      }

      if (var1 == kc.a) {
         ++this.ae;
         if (this.ae > 2) {
            this.ae = 0;
         }
      }

      if (var1 == kc.h) {
         ++this.A;
         if (this.A > 2) {
            this.A = 0;
         }

         this.au.vb.new();
      }

      if (var1 == kc.ax) {
         ++this.R;
         if (this.R > 2) {
            this.R = 0;
         }

         this.au.vb.new();
      }

      if (var1 == kc.if) {
         this.J = !this.J;
         this.au.vb.new();
      }

      if (var1 == kc.j) {
         this.aq = !this.aq;
         this.au.vb.new();
      }

      if (var1 == kc.aC) {
         this.p = !this.p;
      }

      if (var1 == kc.X) {
         this.bg = !this.bg;
      }

      if (var1 == kc.goto) {
         this.av = !this.av;
      }

      if (var1 == kc.aj) {
         this.n = !this.n;
      }

      if (var1 == kc.d) {
         this.v = !this.v;
      }

      if (var1 == kc.new) {
         this.a4 = !this.a4;
      }

      if (var1 == kc.p) {
         this.void = !this.void;
      }

      if (var1 == kc.ay) {
         this.try = !this.try;
      }

      if (var1 == kc.W) {
         this.C = !this.C;
         this.au.vb.new();
      }

      if (var1 == kc.for) {
         this.c = !this.c;
      }

      if (var1 == kc.af) {
         this.F = !this.F;
         this.au.vb.new();
      }

      if (var1 == kc.B) {
         this.a = !this.a;
      }

      if (var1 == kc.ad) {
         this.D = !this.D;
      }

      if (var1 == kc.g) {
         this.an *= 10;
         if (this.an > 40000) {
            this.an = 40;
         }
      }

      if (var1 == kc.aF) {
         ++this.aW;
         if (this.aW > 3) {
            this.aW = 1;
         }

         this.au.vl.case();
      }

      if (var1 == kc.aB) {
         ++this.u;
         if (this.u > 3) {
            this.u = 1;
         }

         this.au.vl.case();
      }

      if (var1 == kc.k) {
         this.j = !this.j;
      }

      if (var1 == kc.as) {
         this.E = !this.E;
      }

      if (var1 == kc.at) {
         this.G = !this.G;
      }

      if (var1 == kc.case) {
         this.bw = !this.bw;
      }

      if (var1 == kc.try) {
         ++this.f;
         if (this.f > 5) {
            this.f = 1;
         }
      }

      if (var1 == kc.void) {
         ++this.I;
         if (this.I > 2) {
            this.I = 0;
         }

         this.for();
      }

      if (var1 == kc.aH) {
         this.aO = !this.aO;
      }

      if (var1 == kc.do) {
         ++this.y;
         if (this.y > 3) {
            this.y = 0;
         }
      }

      if (var1 == kc.aa) {
         this.m = !this.m;
         this.if();
      }

      if (var1 == kc.T) {
         this.b = !this.b;
      }

      if (var1 == kc.av) {
         this.k = 0;
      }

      if (var1 == kc.aD) {
         this.H = 1;
      }

      if (var1 == kc.au) {
         this.bi = !this.bi;
      }

      if (var1 == kc.char) {
         this.h = !this.h;
         this.au.vl.case();
      }

      if (var1 == kc.u) {
         this.X = !this.X;
         this.au.vl.case();
      }

      if (var1 == kc.N) {
         this.l = !this.l;
         this.au.vb.new();
      }

      if (var1 == kc.i) {
         this.o = !this.o;
         this.au.vl.case();
      }

      if (var1 == kc.b) {
         this.K = !this.K;
         this.au.vb.new();
      }

      if (var1 == kc.V) {
         this.bt = !this.bt;
         this.au.vb.new();
         this.au.vl.case();
      }

      if (var1 == kc.int) {
         this.byte = !this.byte;
         this.au.vb.new();
      }

      if (var1 == kc.ap) {
         this.a2 = !this.a2;
         this.au.vl.if();
      }

      if (var1 == kc.f) {
         this.if = !this.if;
         this.au.vb.new();
         this.au.vl.case();
      }

      if (var1 == kc.n) {
         this.i = !this.i;
         this.au.vl.case();
      }

      if (var1 == kc.c) {
         List var3 = Arrays.asList(qs.m());
         if (this.d.equals("Default")) {
            this.d = (String)var3.get(0);
         } else {
            int var4 = var3.indexOf(this.d);
            if (var4 < 0) {
               this.d = "Default";
            } else {
               ++var4;
               if (var4 >= var3.size()) {
                  this.d = "Default";
               } else {
                  this.d = (String)var3.get(var4);
               }
            }
         }
      }

      if (var1 == kc.aA) {
         this.aS = !this.aS;
      }

      if (var1 == kc.w) {
         this.ab = (this.ab + var2) % 3;
      }

      if (var1 == kc.v) {
         this.Z = !this.Z;
      }

      if (var1 == kc.t) {
         this.Y = !this.Y;
      }

      if (var1 == kc.r) {
         this.W = !this.W;
      }

      if (var1 == kc.q) {
         this.U = !this.U;
      }

      if (var1 == kc.o) {
         this.T = !this.T;
      }

      if (var1 == kc.ao) {
         this.M = !this.M;
      }

      if (var1 == kc.an) {
         this.aV = !this.aV;
      }

      if (var1 == kc.m) {
         this.S = !this.S;
         if (this.au.ib() != this.S) {
            this.au.hN();
         }
      }

      if (var1 == kc.l) {
         this.Q = !this.Q;
         Display.setVSyncEnabled(this.Q);
      }

      this.new();
   }

   public float a(kc var1) {
      return var1 == kc.long ? this.int : (var1 == kc.e ? this.br : (var1 == kc.x ? (float)(this.B - 32) / 480.0F : (var1 == kc.ar ? (this.long > 0 && this.long < 200 ? (float)this.long / 200.0F : (this.Q ? 0.0F : 1.0F)) : (var1 == kc.M ? this.bc : (var1 == kc.L ? this.bb : (var1 == kc.S ? this.ar : (var1 == kc.Q ? this.ap : (var1 == kc.O ? this.ao : (var1 == kc.s ? this.V : (var1 == kc.ak ? this.aM : (var1 == kc.ah ? this.aN : (var1 == kc.am ? this.aR : (var1 == kc.al ? this.aP : 0.0F)))))))))))));
   }

   public boolean if(kc var1) {
      // $FF: Couldn't be decompiled
   }

   private static String a(String[] var0, int var1) {
      if (var1 < 0 || var1 >= var0.length) {
         var1 = 0;
      }

      aqy var2 = aqy.if();
      return var2.a(var0[var1]);
   }

   public String do(kc var1) {
      aqy var2 = aqy.if();
      String var3 = var2.a(var1.for());
      if (var3 == null) {
         var3 = var1.for();
      }

      String var4 = var3 + ": ";
      if (var1 == kc.x) {
         String var9 = "Tiny";
         short var6 = 32;
         if (this.B >= 64) {
            var9 = "Short";
            var6 = 64;
         }

         if (this.B >= 128) {
            var9 = "Normal";
            var6 = 128;
         }

         if (this.B >= 256) {
            var9 = "Far";
            var6 = 256;
         }

         if (this.B >= 512) {
            var9 = "Extreme";
            var6 = 512;
         }

         int var7 = this.B - var6;
         return var7 == 0 ? var4 + var9 : var4 + var9 + " +" + var7;
      } else if (var1 != kc.ar) {
         if (var1 == kc.H) {
            return !this.ai ? var4 + "OFF" : (this.for ? var4 + "Fancy" : var4 + "Fast");
         } else if (var1 == kc.Y) {
            switch(this.case) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            case 3:
               return var4 + "OFF";
            default:
               return var4 + "OFF";
            }
         } else if (var1 == kc.ai) {
            return var4 + this.char;
         } else if (var1 == kc.aq) {
            return this.z == 0 ? var4 + "OFF" : (this.z == 4 ? var4 + "Max" : var4 + this.z);
         } else if (var1 == kc.E) {
            return this.do ? var4 + "Linear" : var4 + "Nearest";
         } else if (var1 == kc.aG) {
            return this.e ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.R) {
            return this.r == 0 ? var4 + "OFF" : var4 + this.r;
         } else if (var1 == kc.else) {
            return this.x ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.Z) {
            return this.aa ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.byte) {
            switch(this.bv) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            case 3:
               return var4 + "OFF";
            default:
               return var4 + "Default";
            }
         } else if (var1 == kc.U) {
            switch(this.bk) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            default:
               return var4 + "Default";
            }
         } else if (var1 == kc.aw) {
            switch(this.t) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            default:
               return var4 + "Default";
            }
         } else if (var1 == kc.aE) {
            switch(this.g) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            default:
               return var4 + "Default";
            }
         } else if (var1 == kc.az) {
            switch(this.s) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            case 3:
               return var4 + "OFF";
            default:
               return var4 + "Default";
            }
         } else if (var1 == kc.a) {
            switch(this.ae) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            case 3:
               return var4 + "OFF";
            default:
               return var4 + "Default";
            }
         } else if (var1 == kc.h) {
            switch(this.A) {
            case 1:
               return var4 + "Dynamic";
            case 2:
               return var4 + "OFF";
            default:
               return var4 + "ON";
            }
         } else if (var1 == kc.ax) {
            switch(this.R) {
            case 1:
               return var4 + "Dynamic";
            case 2:
               return var4 + "OFF";
            default:
               return var4 + "ON";
            }
         } else if (var1 == kc.if) {
            return this.J ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.j) {
            return this.aq ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.aC) {
            return this.p ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.X) {
            return this.bg ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.goto) {
            return this.av ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.aj) {
            return this.n ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.d) {
            return this.v ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.new) {
            return this.a4 ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.p) {
            return this.void ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.ay) {
            return this.try ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.W) {
            return this.C ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.for) {
            return this.c ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.af) {
            return this.F ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.B) {
            return this.a ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.ad) {
            return this.D ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.g) {
            return this.an <= 40 ? var4 + "Default (2s)" : (this.an <= 400 ? var4 + "20s" : (this.an <= 4000 ? var4 + "3min" : var4 + "30min"));
         } else if (var1 == kc.aF) {
            switch(this.aW) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            default:
               return var4 + "OFF";
            }
         } else if (var1 == kc.aB) {
            switch(this.u) {
            case 1:
               return var4 + "Fast";
            case 2:
               return var4 + "Fancy";
            default:
               return var4 + "OFF";
            }
         } else if (var1 == kc.k) {
            return this.j ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.as) {
            return this.E ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.at) {
            return this.G ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.case) {
            return this.bw ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.try) {
            return var4 + this.f;
         } else if (var1 == kc.void) {
            return this.I == 1 ? var4 + "Smooth" : (this.I == 2 ? var4 + "Multi-Core" : var4 + "Default");
         } else if (var1 == kc.aH) {
            return this.aO ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.do) {
            return this.y == 1 ? var4 + "Day Only" : (this.y == 3 ? var4 + "Night Only" : var4 + "Default");
         } else if (var1 == kc.aa) {
            return this.m ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.T) {
            return this.b ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.av) {
            return this.k == 0 ? var4 + "OFF" : var4 + this.k;
         } else if (var1 == kc.aD) {
            return this.H == 1 ? var4 + "OFF" : var4 + this.H;
         } else if (var1 == kc.au) {
            return this.bi ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.char) {
            return this.h ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.u) {
            return this.X ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.N) {
            return this.l ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.i) {
            return this.o ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.b) {
            return this.K ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.V) {
            return this.bt ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.int) {
            return this.byte ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.ap) {
            return this.a2 ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.f) {
            return this.if ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.n) {
            return this.i ? var4 + "ON" : var4 + "OFF";
         } else if (var1 == kc.c) {
            return var4 + this.d;
         } else if (var1 == kc.aA) {
            return this.aS ? var4 + "ON" : var4 + "OFF";
         } else if (var1.if()) {
            float var8 = this.a(var1);
            return var1 == kc.O ? (var8 == 0.0F ? var4 + var2.a("options.sensitivity.min") : (var8 == 1.0F ? var4 + var2.a("options.sensitivity.max") : var4 + (int)(var8 * 200.0F) + "%")) : (var1 == kc.M ? (var8 == 0.0F ? var4 + var2.a("options.fov.min") : (var8 == 1.0F ? var4 + var2.a("options.fov.max") : var4 + (int)(70.0F + var8 * 40.0F))) : (var1 == kc.L ? (var8 == 0.0F ? var4 + var2.a("options.gamma.min") : (var8 == 1.0F ? var4 + var2.a("options.gamma.max") : var4 + "+" + (int)(var8 * 100.0F) + "%")) : (var1 == kc.s ? var4 + (int)(var8 * 90.0F + 10.0F) + "%" : (var1 == kc.ah ? var4 + j5.f(var8) + "px" : (var1 == kc.ak ? var4 + j5.f(var8) + "px" : (var1 == kc.al ? var4 + j5.g(var8) + "px" : (var8 == 0.0F ? var4 + var2.a("options.off") : var4 + (int)(var8 * 100.0F) + "%")))))));
         } else if (var1.int()) {
            boolean var5 = this.if(var1);
            return var5 ? var4 + var2.a("options.on") : var4 + var2.a("options.off");
         } else {
            return var1 == kc.K ? var4 + a(a7, this.al) : (var1 == kc.F ? var4 + a(a5, this.at) : (var1 == kc.A ? var4 + a(a3, this.ba) : (var1 == kc.w ? var4 + a(a1, this.ab) : (var1 == kc.y ? var4 + a(a0, this.a9) : (var1 == kc.G ? var4 + a(aZ, this.ah) : (var1 == kc.C ? var4 + a(aY, this.af) : (var1 == kc.D ? (this.ag ? var4 + var2.a("options.graphics.fancy") : var4 + var2.a("options.graphics.fast")) : var4)))))));
         }
      } else {
         return this.long > 0 && this.long < 200 ? var4 + " " + this.long + " FPS" : (this.Q ? var4 + " VSync" : var4 + " MaxFPS");
      }
   }

   public void int() {
      try {
         if (!this.aX.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.aX));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if (var3[0].equals("music")) {
                  this.ar = this.a(var3[1]);
               }

               if (var3[0].equals("sound")) {
                  this.ap = this.a(var3[1]);
               }

               if (var3[0].equals("mouseSensitivity")) {
                  this.ao = this.a(var3[1]);
               }

               if (var3[0].equals("fov")) {
                  this.bc = this.a(var3[1]);
               }

               if (var3[0].equals("gamma")) {
                  this.bb = this.a(var3[1]);
               }

               if (var3[0].equals("invertYMouse")) {
                  this.am = var3[1].equals("true");
               }

               if (var3[0].equals("viewDistance")) {
                  this.al = Integer.parseInt(var3[1]);
                  this.B = try(this.al);
               }

               if (var3[0].equals("guiScale")) {
                  this.ba = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("particles")) {
                  this.a9 = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("bobView")) {
                  this.ak = var3[1].equals("true");
               }

               if (var3[0].equals("anaglyph3d")) {
                  this.aj = var3[1].equals("true");
               }

               if (var3[0].equals("advancedOpengl")) {
                  this.ai = var3[1].equals("true");
               }

               if (var3[0].equals("fpsLimit")) {
                  this.ah = Integer.parseInt(var3[1]);
                  this.long = for(this.ah);
               }

               if (var3[0].equals("difficulty")) {
                  this.at = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("fancyGraphics")) {
                  this.ag = var3[1].equals("true");
               }

               if (var3[0].equals("ao")) {
                  if (var3[1].equals("true")) {
                     this.af = 2;
                  } else if (var3[1].equals("false")) {
                     this.af = 0;
                  } else {
                     this.af = Integer.parseInt(var3[1]);
                  }
               }

               if (var3[0].equals("clouds")) {
                  this.ad = var3[1].equals("true");
               }

               if (var3[0].equals("skin")) {
                  this.ac = var3[1];
               }

               if (var3[0].equals("lastServer") && var3.length >= 2) {
                  this.bl = var3[1];
               }

               if (var3[0].equals("lang") && var3.length >= 2) {
                  this.a8 = var3[1];
               }

               if (var3[0].equals("chatVisibility")) {
                  this.ab = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("chatColors")) {
                  this.Z = var3[1].equals("true");
               }

               if (var3[0].equals("chatLinks")) {
                  this.Y = var3[1].equals("true");
               }

               if (var3[0].equals("chatLinksPrompt")) {
                  this.W = var3[1].equals("true");
               }

               if (var3[0].equals("chatOpacity")) {
                  this.V = this.a(var3[1]);
               }

               if (var3[0].equals("serverTextures")) {
                  this.U = var3[1].equals("true");
               }

               if (var3[0].equals("snooperEnabled")) {
                  this.T = var3[1].equals("true");
               }

               if (var3[0].equals("fullscreen")) {
                  this.S = var3[1].equals("true");
               }

               if (var3[0].equals("enableVsync")) {
                  this.Q = var3[1].equals("true");
                  this.try();
               }

               if (var3[0].equals("hideServerAddress")) {
                  this.P = var3[1].equals("true");
               }

               if (var3[0].equals("advancedItemTooltips")) {
                  this.O = var3[1].equals("true");
               }

               if (var3[0].equals("pauseOnLostFocus")) {
                  this.N = var3[1].equals("true");
               }

               if (var3[0].equals("showCape")) {
                  this.M = var3[1].equals("true");
               }

               if (var3[0].equals("touchscreen")) {
                  this.aV = var3[1].equals("true");
               }

               if (var3[0].equals("overrideHeight")) {
                  this.aT = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("overrideWidth")) {
                  this.aU = Integer.parseInt(var3[1]);
               }

               if (var3[0].equals("heldItemTooltips")) {
                  this.aS = var3[1].equals("true");
               }

               if (var3[0].equals("chatHeightFocused")) {
                  this.aM = this.a(var3[1]);
               }

               if (var3[0].equals("chatHeightUnfocused")) {
                  this.aN = this.a(var3[1]);
               }

               if (var3[0].equals("chatScale")) {
                  this.aR = this.a(var3[1]);
               }

               if (var3[0].equals("chatWidth")) {
                  this.aP = this.a(var3[1]);
               }

               for(int var4 = 0; var4 < this.aw.length; ++var4) {
                  if (var3[0].equals("key_" + this.aw[var4].new)) {
                     this.aw[var4].int = Integer.parseInt(var3[1]);
                  }
               }
            } catch (Exception var7) {
               this.au.a().if("Skipping bad option: " + var2);
               var7.printStackTrace();
            }
         }

         k2.a();
         var1.close();
      } catch (Exception var8) {
         this.au.a().if("Failed to load options");
         var8.printStackTrace();
      }

      try {
         File var9 = this.new;
         if (!var9.exists()) {
            var9 = this.aX;
         }

         if (!var9.exists()) {
            return;
         }

         BufferedReader var10 = new BufferedReader(new FileReader(var9));
         String var11 = "";

         while((var11 = var10.readLine()) != null) {
            try {
               String[] var12 = var11.split(":");
               if (var12[0].equals("ofRenderDistanceFine") && var12.length >= 2) {
                  this.B = Integer.valueOf(var12[1]);
                  this.B = qs.if(this.B, 32, 512);
                  this.al = int(this.B);
               }

               if (var12[0].equals("ofLimitFramerateFine") && var12.length >= 2) {
                  this.long = Integer.valueOf(var12[1]);
                  this.long = qs.if(this.long, 0, 199);
                  this.ah = do(this.long);
               }

               if (var12[0].equals("ofFogType") && var12.length >= 2) {
                  this.case = Integer.valueOf(var12[1]);
                  this.case = qs.if(this.case, 1, 3);
               }

               if (var12[0].equals("ofFogStart") && var12.length >= 2) {
                  this.char = Float.valueOf(var12[1]);
                  if (this.char < 0.2F) {
                     this.char = 0.2F;
                  }

                  if (this.char > 0.81F) {
                     this.char = 0.8F;
                  }
               }

               if (var12[0].equals("ofMipmapLevel") && var12.length >= 2) {
                  this.z = Integer.valueOf(var12[1]);
                  if (this.z < 0) {
                     this.z = 0;
                  }

                  if (this.z > 4) {
                     this.z = 4;
                  }
               }

               if (var12[0].equals("ofMipmapLinear") && var12.length >= 2) {
                  this.do = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofLoadFar") && var12.length >= 2) {
                  this.e = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofPreloadedChunks") && var12.length >= 2) {
                  this.r = Integer.valueOf(var12[1]);
                  if (this.r < 0) {
                     this.r = 0;
                  }

                  if (this.r > 8) {
                     this.r = 8;
                  }
               }

               if (var12[0].equals("ofOcclusionFancy") && var12.length >= 2) {
                  this.for = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofSmoothFps") && var12.length >= 2) {
                  this.x = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofSmoothWorld") && var12.length >= 2) {
                  this.aa = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAoLevel") && var12.length >= 2) {
                  this.br = Float.valueOf(var12[1]);
                  this.br = qs.a(this.br, 0.0F, 1.0F);
               }

               if (var12[0].equals("ofClouds") && var12.length >= 2) {
                  this.bv = Integer.valueOf(var12[1]);
                  this.bv = qs.if(this.bv, 0, 3);
               }

               if (var12[0].equals("ofCloudsHeight") && var12.length >= 2) {
                  this.int = Float.valueOf(var12[1]);
                  this.int = qs.a(this.int, 0.0F, 1.0F);
               }

               if (var12[0].equals("ofTrees") && var12.length >= 2) {
                  this.bk = Integer.valueOf(var12[1]);
                  this.bk = qs.if(this.bk, 0, 2);
               }

               if (var12[0].equals("ofGrass") && var12.length >= 2) {
                  this.t = Integer.valueOf(var12[1]);
                  this.t = qs.if(this.t, 0, 2);
               }

               if (var12[0].equals("ofDroppedItems") && var12.length >= 2) {
                  this.g = Integer.valueOf(var12[1]);
                  this.g = qs.if(this.g, 0, 2);
               }

               if (var12[0].equals("ofRain") && var12.length >= 2) {
                  this.s = Integer.valueOf(var12[1]);
                  this.s = qs.if(this.s, 0, 3);
               }

               if (var12[0].equals("ofWater") && var12.length >= 2) {
                  this.ae = Integer.valueOf(var12[1]);
                  this.ae = qs.if(this.ae, 0, 3);
               }

               if (var12[0].equals("ofAnimatedWater") && var12.length >= 2) {
                  this.A = Integer.valueOf(var12[1]);
                  this.A = qs.if(this.A, 0, 2);
               }

               if (var12[0].equals("ofAnimatedLava") && var12.length >= 2) {
                  this.R = Integer.valueOf(var12[1]);
                  this.R = qs.if(this.R, 0, 2);
               }

               if (var12[0].equals("ofAnimatedFire") && var12.length >= 2) {
                  this.J = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedPortal") && var12.length >= 2) {
                  this.aq = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedRedstone") && var12.length >= 2) {
                  this.p = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedExplosion") && var12.length >= 2) {
                  this.bg = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedFlame") && var12.length >= 2) {
                  this.av = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedSmoke") && var12.length >= 2) {
                  this.n = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofVoidParticles") && var12.length >= 2) {
                  this.v = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofWaterParticles") && var12.length >= 2) {
                  this.a4 = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofPortalParticles") && var12.length >= 2) {
                  this.void = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofDrippingWaterLava") && var12.length >= 2) {
                  this.try = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedTerrain") && var12.length >= 2) {
                  this.C = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedTextures") && var12.length >= 2) {
                  this.c = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAnimatedItems") && var12.length >= 2) {
                  this.F = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofRainSplash") && var12.length >= 2) {
                  this.a = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofLagometer") && var12.length >= 2) {
                  this.D = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAutoSaveTicks") && var12.length >= 2) {
                  this.an = Integer.valueOf(var12[1]);
                  this.an = qs.if(this.an, 40, 40000);
               }

               if (var12[0].equals("ofBetterGrass") && var12.length >= 2) {
                  this.aW = Integer.valueOf(var12[1]);
                  this.aW = qs.if(this.aW, 1, 3);
               }

               if (var12[0].equals("ofConnectedTextures") && var12.length >= 2) {
                  this.u = Integer.valueOf(var12[1]);
                  this.u = qs.if(this.u, 1, 3);
               }

               if (var12[0].equals("ofWeather") && var12.length >= 2) {
                  this.j = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofSky") && var12.length >= 2) {
                  this.E = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofStars") && var12.length >= 2) {
                  this.G = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofSunMoon") && var12.length >= 2) {
                  this.bw = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofChunkUpdates") && var12.length >= 2) {
                  this.f = Integer.valueOf(var12[1]);
                  this.f = qs.if(this.f, 1, 5);
               }

               if (var12[0].equals("ofChunkLoading") && var12.length >= 2) {
                  this.I = Integer.valueOf(var12[1]);
                  this.I = qs.if(this.I, 0, 2);
                  this.for();
               }

               if (var12[0].equals("ofChunkUpdatesDynamic") && var12.length >= 2) {
                  this.aO = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofTime") && var12.length >= 2) {
                  this.y = Integer.valueOf(var12[1]);
                  this.y = qs.if(this.y, 0, 3);
               }

               if (var12[0].equals("ofClearWater") && var12.length >= 2) {
                  this.m = Boolean.valueOf(var12[1]);
                  this.if();
               }

               if (var12[0].equals("ofDepthFog") && var12.length >= 2) {
                  this.b = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofAaLevel") && var12.length >= 2) {
                  this.k = Integer.valueOf(var12[1]);
                  this.k = qs.if(this.k, 0, 16);
               }

               if (var12[0].equals("ofAfLevel") && var12.length >= 2) {
                  this.H = Integer.valueOf(var12[1]);
                  this.H = qs.if(this.H, 1, 16);
               }

               if (var12[0].equals("ofProfiler") && var12.length >= 2) {
                  this.bi = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofBetterSnow") && var12.length >= 2) {
                  this.h = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofSwampColors") && var12.length >= 2) {
                  this.X = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofRandomMobs") && var12.length >= 2) {
                  this.l = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofSmoothBiomes") && var12.length >= 2) {
                  this.o = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofCustomFonts") && var12.length >= 2) {
                  this.K = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofCustomColors") && var12.length >= 2) {
                  this.bt = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofCustomSky") && var12.length >= 2) {
                  this.byte = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofShowCapes") && var12.length >= 2) {
                  this.a2 = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofNaturalTextures") && var12.length >= 2) {
                  this.if = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofLazyChunkLoading") && var12.length >= 2) {
                  this.i = Boolean.valueOf(var12[1]);
               }

               if (var12[0].equals("ofFullscreenMode") && var12.length >= 2) {
                  this.d = var12[1];
               }
            } catch (Exception var5) {
               qs.for("Skipping bad option: " + var11);
               var5.printStackTrace();
            }
         }

         k2.a();
         var10.close();
      } catch (Exception var6) {
         qs.for("Failed to load options");
         var6.printStackTrace();
      }

   }

   private float a(String var1) {
      return var1.equals("true") ? 1.0F : (var1.equals("false") ? 0.0F : Float.parseFloat(var1));
   }

   public void new() {
      if (vf.d.do()) {
         Object var1 = vf.if(vf.s);
         if (var1 != null && vf.int(var1, vf.M)) {
            return;
         }
      }

      PrintWriter var5;
      try {
         var5 = new PrintWriter(new FileWriter(this.aX));
         var5.println("music:" + this.ar);
         var5.println("sound:" + this.ap);
         var5.println("invertYMouse:" + this.am);
         var5.println("mouseSensitivity:" + this.ao);
         var5.println("fov:" + this.bc);
         var5.println("gamma:" + this.bb);
         var5.println("viewDistance:" + this.al);
         var5.println("guiScale:" + this.ba);
         var5.println("particles:" + this.a9);
         var5.println("bobView:" + this.ak);
         var5.println("anaglyph3d:" + this.aj);
         var5.println("advancedOpengl:" + this.ai);
         var5.println("fpsLimit:" + this.ah);
         var5.println("difficulty:" + this.at);
         var5.println("fancyGraphics:" + this.ag);
         var5.println("ao:" + this.af);
         var5.println("clouds:" + this.ad);
         var5.println("skin:" + this.ac);
         var5.println("lastServer:" + this.bl);
         var5.println("lang:" + this.a8);
         var5.println("chatVisibility:" + this.ab);
         var5.println("chatColors:" + this.Z);
         var5.println("chatLinks:" + this.Y);
         var5.println("chatLinksPrompt:" + this.W);
         var5.println("chatOpacity:" + this.V);
         var5.println("serverTextures:" + this.U);
         var5.println("snooperEnabled:" + this.T);
         var5.println("fullscreen:" + this.S);
         var5.println("enableVsync:" + this.Q);
         var5.println("hideServerAddress:" + this.P);
         var5.println("advancedItemTooltips:" + this.O);
         var5.println("pauseOnLostFocus:" + this.N);
         var5.println("showCape:" + this.M);
         var5.println("touchscreen:" + this.aV);
         var5.println("overrideWidth:" + this.aU);
         var5.println("overrideHeight:" + this.aT);
         var5.println("heldItemTooltips:" + this.aS);
         var5.println("chatHeightFocused:" + this.aM);
         var5.println("chatHeightUnfocused:" + this.aN);
         var5.println("chatScale:" + this.aR);
         var5.println("chatWidth:" + this.aP);

         for(int var2 = 0; var2 < this.aw.length; ++var2) {
            var5.println("key_" + this.aw[var2].new + ":" + this.aw[var2].int);
         }

         var5.close();
      } catch (Exception var4) {
         this.au.a().if("Failed to save options");
         var4.printStackTrace();
      }

      try {
         var5 = new PrintWriter(new FileWriter(this.new));
         var5.println("ofRenderDistanceFine:" + this.B);
         var5.println("ofLimitFramerateFine:" + this.long);
         var5.println("ofFogType:" + this.case);
         var5.println("ofFogStart:" + this.char);
         var5.println("ofMipmapLevel:" + this.z);
         var5.println("ofMipmapLinear:" + this.do);
         var5.println("ofLoadFar:" + this.e);
         var5.println("ofPreloadedChunks:" + this.r);
         var5.println("ofOcclusionFancy:" + this.for);
         var5.println("ofSmoothFps:" + this.x);
         var5.println("ofSmoothWorld:" + this.aa);
         var5.println("ofAoLevel:" + this.br);
         var5.println("ofClouds:" + this.bv);
         var5.println("ofCloudsHeight:" + this.int);
         var5.println("ofTrees:" + this.bk);
         var5.println("ofGrass:" + this.t);
         var5.println("ofDroppedItems:" + this.g);
         var5.println("ofRain:" + this.s);
         var5.println("ofWater:" + this.ae);
         var5.println("ofAnimatedWater:" + this.A);
         var5.println("ofAnimatedLava:" + this.R);
         var5.println("ofAnimatedFire:" + this.J);
         var5.println("ofAnimatedPortal:" + this.aq);
         var5.println("ofAnimatedRedstone:" + this.p);
         var5.println("ofAnimatedExplosion:" + this.bg);
         var5.println("ofAnimatedFlame:" + this.av);
         var5.println("ofAnimatedSmoke:" + this.n);
         var5.println("ofVoidParticles:" + this.v);
         var5.println("ofWaterParticles:" + this.a4);
         var5.println("ofPortalParticles:" + this.void);
         var5.println("ofDrippingWaterLava:" + this.try);
         var5.println("ofAnimatedTerrain:" + this.C);
         var5.println("ofAnimatedTextures:" + this.c);
         var5.println("ofAnimatedItems:" + this.F);
         var5.println("ofRainSplash:" + this.a);
         var5.println("ofLagometer:" + this.D);
         var5.println("ofAutoSaveTicks:" + this.an);
         var5.println("ofBetterGrass:" + this.aW);
         var5.println("ofConnectedTextures:" + this.u);
         var5.println("ofWeather:" + this.j);
         var5.println("ofSky:" + this.E);
         var5.println("ofStars:" + this.G);
         var5.println("ofSunMoon:" + this.bw);
         var5.println("ofChunkUpdates:" + this.f);
         var5.println("ofChunkLoading:" + this.I);
         var5.println("ofChunkUpdatesDynamic:" + this.aO);
         var5.println("ofTime:" + this.y);
         var5.println("ofClearWater:" + this.m);
         var5.println("ofDepthFog:" + this.b);
         var5.println("ofAaLevel:" + this.k);
         var5.println("ofAfLevel:" + this.H);
         var5.println("ofProfiler:" + this.bi);
         var5.println("ofBetterSnow:" + this.h);
         var5.println("ofSwampColors:" + this.X);
         var5.println("ofRandomMobs:" + this.l);
         var5.println("ofSmoothBiomes:" + this.o);
         var5.println("ofCustomFonts:" + this.K);
         var5.println("ofCustomColors:" + this.bt);
         var5.println("ofCustomSky:" + this.byte);
         var5.println("ofShowCapes:" + this.a2);
         var5.println("ofNaturalTextures:" + this.if);
         var5.println("ofLazyChunkLoading:" + this.i);
         var5.println("ofFullscreenMode:" + this.d);
         var5.close();
      } catch (Exception var3) {
         qs.for("Failed to save options");
         var3.printStackTrace();
      }

      this.byte();
   }

   public void byte() {
      if (this.au.vk != null) {
         this.au.vk.gF.for((an7)(new ao9(this.a8, this.al, this.ab, this.Z, this.at, this.M)));
      }

   }

   public void do() {
      this.al = 1;
      this.B = try(this.al);
      this.ak = true;
      this.aj = false;
      this.ai = false;
      this.ah = 0;
      this.Q = false;
      this.try();
      this.long = 0;
      this.ag = true;
      this.af = 2;
      this.ad = true;
      this.bc = 0.0F;
      this.bb = 0.0F;
      this.ba = 0;
      this.a9 = 0;
      this.aS = true;
      this.case = 1;
      this.char = 0.8F;
      this.z = 0;
      this.do = false;
      this.e = false;
      this.r = 0;
      this.for = false;
      this.x = false;
      this.aa = qs.aB();
      this.i = qs.aB();
      this.br = 1.0F;
      this.k = 0;
      this.H = 1;
      this.bv = 0;
      this.int = 1.0F;
      this.bk = 0;
      this.t = 0;
      this.s = 0;
      this.ae = 0;
      this.aW = 3;
      this.an = 4000;
      this.D = false;
      this.bi = false;
      this.j = true;
      this.E = true;
      this.G = true;
      this.bw = true;
      this.f = 1;
      this.I = 0;
      this.aO = false;
      this.y = 0;
      this.m = false;
      this.b = true;
      this.h = false;
      this.d = "Default";
      this.X = true;
      this.l = true;
      this.o = true;
      this.K = true;
      this.bt = true;
      this.byte = true;
      this.a2 = true;
      this.u = 2;
      this.if = false;
      this.A = 0;
      this.R = 0;
      this.J = true;
      this.aq = true;
      this.p = true;
      this.bg = true;
      this.av = true;
      this.n = true;
      this.v = true;
      this.a4 = true;
      this.a = true;
      this.void = true;
      this.try = true;
      this.C = true;
      this.F = true;
      this.c = true;
      this.au.vl.if();
      this.if();
      this.au.vl.new();
      this.au.vb.new();
      this.au.vl.case();
      this.new();
   }

   public void try() {
      Display.setVSyncEnabled(this.Q);
   }

   private static int int(int var0) {
      byte var1 = 3;
      if (var0 > 32) {
         var1 = 2;
      }

      if (var0 > 64) {
         var1 = 1;
      }

      if (var0 > 128) {
         var1 = 0;
      }

      return var1;
   }

   private static int try(int var0) {
      return 32 << 3 - var0;
   }

   private static int do(int var0) {
      byte var1 = 2;
      if (var0 > 35) {
         var1 = 1;
      }

      if (var0 >= 200) {
         var1 = 0;
      }

      if (var0 <= 0) {
         var1 = 0;
      }

      return var1;
   }

   private static int for(int var0) {
      switch(var0) {
      case 0:
         return 0;
      case 1:
         return 120;
      case 2:
         return 35;
      default:
         return 0;
      }
   }

   public boolean a() {
      return this.B > 64 && this.ad;
   }
}
