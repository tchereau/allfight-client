import net.minecraft.client.Minecraft;

public class ey {
   private final Minecraft goto;
   private final e5 else;
   private int char = -1;
   private int case = -1;
   private int byte = -1;
   private abp try = null;
   private float new = 0.0F;
   private float int = 0.0F;
   private int for = 0;
   private boolean do = false;
   private yz if;
   private int a;

   public ey(Minecraft var1, e5 var2) {
      this.if = yz.a;
      this.a = 0;
      this.goto = var1;
      this.else = var2;
   }

   public static void a(Minecraft var0, ey var1, int var2, int var3, int var4, int var5) {
      if (!var0.vm.a(var0.vk, var2, var3, var4, var5)) {
         var1.do(var2, var3, var4, var5);
      }

   }

   public void do(aek var1) {
      this.if.a(var1.fY);
   }

   public boolean new() {
      return false;
   }

   public void a(yz var1) {
      this.if = var1;
      this.if.a(this.goto.vk.fY);
   }

   public void a(aek var1) {
      var1.a5 = -180.0F;
   }

   public boolean byte() {
      return this.if.if();
   }

   public boolean do(int var1, int var2, int var3, int var4) {
      if (this.if.for() && !this.goto.vk.try(var1, var2, var3)) {
         return false;
      } else {
         ex var5 = this.goto.vm;
         pa var6 = pa.x[var5.new(var1, var2, var3)];
         if (var6 == null) {
            return false;
         } else {
            var5.for(2001, var1, var2, var3, var6.void + (var5.for(var1, var2, var3) << 12));
            int var7 = var5.for(var1, var2, var3);
            boolean var8 = var5.o(var1, var2, var3);
            if (var8) {
               var6.a((y6)var5, var1, var2, var3, var7);
            }

            this.case = -1;
            if (!this.if.do()) {
               abp var9 = this.goto.vk.cD();
               if (var9 != null) {
                  var9.a(var5, var6.void, var1, var2, var3, this.goto.vk);
                  if (var9.if == 0) {
                     this.goto.vk.cH();
                  }
               }
            }

            return var8;
         }
      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      if (!this.if.for() || this.goto.vk.try(var1, var2, var3)) {
         if (this.if.do()) {
            this.else.for((an7)(new an4(0, var1, var2, var3, var4)));
            a(this.goto, this, var1, var2, var3, var4);
            this.for = 5;
         } else if (!this.do || !this.a(var1, var2, var3)) {
            if (this.do) {
               this.else.for((an7)(new an4(1, this.char, this.case, this.byte, var4)));
            }

            this.else.for((an7)(new an4(0, var1, var2, var3, var4)));
            int var5 = this.goto.vm.new(var1, var2, var3);
            if (var5 > 0 && this.new == 0.0F) {
               pa.x[var5].a(this.goto.vm, var1, var2, var3, (aek)this.goto.vk);
            }

            if (var5 > 0 && pa.x[var5].a(this.goto.vk, this.goto.vk.ap, var1, var2, var3) >= 1.0F) {
               this.do(var1, var2, var3, var4);
            } else {
               this.do = true;
               this.char = var1;
               this.case = var2;
               this.byte = var3;
               this.try = this.goto.vk.bW();
               this.new = 0.0F;
               this.int = 0.0F;
               this.goto.vm.new(this.goto.vk.av, this.char, this.case, this.byte, (int)(this.new * 10.0F) - 1);
            }
         }

      }
   }

   public void char() {
      if (this.do) {
         this.else.for((an7)(new an4(1, this.char, this.case, this.byte, -1)));
      }

      this.do = false;
      this.new = 0.0F;
      this.goto.vm.new(this.goto.vk.av, this.char, this.case, this.byte, -1);
   }

   public void if(int var1, int var2, int var3, int var4) {
      this.a();
      if (this.for > 0) {
         --this.for;
      } else if (this.if.do()) {
         this.for = 5;
         this.else.for((an7)(new an4(0, var1, var2, var3, var4)));
         a(this.goto, this, var1, var2, var3, var4);
      } else {
         if (this.a(var1, var2, var3)) {
            int var5 = this.goto.vm.new(var1, var2, var3);
            if (var5 == 0) {
               this.do = false;
               return;
            }

            pa var6 = pa.x[var5];
            this.new += var6.a(this.goto.vk, this.goto.vk.ap, var1, var2, var3);
            if (this.int % 4.0F == 0.0F && var6 != null) {
               this.goto.uX.a(var6.az.if(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.az.for() + 1.0F) / 8.0F, var6.az.a() * 0.5F);
            }

            ++this.int;
            if (this.new >= 1.0F) {
               this.do = false;
               this.else.for((an7)(new an4(2, var1, var2, var3, var4)));
               this.do(var1, var2, var3, var4);
               this.new = 0.0F;
               this.int = 0.0F;
               this.for = 5;
            }

            this.goto.vm.new(this.goto.vk.av, this.char, this.case, this.byte, (int)(this.new * 10.0F) - 1);
         } else {
            this.a(var1, var2, var3, var4);
         }

      }
   }

   public float for() {
      return this.if.do() ? 5.0F : 4.5F;
   }

   public void if() {
      this.a();
      this.goto.uX.byte();
   }

   private boolean a(int var1, int var2, int var3) {
      abp var4 = this.goto.vk.bW();
      boolean var5 = this.try == null && var4 == null;
      if (this.try != null && var4 != null) {
         var5 = var4.new == this.try.new && abp.a(var4, this.try) && (var4.else() || var4.new() == this.try.new());
      }

      return var1 == this.char && var2 == this.case && var3 == this.byte && var5;
   }

   private void a() {
      int var1 = this.goto.vk.fR.aa;
      if (var1 != this.a) {
         this.a = var1;
         this.else.for((an7)(new anw(this.a)));
      }

   }

   public boolean a(aek var1, y6 var2, abp var3, int var4, int var5, int var6, int var7, nr var8) {
      this.a();
      float var9 = (float)var8.int - (float)var4;
      float var10 = (float)var8.for - (float)var5;
      float var11 = (float)var8.do - (float)var6;
      boolean var12 = false;
      int var13;
      if (!var1.Q() || var1.bW() == null) {
         var13 = var2.new(var4, var5, var6);
         if (var13 > 0 && pa.x[var13].a(var2, var4, var5, var6, var1, var7, var9, var10, var11)) {
            var12 = true;
         }
      }

      if (!var12 && var3 != null && var3.d() instanceof aaz) {
         aaz var16 = (aaz)var3.d();
         if (!var16.a(var2, var4, var5, var6, var7, var1, var3)) {
            return false;
         }
      }

      this.else.for((an7)(new am8(var4, var5, var6, var7, var1.fR.L(), var9, var10, var11)));
      if (var12) {
         return true;
      } else if (var3 == null) {
         return false;
      } else if (this.if.do()) {
         var13 = var3.new();
         int var14 = var3.if;
         boolean var15 = var3.a(var1, var2, var4, var5, var6, var7, var9, var10, var11);
         var3.do(var13);
         var3.if = var14;
         return var15;
      } else {
         return var3.a(var1, var2, var4, var5, var6, var7, var9, var10, var11);
      }
   }

   public boolean a(aek var1, y6 var2, abp var3) {
      this.a();
      this.else.for((an7)(new am8(-1, -1, -1, 255, var1.fR.L(), 0.0F, 0.0F, 0.0F)));
      int var4 = var3.if;
      abp var5 = var3.if(var2, var1);
      if (var5 != var3 || var5 != null && var5.if != var4) {
         var1.fR.V[var1.fR.aa] = var5;
         if (var5.if == 0) {
            var1.fR.V[var1.fR.aa] = null;
         }

         return true;
      } else {
         return false;
      }
   }

   public eu a(y6 var1) {
      return new eu(this.goto, var1, this.goto.vg, this.else);
   }

   public void a(aek var1, aiw var2) {
      this.a();
      this.else.for((an7)(new aoo(var1.av, var2.av, 1)));
      var1.f(var2);
   }

   public boolean if(aek var1, aiw var2) {
      this.a();
      this.else.for((an7)(new aoo(var1.av, var2.av, 0)));
      return var1.c(var2);
   }

   public abp a(int var1, int var2, int var3, int var4, aek var5) {
      short var6 = var5.fP.a(var5.fR);
      abp var7 = var5.fP.a(var2, var3, var4, var5);
      this.else.for((an7)(new ao1(var1, var2, var3, var4, var7, var6)));
      return var7;
   }

   public void a(int var1, int var2) {
      this.else.for((an7)(new ao2(var1, var2)));
   }

   public void a(abp var1, int var2) {
      if (this.if.do()) {
         this.else.for((an7)(new anv(var2, var1)));
      }

   }

   public void a(abp var1) {
      if (this.if.do() && var1 != null) {
         this.else.for((an7)(new anv(-1, var1)));
      }

   }

   public void if(aek var1) {
      this.a();
      this.else.for((an7)(new an4(5, 0, 0, 0, 255)));
      var1.cz();
   }

   public boolean do() {
      return true;
   }

   public boolean int() {
      return !this.if.do();
   }

   public boolean try() {
      return this.if.do();
   }

   public boolean case() {
      return this.if.do();
   }
}
