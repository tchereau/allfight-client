import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class akx extends an6 {
   public final aqb e;
   private final net.minecraft.a.a b;
   public boolean d = false;
   public ak2 c;
   private int void;
   private int long;
   private boolean goto;
   private int else;
   private long char;
   private static Random case = new Random();
   private long byte;
   private int try = 0;
   private int new = 0;
   private double int;
   private double for;
   private double do;
   private boolean if = true;
   private ajy a = new ajy();

   public akx(net.minecraft.a.a var1, aqb var2, ak2 var3) {
      this.b = var1;
      this.e = var2;
      var2.a((an6)this);
      this.c = var3;
      var3.pV = this;
   }

   public void do() {
      this.goto = false;
      ++this.void;
      this.b.t5.a("packetflow");
      this.e.if();
      this.b.t5.do("keepAlive");
      if ((long)this.void - this.byte > 20L) {
         this.byte = (long)this.void;
         this.char = System.nanoTime() / 1000000L;
         this.else = case.nextInt();
         this.if((an7)(new aon(this.else)));
      }

      if (this.try > 0) {
         --this.try;
      }

      if (this.new > 0) {
         --this.new;
      }

      this.b.t5.do("playerTick");
      this.b.t5.if();
   }

   public void if(String var1) {
      if (!this.d) {
         this.c.eA();
         this.if((an7)(new aou(var1)));
         this.e.int();
         this.b.g6().a((an7)(new apf(aqj.b + this.c.fJ + " left the game.")));
         this.b.g6().int(this.c);
         this.d = true;
      }

   }

   public void a(aob var1) {
      ak5 var2 = this.b.aS(this.c.a6);
      this.goto = true;
      if (!this.c.pM) {
         double var3;
         if (!this.if) {
            var3 = var1.bb - this.for;
            if (var1.bc == this.int && var3 * var3 < 0.01D && var1.ba == this.do) {
               this.if = true;
            }
         }

         if (this.if) {
            double var5;
            double var7;
            double var9;
            double var11;
            float var13;
            float var14;
            double var15;
            if (this.c.ar != null) {
               var13 = this.c.a5;
               var14 = this.c.a4;
               this.c.ar.aI();
               var5 = this.c.al;
               var7 = this.c.ak;
               var9 = this.c.aj;
               var15 = 0.0D;
               var11 = 0.0D;
               if (var1.a4) {
                  var13 = var1.a8;
                  var14 = var1.a7;
               }

               if (var1.a5 && var1.bb == -999.0D && var1.a9 == -999.0D) {
                  if (Math.abs(var1.bc) > 1.0D || Math.abs(var1.ba) > 1.0D) {
                     System.err.println(this.c.fJ + " was caught trying to crash the server with an invalid position.");
                     this.if("Nope!");
                     return;
                  }

                  var15 = var1.bc;
                  var11 = var1.ba;
               }

               this.c.aY = var1.a6;
               this.c.eD();
               this.c.do(var15, 0.0D, var11);
               this.c.a(var5, var7, var9, var13, var14);
               this.c.ai = var15;
               this.c.ag = var11;
               if (this.c.ar != null) {
                  var2.if(this.c.ar, true);
               }

               if (this.c.ar != null) {
                  this.c.ar.aI();
               }

               this.b.g6().for(this.c);
               this.int = this.c.al;
               this.for = this.c.ak;
               this.do = this.c.aj;
               var2.int(this.c);
               return;
            }

            if (this.c.cg()) {
               this.c.eD();
               this.c.a(this.int, this.for, this.do, this.c.a5, this.c.a4);
               var2.int(this.c);
               return;
            }

            var3 = this.c.ak;
            this.int = this.c.al;
            this.for = this.c.ak;
            this.do = this.c.aj;
            var5 = this.c.al;
            var7 = this.c.ak;
            var9 = this.c.aj;
            var13 = this.c.a5;
            var14 = this.c.a4;
            if (var1.a5 && var1.bb == -999.0D && var1.a9 == -999.0D) {
               var1.a5 = false;
            }

            if (var1.a5) {
               var5 = var1.bc;
               var7 = var1.bb;
               var9 = var1.ba;
               var11 = var1.a9 - var1.bb;
               if (!this.c.cg() && (var11 > 1.65D || var11 < 0.1D)) {
                  this.if("Illegal stance");
                  this.b.a().if(this.c.fJ + " had an illegal stance: " + var11);
                  return;
               }

               if (Math.abs(var1.bc) > 3.2E7D || Math.abs(var1.ba) > 3.2E7D) {
                  this.if("Illegal position");
                  return;
               }
            }

            if (var1.a4) {
               var13 = var1.a8;
               var14 = var1.a7;
            }

            this.c.eD();
            this.c.aG = 0.0F;
            this.c.a(this.int, this.for, this.do, var13, var14);
            if (!this.if) {
               return;
            }

            var11 = var5 - this.c.al;
            var15 = var7 - this.c.ak;
            double var17 = var9 - this.c.aj;
            double var19 = Math.min(Math.abs(var11), Math.abs(this.c.ai));
            double var21 = Math.min(Math.abs(var15), Math.abs(this.c.ah));
            double var23 = Math.min(Math.abs(var17), Math.abs(this.c.ag));
            double var25 = var19 * var19 + var21 * var21 + var23 * var23;
            if (var25 > 100.0D && (!this.b.hb() || !this.b.hC().equals(this.c.fJ))) {
               this.b.a().if(this.c.fJ + " moved too quickly! " + var11 + "," + var15 + "," + var17 + " (" + var19 + ", " + var21 + ", " + var23 + ")");
               this.a(this.int, this.for, this.do, this.c.a5, this.c.a4);
               return;
            }

            float var27 = 0.0625F;
            boolean var28 = var2.if(this.c, this.c.aZ.do().for((double)var27, (double)var27, (double)var27)).isEmpty();
            if (this.c.aY && !var1.a6 && var15 > 0.0D) {
               this.c.d(0.2F);
            }

            this.c.do(var11, var15, var17);
            this.c.aY = var1.a6;
            this.c.else(var11, var15, var17);
            double var29 = var15;
            var11 = var5 - this.c.al;
            var15 = var7 - this.c.ak;
            if (var15 > -0.5D || var15 < 0.5D) {
               var15 = 0.0D;
            }

            var17 = var9 - this.c.aj;
            var25 = var11 * var11 + var15 * var15 + var17 * var17;
            boolean var31 = false;
            if (var25 > 0.0625D && !this.c.cg() && !this.c.pT.do()) {
               var31 = true;
               this.b.a().if(this.c.fJ + " moved wrongly!");
            }

            this.c.a(var5, var7, var9, var13, var14);
            boolean var32 = var2.if(this.c, this.c.aZ.do().for((double)var27, (double)var27, (double)var27)).isEmpty();
            if (var28 && (var31 || !var32) && !this.c.cg()) {
               this.a(this.int, this.for, this.do, var13, var14);
               return;
            }

            nw var33 = this.c.aZ.do().do((double)var27, (double)var27, (double)var27).a(0.0D, -0.55D, 0.0D);
            if (!this.b.hD() && !this.c.pT.do() && !var2.a((nw)var33)) {
               if (var29 >= -0.03125D) {
                  ++this.long;
                  if (this.long > 80) {
                     this.b.a().if(this.c.fJ + " was kicked for floating too long!");
                     this.if("Flying is not enabled on this server");
                     return;
                  }
               }
            } else {
               this.long = 0;
            }

            this.c.aY = var1.a6;
            this.b.g6().for(this.c);
            this.c.if(this.c.ak - var3, var1.a6);
         }
      }

   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      this.if = false;
      this.int = var1;
      this.for = var3;
      this.do = var5;
      this.c.a(var1, var3, var5, var7, var8);
      this.c.pV.if((an7)(new an9(var1, var3 + 1.6200000047683716D, var3, var5, var7, var8, false)));
   }

   public void a(an4 var1) {
      ak5 var2 = this.b.aS(this.c.a6);
      if (var1.aV == 4) {
         this.c.f(false);
      } else if (var1.aV == 3) {
         this.c.f(true);
      } else if (var1.aV == 5) {
         this.c.cz();
      } else {
         boolean var3 = false;
         if (var1.aV == 0) {
            var3 = true;
         }

         if (var1.aV == 1) {
            var3 = true;
         }

         if (var1.aV == 2) {
            var3 = true;
         }

         int var4 = var1.aU;
         int var5 = var1.aT;
         int var6 = var1.aX;
         if (var3) {
            double var7 = this.c.al - ((double)var4 + 0.5D);
            double var9 = this.c.ak - ((double)var5 + 0.5D) + 1.5D;
            double var11 = this.c.aj - ((double)var6 + 0.5D);
            double var13 = var7 * var7 + var9 * var9 + var11 * var11;
            if (var13 > 36.0D) {
               return;
            }

            if (var5 >= this.b.hG()) {
               return;
            }
         }

         if (var1.aV == 0) {
            if (!this.b.a(var2, var4, var5, var6, this.c)) {
               this.c.pT.a(var4, var5, var6, var1.aW);
            } else {
               this.c.pV.if((an7)(new ana(var4, var5, var6, var2)));
            }
         } else if (var1.aV == 2) {
            this.c.pT.a(var4, var5, var6);
            if (var2.new(var4, var5, var6) != 0) {
               this.c.pV.if((an7)(new ana(var4, var5, var6, var2)));
            }
         } else if (var1.aV == 1) {
            this.c.pT.if(var4, var5, var6);
            if (var2.new(var4, var5, var6) != 0) {
               this.c.pV.if((an7)(new ana(var4, var5, var6, var2)));
            }
         }
      }

   }

   public void a(am8 var1) {
      ak5 var2 = this.b.aS(this.c.a6);
      abp var3 = this.c.fR.L();
      boolean var4 = false;
      int var5 = var1.S();
      int var6 = var1.W();
      int var7 = var1.U();
      int var8 = var1.R();
      if (var1.R() == 255) {
         if (var3 == null) {
            return;
         }

         this.c.pT.a(this.c, var2, var3);
      } else if (var1.W() < this.b.hG() - 1 || var1.R() != 1 && var1.W() < this.b.hG()) {
         if (this.if && this.c.if((double)var5 + 0.5D, (double)var6 + 0.5D, (double)var7 + 0.5D) < 64.0D && !this.b.a(var2, var5, var6, var7, this.c)) {
            this.c.pT.a(this.c, var2, var3, var5, var6, var7, var8, var1.X(), var1.V(), var1.T());
         }

         var4 = true;
      } else {
         this.c.pV.if((an7)(new apf("" + aqj.i + "Height limit for building is " + this.b.hG())));
         var4 = true;
      }

      if (var4) {
         this.c.pV.if((an7)(new ana(var5, var6, var7, var2)));
         if (var8 == 0) {
            --var6;
         }

         if (var8 == 1) {
            ++var6;
         }

         if (var8 == 2) {
            --var7;
         }

         if (var8 == 3) {
            ++var7;
         }

         if (var8 == 4) {
            --var5;
         }

         if (var8 == 5) {
            ++var5;
         }

         this.c.pV.if((an7)(new ana(var5, var6, var7, var2)));
      }

      var3 = this.c.fR.L();
      if (var3 != null && var3.if == 0) {
         this.c.fR.V[this.c.fR.aa] = null;
         var3 = null;
      }

      if (var3 == null || var3.long() == 0) {
         this.c.pO = true;
         this.c.fR.V[this.c.fR.aa] = abp.if(this.c.fR.V[this.c.fR.aa]);
         ac9 var9 = this.c.fP.a((ajg)this.c.fR, this.c.fR.aa);
         this.c.fP.do();
         this.c.pO = false;
         if (!abp.if(this.c.fR.L(), var1.Q())) {
            this.if((an7)(new aow(this.c.fP.new, var9.for, this.c.fR.L())));
         }
      }

   }

   public void a(String var1, Object[] var2) {
      this.b.a().a(this.c.fJ + " lost connection: " + var1);
      this.b.g6().a((an7)(new apf(aqj.b + this.c.at() + " left the game.")));
      this.b.g6().int(this.c);
      this.d = true;
      if (this.b.hb() && this.c.fJ.equals(this.b.hC())) {
         this.b.a().a("Stopping singleplayer server as player logged out");
         this.b.ha();
      }

   }

   public void a(an7 var1) {
      this.b.a().if(this.getClass() + " wasn't prepared to deal with a " + var1.getClass());
      this.if("Protocol error, unexpected packet");
   }

   public void if(an7 var1) {
      if (var1 instanceof apf) {
         apf var2 = (apf)var1;
         int var3 = this.c.eJ();
         if (var3 == 2) {
            return;
         }

         if (var3 == 1 && !var2.M()) {
            return;
         }
      }

      try {
         this.e.a(var1);
      } catch (Throwable var5) {
         aqh var6 = aqh.a(var5, "Sending packet");
         apu var4 = var6.a("Packet being sent");
         var4.a((String)"Packet ID", (Callable)(new akw(this, var1)));
         var4.a((String)"Packet class", (Callable)(new akv(this, var1)));
         throw new ape(var6);
      }
   }

   public void a(anw var1) {
      if (var1.aA >= 0 && var1.aA < aen.H()) {
         this.c.fR.aa = var1.aA;
      } else {
         this.b.a().if(this.c.fJ + " tried to set an invalid carried item");
      }

   }

   public void a(apf var1) {
      ModLoader.a(this, var1.de);
      if (this.c.eJ() == 2) {
         this.if((an7)(new apf("Cannot send chat message.")));
      } else {
         String var2 = var1.de;
         if (var2.length() > 100) {
            this.if("Chat message too long");
         } else {
            var2 = var2.trim();

            for(int var3 = 0; var3 < var2.length(); ++var3) {
               if (!apc.a(var2.charAt(var3))) {
                  this.if("Illegal characters in chat");
                  return;
               }
            }

            if (var2.startsWith("/")) {
               this.a(var2);
            } else {
               if (this.c.eJ() == 1) {
                  this.if((an7)(new apf("Cannot send chat message.")));
                  return;
               }

               var2 = "<" + this.c.at() + "> " + var2;
               this.b.a().a(var2);
               this.b.g6().a((an7)(new apf(var2, false)));
            }

            this.try += 20;
            if (this.try > 200 && !this.b.g6().for(this.c.fJ)) {
               this.if("disconnect.spam");
            }
         }
      }

   }

   private void a(String var1) {
      this.b.gM().a(this.c, var1);
   }

   public void a(apl var1) {
      if (var1.dk == 1) {
         this.c.b5();
      }

   }

   public void a(an3 var1) {
      if (var1.aR == 1) {
         this.c.int(true);
      } else if (var1.aR == 2) {
         this.c.int(false);
      } else if (var1.aR == 4) {
         this.c.for(true);
      } else if (var1.aR == 5) {
         this.c.for(false);
      } else if (var1.aR == 3) {
         this.c.a(false, true, true);
         this.if = false;
      }

   }

   public void a(aou var1) {
      this.e.a("disconnect.quitting");
   }

   public int for() {
      return this.e.new();
   }

   public void a(aoo var1) {
      ak5 var2 = this.b.aS(this.c.a6);
      aiw var3 = var2.a(var1.b6);
      if (var3 != null) {
         boolean var4 = this.c.void(var3);
         double var5 = 36.0D;
         if (!var4) {
            var5 = 9.0D;
         }

         if (this.c.for(var3) < var5) {
            if (var1.b8 == 0) {
               this.c.c(var3);
            } else if (var1.b8 == 1) {
               this.c.f(var3);
            }
         }
      }

   }

   public void a(apb var1) {
      if (var1.c8 == 1) {
         if (this.c.pM) {
            this.c = this.b.g6().a(this.c, 0, true);
         } else if (this.c.eC().l().void()) {
            if (this.b.hb() && this.c.fJ.equals(this.b.hC())) {
               this.c.pV.if("You have died. Game over, man, it's game over!");
               this.b.hp();
            } else {
               am6 var2 = new am6(this.c.fJ);
               var2.if("Death in Hardcore");
               this.b.g6().int().a(var2);
               this.c.pV.if("You have died. Game over, man, it's game over!");
            }
         } else {
            if (this.c.cd() > 0) {
               return;
            }

            this.c = this.b.g6().a(this.c, 0, false);
         }
      }

   }

   public boolean if() {
      return true;
   }

   public void a(anz var1) {
   }

   public void a(ao0 var1) {
      this.c.eF();
   }

   public void a(ao1 var1) {
      if (this.c.fP.new == var1.cL && this.c.fP.a((aek)this.c)) {
         abp var2 = this.c.fP.a(var1.cK, var1.cP, var1.cM, this.c);
         if (abp.if(var1.cN, var2)) {
            this.c.pV.if((an7)(new ao3(var1.cL, var1.cO, true)));
            this.c.pO = true;
            this.c.fP.do();
            this.c.eB();
            this.c.pO = false;
         } else {
            this.a.a(this.c.fP.new, var1.cO);
            this.c.pV.if((an7)(new ao3(var1.cL, var1.cO, false)));
            this.c.fP.a(this.c, false);
            ArrayList var3 = new ArrayList();

            for(int var4 = 0; var4 < this.c.fP.try.size(); ++var4) {
               var3.add(((ac9)this.c.fP.try.get(var4)).for());
            }

            this.c.a((ad1)this.c.fP, (List)var3);
         }
      }

   }

   public void a(ao2 var1) {
      if (this.c.fP.new == var1.cR && this.c.fP.a((aek)this.c)) {
         this.c.fP.a((aek)this.c, var1.cQ);
         this.c.fP.do();
      }

   }

   public void a(anv var1) {
      if (this.c.pT.do()) {
         boolean var2 = var1.az < 0;
         abp var3 = var1.ay;
         boolean var4 = var1.az >= 1 && var1.az < 36 + aen.H();
         boolean var5 = var3 == null || var3.new < abr.ai.length && var3.new >= 0 && abr.ai[var3.new] != null;
         boolean var6 = var3 == null || var3.new() >= 0 && var3.new() >= 0 && var3.if <= 64 && var3.if > 0;
         if (var4 && var5 && var6) {
            if (var3 == null) {
               this.c.fQ.a(var1.az, (abp)null);
            } else {
               this.c.fQ.a(var1.az, var3);
            }

            this.c.fQ.a(this.c, true);
         } else if (var2 && var5 && var6 && this.new < 200) {
            this.new += 20;
            afk var7 = this.c.else(var3);
            if (var7 != null) {
               var7.bc();
            }
         }
      }

   }

   public void a(ao3 var1) {
      Short var2 = (Short)this.a.for(this.c.fP.new);
      if (var2 != null && var1.cS == var2 && this.c.fP.new == var1.cT && !this.c.fP.a((aek)this.c)) {
         this.c.fP.a(this.c, true);
      }

   }

   public void a(ang var1) {
      ak5 var2 = this.b.aS(this.c.a6);
      if (var2.p(var1.G, var1.F, var1.I)) {
         n4 var3 = var2.if(var1.G, var1.F, var1.I);
         if (var3 instanceof n7) {
            n7 var4 = (n7)var3;
            if (!var4.m()) {
               this.b.I("Player " + this.c.fJ + " just tried to change non-editable sign");
               return;
            }
         }

         int var5;
         int var8;
         for(var5 = 0; var5 < 4; ++var5) {
            boolean var6 = true;
            if (var1.H[var5].length() > 15) {
               var6 = false;
            } else {
               for(var8 = 0; var8 < var1.H[var5].length(); ++var8) {
                  if (apc.if.indexOf(var1.H[var5].charAt(var8)) < 0) {
                     var6 = false;
                  }
               }
            }

            if (!var6) {
               var1.H[var5] = "!?";
            }
         }

         if (var3 instanceof n7) {
            var5 = var1.G;
            int var9 = var1.F;
            var8 = var1.I;
            n7 var7 = (n7)var3;
            System.arraycopy(var1.H, 0, var7.i, 0, 4);
            var7.case();
            var2.n(var5, var9, var8);
         }
      }

   }

   public void a(aon var1) {
      if (var1.b5 == this.else) {
         int var2 = (int)(System.nanoTime() / 1000000L - this.char);
         this.c.pN = (this.c.pN * 3 + var2) / 4;
      }

   }

   public boolean a() {
      return true;
   }

   public void a(an5 var1) {
      this.c.fY.a = var1.f() && this.c.fY.try;
   }

   public void a(aph var1) {
      StringBuilder var2 = new StringBuilder();

      String var3;
      for(Iterator var4 = this.b.a((ar0)this.c, (String)var1.N()).iterator(); var4.hasNext(); var2.append(var3)) {
         var3 = (String)var4.next();
         if (var2.length() > 0) {
            var2.append("\u0000");
         }
      }

      this.c.pV.if((an7)(new aph(var2.toString())));
   }

   public void a(ao9 var1) {
      this.c.a(var1);
   }

   public void a(aov var1) {
      DataInputStream var2;
      abp var3;
      abp var4;
      if ("MC|BEdit".equals(var1.cu)) {
         try {
            var2 = new DataInputStream(new ByteArrayInputStream(var1.cv));
            var3 = an7.do(var2);
            if (!aau.if(var3.b())) {
               throw new IOException("Invalid book tag!");
            }

            var4 = this.c.fR.L();
            if (var3 != null && var3.new == abr.bT.A && var3.new == var4.new) {
               var4.a((String)"pages", (aqd)var3.b().void("pages"));
            }
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      } else if ("MC|BSign".equals(var1.cu)) {
         try {
            var2 = new DataInputStream(new ByteArrayInputStream(var1.cv));
            var3 = an7.do(var2);
            if (!aat.a(var3.b())) {
               throw new IOException("Invalid book tag!");
            }

            var4 = this.c.fR.L();
            if (var3 != null && var3.new == abr.bR.A && var4.new == abr.bT.A) {
               var4.a((String)"author", (aqd)(new aqf("author", this.c.fJ)));
               var4.a((String)"title", (aqd)(new aqf("title", var3.b().new("title"))));
               var4.a((String)"pages", (aqd)var3.b().void("pages"));
               var4.new = abr.bR.A;
            }
         } catch (Exception var13) {
            var13.printStackTrace();
         }
      } else {
         int var5;
         if ("MC|TrSel".equals(var1.cu)) {
            try {
               var2 = new DataInputStream(new ByteArrayInputStream(var1.cv));
               var5 = var2.readInt();
               ad1 var6 = this.c.fP;
               if (var6 instanceof adh) {
                  ((adh)var6).int(var5);
               }
            } catch (Exception var12) {
               var12.printStackTrace();
            }
         } else {
            String var8;
            int var15;
            if ("MC|AdvCdm".equals(var1.cu)) {
               if (!this.b.hF()) {
                  this.c.a(this.c.a((String)"advMode.notEnabled", (Object[])(new Object[0])));
               } else if (this.c.a(2, "") && this.c.fY.new) {
                  try {
                     var2 = new DataInputStream(new ByteArrayInputStream(var1.cv));
                     var5 = var2.readInt();
                     var15 = var2.readInt();
                     int var7 = var2.readInt();
                     var8 = an7.a((DataInputStream)var2, 256);
                     n4 var9 = this.c.ap.if(var5, var15, var7);
                     if (var9 != null && var9 instanceof ol) {
                        ((ol)var9).E(var8);
                        this.c.ap.n(var5, var15, var7);
                        this.c.a("Command set: " + var8);
                     }
                  } catch (Exception var11) {
                     var11.printStackTrace();
                  }
               } else {
                  this.c.a(this.c.a((String)"advMode.notAllowed", (Object[])(new Object[0])));
               }
            } else if ("MC|Beacon".equals(var1.cu)) {
               if (this.c.fP instanceof ad0) {
                  try {
                     var2 = new DataInputStream(new ByteArrayInputStream(var1.cv));
                     var5 = var2.readInt();
                     var15 = var2.readInt();
                     ad0 var16 = (ad0)this.c.fP;
                     ac9 var18 = var16.do(0);
                     if (var18.do()) {
                        var18.a(1);
                        oo var19 = var16.try();
                        var19.for(var5);
                        var19.new(var15);
                        var19.case();
                     }
                  } catch (Exception var10) {
                     var10.printStackTrace();
                  }
               }
            } else if ("MC|ItemName".equals(var1.cu) && this.c.fP instanceof ade) {
               ade var17 = (ade)this.c.fP;
               if (var1.cv != null && var1.cv.length >= 1) {
                  var8 = apc.a(new String(var1.cv));
                  if (var8.length() <= 30) {
                     var17.a(var8);
                  }
               } else {
                  var17.a("");
               }
            } else {
               ModLoader.a(this, var1);
            }
         }
      }

   }
}
