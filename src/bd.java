public class bd implements Comparable {
   private final be if;
   private final int a;
   private final int int;
   private boolean for;
   private float do = 1.0F;

   public bd(be var1) {
      this.if = var1;
      this.a = var1.new();
      this.int = var1.try();
      this.for = this.a(this.int) > this.a(this.a);
   }

   public be int() {
      return this.if;
   }

   public int for() {
      return this.for ? this.a((int)((float)this.int * this.do)) : this.a((int)((float)this.a * this.do));
   }

   public int if() {
      return this.for ? this.a((int)((float)this.a * this.do)) : this.a((int)((float)this.int * this.do));
   }

   public void do() {
      this.for = !this.for;
   }

   public boolean a() {
      return this.for;
   }

   private int a(int var1) {
      int var2 = ct.for(var1);
      return var2 < 16 ? 16 : var2;
   }

   public void if(int var1) {
      if (this.a > var1 && this.int > var1) {
         this.do = (float)var1 / (float)Math.min(this.a, this.int);
      }

   }

   public String toString() {
      return "TextureHolder{width=" + this.a + ", height=" + this.int + '}';
   }

   public int a(bd var1) {
      int var2;
      if (this.if() == var1.if()) {
         if (this.for() == var1.for()) {
            if (this.if.case() == null) {
               return var1.if.case() == null ? 0 : -1;
            }

            return this.if.case().compareTo(var1.if.case());
         }

         var2 = this.for() < var1.for() ? 1 : -1;
      } else {
         var2 = this.if() < var1.if() ? 1 : -1;
      }

      return var2;
   }

   public int compareTo(Object var1) {
      return this.a((bd)var1);
   }
}
