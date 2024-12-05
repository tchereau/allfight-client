import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

public class av extends net.minecraft.a.a {
   private final Minecraft t8;
   private final y0 t7;
   private final ajw t6 = new aj8("Minecraft-Server", " [SERVER]", (new File(Minecraft.hQ(), "output-server.log")).getAbsolutePath());
   private as uc;
   private boolean ub = false;
   private boolean ua;
   private ao t9;

   public av(Minecraft var1, String var2, String var3, y0 var4) {
      super(new File(Minecraft.hQ(), "saves"));
      this.S(var1.vg.if);
      this.Q(var2);
      this.O(var3);
      this.Q(var1.h6());
      this.O(var4.new());
      this.aT(256);
      this.a(new ax(this));
      this.t8 = var1;
      this.t7 = var4;

      try {
         this.uc = new as(this);
      } catch (IOException var6) {
         throw new Error();
      }
   }

   protected void a(String var1, String var2, long var3, yx var5, String var6) {
      this.R(var1);
      si var7 = this.gP().a(var1, true);
      if (vf.T.do()) {
         Object var8 = this.hk() ? new ale(this, var7, var2, 0, this.t5, this.a()) : new arx(this, var7, var2, 0, this.t7, this.t5, this.a());
         Integer[] var9 = (Integer[])((Integer[])vf.if(vf.int));
         Integer[] var10 = var9;
         int var11 = var9.length;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var10[var12];
            Object var14 = var13 == 0 ? var8 : new alc(this, var7, var2, var13, this.t7, (ak5)var8, this.t5, this.a());
            ((ak5)var14).a((y1)(new ak9(this, (ak5)var14)));
            if (!this.hb()) {
               ((ak5)var14).l().a(this.gK());
            }

            if (vf.j.do()) {
               vf.a(vf.z, var14);
            }
         }

         this.g6().a(new ak5[]{(ak5)var8});
      } else {
         this.t4 = new ak5[3];
         this.tW = new long[this.t4.length][100];

         for(int var15 = 0; var15 < this.t4.length; ++var15) {
            byte var16 = 0;
            if (var15 == 1) {
               var16 = -1;
            }

            if (var15 == 2) {
               var16 = 1;
            }

            if (var15 == 0) {
               if (this.hk()) {
                  this.t4[var15] = new ale(this, var7, var2, var16, this.t5, this.a());
               } else {
                  this.t4[var15] = new arx(this, var7, var2, var16, this.t7, this.t5, this.a());
               }
            } else {
               this.t4[var15] = new alc(this, var7, var2, var16, this.t7, this.t4[0], this.t5, this.a());
            }

            this.t4[var15].a((y1)(new ak9(this, this.t4[var15])));
            this.g6().a(this.t4);
         }
      }

      this.aU(this.g5());
      this.gW();
   }

   protected boolean gQ() throws IOException {
      this.t6.a("Starting integrated minecraft server version 1.5.1");
      this.N(false);
      this.M(true);
      this.T(true);
      this.R(true);
      this.P(true);
      this.t6.a("Generating keypair");
      this.a(aj5.a());
      Object var1;
      if (vf.long.for()) {
         var1 = vf.if(vf.do);
         if (!vf.int(var1, vf.long, this)) {
            return false;
         }
      }

      this.a(this.gT(), this.hE(), this.t7.if(), this.t7.do(), this.t7.char());
      this.K(this.hC() + " - " + this.t4[0].l().l());
      if (vf.char.for()) {
         var1 = vf.if(vf.do);
         if (vf.char.do() == Boolean.TYPE) {
            return vf.int(var1, vf.char, this);
         }

         vf.for(var1, vf.char, this);
      }

      return true;
   }

   public void hf() {
      boolean var1 = this.ub;
      this.ub = this.uc.new();
      if (!var1 && this.ub) {
         this.t6.a("Saving and pausing game...");
         this.g6().byte();
         this.S(false);
      }

      if (!this.ub) {
         super.hf();
      }

   }

   public boolean gX() {
      return false;
   }

   public yz gK() {
      return this.t7.case();
   }

   public int g5() {
      return this.t8.u1.at;
   }

   public boolean g0() {
      return this.t7.byte();
   }

   protected File g4() {
      return this.t8.uR;
   }

   public boolean ht() {
      return false;
   }

   public as hI() {
      return this.uc;
   }

   protected void a(aqh var1) {
      this.t8.for(var1);
   }

   public aqh if(aqh var1) {
      var1 = super.if(var1);
      var1.for().a((String)"Type", (Callable)(new au(this)));
      var1.for().a((String)"Is Modded", (Callable)(new at(this)));
      return var1;
   }

   public void if(aja var1) {
      super.if(var1);
      var1.a("snooper_partner", this.t8.ip().if());
   }

   public boolean if() {
      return Minecraft.ih().if();
   }

   public String a(yz var1, boolean var2) {
      try {
         String var3 = this.uc.int();
         this.a().a("Started on " + var3);
         this.ua = true;
         this.t9 = new ao(this.gV(), var3);
         this.t9.start();
         this.g6().a(var1);
         this.g6().if(var2);
         return var3;
      } catch (IOException var4) {
         return null;
      }
   }

   public ajw a() {
      return this.t6;
   }

   public void g7() {
      super.g7();
      if (this.t9 != null) {
         this.t9.interrupt();
         this.t9 = null;
      }

   }

   public void ha() {
      super.ha();
      if (this.t9 != null) {
         this.t9.interrupt();
         this.t9 = null;
      }

   }

   public boolean hH() {
      return this.ua;
   }

   public void if(yz var1) {
      this.g6().a(var1);
   }

   public boolean hF() {
      return true;
   }

   public aku ho() {
      return this.hI();
   }
}
