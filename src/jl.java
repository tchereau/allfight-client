import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class jl extends i5 {
   private static int mM = 0;
   private static Object mL = new Object();
   private i5 mK;
   private jk mJ;
   private ep mI;
   private int mH = -1;
   private j6 mG;
   private j6 mE;
   private j6 mC;
   private boolean mA = false;
   private boolean mz = false;
   private boolean my = false;
   private boolean mx = false;
   private String mw = null;
   private eq mv = null;
   private ap mu;
   private aq mt;
   private int mF;
   private boolean mD;
   private List mB = Collections.emptyList();

   public jl(i5 var1) {
      this.mK = var1;
   }

   public void dA() {
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      if (!this.mD) {
         this.mD = true;
         this.mI = new ep(this.hW);
         this.mI.if();
         this.mu = new ap();

         try {
            this.mt = new aq(this.mu);
            this.mt.start();
         } catch (Exception var2) {
            this.hW.a().if("Unable to start LAN server detection: " + var2.getMessage());
         }

         this.mJ = new jk(this);
      } else {
         this.mJ.a(this.hV, this.hU, 32, this.hU - 64);
      }

      this.ef();
   }

   public void ef() {
      aqy var1 = aqy.if();
      this.hT.add(this.mG = new j6(7, this.hV / 2 - 154, this.hU - 28, 70, 20, var1.a("selectServer.edit")));
      this.hT.add(this.mC = new j6(2, this.hV / 2 - 74, this.hU - 28, 70, 20, var1.a("selectServer.delete")));
      this.hT.add(this.mE = new j6(1, this.hV / 2 - 154, this.hU - 52, 100, 20, var1.a("selectServer.select")));
      this.hT.add(new j6(4, this.hV / 2 - 50, this.hU - 52, 100, 20, var1.a("selectServer.direct")));
      this.hT.add(new j6(3, this.hV / 2 + 4 + 50, this.hU - 52, 100, 20, var1.a("selectServer.add")));
      this.hT.add(new j6(8, this.hV / 2 + 4, this.hU - 28, 70, 20, var1.a("selectServer.refresh")));
      this.hT.add(new j6(0, this.hV / 2 + 4 + 76, this.hU - 28, 75, 20, var1.a("gui.cancel")));
      boolean var2 = this.mH >= 0 && this.mH < this.mJ.new();
      this.mE.hu = var2;
      this.mG.hu = var2;
      this.mC.hu = var2;
   }

   public void dG() {
      super.dG();
      ++this.mF;
      if (this.mu.if()) {
         this.mB = this.mu.a();
         this.mu.do();
      }

   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
      if (this.mt != null) {
         this.mt.interrupt();
         this.mt = null;
      }

   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 2) {
            String var2 = this.mI.a(this.mH).else;
            if (var2 != null) {
               this.mA = true;
               aqy var3 = aqy.if();
               String var4 = var3.a("selectServer.deleteQuestion");
               String var5 = "'" + var2 + "' " + var3.a("selectServer.deleteWarning");
               String var6 = var3.a("selectServer.deleteButton");
               String var7 = var3.a("gui.cancel");
               j2 var8 = new j2(this, var4, var5, var6, var7, this.mH);
               this.hW.a((i5)var8);
            }
         } else if (var1.hv == 1) {
            this.ad(this.mH);
         } else if (var1.hv == 4) {
            this.mx = true;
            this.hW.a((i5)(new jv(this, this.mv = new eq(aqz.if("selectServer.defaultName"), ""))));
         } else if (var1.hv == 3) {
            this.mz = true;
            this.hW.a((i5)(new jt(this, this.mv = new eq(aqz.if("selectServer.defaultName"), ""))));
         } else if (var1.hv == 7) {
            this.my = true;
            eq var9 = this.mI.a(this.mH);
            this.mv = new eq(var9.else, var9.char);
            this.mv.a(var9.a());
            this.hW.a((i5)(new jt(this, this.mv)));
         } else if (var1.hv == 0) {
            this.hW.a(this.mK);
         } else if (var1.hv == 8) {
            this.hW.a((i5)(new jl(this.mK)));
         } else {
            this.mJ.a(var1);
         }

      }
   }

   public void do(boolean var1, int var2) {
      if (this.mA) {
         this.mA = false;
         if (var1) {
            this.mI.if(var2);
            this.mI.a();
            this.mH = -1;
         }

         this.hW.a((i5)this);
      } else if (this.mx) {
         this.mx = false;
         if (var1) {
            this.a(this.mv);
         } else {
            this.hW.a((i5)this);
         }
      } else if (this.mz) {
         this.mz = false;
         if (var1) {
            this.mI.if(this.mv);
            this.mI.a();
            this.mH = -1;
         }

         this.hW.a((i5)this);
      } else if (this.my) {
         this.my = false;
         if (var1) {
            eq var3 = this.mI.a(this.mH);
            var3.else = this.mv.else;
            var3.char = this.mv.char;
            var3.a(this.mv.a());
            this.mI.a();
         }

         this.hW.a((i5)this);
      }

   }

   protected void if(char var1, int var2) {
      int var3 = this.mH;
      if (var2 == 59) {
         this.hW.u1.P = !this.hW.u1.P;
         this.hW.u1.new();
      } else {
         if (dE() && var2 == 200) {
            if (var3 > 0 && var3 < this.mI.do()) {
               this.mI.a(var3, var3 - 1);
               --this.mH;
               if (var3 < this.mI.do() - 1) {
                  this.mJ.if(-this.mJ.c);
               }
            }
         } else if (dE() && var2 == 208) {
            if (var3 < this.mI.do() - 1) {
               this.mI.a(var3, var3 + 1);
               ++this.mH;
               if (var3 > 0) {
                  this.mJ.if(this.mJ.c);
               }
            }
         } else if (var1 == '\r') {
            this.a((j6)this.hT.get(2));
         } else {
            super.if(var1, var2);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.mw = null;
      aqy var4 = aqy.if();
      this.dx();
      this.mJ.a(var1, var2, var3);
      this.a(this.hR, var4.a("multiplayer.title"), this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (this.mw != null) {
         this.if(this.mw, var1, var2);
      }

   }

   private void ad(int var1) {
      if (var1 < this.mI.do()) {
         this.a(this.mI.a(var1));
      } else {
         var1 -= this.mI.do();
         if (var1 < this.mB.size()) {
            ar var2 = (ar)this.mB.get(var1);
            this.a(new eq(var2.do(), var2.if()));
         }

      }
   }

   private void a(eq var1) {
      this.hW.a((i5)(new e2(this, this.hW, var1)));
   }

   private static void if(eq var0) {
      er var1 = er.if(var0.char);
      Socket var2 = null;
      DataInputStream var3 = null;
      DataOutputStream var4 = null;

      try {
         var2 = new Socket();
         var2.setSoTimeout(3000);
         var2.setTcpNoDelay(true);
         var2.setTrafficClass(18);
         var2.connect(new InetSocketAddress(var1.if(), var1.a()), 3000);
         var3 = new DataInputStream(var2.getInputStream());
         var4 = new DataOutputStream(var2.getOutputStream());
         var4.write(254);
         var4.write(1);
         if (var3.read() != 255) {
            throw new IOException("Bad message");
         }

         String var5 = an7.a((DataInputStream)var3, 256);
         char[] var6 = var5.toCharArray();

         for(int var7 = 0; var7 < var6.length; ++var7) {
            if (var6[var7] != 167 && var6[var7] != 0 && apc.if.indexOf(var6[var7]) < 0) {
               var6[var7] = '?';
            }
         }

         var5 = new String(var6);
         int var8;
         int var9;
         String[] var26;
         if (var5.startsWith("§") && var5.length() > 1) {
            var26 = var5.substring(1).split("\u0000");
            if (ajs.a(var26[0], 0) == 1) {
               var0.byte = var26[3];
               var0.new = ajs.a(var26[1], var0.new);
               var0.int = var26[2];
               var8 = ajs.a(var26[4], 0);
               var9 = ajs.a(var26[5], 0);
               if (var8 >= 0 && var9 >= 0) {
                  var0.case = aqj.i + "" + var8 + "" + aqj.h + "/" + aqj.i + var9;
               } else {
                  var0.case = "" + aqj.h + "???";
               }
            } else {
               var0.int = "???";
               var0.byte = "" + aqj.h + "???";
               var0.new = 61;
               var0.case = "" + aqj.h + "???";
            }
         } else {
            var26 = var5.split("§");
            var5 = var26[0];
            var8 = -1;
            var9 = -1;

            try {
               var8 = Integer.parseInt(var26[1]);
               var9 = Integer.parseInt(var26[2]);
            } catch (Exception var24) {
            }

            var0.byte = aqj.i + var5;
            if (var8 >= 0 && var9 > 0) {
               var0.case = aqj.i + "" + var8 + "" + aqj.h + "/" + aqj.i + var9;
            } else {
               var0.case = "" + aqj.h + "???";
            }

            var0.int = "1.3";
            var0.new = 59;
         }
      } finally {
         try {
            if (var3 != null) {
               var3.close();
            }
         } catch (Throwable var23) {
         }

         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var22) {
         }

         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (Throwable var21) {
         }

      }

   }

   protected void if(String var1, int var2, int var3) {
      if (var1 != null) {
         int var4 = var2 + 12;
         int var5 = var3 - 12;
         int var6 = this.hR.for(var1);
         this.a(var4 - 3, var5 - 3, var4 + var6 + 3, var5 + 8 + 3, -1073741824, -1073741824);
         this.hR.a(var1, var4, var5, -1);
      }
   }

   // $FF: synthetic method
   static ep for(jl var0) {
      return var0.mI;
   }

   // $FF: synthetic method
   static List int(jl var0) {
      return var0.mB;
   }

   // $FF: synthetic method
   static int new(jl var0) {
      return var0.mH;
   }

   // $FF: synthetic method
   static int a(jl var0, int var1) {
      return var0.mH = var1;
   }

   // $FF: synthetic method
   static j6 a(jl var0) {
      return var0.mE;
   }

   // $FF: synthetic method
   static j6 if(jl var0) {
      return var0.mG;
   }

   // $FF: synthetic method
   static j6 do(jl var0) {
      return var0.mC;
   }

   // $FF: synthetic method
   static void if(jl var0, int var1) {
      var0.ad(var1);
   }

   // $FF: synthetic method
   static int try(jl var0) {
      return var0.mF;
   }

   // $FF: synthetic method
   static Object ec() {
      return mL;
   }

   // $FF: synthetic method
   static int eb() {
      return mM;
   }

   // $FF: synthetic method
   static int ed() {
      return mM++;
   }

   // $FF: synthetic method
   static void do(eq var0) {
      if(var0);
   }

   // $FF: synthetic method
   static int ee() {
      return mM--;
   }

   // $FF: synthetic method
   static String a(jl var0, String var1) {
      return var0.mw = var1;
   }
}
