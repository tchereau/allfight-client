public class cy {
   public float[][] if = new float[16][16];
   public float[] a = new float[16];
   public float[] for = new float[16];
   public float[] do = new float[16];

   public boolean if(double var1, double var3, double var5, double var7, double var9, double var11) {
      for(int var13 = 0; var13 < 6; ++var13) {
         float var14 = (float)var1;
         float var15 = (float)var3;
         float var16 = (float)var5;
         float var17 = (float)var7;
         float var18 = (float)var9;
         float var19 = (float)var11;
         if (this.if[var13][0] * var14 + this.if[var13][1] * var15 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var15 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var14 + this.if[var13][1] * var18 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var18 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var14 + this.if[var13][1] * var15 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var15 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var14 + this.if[var13][1] * var18 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var18 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F) {
            return false;
         }
      }

      return true;
   }

   public boolean a(double var1, double var3, double var5, double var7, double var9, double var11) {
      for(int var13 = 0; var13 < 6; ++var13) {
         float var14 = (float)var1;
         float var15 = (float)var3;
         float var16 = (float)var5;
         float var17 = (float)var7;
         float var18 = (float)var9;
         float var19 = (float)var11;
         if (var13 < 4) {
            if (this.if[var13][0] * var14 + this.if[var13][1] * var15 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var17 + this.if[var13][1] * var15 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var14 + this.if[var13][1] * var18 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var17 + this.if[var13][1] * var18 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var14 + this.if[var13][1] * var15 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var17 + this.if[var13][1] * var15 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var14 + this.if[var13][1] * var18 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F || this.if[var13][0] * var17 + this.if[var13][1] * var18 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F) {
               return false;
            }
         } else if (this.if[var13][0] * var14 + this.if[var13][1] * var15 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var15 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var14 + this.if[var13][1] * var18 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var18 + this.if[var13][2] * var16 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var14 + this.if[var13][1] * var15 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var15 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var14 + this.if[var13][1] * var18 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F && this.if[var13][0] * var17 + this.if[var13][1] * var18 + this.if[var13][2] * var19 + this.if[var13][3] <= 0.0F) {
            return false;
         }
      }

      return true;
   }
}
