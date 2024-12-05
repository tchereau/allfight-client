import java.util.List;
import java.util.Random;

public class ab5 extends abr {
   public ab5(int var1) {
      super(var1);
   }

   public boolean do(abp var1) {
      return true;
   }

   public boolean for(abp var1) {
      return false;
   }

   public abd try(abp var1) {
      return this.long(var1).for() > 0 ? abd.a : super.try(var1);
   }

   public aqm long(abp var1) {
      return var1.int != null && var1.int.try("StoredEnchantments") ? (aqm)var1.int.byte("StoredEnchantments") : new aqm();
   }

   public void a(abp var1, aek var2, List var3, boolean var4) {
      super.a(var1, var2, var3, var4);
      aqm var5 = this.long(var1);
      if (var5 != null) {
         for(int var6 = 0; var6 < var5.for(); ++var6) {
            short var7 = ((aqv)var5.a(var6)).case("id");
            short var8 = ((aqv)var5.a(var6)).case("lvl");
            if (z3.n[var7] != null) {
               var3.add(z3.n[var7].do(var8));
            }
         }
      }

   }

   public void a(abp var1, zw var2) {
      aqm var3 = this.long(var1);
      boolean var4 = true;

      for(int var5 = 0; var5 < var3.for(); ++var5) {
         aqv var6 = (aqv)var3.a(var5);
         if (var6.case("id") == var2.int.a) {
            if (var6.case("lvl") < var2.new) {
               var6.a("lvl", (short)var2.new);
            }

            var4 = false;
            break;
         }
      }

      if (var4) {
         aqv var7 = new aqv();
         var7.a("id", (short)var2.int.a);
         var7.a("lvl", (short)var2.new);
         var3.a((aqd)var7);
      }

      if (!var1.a()) {
         var1.do(new aqv());
      }

      var1.b().a("StoredEnchantments", (aqd)var3);
   }

   public abp a(zw var1) {
      abp var2 = new abp(this);
      this.a(var2, var1);
      return var2;
   }

   public void a(z3 var1, List var2) {
      for(int var3 = var1.a(); var3 <= var1.do(); ++var3) {
         var2.add(this.a(new zw(var1, var3)));
      }

   }

   public abp a(Random var1) {
      z3 var2 = z3.m[var1.nextInt(z3.m.length)];
      abp var3 = new abp(this.A, 1, 0);
      int var4 = ajs.a(var1, var2.a(), var2.do());
      this.a(var3, new zw(var2, var4));
      return var3;
   }

   public aji if(Random var1) {
      return this.a(var1, 1, 1, 1);
   }

   public aji a(Random var1, int var2, int var3, int var4) {
      z3 var5 = z3.m[var1.nextInt(z3.m.length)];
      abp var6 = new abp(this.A, 1, 0);
      int var7 = ajs.a(var1, var5.a(), var5.do());
      this.a(var6, new zw(var5, var7));
      return new aji(var6, var2, var3, var4);
   }
}
