public class fp extends fx {
   private e7[] ae = new e7[7];
   private e7[] ad;
   private float[] ah = new float[7];
   private static final int[][] ag = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] af = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public fp() {
      float var1 = -3.5F;

      for(int var2 = 0; var2 < this.ae.length; ++var2) {
         this.ae[var2] = new e7(this, af[var2][0], af[var2][1]);
         this.ae[var2].a((float)ag[var2][0] * -0.5F, 0.0F, (float)ag[var2][2] * -0.5F, ag[var2][0], ag[var2][1], ag[var2][2]);
         this.ae[var2].a(0.0F, (float)(24 - ag[var2][1]), var1);
         this.ah[var2] = var1;
         if (var2 < this.ae.length - 1) {
            var1 += (float)(ag[var2][2] + ag[var2 + 1][2]) * 0.5F;
         }
      }

      this.ad = new e7[3];
      this.ad[0] = new e7(this, 20, 0);
      this.ad[0].a(-5.0F, 0.0F, (float)ag[2][2] * -0.5F, 10, 8, ag[2][2]);
      this.ad[0].a(0.0F, 16.0F, this.ah[2]);
      this.ad[1] = new e7(this, 20, 11);
      this.ad[1].a(-3.0F, 0.0F, (float)ag[4][2] * -0.5F, 6, 4, ag[4][2]);
      this.ad[1].a(0.0F, 20.0F, this.ah[4]);
      this.ad[2] = new e7(this, 20, 18);
      this.ad[2].a(-3.0F, 0.0F, (float)ag[4][2] * -0.5F, 6, 5, ag[1][2]);
      this.ad[2].a(0.0F, 19.0F, this.ah[1]);
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.a(var2, var3, var4, var5, var6, var7, var1);

      int var8;
      for(var8 = 0; var8 < this.ae.length; ++var8) {
         this.ae[var8].for(var7);
      }

      for(var8 = 0; var8 < this.ad.length; ++var8) {
         this.ad[var8].for(var7);
      }

   }

   public void a(float var1, float var2, float var3, float var4, float var5, float var6, aiw var7) {
      for(int var8 = 0; var8 < this.ae.length; ++var8) {
         this.ae[var8].c = ajs.for(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (float)(1 + Math.abs(var8 - 2));
         this.ae[var8].g = ajs.try(var3 * 0.9F + (float)var8 * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * (float)Math.abs(var8 - 2);
      }

      this.ad[0].c = this.ae[2].c;
      this.ad[1].c = this.ae[4].c;
      this.ad[1].g = this.ae[4].g;
      this.ad[2].c = this.ae[1].c;
      this.ad[2].g = this.ae[1].g;
   }
}
