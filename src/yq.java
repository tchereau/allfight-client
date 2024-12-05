public class yq {
   private int if;
   private int a;
   private int new;
   private int int;
   private int for;
   private int do;

   public yq(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.if = var1;
      this.a = var2;
      this.new = var3;
      this.for = var5;
      this.do = var6;
      this.int = var4;
   }

   public int int() {
      return this.if;
   }

   public int do() {
      return this.a;
   }

   public int a() {
      return this.new;
   }

   public int new() {
      return this.for;
   }

   public int for() {
      return this.do;
   }

   public int if() {
      return this.int;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof yq)) {
         return false;
      } else {
         yq var2 = (yq)var1;
         return this.if == var2.if && this.a == var2.a && this.new == var2.new && this.for == var2.for && this.do == var2.do && this.int == var2.int;
      }
   }

   public String toString() {
      return "TE(" + this.if + "," + this.a + "," + this.new + ")," + this.for + "," + this.do + "," + this.int;
   }
}
