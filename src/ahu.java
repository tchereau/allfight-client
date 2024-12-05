public class ahu extends ahr {
   private int bw;
   private int bv = -1;

   public ahu(aig var1) {
      super(var1);
   }

   public boolean do() {
      if (!super.do()) {
         return false;
      } else if (!this.bm.ap.i().a("mobGriefing")) {
         return false;
      } else {
         return !this.bq.c(this.bm.ap, this.bl, this.bs, this.br);
      }
   }

   public void a() {
      super.a();
      this.bw = 0;
   }

   public boolean try() {
      double var1 = this.bm.if((double)this.bl, (double)this.bs, (double)this.br);
      return this.bw <= 240 && !this.bq.c(this.bm.ap, this.bl, this.bs, this.br) && var1 < 4.0D;
   }

   public void new() {
      super.new();
      this.bm.ap.new(this.bm.av, this.bl, this.bs, this.br, -1);
   }

   public void int() {
      super.int();
      if (this.bm.bq().nextInt(20) == 0) {
         this.bm.ap.for(1010, this.bl, this.bs, this.br, 0);
      }

      ++this.bw;
      int var1 = (int)((float)this.bw / 240.0F * 10.0F);
      if (var1 != this.bv) {
         this.bm.ap.new(this.bm.av, this.bl, this.bs, this.br, var1);
         this.bv = var1;
      }

      if (this.bw == 240 && this.bm.ap.p == 3) {
         this.bm.ap.o(this.bl, this.bs, this.br);
         this.bm.ap.for(1012, this.bl, this.bs, this.br, 0);
         this.bm.ap.for(2001, this.bl, this.bs, this.br, this.bq.void);
      }

   }
}
