public class agg {
   public final int if;
   public final int a;
   public final int byte;
   public final int try;
   public final int new;
   public int int;
   public boolean for = false;
   private int do = 0;

   public agg(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.if = var1;
      this.a = var2;
      this.byte = var3;
      this.try = var4;
      this.new = var5;
      this.int = var6;
   }

   public int a(int var1, int var2, int var3) {
      int var4 = var1 - this.if;
      int var5 = var2 - this.a;
      int var6 = var3 - this.byte;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public int if(int var1, int var2, int var3) {
      int var4 = var1 - this.if - this.try;
      int var5 = var2 - this.a;
      int var6 = var3 - this.byte - this.new;
      return var4 * var4 + var5 * var5 + var6 * var6;
   }

   public int new() {
      return this.if + this.try;
   }

   public int int() {
      return this.a;
   }

   public int if() {
      return this.byte + this.new;
   }

   public boolean a(int var1, int var2) {
      int var3 = var1 - this.if;
      int var4 = var2 - this.byte;
      return var3 * this.try + var4 * this.new >= 0;
   }

   public void do() {
      this.do = 0;
   }

   public void a() {
      ++this.do;
   }

   public int for() {
      return this.do;
   }
}
