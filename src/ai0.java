public class ai0 {
   public static final ai0[] A = new ai0[32];
   public static final ai0 z = null;
   public static final ai0 y = (new ai0(1, false, 8171462)).a("potion.moveSpeed").a(0, 0);
   public static final ai0 x = (new ai0(2, true, 5926017)).a("potion.moveSlowdown").a(1, 0);
   public static final ai0 w = (new ai0(3, false, 14270531)).a("potion.digSpeed").a(2, 0).a(1.5D);
   public static final ai0 v = (new ai0(4, true, 4866583)).a("potion.digSlowDown").a(3, 0);
   public static final ai0 u = (new ai0(5, false, 9643043)).a("potion.damageBoost").a(4, 0);
   public static final ai0 t = (new ai1(6, false, 16262179)).a("potion.heal");
   public static final ai0 s = (new ai1(7, true, 4393481)).a("potion.harm");
   public static final ai0 r = (new ai0(8, false, 7889559)).a("potion.jump").a(2, 1);
   public static final ai0 q = (new ai0(9, true, 5578058)).a("potion.confusion").a(3, 1).a(0.25D);
   public static final ai0 p = (new ai0(10, false, 13458603)).a("potion.regeneration").a(7, 0).a(0.25D);
   public static final ai0 o = (new ai0(11, false, 10044730)).a("potion.resistance").a(6, 1);
   public static final ai0 n = (new ai0(12, false, 14981690)).a("potion.fireResistance").a(7, 1);
   public static final ai0 m = (new ai0(13, false, 3035801)).a("potion.waterBreathing").a(0, 2);
   public static final ai0 l = (new ai0(14, false, 8356754)).a("potion.invisibility").a(0, 1);
   public static final ai0 k = (new ai0(15, true, 2039587)).a("potion.blindness").a(5, 1).a(0.25D);
   public static final ai0 j = (new ai0(16, false, 2039713)).a("potion.nightVision").a(4, 1);
   public static final ai0 i = (new ai0(17, true, 5797459)).a("potion.hunger").a(1, 1);
   public static final ai0 h = (new ai0(18, true, 4738376)).a("potion.weakness").a(5, 0);
   public static final ai0 g = (new ai0(19, true, 5149489)).a("potion.poison").a(6, 0).a(0.25D);
   public static final ai0 f = (new ai0(20, true, 3484199)).a("potion.wither").a(1, 2).a(0.25D);
   public static final ai0 e = null;
   public static final ai0 d = null;
   public static final ai0 c = null;
   public static final ai0 b = null;
   public static final ai0 void = null;
   public static final ai0 long = null;
   public static final ai0 goto = null;
   public static final ai0 else = null;
   public static final ai0 char = null;
   public static final ai0 case = null;
   public static final ai0 byte = null;
   public final int try;
   private String new = "";
   private int int = -1;
   private final boolean for;
   private double do;
   private boolean if;
   private final int a;

   protected ai0(int var1, boolean var2, int var3) {
      this.try = var1;
      A[var1] = this;
      this.for = var2;
      if (var2) {
         this.do = 0.5D;
      } else {
         this.do = 1.0D;
      }

      this.a = var3;
   }

   protected ai0 a(int var1, int var2) {
      this.int = var1 + var2 * 8;
      return this;
   }

   public int do() {
      return this.try;
   }

   public void a(aig var1, int var2) {
      if (this.try == p.try) {
         if (var1.cd() < var1.b0()) {
            var1.q(1);
         }
      } else if (this.try == g.try) {
         if (var1.cd() > 1) {
            var1.a((ai4)ai4.long, 1);
         }
      } else if (this.try == f.try) {
         var1.a((ai4)ai4.goto, 1);
      } else if (this.try == i.try && var1 instanceof aek) {
         ((aek)var1).d(0.025F * (float)(var2 + 1));
      } else if ((this.try != t.try || var1.bu()) && (this.try != s.try || !var1.bu())) {
         if (this.try == s.try && !var1.bu() || this.try == t.try && var1.bu()) {
            var1.a(ai4.long, 6 << var2);
         }
      } else {
         var1.q(6 << var2);
      }

   }

   public void a(aig var1, aig var2, int var3, double var4) {
      int var6;
      if ((this.try != t.try || var2.bu()) && (this.try != s.try || !var2.bu())) {
         if (this.try == s.try && !var2.bu() || this.try == t.try && var2.bu()) {
            var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
            if (var1 == null) {
               var2.a(ai4.long, var6);
            } else {
               var2.a(ai4.if(var2, var1), var6);
            }
         }
      } else {
         var6 = (int)(var4 * (double)(6 << var3) + 0.5D);
         var2.q(var6);
      }

   }

   public boolean case() {
      return false;
   }

   public boolean if(int var1, int var2) {
      int var3;
      if (this.try != p.try && this.try != g.try) {
         if (this.try == f.try) {
            var3 = 40 >> var2;
            if (var3 > 0) {
               return var1 % var3 == 0;
            } else {
               return true;
            }
         } else {
            return this.try == i.try;
         }
      } else {
         var3 = 25 >> var2;
         if (var3 > 0) {
            return var1 % var3 == 0;
         } else {
            return true;
         }
      }
   }

   public ai0 a(String var1) {
      this.new = var1;
      return this;
   }

   public String byte() {
      return this.new;
   }

   public boolean if() {
      return this.int >= 0;
   }

   public int try() {
      return this.int;
   }

   public boolean new() {
      return this.for;
   }

   public static String a(aiz var0) {
      if (var0.new()) {
         return "**:**";
      } else {
         int var1 = var0.do();
         return ajm.a(var1);
      }
   }

   protected ai0 a(double var1) {
      this.do = var1;
      return this;
   }

   public double int() {
      return this.do;
   }

   public boolean a() {
      return this.if;
   }

   public int for() {
      return this.a;
   }
}
