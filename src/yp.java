public class yp {
   public final int if;
   public final int a;
   public final int do;

   public yp(int var1, int var2, int var3) {
      this.if = var1;
      this.a = var2;
      this.do = var3;
   }

   public yp(nr var1) {
      this(ajs.a(var1.int), ajs.a(var1.for), ajs.a(var1.do));
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof yp)) {
         return false;
      } else {
         yp var2 = (yp)var1;
         return var2.if == this.if && var2.a == this.a && var2.do == this.do;
      }
   }

   public int hashCode() {
      return this.if * 8976890 + this.a * 981131 + this.do;
   }
}
