import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class g8 extends i5 {
   private i5 jl;
   private g5 jj;
   private static int jh = 0;
   private static final Object jg = new Object();
   private int jf = -1;
   private j6 je;
   private j6 jd;
   private jf jc;
   private j6 jb;
   private String jq = null;
   private hf jp;
   private boolean jo;
   private List jn = Collections.emptyList();
   private String jm = "http://realms.minecraft.net/";
   private volatile int jk;
   private Long ji;

   public g8(i5 var1) {
      this.jl = var1;
   }

   public void dA() {
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.jp = new hf(this.hW.vg);
      if (!this.jo) {
         this.jo = true;
         this.jj = new g5(this);
      } else {
         this.jj.a(this.hV, this.hU, 32, this.hU - 64);
      }

      (new g6(this)).start();
      this.dK();
   }

   public void dK() {
      aqy var1 = aqy.if();
      this.hT.add(this.jb = new j6(1, this.hV / 2 - 154, this.hU - 52, 100, 20, var1.a("mco.selectServer.select")));
      this.hT.add(this.jd = new j6(2, this.hV / 2 - 48, this.hU - 52, 100, 20, var1.a("mco.selectServer.create")));
      this.hT.add(this.je = new j6(3, this.hV / 2 + 58, this.hU - 52, 100, 20, var1.a("mco.selectServer.configure")));
      this.hT.add(this.jc = new jf(4, this.hV / 2 - 154, this.hU - 28, 154, 20, var1.a("mco.selectServer.moreinfo")));
      this.hT.add(new j6(0, this.hV / 2 + 6, this.hU - 28, 153, 20, var1.a("gui.cancel")));
      boolean var2 = this.jf >= 0 && this.jf < this.jj.new();
      this.jb.hu = var2 && ((gm)this.jn.get(this.jf)).d.equals("OPEN") && !((gm)this.jn.get(this.jf)).long;
      this.je.hu = var2 && this.hW.vg.if.equals(((gm)this.jn.get(this.jf)).c);
      this.jd.hu = this.jk > 0;
   }

   public void dG() {
      super.dG();
      if (this.jp.if()) {
         List var1 = this.jp.a();
         Iterator var2 = var1.iterator();

         while(true) {
            while(var2.hasNext()) {
               gm var3 = (gm)var2.next();
               Iterator var4 = this.jn.iterator();

               while(var4.hasNext()) {
                  gm var5 = (gm)var4.next();
                  if (var3.g == var5.g) {
                     var3.a(var5);
                     if (this.ji != null && this.ji == var3.g) {
                        this.ji = null;
                        var3.case = false;
                     }
                     break;
                  }
               }
            }

            this.jn = var1;
            this.jp.do();
            break;
         }
      }

      this.jd.hu = this.jk > 0;
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 1) {
            this.W(this.jf);
         } else if (var1.hv == 3) {
            gm var2 = (gm)this.jp.a().get(this.jf);
            gm var3 = this.for(var2.g);
            if (var3 != null) {
               this.jp.for();
               this.hW.a((i5)(new ht(this, var3)));
            }
         } else if (var1.hv == 0) {
            this.jp.for();
            this.hW.a(this.jl);
         } else if (var1.hv == 2) {
            this.jp.for();
            this.hW.a((i5)(new hr(this)));
         } else if (var1.hv == 4) {
            this.jc.long(this.jm);
         } else {
            this.jj.a(var1);
         }

      }
   }

   public void do(long var1) {
      this.jf = -1;
      this.ji = var1;
   }

   private gm for(long var1) {
      gv var3 = new gv(this.hW.vg);

      try {
         return var3.do(var1);
      } catch (gj var5) {
      } catch (IOException var6) {
      }

      return null;
   }

   protected void if(char var1, int var2) {
      if (var2 == 59) {
         this.hW.u1.P = !this.hW.u1.P;
         this.hW.u1.new();
      } else {
         if (var1 == '\r') {
            this.a((j6)this.hT.get(2));
         } else {
            super.if(var1, var2);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.jq = null;
      aqy var4 = aqy.if();
      this.dx();
      this.jj.a(var1, var2, var3);
      this.a(this.hR, var4.a("mco.title"), this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
      if (this.jq != null) {
         this.a(this.jq, var1, var2);
      }

   }

   private void W(int var1) {
      if (var1 >= 0 && var1 < this.jn.size()) {
         gm var2 = (gm)this.jn.get(var1);
         this.jp.for();
         hi var3 = new hi(this.hW, this, new ha(this, var2));
         var3.dO();
         this.hW.a((i5)var3);
      }

   }

   private void try(int var1, int var2, int var3, int var4) {
      this.hW.vb.for("/gui/gui.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      this.if(var1 * 2, var2 * 2, 191, 0, 16, 15);
      GL11.glPopMatrix();
      if (var3 >= var1 && var3 <= var1 + 9 && var4 >= var2 && var4 <= var2 + 9) {
         this.jq = "Expired World";
      }

   }

   private void byte(int var1, int var2, int var3, int var4) {
      this.hW.vb.for("/gui/gui.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      this.if(var1 * 2, var2 * 2, 207, 0, 16, 15);
      GL11.glPopMatrix();
      if (var3 >= var1 && var3 <= var1 + 9 && var4 >= var2 && var4 <= var2 + 9) {
         this.jq = "Open World";
      }

   }

   private void case(int var1, int var2, int var3, int var4) {
      this.hW.vb.for("/gui/gui.png");
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      this.if(var1 * 2, var2 * 2, 223, 0, 16, 15);
      GL11.glPopMatrix();
      if (var3 >= var1 && var3 <= var1 + 9 && var4 >= var2 && var4 <= var2 + 9) {
         this.jq = "Closed World";
      }

   }

   protected void a(String var1, int var2, int var3) {
      if (var1 != null) {
         int var4 = var2 + 12;
         int var5 = var3 - 12;
         int var6 = this.hR.for(var1);
         this.a(var4 - 3, var5 - 3, var4 + var6 + 3, var5 + 8 + 3, -1073741824, -1073741824);
         this.hR.a(var1, var4, var5, -1);
      }
   }

   private void a(gm var1) {
      er var2 = er.if(var1.void);
      Socket var3 = null;
      DataInputStream var4 = null;
      DataOutputStream var5 = null;

      try {
         var3 = new Socket();
         var3.setSoTimeout(3000);
         var3.setTcpNoDelay(true);
         var3.setTrafficClass(18);
         var3.connect(new InetSocketAddress(var2.if(), var2.a()), 3000);
         var4 = new DataInputStream(var3.getInputStream());
         var5 = new DataOutputStream(var3.getOutputStream());
         var5.write(254);
         var5.write(1);
         if (var4.read() != 255) {
            throw new IOException("Bad message");
         }

         String var6 = an7.a((DataInputStream)var4, 256);
         char[] var7 = var6.toCharArray();

         for(int var8 = 0; var8 < var7.length; ++var8) {
            if (var7[var8] != 167 && var7[var8] != 0 && apc.if.indexOf(var7[var8]) < 0) {
               var7[var8] = '?';
            }
         }

         var6 = new String(var7);
         int var9;
         int var10;
         String[] var27;
         if (var6.startsWith("§") && var6.length() > 1) {
            var27 = var6.substring(1).split("\u0000");
            if (ajs.a(var27[0], 0) == 1) {
               var1.goto = ajs.a(var27[1], var1.goto);
               var1.else = var27[2];
               var9 = ajs.a(var27[4], 0);
               var10 = ajs.a(var27[5], 0);
               if (var9 >= 0 && var10 >= 0) {
                  var1.char = aqj.i + "" + var9;
               } else {
                  var1.char = "" + aqj.h + "???";
               }
            } else {
               var1.else = "???";
               var1.goto = 61;
               var1.char = "" + aqj.h + "???";
            }
         } else {
            var27 = var6.split("§");
            var6 = var27[0];
            var9 = -1;
            var10 = -1;

            try {
               var9 = Integer.parseInt(var27[1]);
               var10 = Integer.parseInt(var27[2]);
            } catch (Exception var25) {
            }

            var1.e = aqj.i + var6;
            if (var9 >= 0 && var10 > 0) {
               var1.char = aqj.i + "" + var9;
            } else {
               var1.char = "" + aqj.h + "???";
            }

            var1.else = "1.3";
            var1.goto = 59;
         }
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (Throwable var24) {
         }

         try {
            if (var5 != null) {
               var5.close();
            }
         } catch (Throwable var23) {
         }

         try {
            if (var3 != null) {
               var3.close();
            }
         } catch (Throwable var22) {
         }

      }

   }

   // $FF: synthetic method
   static Minecraft case(g8 var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static int a(g8 var0, int var1) {
      return var0.jk = var1;
   }

   // $FF: synthetic method
   static Minecraft b(g8 var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static List if(g8 var0) {
      return var0.jn;
   }

   // $FF: synthetic method
   static int if(g8 var0, int var1) {
      return var0.jf = var1;
   }

   // $FF: synthetic method
   static int do(g8 var0) {
      return var0.jf;
   }

   // $FF: synthetic method
   static j6 goto(g8 var0) {
      return var0.je;
   }

   // $FF: synthetic method
   static Minecraft char(g8 var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static j6 for(g8 var0) {
      return var0.jb;
   }

   // $FF: synthetic method
   static void do(g8 var0, int var1) {
      var0.W(var1);
   }

   // $FF: synthetic method
   static jq void(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static void do(g8 var0, int var1, int var2, int var3, int var4) {
      var0.try(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static void if(g8 var0, int var1, int var2, int var3, int var4) {
      var0.case(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static void a(g8 var0, int var1, int var2, int var3, int var4) {
      var0.byte(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static jq else(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq try(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static Object dL() {
      return jg;
   }

   // $FF: synthetic method
   static int dJ() {
      return jh;
   }

   // $FF: synthetic method
   static int dM() {
      return jh++;
   }

   // $FF: synthetic method
   static void a(g8 var0, gm var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static int dI() {
      return jh--;
   }

   // $FF: synthetic method
   static jq a(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq long(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq byte(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq int(g8 var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static Minecraft new(g8 var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static String a(g8 var0, String var1) {
      return var0.jq = var1;
   }
}
