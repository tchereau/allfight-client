public class alf {
   private final int if;
   private final int a;
   private final int new;
   private final int int;
   private int for;
   private int do;

   public alf(int var1, int var2, int var3, int var4) {
      this.if = var1;
      this.a = var2;
      this.new = var3;
      this.int = var4;
   }

   public int do() {
      return this.a;
   }

   public int a() {
      return this.new;
   }

   public int int() {
      return this.int;
   }

   public void a(int var1) {
      if (var1 > 10) {
         var1 = 10;
      }

      this.for = var1;
   }

   public int for() {
      return this.for;
   }

   public void if(int var1) {
      this.do = var1;
   }

   public int if() {
      return this.do;
   }
}
