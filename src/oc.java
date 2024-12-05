import java.util.List;

public class oc extends n4 implements od {
   private abp[] sw = new abp[5];
   private String sv;
   private int sx = -1;

   public void a(aqv var1) {
      super.a(var1);
      aqm var2 = var1.void("Items");
      this.sw = new abp[this.r()];
      if (var1.try("CustomName")) {
         this.sv = var1.new("CustomName");
      }

      this.sx = var1.goto("TransferCooldown");

      for(int var3 = 0; var3 < var2.for(); ++var3) {
         aqv var4 = (aqv)var2.a(var3);
         byte var5 = var4.else("Slot");
         if (var5 >= 0 && var5 < this.sw.length) {
            this.sw[var5] = abp.for(var4);
         }
      }

   }

   public void do(aqv var1) {
      super.do(var1);
      aqm var2 = new aqm();

      for(int var3 = 0; var3 < this.sw.length; ++var3) {
         if (this.sw[var3] != null) {
            aqv var4 = new aqv();
            var4.a("Slot", (byte)var3);
            this.sw[var3].if(var4);
            var2.a((aqd)var4);
         }
      }

      var1.a("Items", (aqd)var2);
      var1.a("TransferCooldown", this.sx);
      if (this.s()) {
         var1.a("CustomName", this.sv);
      }

   }

   public void case() {
      super.case();
   }

   public int r() {
      return this.sw.length;
   }

   public abp do(int var1) {
      return this.sw[var1];
   }

   public abp if(int var1, int var2) {
      if (this.sw[var1] != null) {
         abp var3;
         if (this.sw[var1].if <= var2) {
            var3 = this.sw[var1];
            this.sw[var1] = null;
            return var3;
         } else {
            var3 = this.sw[var1].a(var2);
            if (this.sw[var1].if == 0) {
               this.sw[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public abp if(int var1) {
      if (this.sw[var1] != null) {
         abp var2 = this.sw[var1];
         this.sw[var1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void if(int var1, abp var2) {
      this.sw[var1] = var2;
      if (var2 != null && var2.if > this.q()) {
         var2.if = this.q();
      }

   }

   public String t() {
      return this.s() ? this.sv : "container.hopper";
   }

   public boolean s() {
      return this.sv != null && this.sv.length() > 0;
   }

   public void z(String var1) {
      this.sv = var1;
   }

   public int q() {
      return 64;
   }

   public boolean a(aek var1) {
      if (this.try.if(this.new, this.int, this.for) != this) {
         return false;
      } else {
         return !(var1.if((double)this.new + 0.5D, (double)this.int + 0.5D, (double)this.for + 0.5D) > 64.0D);
      }
   }

   public void p() {
   }

   public void u() {
   }

   public boolean a(int var1, abp var2) {
      return true;
   }

   public void long() {
      if (this.try != null && !this.try.goto) {
         --this.sx;
         if (!this.gk()) {
            this.aJ(0);
            this.gl();
         }

      }
   }

   public boolean gl() {
      if (this.try != null && !this.try.goto) {
         if (!this.gk() && qv.z(this.try())) {
            boolean var1 = this.gj() | a((od)this);
            if (var1) {
               this.aJ(8);
               this.case();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean gj() {
      ajg var1 = this.gm();
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < this.r(); ++var2) {
            if (this.do(var2) != null) {
               abp var3 = this.do(var2).n();
               abp var4 = a(var1, this.if(var2, 1), api.if[qv.A(this.try())]);
               if (var4 == null || var4.if == 0) {
                  var1.case();
                  return true;
               }

               this.if(var2, var3);
            }
         }

         return false;
      }
   }

   public static boolean a(od var0) {
      ajg var1 = if(var0);
      if (var1 != null) {
         byte var2 = 0;
         if (var1 instanceof ai7 && var2 > -1) {
            ai7 var7 = (ai7)var1;
            int[] var8 = var7.aL(var2);

            for(int var5 = 0; var5 < var8.length; ++var5) {
               if (a((od)var0, (ajg)var1, var8[var5], var2)) {
                  return true;
               }
            }
         } else {
            int var3 = var1.r();

            for(int var4 = 0; var4 < var3; ++var4) {
               if (a((od)var0, (ajg)var1, var4, var2)) {
                  return true;
               }
            }
         }
      } else {
         afk var6 = if(var0.b(), var0.gi(), var0.gh() + 1.0D, var0.gg());
         if (var6 != null) {
            return a((ajg)var0, (afk)var6);
         }
      }

      return false;
   }

   private static boolean a(od var0, ajg var1, int var2, int var3) {
      abp var4 = var1.do(var2);
      if (var4 != null && a(var1, var4, var2, var3)) {
         abp var5 = var4.n();
         abp var6 = a(var0, var1.if(var2, 1), -1);
         if (var6 == null || var6.if == 0) {
            var1.case();
            return true;
         }

         var1.if(var2, var5);
      }

      return false;
   }

   public static boolean a(ajg var0, afk var1) {
      boolean var2 = false;
      if (var1 == null) {
         return false;
      } else {
         abp var3 = var1.ba().n();
         abp var4 = a(var0, var3, -1);
         if (var4 != null && var4.if != 0) {
            var1.try(var4);
         } else {
            var2 = true;
            var1.az();
         }

         return var2;
      }
   }

   public static abp a(ajg var0, abp var1, int var2) {
      if (var0 instanceof ai7 && var2 > -1) {
         ai7 var6 = (ai7)var0;
         int[] var7 = var6.aL(var2);

         for(int var5 = 0; var5 < var7.length && var1 != null && var1.if > 0; ++var5) {
            var1 = do(var0, var1, var7[var5], var2);
         }
      } else {
         int var3 = var0.r();

         for(int var4 = 0; var4 < var3 && var1 != null && var1.if > 0; ++var4) {
            var1 = do(var0, var1, var4, var2);
         }
      }

      if (var1 != null && var1.if == 0) {
         var1 = null;
      }

      return var1;
   }

   private static boolean if(ajg var0, abp var1, int var2, int var3) {
      if (!var0.a(var2, var1)) {
         return false;
      } else {
         return !(var0 instanceof ai7) || ((ai7)var0).a(var2, var1, var3);
      }
   }

   private static boolean a(ajg var0, abp var1, int var2, int var3) {
      return !(var0 instanceof ai7) || ((ai7)var0).if(var2, var1, var3);
   }

   private static abp do(ajg var0, abp var1, int var2, int var3) {
      abp var4 = var0.do(var2);
      if (if(var0, var1, var2, var3)) {
         boolean var5 = false;
         if (var4 == null) {
            var0.if(var2, var1);
            var1 = null;
            var5 = true;
         } else if (a(var4, var1)) {
            int var6 = var1.h() - var4.if;
            int var7 = Math.min(var1.if, var6);
            var1.if -= var7;
            var4.if += var7;
            var5 = var7 > 0;
         }

         if (var5) {
            if (var0 instanceof oc) {
               ((oc)var0).aJ(8);
            }

            var0.case();
         }
      }

      return var1;
   }

   private ajg gm() {
      int var1 = qv.A(this.try());
      return a(this.b(), (double)(this.new + api.a[var1]), (double)(this.int + api.int[var1]), (double)(this.for + api.for[var1]));
   }

   public static ajg if(od var0) {
      return a(var0.b(), var0.gi(), var0.gh() + 1.0D, var0.gg());
   }

   public static afk if(y6 var0, double var1, double var3, double var5) {
      List var7 = var0.a(afk.class, nw.if().a(var1, var3, var5, var1 + 1.0D, var3 + 1.0D, var5 + 1.0D), aip.if);
      return var7.size() > 0 ? (afk)var7.get(0) : null;
   }

   public static ajg a(y6 var0, double var1, double var3, double var5) {
      ajg var7 = null;
      int var8 = ajs.a(var1);
      int var9 = ajs.a(var3);
      int var10 = ajs.a(var5);
      n4 var11 = var0.if(var8, var9, var10);
      if (var11 != null && var11 instanceof ajg) {
         var7 = (ajg)var11;
         if (var7 instanceof om) {
            int var12 = var0.new(var8, var9, var10);
            pa var13 = pa.x[var12];
            if (var13 instanceof ru) {
               var7 = ((ru)var13).K(var0, var8, var9, var10);
            }
         }
      }

      if (var7 == null) {
         List var14 = var0.a((aiw)null, (nw)nw.if().a(var1, var3, var5, var1 + 1.0D, var3 + 1.0D, var5 + 1.0D), (aip)aip.a);
         if (var14 != null && var14.size() > 0) {
            var7 = (ajg)var14.get(var0.o.nextInt(var14.size()));
         }
      }

      return var7;
   }

   private static boolean a(abp var0, abp var1) {
      if (var0.new != var1.new) {
         return false;
      } else if (var0.new() != var1.new()) {
         return false;
      } else if (var0.if > var0.h()) {
         return false;
      } else {
         return abp.a(var0, var1);
      }
   }

   public double gi() {
      return (double)this.new;
   }

   public double gh() {
      return (double)this.int;
   }

   public double gg() {
      return (double)this.for;
   }

   public void aJ(int var1) {
      this.sx = var1;
   }

   public boolean gk() {
      return this.sx > 0;
   }
}
