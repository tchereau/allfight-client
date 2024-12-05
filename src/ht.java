import java.io.IOException;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class ht extends i5 {
   private final i5 kp;
   private gm kn;
   private hs kl;
   private int kk;
   private int kj;
   private int ki;
   private int kh = -1;
   private String kg;
   private j6 kf;
   private j6 ku;
   private j6 kt;
   private j6 ks;
   private j6 kr;
   private j6 kq;
   private j6 ko;
   private boolean km;

   public ht(i5 var1, gm var2) {
      this.kp = var1;
      this.kn = var2;
   }

   public void dG() {
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.kk = this.hV / 2 - 200;
      this.kj = 180;
      this.ki = this.hV / 2;
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      if (this.kn.d.equals("CLOSED")) {
         this.hT.add(this.kf = new j6(0, this.kk, this.Y(12), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.open")));
         this.kf.hu = !this.kn.long;
      } else {
         this.hT.add(this.ku = new j6(1, this.kk, this.Y(12), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.close")));
         this.ku.hu = !this.kn.long;
      }

      this.hT.add(this.ko = new j6(7, this.kk + this.kj / 2 + 2, this.Y(12), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.subscription")));
      this.hT.add(this.kt = new j6(5, this.kk, this.Y(10), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.edit")));
      this.hT.add(this.ks = new j6(6, this.kk + this.kj / 2 + 2, this.Y(10), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.reset")));
      this.hT.add(this.kr = new j6(4, this.ki, this.Y(10), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.invite")));
      this.hT.add(this.kq = new j6(3, this.ki + this.kj / 2 + 2, this.Y(10), this.kj / 2 - 2, 20, var1.a("mco.configure.world.buttons.uninvite")));
      this.hT.add(new j6(10, this.ki, this.Y(12), this.kj, 20, var1.a("gui.back")));
      this.kl = new hs(this);
      this.kt.hu = !this.kn.long;
      this.ks.hu = !this.kn.long;
      this.kr.hu = !this.kn.long;
      this.kq.hu = !this.kn.long;
   }

   private int Y(int var1) {
      return 40 + var1 * 13;
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 10) {
            if (this.km) {
               ((g8)this.kp).do(this.kn.g);
            }

            this.hW.a(this.kp);
         } else if (var1.hv == 5) {
            this.hW.a((i5)(new hn(this, this.kp, this.kn)));
         } else if (var1.hv == 1) {
            aqy var2 = aqy.if();
            String var3 = var2.a("mco.configure.world.close.question.line1");
            String var4 = var2.a("mco.configure.world.close.question.line2");
            this.hW.a((i5)(new hj(this, "Warning!", var3, var4, 1)));
         } else if (var1.hv == 0) {
            this.dV();
         } else if (var1.hv == 4) {
            this.hW.a((i5)(new hm(this.kp, this, this.kn)));
         } else if (var1.hv == 3) {
            this.dX();
         } else if (var1.hv == 6) {
            this.hW.a((i5)(new g1(this, this.kn)));
         } else if (var1.hv == 7) {
            this.hW.a((i5)(new gz(this, this.kn)));
         }

      }
   }

   private void dV() {
      gv var1 = new gv(this.hW.vg);

      try {
         Boolean var2 = var1.if(this.kn.g);
         if (var2) {
            this.km = true;
            this.kn.d = "OPEN";
            this.dA();
         }
      } catch (gj var3) {
      } catch (IOException var4) {
      }

   }

   private void dW() {
      gv var1 = new gv(this.hW.vg);

      try {
         boolean var2 = var1.int(this.kn.g);
         if (var2) {
            this.km = true;
            this.kn.d = "CLOSED";
            this.dA();
         }
      } catch (gj var3) {
      } catch (IOException var4) {
      }

   }

   private void dX() {
      if (this.kh >= 0 && this.kh < this.kn.b.size()) {
         this.kg = (String)this.kn.b.get(this.kh);
         aqy var1 = aqy.if();
         j2 var2 = new j2(this, "Warning!", var1.a("mco.configure.world.uninvite.question") + " '" + this.kg + "'", 3);
         this.hW.a((i5)var2);
      }

   }

   public void do(boolean var1, int var2) {
      if (var2 == 3) {
         if (var1) {
            gv var3 = new gv(this.hW.vg);

            try {
               var3.a(this.kn.g, this.kg);
            } catch (gj var5) {
               System.err.println("Could not uninvite the selected user");
            }

            this.X(this.kh);
         }

         this.hW.a((i5)(new ht(this.kp, this.kn)));
      }

      if (var2 == 1) {
         if (var1) {
            this.dW();
         }

         this.hW.a((i5)this);
      }

   }

   private void X(int var1) {
      this.kn.b.remove(var1);
   }

   protected void if(char var1, int var2) {
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.kl.a(var1, var2, var3);
      this.a(this.hR, var4.a("mco.configure.world.title"), this.hV / 2, 17, 16777215);
      this.if(this.hR, var4.a("mco.configure.world.name"), this.kk, this.Y(1), 10526880);
      this.if(this.hR, this.kn.a(), this.kk, this.Y(2), 16777215);
      this.if(this.hR, var4.a("mco.configure.world.description"), this.kk, this.Y(4), 10526880);
      this.if(this.hR, this.kn.if(), this.kk, this.Y(5), 16777215);
      this.if(this.hR, var4.a("mco.configure.world.owner"), this.kk, this.Y(7), 10526880);
      this.if(this.hR, this.kn.c, this.kk, this.Y(8), 16777215);
      this.if(this.hR, var4.a("mco.configure.world.invited"), this.ki, this.Y(1), 10526880);
      super.if(var1, var2, var3);
   }

   // $FF: synthetic method
   static Minecraft do(ht var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static int if(ht var0) {
      return var0.ki;
   }

   // $FF: synthetic method
   static int if(ht var0, int var1) {
      return var0.Y(var1);
   }

   // $FF: synthetic method
   static int int(ht var0) {
      return var0.kj;
   }

   // $FF: synthetic method
   static gm new(ht var0) {
      return var0.kn;
   }

   // $FF: synthetic method
   static int a(ht var0, int var1) {
      return var0.kh = var1;
   }

   // $FF: synthetic method
   static int a(ht var0) {
      return var0.kh;
   }

   // $FF: synthetic method
   static jq for(ht var0) {
      return var0.hR;
   }
}
