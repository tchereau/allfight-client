public class zi {
   public final int if;
   public final int a;

   public zi(int var1, int var2) {
      this.if = var1;
      this.a = var2;
   }

   public static long a(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public int hashCode() {
      long var1 = a(this.if, this.a);
      int var3 = (int)var1;
      int var4 = (int)(var1 >> 32);
      return var3 ^ var4;
   }

   public boolean equals(Object var1) {
      zi var2 = (zi)var1;
      return var2.if == this.if && var2.a == this.a;
   }

   public int if() {
      return (this.if << 4) + 8;
   }

   public int a() {
      return (this.a << 4) + 8;
   }

   public yp a(int var1) {
      return new yp(this.if(), var1, this.a());
   }

   public String toString() {
      return "[" + this.if + ", " + this.a + "]";
   }
}
