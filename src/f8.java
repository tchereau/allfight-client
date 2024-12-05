public class f8 extends fx {
   public e7 bg = (new e7(this)).a(0, 0).a(-6.0F, -5.0F, 0.0F, 6, 10, 0);
   public e7 bf = (new e7(this)).a(16, 0).a(0.0F, -5.0F, 0.0F, 6, 10, 0);
   public e7 bl = (new e7(this)).a(0, 10).a(0.0F, -4.0F, -0.99F, 5, 8, 1);
   public e7 bk = (new e7(this)).a(12, 10).a(0.0F, -4.0F, -0.01F, 5, 8, 1);
   public e7 bj = (new e7(this)).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public e7 bi = (new e7(this)).a(24, 10).a(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public e7 bh = (new e7(this)).a(12, 0).a(-1.0F, -5.0F, 0.0F, 2, 10, 0);

   public f8() {
      this.bg.a(0.0F, 0.0F, -1.0F);
      this.bf.a(0.0F, 0.0F, 1.0F);
      this.bh.c = 1.5707964F;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);
      this.bg.for(var7);
      this.bf.for(var7);
      this.bh.for(var7);
      this.bl.for(var7);
      this.bk.for(var7);
      this.bj.for(var7);
      this.bi.for(var7);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      float var8 = (ajs.try(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.bg.c = 3.1415927F + var8;
      this.bf.c = -var8;
      this.bl.c = var8;
      this.bk.c = -var8;
      this.bj.c = var8 - var8 * 2.0F * var2;
      this.bi.c = var8 - var8 * 2.0F * var3;
      this.bl.g = ajs.try(var8);
      this.bk.g = ajs.try(var8);
      this.bj.g = ajs.try(var8);
      this.bi.g = ajs.try(var8);
   }
}
