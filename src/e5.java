import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLEncoder;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.SecretKey;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class e5 extends an6 {
   private boolean w = false;
   private aqb v;
   public String B;
   private Minecraft u;
   private ex t;
   private boolean s = false;
   public sc A = new sc((si)null);
   private Map r = new HashMap();
   public List z = new ArrayList();
   public int y = 20;
   private i5 q = null;
   Random x = new Random();

   public e5(Minecraft var1, String var2, int var3) throws IOException {
      this.u = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.v = new ap7(var1.a(), var4, "Client", this);
   }

   public e5(Minecraft var1, String var2, int var3, i5 var4) throws IOException {
      this.u = var1;
      this.q = var4;
      Socket var5 = new Socket(InetAddress.getByName(var2), var3);
      this.v = new ap7(var1.a(), var5, "Client", this);
   }

   public e5(Minecraft var1, av var2) throws IOException {
      this.u = var1;
      this.v = new ap9(var1.a(), this);
      var2.hI().a((ap9)this.v, var1.vg.if);
   }

   public void case() {
      if (this.v != null) {
         this.v.for();
      }

      this.v = null;
      this.t = null;
   }

   public void char() {
      if (!this.w && this.v != null) {
         this.v.if();
      }

      if (this.v != null) {
         this.v.for();
      }

   }

   public void a(anx var1) {
      String var2 = var1.b().trim();
      PublicKey var3 = var1.void();
      SecretKey var4 = aj5.if();
      if (!"-".equals(var2)) {
         String var5 = (new BigInteger(aj5.a(var2, var3, var4))).toString(16);
         String var6 = this.a(this.u.vg.if, this.u.vg.a, var5);
         if (!"ok".equalsIgnoreCase(var6.trim())) {
            this.v.a("Erreur de Vérification");
            return;
         }
      }

      this.for((an7)(new anh(var4, var3, var1.c())));
   }

   private String a(String var1, String var2, String var3) {
      try {
         URL var4 = new URL("http://allfightpvp.com/lanceur/loginserveur.php?user=" + for(var1) + "&sessionId=" + for(var2) + "&serverId=" + for(var3));
         BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
         String var6 = var5.readLine();
         var5.close();
         return var6;
      } catch (IOException var7) {
         return var7.toString();
      }
   }

   private static String for(String var0) throws IOException {
      return URLEncoder.encode(var0, "UTF-8");
   }

   public void a(anh var1) {
      this.for((an7)(new apb(0)));
   }

   public void a(aog var1) {
      this.u.vp = new ey(this.u, this);
      this.u.uP.a(aka.m, 1);
      this.t = new ex(this, new y0(0L, var1.bq, false, var1.br, var1.bk), var1.bp, var1.bo, this.u.uG, this.u.a());
      this.t.goto = true;
      this.u.a(this.t);
      this.u.vk.a6 = var1.bp;
      this.u.a((i5)(new es(this)));
      this.u.vk.av = var1.bl;
      this.y = var1.bm;
      this.u.vp.a(var1.bq);
      this.u.u1.byte();
      ModLoader.a(this, var1);
   }

   public void a(apx var1) {
      double var2 = (double)var1.d9 / 32.0D;
      double var4 = (double)var1.d8 / 32.0D;
      double var6 = (double)var1.d7 / 32.0D;
      Object var8 = null;
      if (var1.d1 == 10) {
         var8 = afj.a(this.t, var2, var4, var6, var1.d0);
      } else if (var1.d1 == 90) {
         aiw var9 = this.a(var1.d0);
         if (var9 instanceof aek) {
            var8 = new aee(this.t, var2, var4, var6, (aek)var9);
         }

         var1.d0 = 0;
      } else if (var1.d1 == 60) {
         var8 = new aei(this.t, var2, var4, var6);
      } else if (var1.d1 == 61) {
         var8 = new aea(this.t, var2, var4, var6);
      } else if (var1.d1 == 71) {
         var8 = new aih(this.t, (int)var2, (int)var4, (int)var6, var1.d0);
         var1.d0 = 0;
      } else if (var1.d1 == 65) {
         var8 = new ad6(this.t, var2, var4, var6);
      } else if (var1.d1 == 72) {
         var8 = new aeh(this.t, var2, var4, var6);
      } else if (var1.d1 == 76) {
         var8 = new aef(this.t, var2, var4, var6, (abp)null);
      } else if (var1.d1 == 63) {
         var8 = new aed(this.t, var2, var4, var6, (double)var1.d6 / 8000.0D, (double)var1.d5 / 8000.0D, (double)var1.d4 / 8000.0D);
         var1.d0 = 0;
      } else if (var1.d1 == 64) {
         var8 = new aeb(this.t, var2, var4, var6, (double)var1.d6 / 8000.0D, (double)var1.d5 / 8000.0D, (double)var1.d4 / 8000.0D);
         var1.d0 = 0;
      } else if (var1.d1 == 66) {
         var8 = new ad3(this.t, var2, var4, var6, (double)var1.d6 / 8000.0D, (double)var1.d5 / 8000.0D, (double)var1.d4 / 8000.0D);
         var1.d0 = 0;
      } else if (var1.d1 == 62) {
         var8 = new ad7(this.t, var2, var4, var6);
      } else if (var1.d1 == 73) {
         var8 = new ad4(this.t, var2, var4, var6, var1.d0);
         var1.d0 = 0;
      } else if (var1.d1 == 75) {
         var8 = new ad5(this.t, var2, var4, var6);
         var1.d0 = 0;
      } else if (var1.d1 == 1) {
         var8 = new afm(this.t, var2, var4, var6);
      } else if (var1.d1 == 50) {
         var8 = new afa(this.t, var2, var4, var6, (aig)null);
      } else if (var1.d1 == 51) {
         var8 = new afs(this.t, var2, var4, var6);
      } else if (var1.d1 == 2) {
         var8 = new afk(this.t, var2, var4, var6);
      } else if (var1.d1 == 70) {
         var8 = new afl(this.t, var2, var4, var6, var1.d0 & '\uffff', var1.d0 >> 16);
         var1.d0 = 0;
      } else {
         Iterator var12 = ModLoader.a().values().iterator();

         while(var12.hasNext()) {
            g var10 = (g)var12.next();
            if (var1.d1 == var10.new) {
               var8 = var10.if.a(var1.d1, this.t, var2, var4, var6);
               break;
            }
         }
      }

      if (var8 != null) {
         ((aiw)var8).ad = var1.d9;
         ((aiw)var8).ac = var1.d8;
         ((aiw)var8).ab = var1.d7;
         ((aiw)var8).a4 = (float)(var1.d3 * 360) / 256.0F;
         ((aiw)var8).a5 = (float)(var1.d2 * 360) / 256.0F;
         aiw[] var13 = ((aiw)var8).R();
         if (var13 != null) {
            int var14 = var1.ea - ((aiw)var8).av;

            for(int var11 = 0; var11 < var13.length; ++var11) {
               var13[var11].av += var14;
            }
         }

         ((aiw)var8).av = var1.ea;
         this.t.a(var1.ea, (aiw)var8);
         if (var1.d0 > 0) {
            if (var1.d1 == 60) {
               aiw var15 = this.a(var1.d0);
               if (var15 instanceof aig) {
                  aei var16 = (aei)var8;
                  var16.cF = var15;
               }
            }

            ((aiw)var8).new((double)var1.d6 / 8000.0D, (double)var1.d5 / 8000.0D, (double)var1.d4 / 8000.0D);
         }
      }

   }

   public void a(apv var1) {
      aik var2 = new aik(this.t, (double)var1.dV, (double)var1.dZ, (double)var1.dY, var1.dX);
      var2.ad = var1.dV;
      var2.ac = var1.dZ;
      var2.ab = var1.dY;
      var2.a5 = 0.0F;
      var2.a4 = 0.0F;
      var2.av = var1.dW;
      this.t.a(var1.dW, var2);
   }

   public void a(apt var1) {
      double var2 = (double)var1.dQ / 32.0D;
      double var4 = (double)var1.dU / 32.0D;
      double var6 = (double)var1.dT / 32.0D;
      afn var8 = null;
      if (var1.dS == 1) {
         var8 = new afn(this.t, var2, var4, var6);
      }

      if (var8 != null) {
         var8.ad = var1.dQ;
         var8.ac = var1.dU;
         var8.ab = var1.dT;
         var8.a5 = 0.0F;
         var8.a4 = 0.0F;
         var8.av = var1.dR;
         this.t.for(var8);
      }

   }

   public void a(app var1) {
      ah7 var2 = new ah7(this.t, var1.dx, var1.dC, var1.dB, var1.dA, var1.dz);
      this.t.a(var1.dy, var2);
   }

   public void a(anr var1) {
      aiw var2 = this.a(var1.ar);
      if (var2 != null) {
         var2.new((double)var1.aq / 8000.0D, (double)var1.at / 8000.0D, (double)var1.as / 8000.0D);
      }

   }

   public void a(ans var1) {
      aiw var2 = this.a(var1.av);
      if (var2 != null && var1.long() != null) {
         var2.ab().a(var1.long());
      }

   }

   public void a(apn var1) {
      double var2 = (double)var1.du / 32.0D;
      double var4 = (double)var1.dt / 32.0D;
      double var6 = (double)var1.ds / 32.0D;
      float var8 = (float)(var1.dr * 360) / 256.0F;
      float var9 = (float)(var1.dq * 360) / 256.0F;
      dp var10 = new dp(this.u.vm, var1.dv);
      var10.ao = var10.aJ = (double)(var10.ad = var1.du);
      var10.an = var10.aI = (double)(var10.ac = var1.dt);
      var10.am = var10.aH = (double)(var10.ab = var1.ds);
      int var11 = var1.dp;
      if (var11 == 0) {
         var10.fR.V[var10.fR.aa] = null;
      } else {
         var10.fR.V[var10.fR.aa] = new abp(var11, 1, 0);
      }

      var10.a(var2, var4, var6, var8, var9);
      this.t.a(var1.dw, var10);
      List var12 = var1.O();
      if (var12 != null) {
         var10.ab().a(var12);
      }

   }

   public void a(ane var1) {
      aiw var2 = this.a(var1.y);
      if (var2 != null) {
         var2.ad = var1.x;
         var2.ac = var1.C;
         var2.ab = var1.B;
         double var3 = (double)var2.ad / 32.0D;
         double var5 = (double)var2.ac / 32.0D + 0.015625D;
         double var7 = (double)var2.ab / 32.0D;
         float var9 = (float)(var1.A * 360) / 256.0F;
         float var10 = (float)(var1.z * 360) / 256.0F;
         var2.a(var3, var5, var7, var9, var10, 3);
      }

   }

   public void a(anw var1) {
      if (var1.aA >= 0 && var1.aA < aen.H()) {
         this.u.vk.fR.aa = var1.aA;
      }

   }

   public void a(aof var1) {
      aiw var2 = this.a(var1.be);
      if (var2 != null) {
         var2.ad += var1.bd;
         var2.ac += var1.bj;
         var2.ab += var1.bi;
         double var3 = (double)var2.ad / 32.0D;
         double var5 = (double)var2.ac / 32.0D;
         double var7 = (double)var2.ab / 32.0D;
         float var9 = var1.bf ? (float)(var1.bh * 360) / 256.0F : var2.a5;
         float var10 = var1.bf ? (float)(var1.bg * 360) / 256.0F : var2.a4;
         var2.a(var3, var5, var7, var9, var10, 3);
      }

   }

   public void a(any var1) {
      aiw var2 = this.a(var1.aF);
      if (var2 != null) {
         float var3 = (float)(var1.aE * 360) / 256.0F;
         var2.byte(var3);
      }

   }

   public void a(an1 var1) {
      for(int var2 = 0; var2 < var1.aN.length; ++var2) {
         this.t.if(var1.aN[var2]);
      }

   }

   public void a(aob var1) {
      eu var2 = this.u.vk;
      double var3 = var2.al;
      double var5 = var2.ak;
      double var7 = var2.aj;
      float var9 = var2.a5;
      float var10 = var2.a4;
      if (var1.a5) {
         var3 = var1.bc;
         var5 = var1.bb;
         var7 = var1.ba;
      }

      if (var1.a4) {
         var9 = var1.a8;
         var10 = var1.a7;
      }

      var2.aG = 0.0F;
      var2.ai = var2.ah = var2.ag = 0.0D;
      var2.a(var3, var5, var7, var9, var10);
      var1.bc = var2.al;
      var1.bb = var2.aZ.a;
      var1.ba = var2.aj;
      var1.a9 = var2.ak;
      this.v.a((an7)var1);
      if (!this.s) {
         this.u.vk.ao = this.u.vk.al;
         this.u.vk.an = this.u.vk.ak;
         this.u.vk.am = this.u.vk.aj;
         this.s = true;
         this.u.a((i5)null);
      }

   }

   public void a(apd var1) {
      int var2 = var1.da * 16;
      int var3 = var1.c9 * 16;
      if (var1.dd != null) {
         DataInputStream var4 = new DataInputStream(new ByteArrayInputStream(var1.dd));

         try {
            for(int var5 = 0; var5 < var1.dc; ++var5) {
               short var6 = var4.readShort();
               short var7 = var4.readShort();
               int var8 = var7 >> 4 & 4095;
               int var9 = var7 & 15;
               int var10 = var6 >> 12 & 15;
               int var11 = var6 >> 8 & 15;
               int var12 = var6 & 255;
               this.t.try(var10 + var2, var12, var11 + var3, var8, var9);
            }
         } catch (IOException var13) {
         }
      }

   }

   public void a(aom var1) {
      if (var1.b0) {
         if (var1.b2 == 0) {
            this.t.a(var1.b4, var1.b3, false);
            return;
         }

         this.t.a(var1.b4, var1.b3, true);
      }

      this.t.byte(var1.b4 << 4, 0, var1.b3 << 4, (var1.b4 << 4) + 15, 256, (var1.b3 << 4) + 15);
      xx var2 = this.t.byte(var1.b4, var1.b3);
      if (var1.b0 && var2 == null) {
         this.t.a(var1.b4, var1.b3, true);
         var2 = this.t.byte(var1.b4, var1.b3);
      }

      if (var2 != null) {
         var2.a(var1.A(), var1.b2, var1.b1, var1.b0);
         this.t.new(var1.b4 << 4, 0, var1.b3 << 4, (var1.b4 << 4) + 15, 256, (var1.b3 << 4) + 15);
         if (!var1.b0 || !(this.t.n instanceof xj)) {
            var2.do();
         }
      }

   }

   public void a(ana var1) {
      this.t.try(var1.d, var1.c, var1.g, var1.f, var1.e);
   }

   public void a(aou var1) {
      this.v.a("disconnect.kicked");
      this.w = true;
      ModLoader.char();
      this.u.a((ex)null);
      if (this.q != null) {
         this.u.a((i5)(new ho(this.q, "disconnect.disconnected", "disconnect.genericReason", new Object[]{var1.cs})));
      } else {
         this.u.a((i5)(new e0(new x(), "disconnect.disconnected", "disconnect.genericReason", new Object[]{var1.cs})));
      }

   }

   public void a(String var1, Object[] var2) {
      if (!this.w) {
         this.w = true;
         ModLoader.char();
         this.u.a((ex)null);
         if (this.q != null) {
            this.u.a((i5)(new ho(this.q, "disconnect.lost", var1, var2)));
         } else {
            this.u.a((i5)(new e0(new x(), "disconnect.lost", var1, var2)));
         }
      }

   }

   public void do(an7 var1) {
      if (!this.w) {
         this.v.a(var1);
         this.v.int();
      }

   }

   public void for(an7 var1) {
      if (!this.w) {
         this.v.a(var1);
      }

   }

   public void a(anf var1) {
      aiw var2 = this.a(var1.E);
      Object var3 = (aig)this.a(var1.D);
      if (var3 == null) {
         var3 = this.u.vk;
      }

      if (var2 != null) {
         if (var2 instanceof aik) {
            this.t.a(var2, "random.orb", 0.2F, ((this.x.nextFloat() - this.x.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         } else {
            this.t.a(var2, "random.pop", 0.2F, ((this.x.nextFloat() - this.x.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         }

         this.u.vh.a((d7)(new dv(this.u.vm, var2, (aiw)var3, -0.5F)));
         this.t.if(var1.E);
      }

   }

   public void a(apf var1) {
      this.u.u4.c5().else(var1.de);
      ModLoader.if(var1.de);
   }

   public void a(apl var1) {
      aiw var2 = this.a(var1.dl);
      if (var2 != null) {
         if (var1.dk == 1) {
            aig var3 = (aig)var2;
            var3.b5();
         } else if (var1.dk == 2) {
            var2.aM();
         } else if (var1.dk == 3) {
            aek var4 = (aek)var2;
            var4.a(false, false, false);
         } else if (var1.dk != 4) {
            if (var1.dk == 6) {
               this.u.vh.a((d7)(new em(this.u.vm, var2)));
            } else if (var1.dk == 7) {
               em var5 = new em(this.u.vm, var2, "magicCrit");
               this.u.vh.a((d7)var5);
            } else if (var1.dk == 5 && var2 instanceof dp) {
            }
         }
      }

   }

   public void a(aot var1) {
      aiw var2 = this.a(var1.co);
      if (var2 != null && var1.cp == 0) {
         aek var3 = (aek)var2;
         var3.int(var1.cn, var1.cr, var1.cq);
      }

   }

   public void else() {
      this.w = true;
      ModLoader.char();
      this.v.for();
      this.v.a("disconnect.closed");
   }

   public void a(apr var1) {
      double var2 = (double)var1.dL / 32.0D;
      double var4 = (double)var1.dK / 32.0D;
      double var6 = (double)var1.dJ / 32.0D;
      float var8 = (float)(var1.dF * 360) / 256.0F;
      float var9 = (float)(var1.dE * 360) / 256.0F;
      aig var10 = (aig)air.a(var1.dM, this.u.vm);
      var10.ad = var1.dL;
      var10.ac = var1.dK;
      var10.ab = var1.dJ;
      var10.fA = (float)(var1.dD * 360) / 256.0F;
      aiw[] var11 = var10.R();
      if (var11 != null) {
         int var12 = var1.dN - var10.av;

         for(int var13 = 0; var13 < var11.length; ++var13) {
            var11[var13].av += var12;
         }
      }

      var10.av = var1.dN;
      var10.a(var2, var4, var6, var8, var9);
      var10.ai = (double)((float)var1.dI / 8000.0F);
      var10.ah = (double)((float)var1.dH / 8000.0F);
      var10.ag = (double)((float)var1.dG / 8000.0F);
      this.t.a(var1.dN, var10);
      List var14 = var1.P();
      if (var14 != null) {
         var10.ab().a(var14);
      }

   }

   public void a(ani var1) {
      this.u.vm.a(var1.N);
      this.u.vm.if(var1.M);
   }

   public void a(anj var1) {
      this.u.vk.a(new apg(var1.P, var1.O, var1.Q), true);
      this.u.vm.l().a(var1.P, var1.O, var1.Q);
   }

   public void a(anl var1) {
      Object var2 = this.a(var1.W);
      aiw var3 = this.a(var1.V);
      if (var1.W == this.u.vk.av) {
         var2 = this.u.vk;
         if (var3 instanceof afm) {
            ((afm)var3).void(false);
         }
      } else if (var3 instanceof afm) {
         ((afm)var3).void(true);
      }

      if (var2 != null) {
         ((aiw)var2).int(var3);
      }

   }

   public void a(aos var1) {
      aiw var2 = this.a(var1.cm);
      if (var2 != null) {
         var2.a(var1.cl);
      }

   }

   private aiw a(int var1) {
      return (aiw)(var1 == this.u.vk.av ? this.u.vk : this.t.a(var1));
   }

   public void a(ano var1) {
      this.u.vk.H(var1.ai);
      this.u.vk.cA().a(var1.ah);
      this.u.vk.cA().a(var1.aj);
   }

   public void a(anp var1) {
      this.u.vk.a(var1.al, var1.ak, var1.am);
   }

   public void a(anz var1) {
      if (var1.aH != this.u.vk.a6) {
         this.s = false;
         nl var2 = this.t.f();
         this.t = new ex(this, new y0(0L, var1.aJ, false, this.u.vm.l().void(), var1.aI), var1.aH, var1.aG, this.u.uG, this.u.a());
         this.t.a(var2);
         this.t.goto = true;
         this.u.a(this.t);
         this.u.vk.a6 = var1.aH;
         this.u.a((i5)(new es(this)));
      }

      this.u.aV(var1.aH);
      this.u.vp.a(var1.aJ);
   }

   public void a(aor var1) {
      zg var2 = new zg(this.u.vm, (aiw)null, var1.ce, var1.cd, var1.ck, var1.cj);
      var2.int = var1.ci;
      var2.a(true);
      eu var10000 = this.u.vk;
      var10000.ai += (double)var1.B();
      var10000 = this.u.vk;
      var10000.ah += (double)var1.D();
      var10000 = this.u.vk;
      var10000.ag += (double)var1.C();
   }

   public void a(aoz var1) {
      eu var2 = this.u.vk;
      switch(var1.cE) {
      case 0:
         var2.a(new ajb(var1.cI, var1.cG, var1.cH));
         var2.fP.new = var1.cF;
         break;
      case 1:
         var2.new(ajs.a(var2.al), ajs.a(var2.ak), ajs.a(var2.aj));
         var2.fP.new = var1.cF;
         break;
      case 2:
         oe var3 = new oe();
         if (var1.cG) {
            var3.A(var1.cI);
         }

         var2.a(var3);
         var2.fP.new = var1.cF;
         break;
      case 3:
         oi var4 = new oi();
         if (var1.cG) {
            var4.if(var1.cI);
         }

         var2.a(var4);
         var2.fP.new = var1.cF;
         break;
      case 4:
         var2.a(ajs.a(var2.al), ajs.a(var2.ak), ajs.a(var2.aj), var1.cG ? var1.cI : null);
         var2.fP.new = var1.cF;
         break;
      case 5:
         on var5 = new on();
         if (var1.cG) {
            var5.B(var1.cI);
         }

         var2.a(var5);
         var2.fP.new = var1.cF;
         break;
      case 6:
         var2.a(new aer(var2), var1.cG ? var1.cI : null);
         var2.fP.new = var1.cF;
         break;
      case 7:
         oo var6 = new oo();
         var2.a(var6);
         if (var1.cG) {
            var6.for(var1.cI);
         }

         var2.fP.new = var1.cF;
         break;
      case 8:
         var2.for(ajs.a(var2.al), ajs.a(var2.ak), ajs.a(var2.aj));
         var2.fP.new = var1.cF;
         break;
      case 9:
         oc var7 = new oc();
         if (var1.cG) {
            var7.z(var1.cI);
         }

         var2.a(var7);
         var2.fP.new = var1.cF;
         break;
      case 10:
         oh var8 = new oh();
         if (var1.cG) {
            var8.if(var1.cI);
         }

         var2.a(var8);
         var2.fP.new = var1.cF;
      default:
         ModLoader.a(var1);
      }

   }

   public void a(aow var1) {
      eu var2 = this.u.vk;
      if (var1.cx == -1) {
         var2.fR.if(var1.cy);
      } else {
         boolean var3 = false;
         if (this.u.u8 instanceof h7) {
            h7 var4 = (h7)this.u.u8;
            var3 = var4.ex() != acn.new.goto();
         }

         if (var1.cx == 0 && var1.cw >= 36 && var1.cw < 45) {
            abp var5 = var2.fQ.do(var1.cw).for();
            if (var1.cy != null && (var5 == null || var5.if < var1.cy.if)) {
               var1.cy.a = 5;
            }

            var2.fQ.a(var1.cw, var1.cy);
         } else if (var1.cx == var2.fP.new && (var1.cx != 0 || !var3)) {
            var2.fP.a(var1.cw, var1.cy);
         }
      }

   }

   public void a(ao3 var1) {
      ad1 var2 = null;
      eu var3 = this.u.vk;
      if (var1.cT == 0) {
         var2 = var3.fQ;
      } else if (var1.cT == var3.fP.new) {
         var2 = var3.fP;
      }

      if (var2 != null && !var1.cU) {
         this.for((an7)(new ao3(var1.cT, var1.cS, true)));
      }

   }

   public void a(aoy var1) {
      eu var2 = this.u.vk;
      if (var1.cD == 0) {
         var2.fQ.a(var1.cC);
      } else if (var1.cD == var2.fP.new) {
         var2.fP.a(var1.cC);
      }

   }

   public void a(ang var1) {
      boolean var2 = false;
      if (this.u.vm.p(var1.G, var1.F, var1.I)) {
         n4 var3 = this.u.vm.if(var1.G, var1.F, var1.I);
         if (var3 instanceof n7) {
            n7 var4 = (n7)var3;
            if (var4.m()) {
               for(int var5 = 0; var5 < 4; ++var5) {
                  var4.i[var5] = var1.H[var5];
               }

               var4.case();
            }

            var2 = true;
         }
      }

      if (!var2 && this.u.vk != null) {
         this.u.vk.a("Unable to locate sign at " + var1.G + ", " + var1.F + ", " + var1.I);
      }

   }

   public void a(anc var1) {
      if (this.u.vm.p(var1.o, var1.n, var1.r)) {
         n4 var2 = this.u.vm.if(var1.o, var1.n, var1.r);
         if (var2 != null) {
            if (var1.q == 1 && var2 instanceof oa) {
               var2.a(var1.p);
            } else if (var1.q == 2 && var2 instanceof ol) {
               var2.a(var1.p);
            } else if (var1.q == 3 && var2 instanceof oo) {
               var2.a(var1.p);
            } else if (var1.q == 4 && var2 instanceof n6) {
               var2.a(var1.p);
            } else if (var1.q == 255) {
               if (var1.p == null) {
                  return;
               }

               String var3 = var1.p.new("id");
               String var4 = (String)n4.void().get(var2.getClass());
               if (var3 != null && var4 != null && var3.equals(var4)) {
                  var2.a(var1.p);
               }
            }
         }
      }

   }

   public void a(aox var1) {
      eu var2 = this.u.vk;
      this.a((an7)var1);
      if (var2.fP != null && var2.fP.new == var1.cA) {
         var2.fP.a(var1.cz, var1.cB);
      }

   }

   public void a(anq var1) {
      aiw var2 = this.a(var1.ao);
      if (var2 != null) {
         var2.do(var1.an, var1.goto());
      }

   }

   public void a(ao0 var1) {
      this.u.vk.cX();
   }

   public void a(anb var1) {
      this.u.vm.do(var1.i, var1.h, var1.m, var1.j, var1.l, var1.k);
   }

   public void a(and var1) {
      this.u.vm.new(var1.try(), var1.case(), var1.byte(), var1.new(), var1.char());
   }

   public void a(aok var1) {
      for(int var2 = 0; var2 < var1.z(); ++var2) {
         int var3 = var1.a(var2);
         int var4 = var1.do(var2);
         this.t.a(var3, var4, true);
         this.t.byte(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
         xx var5 = this.t.byte(var3, var4);
         if (var5 == null) {
            this.t.a(var3, var4, true);
            var5 = this.t.byte(var3, var4);
         }

         if (var5 != null) {
            var5.a(var1.if(var2), var1.bV[var2], var1.bU[var2], true);
            this.t.new(var3 << 4, 0, var4 << 4, (var3 << 4) + 15, 256, (var4 << 4) + 15);
            if (!(this.t.n instanceof xj)) {
               var5.do();
            }
         }
      }

   }

   public boolean if() {
      return this.u != null && this.u.vm != null && this.u.vk != null && this.t != null;
   }

   public void a(aoq var1) {
      eu var2 = this.u.vk;
      int var3 = var1.ca;
      int var4 = var1.cc;
      if (var3 >= 0 && var3 < aoq.cb.length && aoq.cb[var3] != null) {
         var2.new(aoq.cb[var3]);
      }

      if (var3 == 1) {
         this.t.l().do(true);
         this.t.new(0.0F);
      } else if (var3 == 2) {
         this.t.l().do(false);
         this.t.new(1.0F);
      } else if (var3 == 3) {
         this.u.vp.a(yz.a(var4));
      } else if (var3 == 4) {
         this.u.a((i5)(new gw()));
      } else if (var3 == 5) {
         ke var5 = this.u.u1;
         if (var4 == 0) {
            this.u.a((i5)(new jw()));
         } else if (var4 == 101) {
            this.u.u4.c5().if("demo.help.movement", Keyboard.getKeyName(var5.aL.int), Keyboard.getKeyName(var5.aK.int), Keyboard.getKeyName(var5.aJ.int), Keyboard.getKeyName(var5.aH.int));
         } else if (var4 == 102) {
            this.u.u4.c5().if("demo.help.jump", Keyboard.getKeyName(var5.aG.int));
         } else if (var4 == 103) {
            this.u.u4.c5().if("demo.help.inventory", Keyboard.getKeyName(var5.aF.int));
         }
      } else if (var3 == 6) {
         this.t.a(var2.al, var2.ak + (double)var2.af(), var2.aj, "random.successful_hit", 0.18F, 0.45F, false);
      }

   }

   public void a(ao4 var1) {
      if (var1.cW == abr.aZ.A) {
         abn.a(var1.cV, this.u.vm).a(var1.cX);
      } else {
         this.u.a().if("Unknown itemid: " + var1.cV);
      }

   }

   public void a(aoj var1) {
      if (var1.y()) {
         this.u.vm.a(var1.bI, var1.bM, var1.bL, var1.bK, var1.bH);
      } else {
         this.u.vm.for(var1.bI, var1.bM, var1.bL, var1.bK, var1.bH);
      }

   }

   public void a(apj var1) {
      this.u.vk.if(aka.a(var1.dj), var1.di);
   }

   public void a(am9 var1) {
      aiw var2 = this.a(var1.long);
      if (var2 instanceof aig) {
         aiz var3 = new aiz(var1.goto, var1.void, var1.b);
         var3.a(var1.int());
         ((aig)var2).for(var3);
      }

   }

   public void a(an0 var1) {
      aiw var2 = this.a(var1.aM);
      if (var2 instanceof aig) {
         ((aig)var2).z(var1.aL);
      }

   }

   public boolean a() {
      return false;
   }

   public void a(an2 var1) {
      et var2 = (et)this.r.get(var1.aP);
      if (var2 == null && var1.aO) {
         var2 = new et(var1.aP);
         this.r.put(var1.aP, var2);
         this.z.add(var2);
      }

      if (var2 != null && !var1.aO) {
         this.r.remove(var1.aP);
         this.z.remove(var2);
      }

      if (var1.aO && var2 != null) {
         var2.a = var1.aQ;
      }

   }

   public void a(aon var1) {
      this.for((an7)(new aon(var1.b5)));
   }

   public void a(an5 var1) {
      eu var2 = this.u.vk;
      var2.fY.a = var1.f();
      var2.fY.new = var1.i();
      var2.fY.if = var1.d();
      var2.fY.try = var1.h();
      var2.fY.a(var1.e());
      var2.fY.if(var1.g());
   }

   public void a(aph var1) {
      String[] var2 = var1.N().split("\u0000");
      if (this.u.u8 instanceof j3) {
         j3 var3 = (j3)this.u.u8;
         var3.a(var2);
      }

   }

   public void a(aoh var1) {
      this.u.vm.a(var1.n(), var1.l(), var1.j(), var1.k(), var1.o(), var1.m(), false);
   }

   public void a(aov var1) {
      if ("MC|TPack".equals(var1.cu)) {
         String[] var2 = (new String(var1.cv)).split("\u0000");
         String var3 = var2[0];
         if (var2[1].equals("16")) {
            if (this.u.uT.do()) {
               this.u.uT.a(var3);
            } else if (this.u.uT.a()) {
               this.u.a((i5)(new j2(new e4(this, var3), aqy.if().a("multiplayer.texturePrompt.line1"), aqy.if().a("multiplayer.texturePrompt.line2"), 0)));
            }
         }
      } else if ("MC|TrList".equals(var1.cu)) {
         DataInputStream var8 = new DataInputStream(new ByteArrayInputStream(var1.cv));

         try {
            int var9 = var8.readInt();
            i5 var4 = this.u.u8;
            if (var4 != null && var4 instanceof hy && var9 == this.u.vk.fP.new) {
               zn var5 = ((hy)var4).et();
               zl var6 = zl.a(var8);
               var5.a(var6);
            }
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      } else {
         ModLoader.a(var1);
      }

   }

   public void a(ann var1) {
      nl var2 = this.t.f();
      np var3;
      if (var1.ag == 0) {
         var3 = var2.a(var1.af, nh.a);
         var3.a(var1.ae);
      } else {
         var3 = var2.byte(var1.af);
         if (var1.ag == 1) {
            var2.int(var3);
         } else if (var1.ag == 2) {
            var3.a(var1.ae);
         }
      }

   }

   public void a(ank var1) {
      nl var2 = this.t.f();
      np var3 = var2.byte(var1.R);
      if (var1.T == 0) {
         nn var4 = var2.a(var1.S, var3);
         var4.a(var1.U);
      } else if (var1.T == 1) {
         var2.new(var1.S);
      }

   }

   public void a(ant var1) {
      nl var2 = this.t.f();
      if (var1.aw.length() == 0) {
         var2.a(var1.ax, (np)null);
      } else {
         np var3 = var2.byte(var1.aw);
         var2.a(var1.ax, var3);
      }

   }

   public void a(anm var1) {
      nl var2 = this.t.f();
      no var3;
      if (var1.aa == 0) {
         var3 = var2.int(var1.Y);
      } else {
         var3 = var2.for(var1.Y);
      }

      if (var1.aa == 0 || var1.aa == 2) {
         var3.do(var1.X);
         var3.if(var1.ad);
         var3.a(var1.ac);
         var3.a(var1.Z);
      }

      Iterator var4;
      String var5;
      if (var1.aa == 0 || var1.aa == 3) {
         var4 = var1.ab.iterator();

         while(var4.hasNext()) {
            var5 = (String)var4.next();
            var2.if(var5, var3);
         }
      }

      if (var1.aa == 4) {
         var4 = var1.ab.iterator();

         while(var4.hasNext()) {
            var5 = (String)var4.next();
            var2.a(var5, var3);
         }
      }

      if (var1.aa == 1) {
         var2.a(var3);
      }

   }

   public void a(aoi var1) {
      for(int var2 = 0; var2 < var1.v(); ++var2) {
         double var3 = this.x.nextGaussian() * (double)var1.x();
         double var5 = this.x.nextGaussian() * (double)var1.u();
         double var7 = this.x.nextGaussian() * (double)var1.r();
         double var9 = this.x.nextGaussian() * (double)var1.p();
         double var11 = this.x.nextGaussian() * (double)var1.p();
         double var13 = this.x.nextGaussian() * (double)var1.p();
         this.t.a(var1.s(), var1.w() + var3, var1.t() + var5, var1.q() + var7, var9, var11, var13);
      }

   }

   public aqb byte() {
      return this.v;
   }
}
