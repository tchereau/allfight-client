public class fe extends fg {
   public boolean z = false;
   private e7 y = (new e7(this)).if(64, 128);
   private e7 x;

   public fe(float var1) {
      super(var1, 0.0F, 64, 128);
      this.y.a(0.0F, -2.0F, 0.0F);
      this.y.a(0, 0).a(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
      this.t.a(this.y);
      this.x = (new e7(this)).if(64, 128);
      this.x.a(-5.0F, -10.03125F, -5.0F);
      this.x.a(0, 64).a(0.0F, 0.0F, 0.0F, 10, 2, 10);
      this.s.a(this.x);
      e7 var2 = (new e7(this)).if(64, 128);
      var2.a(1.75F, -4.0F, 2.0F);
      var2.a(0, 76).a(0.0F, 0.0F, 0.0F, 7, 4, 7);
      var2.d = -0.05235988F;
      var2.b = 0.02617994F;
      this.x.a(var2);
      e7 var3 = (new e7(this)).if(64, 128);
      var3.a(1.75F, -4.0F, 2.0F);
      var3.a(0, 87).a(0.0F, 0.0F, 0.0F, 4, 4, 4);
      var3.d = -0.10471976F;
      var3.b = 0.05235988F;
      var2.a(var3);
      e7 var4 = (new e7(this)).if(64, 128);
      var4.a(1.75F, -2.0F, 2.0F);
      var4.a(0, 95).a(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
      var4.d = -0.20943952F;
      var4.b = 0.10471976F;
      var3.a(var4);
   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
      this.t.byte = this.t.try = this.t.new = 0.0F;
      float var8 = 0.01F * (float)(var7.av % 10);
      this.t.d = ajs.try((float)var7.bl * var8) * 4.5F * 3.1415927F / 180.0F;
      this.t.c = 0.0F;
      this.t.b = ajs.for((float)var7.bl * var8) * 2.5F * 3.1415927F / 180.0F;
      if (this.z) {
         this.t.d = -0.9F;
         this.t.new = -0.09375F;
         this.t.try = 0.1875F;
      }

   }

   public int if() {
      return 0;
   }
}
