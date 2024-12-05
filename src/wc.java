public class wc {
   public int if;
   public int a;
   public int new;
   public int int;
   public int for;
   public int do;

   public wc() {
   }

   public static wc try() {
      return new wc(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static wc a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      switch(var9) {
      case 0:
         return new wc(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      case 1:
         return new wc(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      case 2:
         return new wc(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
      case 3:
         return new wc(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      default:
         return new wc(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public wc(wc var1) {
      this.if = var1.if;
      this.a = var1.a;
      this.new = var1.new;
      this.int = var1.int;
      this.for = var1.for;
      this.do = var1.do;
   }

   public wc(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.if = var1;
      this.a = var2;
      this.new = var3;
      this.int = var4;
      this.for = var5;
      this.do = var6;
   }

   public wc(int var1, int var2, int var3, int var4) {
      this.if = var1;
      this.new = var2;
      this.int = var3;
      this.do = var4;
      this.a = 1;
      this.for = 512;
   }

   public boolean if(wc var1) {
      return this.int >= var1.if && this.if <= var1.int && this.do >= var1.new && this.new <= var1.do && this.for >= var1.a && this.a <= var1.for;
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      return this.int >= var1 && this.if <= var3 && this.do >= var2 && this.new <= var4;
   }

   public void a(wc var1) {
      this.if = Math.min(this.if, var1.if);
      this.a = Math.min(this.a, var1.a);
      this.new = Math.min(this.new, var1.new);
      this.int = Math.max(this.int, var1.int);
      this.for = Math.max(this.for, var1.for);
      this.do = Math.max(this.do, var1.do);
   }

   public void a(int var1, int var2, int var3) {
      this.if += var1;
      this.a += var2;
      this.new += var3;
      this.int += var1;
      this.for += var2;
      this.do += var3;
   }

   public boolean if(int var1, int var2, int var3) {
      return var1 >= this.if && var1 <= this.int && var3 >= this.new && var3 <= this.do && var2 >= this.a && var2 <= this.for;
   }

   public int int() {
      return this.int - this.if + 1;
   }

   public int do() {
      return this.for - this.a + 1;
   }

   public int a() {
      return this.do - this.new + 1;
   }

   public int new() {
      return this.if + (this.int - this.if + 1) / 2;
   }

   public int for() {
      return this.a + (this.for - this.a + 1) / 2;
   }

   public int if() {
      return this.new + (this.do - this.new + 1) / 2;
   }

   public String toString() {
      return "(" + this.if + ", " + this.a + ", " + this.new + "; " + this.int + ", " + this.for + ", " + this.do + ")";
   }
}
