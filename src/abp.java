import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class abp {
   public int if;
   public int a;
   public int new;
   public aqv int;
   private int for;
   private aih do;

   public abp(pa var1) {
      this((pa)var1, 1);
   }

   public abp(pa var1, int var2) {
      this(var1.void, var2, 0);
   }

   public abp(pa var1, int var2, int var3) {
      this(var1.void, var2, var3);
   }

   public abp(abr var1) {
      this(var1.A, 1, 0);
   }

   public abp(abr var1, int var2) {
      this(var1.A, var2, 0);
   }

   public abp(abr var1, int var2, int var3) {
      this(var1.A, var2, var3);
   }

   public abp(int var1, int var2, int var3) {
      this.if = 0;
      this.do = null;
      this.new = var1;
      this.if = var2;
      this.for = var3;
      if (this.for < 0) {
         this.for = 0;
      }

   }

   public static abp for(aqv var0) {
      abp var1 = new abp();
      var1.a(var0);
      return var1.d() != null ? var1 : null;
   }

   private abp() {
      this.if = 0;
      this.do = null;
   }

   public abp a(int var1) {
      abp var2 = new abp(this.new, var1, this.for);
      if (this.int != null) {
         var2.int = (aqv)this.int.do();
      }

      this.if -= var1;
      return var2;
   }

   public abr d() {
      return abr.ai[this.new];
   }

   public ajd f() {
      return this.d().char(this);
   }

   public int byte() {
      return this.d().if();
   }

   public boolean a(aek var1, y6 var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      boolean var10 = this.d().a(this, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      if (var10) {
         var1.a((akf)aka.char[this.new], 1);
      }

      return var10;
   }

   public float if(pa var1) {
      return this.d().a(this, var1);
   }

   public abp if(y6 var1, aek var2) {
      return this.d().a(this, var1, var2);
   }

   public abp a(y6 var1, aek var2) {
      return this.d().do(this, var1, var2);
   }

   public aqv if(aqv var1) {
      var1.a("id", (short)this.new);
      var1.a("Count", (byte)this.if);
      var1.a("Damage", (short)this.for);
      if (this.int != null) {
         var1.a("tag", (aqd)this.int);
      }

      return var1;
   }

   public void a(aqv var1) {
      this.new = var1.case("id");
      this.if = var1.else("Count");
      this.for = var1.case("Damage");
      if (this.for < 0) {
         this.for = 0;
      }

      if (var1.try("tag")) {
         this.int = var1.char("tag");
      }

   }

   public int h() {
      return this.d().try();
   }

   public boolean o() {
      return this.h() > 1 && (!this.else() || !this.int());
   }

   public boolean else() {
      return abr.ai[this.new].for() > 0;
   }

   public boolean j() {
      return abr.ai[this.new].b();
   }

   public boolean int() {
      return this.else() && this.for > 0;
   }

   public int k() {
      return this.for;
   }

   public int new() {
      return this.for;
   }

   public void do(int var1) {
      this.for = var1;
      if (this.for < 0) {
         this.for = 0;
      }

   }

   public int e() {
      return abr.ai[this.new].for();
   }

   public boolean a(int var1, Random var2) {
      if (!this.else()) {
         return false;
      } else {
         if (var1 > 0) {
            int var3 = z1.a(z3.try.a, this);
            int var4 = 0;

            for(int var5 = 0; var3 > 0 && var5 < var1; ++var5) {
               if (z5.a(this, var3, var2)) {
                  ++var4;
               }
            }

            var1 -= var4;
            if (var1 <= 0) {
               return false;
            }
         }

         this.for += var1;
         return this.for > this.e();
      }
   }

   public void a(int var1, aig var2) {
      if (!(var2 instanceof aek) || !((aek)var2).fY.new) {
         if (this.else()) {
            if (this.a(var1, var2.bq())) {
               var2.byte(this);
               if (var2 instanceof aek) {
                  ((aek)var2).a((akf)aka.byte[this.new], 1);
               }

               --this.if;
               if (this.if < 0) {
                  this.if = 0;
               }

               this.for = 0;
            }

         }
      }
   }

   public void a(aig var1, aek var2) {
      boolean var3 = abr.ai[this.new].a(this, (aig)var1, (aig)var2);
      if (var3) {
         var2.a((akf)aka.char[this.new], 1);
      }

   }

   public void a(y6 var1, int var2, int var3, int var4, int var5, aek var6) {
      boolean var7 = abr.ai[this.new].a(this, var1, var2, var3, var4, var5, var6);
      if (var7) {
         var6.a((akf)aka.char[this.new], 1);
      }

   }

   public int a(aiw var1) {
      return abr.ai[this.new].a(var1);
   }

   public boolean a(pa var1) {
      return abr.ai[this.new].a(var1);
   }

   public boolean a(aig var1) {
      return abr.ai[this.new].a(this, var1);
   }

   public abp n() {
      abp var1 = new abp(this.new, this.if, this.for);
      if (this.int != null) {
         var1.int = (aqv)this.int.do();
      }

      return var1;
   }

   public static boolean a(abp var0, abp var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else if (var0 != null && var1 != null) {
         if (var0.int == null && var1.int != null) {
            return false;
         } else {
            return var0.int == null || var0.int.equals(var1.int);
         }
      } else {
         return false;
      }
   }

   public static boolean if(abp var0, abp var1) {
      if (var0 == null && var1 == null) {
         return true;
      } else {
         return var0 != null && var1 != null ? var0.a(var1) : false;
      }
   }

   private boolean a(abp var1) {
      if (this.if != var1.if) {
         return false;
      } else if (this.new != var1.new) {
         return false;
      } else if (this.for != var1.for) {
         return false;
      } else if (this.int == null && var1.int != null) {
         return false;
      } else {
         return this.int == null || this.int.equals(var1.int);
      }
   }

   public boolean do(abp var1) {
      return this.new == var1.new && this.for == var1.for;
   }

   public String c() {
      return abr.ai[this.new].int(this);
   }

   public static abp if(abp var0) {
      return var0 == null ? null : var0.n();
   }

   public String toString() {
      return this.if + "x" + abr.ai[this.new].int() + "@" + this.for;
   }

   public void a(y6 var1, aiw var2, int var3, boolean var4) {
      if (this.a > 0) {
         --this.a;
      }

      abr.ai[this.new].a(this, var1, var2, var3, var4);
   }

   public void if(y6 var1, aek var2, int var3) {
      var2.a(aka.goto[this.new], var3);
      abr.ai[this.new].if(this, var1, var2);
   }

   public int long() {
      return this.d().a(this);
   }

   public aax l() {
      return this.d().else(this);
   }

   public void a(y6 var1, aek var2, int var3) {
      this.d().a(this, var1, var2, var3);
   }

   public boolean a() {
      return this.int != null;
   }

   public aqv b() {
      return this.int;
   }

   public aqm try() {
      return this.int == null ? null : (aqm)this.int.byte("ench");
   }

   public void do(aqv var1) {
      this.int = var1;
   }

   public String void() {
      String var1 = this.d().if(this);
      if (this.int != null && this.int.try("display")) {
         aqv var2 = this.int.char("display");
         if (var2.try("Name")) {
            var1 = var2.new("Name");
         }
      }

      return var1;
   }

   public void a(String var1) {
      if (this.int == null) {
         this.int = new aqv("tag");
      }

      if (!this.int.try("display")) {
         this.int.a("display", new aqv());
      }

      this.int.char("display").a("Name", var1);
   }

   public boolean g() {
      if (this.int == null) {
         return false;
      } else {
         return !this.int.try("display") ? false : this.int.char("display").try("Name");
      }
   }

   public List a(aek var1, boolean var2) {
      ArrayList var3 = new ArrayList();
      abr var4 = abr.ai[this.new];
      String var5 = this.void();
      if (this.g()) {
         var5 = aqj.new + var5 + aqj.int;
      }

      if (var2) {
         String var6 = "";
         if (var5.length() > 0) {
            var5 = var5 + " (";
            var6 = ")";
         }

         if (this.j()) {
            var5 = var5 + String.format("#%04d/%d%s", this.new, this.for, var6);
         } else {
            var5 = var5 + String.format("#%04d%s", this.new, var6);
         }
      } else if (!this.g() && this.new == abr.aZ.A) {
         var5 = var5 + " #" + this.for;
      }

      var3.add(var5);
      var4.a(this, var1, var3, var2);
      if (this.a()) {
         aqm var10 = this.try();
         if (var10 != null) {
            for(int var7 = 0; var7 < var10.for(); ++var7) {
               short var8 = ((aqv)var10.a(var7)).case("id");
               short var9 = ((aqv)var10.a(var7)).case("lvl");
               if (z3.n[var8] != null) {
                  var3.add(z3.n[var8].do(var9));
               }
            }
         }

         if (this.int.try("display")) {
            aqv var11 = this.int.char("display");
            if (var11.try("color")) {
               if (var2) {
                  var3.add("Color: #" + Integer.toHexString(var11.goto("color")).toUpperCase());
               } else {
                  var3.add(aqj.new + aqz.if("item.dyed"));
               }
            }

            if (var11.try("Lore")) {
               aqm var12 = var11.void("Lore");
               if (var12.for() > 0) {
                  for(int var13 = 0; var13 < var12.for(); ++var13) {
                     var3.add(aqj.k + "" + aqj.new + ((aqf)var12.a(var13)).do);
                  }
               }
            }
         }
      }

      if (var2 && this.int()) {
         var3.add("Durability: " + (this.e() - this.k()) + " / " + this.e());
      }

      return var3;
   }

   public boolean if() {
      return this.d().do(this);
   }

   public abd goto() {
      return this.d().try(this);
   }

   public boolean m() {
      if (!this.d().for(this)) {
         return false;
      } else {
         return !this.case();
      }
   }

   public void a(z3 var1, int var2) {
      if (this.int == null) {
         this.do(new aqv());
      }

      if (!this.int.try("ench")) {
         this.int.a("ench", (aqd)(new aqm("ench")));
      }

      aqm var3 = (aqm)this.int.byte("ench");
      aqv var4 = new aqv();
      var4.a("id", (short)var1.a);
      var4.a("lvl", (short)((byte)var2));
      var3.a((aqd)var4);
   }

   public boolean case() {
      return this.int != null && this.int.try("ench");
   }

   public void a(String var1, aqd var2) {
      if (this.int == null) {
         this.do(new aqv());
      }

      this.int.a(var1, var2);
   }

   public boolean i() {
      return this.d().void();
   }

   public boolean do() {
      return this.do != null;
   }

   public void a(aih var1) {
      this.do = var1;
   }

   public aih for() {
      return this.do;
   }

   public int char() {
      return this.a() && this.int.try("RepairCost") ? this.int.goto("RepairCost") : 0;
   }

   public void if(int var1) {
      if (!this.a()) {
         this.int = new aqv("tag");
      }

      this.int.a("RepairCost", var1);
   }
}
