public class akl extends akf {
   public final int b;
   public final int long;
   public final akl e;
   private final String c;
   private akj void;
   public final abp d;
   private boolean goto;

   public akl(int var1, String var2, int var3, int var4, abr var5, akl var6) {
      this(var1, var2, var3, var4, new abp(var5), var6);
   }

   public akl(int var1, String var2, int var3, int var4, pa var5, akl var6) {
      this(var1, var2, var3, var4, new abp(var5), var6);
   }

   public akl(int var1, String var2, int var3, int var4, abp var5, akl var6) {
      super(5242880 + var1, "achievement." + var2);
      this.d = var5;
      this.c = "achievement." + var2 + ".desc";
      this.b = var3;
      this.long = var4;
      if (var3 < akk.s) {
         akk.s = var3;
      }

      if (var4 < akk.r) {
         akk.r = var4;
      }

      if (var3 > akk.q) {
         akk.q = var3;
      }

      if (var4 > akk.p) {
         akk.p = var4;
      }

      this.e = var6;
   }

   public akl byte() {
      this.int = true;
      return this;
   }

   public akl else() {
      this.goto = true;
      return this;
   }

   public akl case() {
      super.new();
      akk.o.add(this);
      return this;
   }

   public boolean do() {
      return true;
   }

   public String char() {
      return this.void != null ? this.void.a(aqz.if(this.c)) : aqz.if(this.c);
   }

   public akl a(akj var1) {
      this.void = var1;
      return this;
   }

   public boolean goto() {
      return this.goto;
   }

   // $FF: synthetic method
   public akf new() {
      return this.case();
   }

   // $FF: synthetic method
   public akf if() {
      return this.byte();
   }
}
