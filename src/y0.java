public final class y0 {
   private final long if;
   private final yz a;
   private final boolean byte;
   private final boolean try;
   private final yx new;
   private boolean int;
   private boolean for;
   private String do;

   public y0(long var1, yz var3, boolean var4, boolean var5, yx var6) {
      this.do = "";
      this.if = var1;
      this.a = var3;
      this.byte = var4;
      this.try = var5;
      this.new = var6;
   }

   public y0(ss var1) {
      this(var1.case(), var1.f(), var1.for(), var1.void(), var1.new());
   }

   public y0 try() {
      this.for = true;
      return this;
   }

   public y0 for() {
      this.int = true;
      return this;
   }

   public y0 a(String var1) {
      this.do = var1;
      return this;
   }

   public boolean new() {
      return this.for;
   }

   public long if() {
      return this.if;
   }

   public yz case() {
      return this.a;
   }

   public boolean byte() {
      return this.try;
   }

   public boolean int() {
      return this.byte;
   }

   public yx do() {
      return this.new;
   }

   public boolean a() {
      return this.int;
   }

   public static yz a(int var0) {
      return yz.a(var0);
   }

   public String char() {
      return this.do;
   }
}
