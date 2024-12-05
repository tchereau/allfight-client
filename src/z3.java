import java.util.ArrayList;

public abstract class z3 {
   public static final z3[] n = new z3[256];
   public static final z3[] m;
   public static final z3 l = new zr(0, 10, 0);
   public static final z3 k = new zr(1, 5, 1);
   public static final z3 j = new zr(2, 5, 2);
   public static final z3 i = new zr(3, 2, 3);
   public static final z3 h = new zr(4, 5, 4);
   public static final z3 g = new zs(5, 2);
   public static final z3 f = new zo(6, 2);
   public static final z3 e = new zq(7, 1);
   public static final z3 d = new z6(16, 10, 0);
   public static final z3 c = new z6(17, 5, 1);
   public static final z3 b = new z6(18, 5, 2);
   public static final z3 void = new zu(19, 5);
   public static final z3 long = new zv(20, 2);
   public static final z3 else;
   public static final z3 case;
   public static final z3 byte;
   public static final z3 try;
   public static final z3 new;
   public static final z3 int;
   public static final z3 for;
   public static final z3 do;
   public static final z3 if;
   public final int a;
   private final int o;
   public z2 goto;
   protected String char;

   protected z3(int var1, int var2, z2 var3) {
      this.a = var1;
      this.o = var2;
      this.goto = var3;
      if (n[var1] != null) {
         throw new IllegalArgumentException("Duplicate enchantment id!");
      } else {
         n[var1] = this;
      }
   }

   public int if() {
      return this.o;
   }

   public int a() {
      return 1;
   }

   public int do() {
      return 1;
   }

   public int if(int var1) {
      return 1 + var1 * 10;
   }

   public int a(int var1) {
      return this.if(var1) + 5;
   }

   public int a(int var1, ai4 var2) {
      return 0;
   }

   public int a(int var1, aig var2) {
      return 0;
   }

   public boolean a(z3 var1) {
      return this != var1;
   }

   public z3 a(String var1) {
      this.char = var1;
      return this;
   }

   public String for() {
      return "enchantment." + this.char;
   }

   public String do(int var1) {
      String var2 = aqz.if(this.for());
      return var2 + " " + aqz.if("enchantment.level." + var1);
   }

   public boolean a(abp var1) {
      return this.goto.a(var1.d());
   }

   static {
      else = new zt(21, 2, z2.for);
      case = new z4(32, 10);
      byte = new zp(33, 1);
      try = new z5(34, 5);
      new = new zt(35, 2, z2.do);
      int = new aaa(48, 10);
      for = new z7(49, 2);
      do = new z9(50, 2);
      if = new z8(51, 1);
      ArrayList var0 = new ArrayList();
      z3[] var1 = n;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         z3 var4 = var1[var3];
         if (var4 != null) {
            var0.add(var4);
         }
      }

      m = (z3[])var0.toArray(new z3[0]);
   }
}
