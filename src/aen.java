import java.util.concurrent.Callable;

public class aen implements ajg {
   public abp[] V = new abp[36];
   public abp[] U = new abp[4];
   public int aa = 0;
   private abp X;
   public aek Z;
   private abp W;
   public boolean Y = false;

   public aen(aek var1) {
      this.Z = var1;
   }

   public abp L() {
      return this.aa < 9 && this.aa >= 0 ? this.V[this.aa] : null;
   }

   public static int H() {
      return 9;
   }

   private int char(int var1) {
      for(int var2 = 0; var2 < this.V.length; ++var2) {
         if (this.V[var2] != null && this.V[var2].new == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int for(int var1, int var2) {
      for(int var3 = 0; var3 < this.V.length; ++var3) {
         if (this.V[var3] != null && this.V[var3].new == var1 && this.V[var3].new() == var2) {
            return var3;
         }
      }

      return -1;
   }

   private int for(abp var1) {
      for(int var2 = 0; var2 < this.V.length; ++var2) {
         if (this.V[var2] != null && this.V[var2].new == var1.new && this.V[var2].o() && this.V[var2].if < this.V[var2].h() && this.V[var2].if < this.q() && (!this.V[var2].j() || this.V[var2].new() == var1.new()) && abp.a(this.V[var2], var1)) {
            return var2;
         }
      }

      return -1;
   }

   public int J() {
      for(int var1 = 0; var1 < this.V.length; ++var1) {
         if (this.V[var1] == null) {
            return var1;
         }
      }

      return -1;
   }

   public void a(int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = true;
      this.X = this.L();
      int var7;
      if (var3) {
         var7 = this.for(var1, var2);
      } else {
         var7 = this.char(var1);
      }

      if (var7 >= 0 && var7 < 9) {
         this.aa = var7;
      } else {
         if (var4 && var1 > 0) {
            int var6 = this.J();
            if (var6 >= 0 && var6 < 9) {
               this.aa = var6;
            }

            this.a(abr.ai[var1], var2);
         }

      }
   }

   public void goto(int var1) {
      if (var1 > 0) {
         var1 = 1;
      }

      if (var1 < 0) {
         var1 = -1;
      }

      for(this.aa -= var1; this.aa < 0; this.aa += 9) {
      }

      while(this.aa >= 9) {
         this.aa -= 9;
      }

   }

   public int int(int var1, int var2) {
      int var3 = 0;

      int var4;
      abp var5;
      for(var4 = 0; var4 < this.V.length; ++var4) {
         var5 = this.V[var4];
         if (var5 != null && (var1 <= -1 || var5.new == var1) && (var2 <= -1 || var5.new() == var2)) {
            var3 += var5.if;
            this.V[var4] = null;
         }
      }

      for(var4 = 0; var4 < this.U.length; ++var4) {
         var5 = this.U[var4];
         if (var5 != null && (var1 <= -1 || var5.new == var1) && (var2 <= -1 || var5.new() == var2)) {
            var3 += var5.if;
            this.U[var4] = null;
         }
      }

      return var3;
   }

   public void a(abr var1, int var2) {
      if (var1 != null) {
         int var3 = this.for(var1.A, var2);
         if (var3 >= 0) {
            this.V[var3] = this.V[this.aa];
         }

         if (this.X != null && this.X.m() && this.for(this.X.new, this.X.k()) == this.aa) {
            return;
         }

         this.V[this.aa] = new abp(abr.ai[var1.A], 1, var2);
      }

   }

   private int int(abp var1) {
      int var2 = var1.new;
      int var3 = var1.if;
      int var4;
      if (var1.h() == 1) {
         var4 = this.J();
         if (var4 < 0) {
            return var3;
         } else {
            if (this.V[var4] == null) {
               this.V[var4] = abp.if(var1);
            }

            return 0;
         }
      } else {
         var4 = this.for(var1);
         if (var4 < 0) {
            var4 = this.J();
         }

         if (var4 < 0) {
            return var3;
         } else {
            if (this.V[var4] == null) {
               this.V[var4] = new abp(var2, 0, var1.new());
               if (var1.a()) {
                  this.V[var4].do((aqv)var1.b().do());
               }
            }

            int var5 = var3;
            if (var3 > this.V[var4].h() - this.V[var4].if) {
               var5 = this.V[var4].h() - this.V[var4].if;
            }

            if (var5 > this.q() - this.V[var4].if) {
               var5 = this.q() - this.V[var4].if;
            }

            if (var5 == 0) {
               return var3;
            } else {
               var3 -= var5;
               abp var10000 = this.V[var4];
               var10000.if += var5;
               this.V[var4].a = 5;
               return var3;
            }
         }
      }
   }

   public void G() {
      for(int var1 = 0; var1 < this.V.length; ++var1) {
         if (this.V[var1] != null) {
            this.V[var1].a(this.Z.ap, this.Z, var1, this.aa == var1);
         }
      }

   }

   public boolean case(int var1) {
      int var2 = this.char(var1);
      if (var2 < 0) {
         return false;
      } else {
         if (--this.V[var2].if <= 0) {
            this.V[var2] = null;
         }

         return true;
      }
   }

   public boolean void(int var1) {
      int var2 = this.char(var1);
      return var2 >= 0;
   }

   public boolean new(abp var1) {
      if (var1 == null) {
         return false;
      } else {
         try {
            int var2;
            if (var1.int()) {
               var2 = this.J();
               if (var2 >= 0) {
                  this.V[var2] = abp.if(var1);
                  this.V[var2].a = 5;
                  var1.if = 0;
                  return true;
               } else if (this.Z.fY.new) {
                  var1.if = 0;
                  return true;
               } else {
                  return false;
               }
            } else {
               do {
                  var2 = var1.if;
                  var1.if = this.int(var1);
               } while(var1.if > 0 && var1.if < var2);

               if (var1.if == var2 && this.Z.fY.new) {
                  var1.if = 0;
                  return true;
               } else {
                  return var1.if < var2;
               }
            }
         } catch (Throwable var5) {
            aqh var3 = aqh.a(var5, "Adding item to inventory");
            apu var4 = var3.a("Item being added");
            var4.a((String)"Item ID", (Object)var1.new);
            var4.a((String)"Item data", (Object)var1.new());
            var4.a((String)"Item name", (Callable)(new aem(this, var1)));
            throw new ape(var3);
         }
      }
   }

   public abp if(int var1, int var2) {
      abp[] var3 = this.V;
      if (var1 >= this.V.length) {
         var3 = this.U;
         var1 -= this.V.length;
      }

      if (var3[var1] != null) {
         abp var4;
         if (var3[var1].if <= var2) {
            var4 = var3[var1];
            var3[var1] = null;
            return var4;
         } else {
            var4 = var3[var1].a(var2);
            if (var3[var1].if == 0) {
               var3[var1] = null;
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      abp[] var2 = this.V;
      if (var1 >= this.V.length) {
         var2 = this.U;
         var1 -= this.V.length;
      }

      if (var2[var1] != null) {
         abp var3 = var2[var1];
         var2[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      abp[] var3 = this.V;
      if (var1 >= var3.length) {
         var1 -= var3.length;
         var3 = this.U;
      }

      var3[var1] = var2;
   }

   public float if(pa var1) {
      float var2 = 1.0F;
      if (this.V[this.aa] != null) {
         var2 *= this.V[this.aa].if(var1);
      }

      return var2;
   }

   public aqm if(aqm var1) {
      int var2;
      aqv var3;
      for(var2 = 0; var2 < this.V.length; ++var2) {
         if (this.V[var2] != null) {
            var3 = new aqv();
            var3.a("Slot", (byte)var2);
            this.V[var2].if(var3);
            var1.a((aqd)var3);
         }
      }

      for(var2 = 0; var2 < this.U.length; ++var2) {
         if (this.U[var2] != null) {
            var3 = new aqv();
            var3.a("Slot", (byte)(var2 + 100));
            this.U[var2].if(var3);
            var1.a((aqd)var3);
         }
      }

      return var1;
   }

   public void a(aqm var1) {
      this.V = new abp[36];
      this.U = new abp[4];

      for(int var2 = 0; var2 < var1.for(); ++var2) {
         aqv var3 = (aqv)var1.a(var2);
         int var4 = var3.else("Slot") & 255;
         abp var5 = abp.for(var3);
         if (var5 != null) {
            if (var4 >= 0 && var4 < this.V.length) {
               this.V[var4] = var5;
            }

            if (var4 >= 100 && var4 < this.U.length + 100) {
               this.U[var4 - 100] = var5;
            }
         }
      }

   }

   public int r() {
      return this.V.length + 4;
   }

   public abp do(int var1) {
      abp[] var2 = this.V;
      if (var1 >= var2.length) {
         var1 -= var2.length;
         var2 = this.U;
      }

      return var2[var1];
   }

   public String t() {
      return "container.inventory";
   }

   public boolean s() {
      return false;
   }

   public int q() {
      return 64;
   }

   public int a(aiw var1) {
      abp var2 = this.do(this.aa);
      return var2 != null ? var2.a(var1) : 1;
   }

   public boolean a(pa var1) {
      if (var1.at.try()) {
         return true;
      } else {
         abp var2 = this.do(this.aa);
         return var2 != null ? var2.a(var1) : false;
      }
   }

   public abp long(int var1) {
      return this.U[var1];
   }

   public int I() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.U.length; ++var2) {
         if (this.U[var2] != null && this.U[var2].d() instanceof ac4) {
            int var3 = ((ac4)this.U[var2].d()).dU;
            var1 += var3;
         }
      }

      return var1;
   }

   public void else(int var1) {
      var1 /= 4;
      if (var1 < 1) {
         var1 = 1;
      }

      for(int var2 = 0; var2 < this.U.length; ++var2) {
         if (this.U[var2] != null && this.U[var2].d() instanceof ac4) {
            this.U[var2].a(var1, (aig)this.Z);
            if (this.U[var2].if == 0) {
               this.U[var2] = null;
            }
         }
      }

   }

   public void K() {
      int var1;
      for(var1 = 0; var1 < this.V.length; ++var1) {
         if (this.V[var1] != null) {
            this.Z.a(this.V[var1], true);
            this.V[var1] = null;
         }
      }

      for(var1 = 0; var1 < this.U.length; ++var1) {
         if (this.U[var1] != null) {
            this.Z.a(this.U[var1], true);
            this.U[var1] = null;
         }
      }

   }

   public void case() {
      this.Y = true;
   }

   public void if(abp var1) {
      this.W = var1;
   }

   public abp M() {
      return this.W;
   }

   public boolean a(aek var1) {
      if (this.Z.aR) {
         return false;
      } else {
         return !(var1.for(this.Z) > 64.0D);
      }
   }

   public boolean do(abp var1) {
      int var2;
      for(var2 = 0; var2 < this.U.length; ++var2) {
         if (this.U[var2] != null && this.U[var2].do(var1)) {
            return true;
         }
      }

      for(var2 = 0; var2 < this.V.length; ++var2) {
         if (this.V[var2] != null && this.V[var2].do(var1)) {
            return true;
         }
      }

      return false;
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return true;
   }

   public void a(aen var1) {
      int var2;
      for(var2 = 0; var2 < this.V.length; ++var2) {
         this.V[var2] = abp.if(var1.V[var2]);
      }

      for(var2 = 0; var2 < this.U.length; ++var2) {
         this.U[var2] = abp.if(var1.U[var2]);
      }

      this.aa = var1.aa;
   }
}
