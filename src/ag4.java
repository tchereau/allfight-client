public class ag4 extends ahr {
   boolean bu;
   int bt;

   public ag4(aig var1, boolean var2) {
      super(var1);
      this.bm = var1;
      this.bu = var2;
   }

   public boolean try() {
      return this.bu && this.bt > 0 && super.try();
   }

   public void a() {
      this.bt = 20;
      this.bq.do(this.bm.ap, this.bl, this.bs, this.br, true);
   }

   public void new() {
      if (this.bu) {
         this.bq.do(this.bm.ap, this.bl, this.bs, this.br, false);
      }

   }

   public void int() {
      --this.bt;
      super.int();
   }
}
