public class yx {
   public static final yx[] char = new yx[16];
   public static final yx case = (new yx(0, "default", 1)).new();
   public static final yx byte = new yx(1, "flat");
   public static final yx try = new yx(2, "largeBiomes");
   public static final yx new = (new yx(8, "default_1_1", 0)).a(false);
   private final int int;
   private final String for;
   private final int do;
   private boolean if;
   private boolean a;

   public yx(int var1, String var2) {
      this(var1, var2, 0);
   }

   public yx(int var1, String var2, int var3) {
      this.for = var2;
      this.do = var3;
      this.if = true;
      this.int = var1;
      char[var1] = this;
   }

   public String byte() {
      return this.for;
   }

   public String try() {
      return "generator." + this.for;
   }

   public int do() {
      return this.do;
   }

   public yx a(int var1) {
      return this == case && var1 == 0 ? new : this;
   }

   private yx a(boolean var1) {
      this.if = var1;
      return this;
   }

   public boolean if() {
      return this.if;
   }

   private yx new() {
      this.a = true;
      return this;
   }

   public boolean a() {
      return this.a;
   }

   public static yx a(String var0) {
      for(int var1 = 0; var1 < char.length; ++var1) {
         if (char[var1] != null && char[var1].for.equalsIgnoreCase(var0)) {
            return char[var1];
         }
      }

      return null;
   }

   public int int() {
      return this.int;
   }

   public yi if(y6 var1) {
      if (this == byte) {
         we var2 = we.a(var1.l().d());
         return new yf(yn.G[var2.int()], 0.5F, 0.5F);
      } else {
         return new yi(var1);
      }
   }

   public x0 a(y6 var1, String var2) {
      return (x0)(this == byte ? new xg(var1, var1.b(), var1.l().for(), var2) : new xb(var1, var1.b(), var1.l().for()));
   }

   public int a(y6 var1) {
      return this != byte ? 64 : 4;
   }

   public boolean if(boolean var1) {
      return this != byte && !var1;
   }

   public double for() {
      return this != byte ? 0.03125D : 1.0D;
   }
}
