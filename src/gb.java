public class gb extends fx {
   private e7 bq;
   private e7 bp;
   private e7 bu;
   private e7 bt;
   private e7 bs;
   private e7 br;

   public gb() {
      this.do = 64;
      this.if = 64;
      this.bq = new e7(this, 0, 0);
      this.bq.a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
      e7 var1 = new e7(this, 24, 0);
      var1.a(-4.0F, -6.0F, -2.0F, 3, 4, 1);
      this.bq.a(var1);
      e7 var2 = new e7(this, 24, 0);
      var2.void = true;
      var2.a(1.0F, -6.0F, -2.0F, 3, 4, 1);
      this.bq.a(var2);
      this.bp = new e7(this, 0, 16);
      this.bp.a(-3.0F, 4.0F, -3.0F, 6, 12, 6);
      this.bp.a(0, 34).a(-5.0F, 16.0F, 0.0F, 10, 6, 1);
      this.bu = new e7(this, 42, 0);
      this.bu.a(-12.0F, 1.0F, 1.5F, 10, 16, 1);
      this.bs = new e7(this, 24, 16);
      this.bs.a(-12.0F, 1.0F, 1.5F);
      this.bs.a(-8.0F, 1.0F, 0.0F, 8, 12, 1);
      this.bt = new e7(this, 42, 0);
      this.bt.void = true;
      this.bt.a(2.0F, 1.0F, 1.5F, 10, 16, 1);
      this.br = new e7(this, 24, 16);
      this.br.void = true;
      this.br.a(12.0F, 1.0F, 1.5F);
      this.br.a(0.0F, 1.0F, 0.0F, 8, 12, 1);
      this.bp.a(this.bu);
      this.bp.a(this.bt);
      this.bu.a(this.bs);
      this.bt.a(this.br);
   }

   public int byte() {
      return 36;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      aga var8 = (aga)var1;
      if (var8.fP()) {
         this.bq.d = var6 / 57.295776F;
         this.bq.c = 3.1415927F - var5 / 57.295776F;
         this.bq.b = 3.1415927F;
         this.bq.a(0.0F, -2.0F, 0.0F);
         this.bu.a(-3.0F, 0.0F, 3.0F);
         this.bt.a(3.0F, 0.0F, 3.0F);
         this.bp.d = 3.1415927F;
         this.bu.d = -0.15707964F;
         this.bu.c = -1.2566371F;
         this.bs.c = -1.7278761F;
         this.bt.d = this.bu.d;
         this.bt.c = -this.bu.c;
         this.br.c = -this.bs.c;
      } else {
         this.bq.d = var6 / 57.295776F;
         this.bq.c = var5 / 57.295776F;
         this.bq.b = 0.0F;
         this.bq.a(0.0F, 0.0F, 0.0F);
         this.bu.a(0.0F, 0.0F, 0.0F);
         this.bt.a(0.0F, 0.0F, 0.0F);
         this.bp.d = 0.7853982F + ajs.for(var4 * 0.1F) * 0.15F;
         this.bp.c = 0.0F;
         this.bu.c = ajs.for(var4 * 1.3F) * 3.1415927F * 0.25F;
         this.bt.c = -this.bu.c;
         this.bs.c = this.bu.c * 0.5F;
         this.br.c = -this.bu.c * 0.5F;
      }

      this.bq.for(var7);
      this.bp.for(var7);
   }
}
