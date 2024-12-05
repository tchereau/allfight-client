public class fy extends fx {
   public e7[] aD = new e7[7];

   public fy() {
      this.aD[0] = new e7(this, 0, 10);
      this.aD[1] = new e7(this, 0, 0);
      this.aD[2] = new e7(this, 0, 0);
      this.aD[3] = new e7(this, 0, 0);
      this.aD[4] = new e7(this, 0, 0);
      this.aD[5] = new e7(this, 44, 10);
      byte var1 = 20;
      byte var2 = 8;
      byte var3 = 16;
      byte var4 = 4;
      this.aD[0].a((float)(-var1 / 2), (float)(-var3 / 2), -1.0F, var1, var3, 2, 0.0F);
      this.aD[0].a(0.0F, (float)var4, 0.0F);
      this.aD[5].a((float)(-var1 / 2 + 1), (float)(-var3 / 2 + 1), -1.0F, var1 - 2, var3 - 2, 1, 0.0F);
      this.aD[5].a(0.0F, (float)var4, 0.0F);
      this.aD[1].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.aD[1].a((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.aD[2].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.aD[2].a((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.aD[3].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.aD[3].a(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.aD[4].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.aD[4].a(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.aD[0].d = 1.5707964F;
      this.aD[1].c = 4.712389F;
      this.aD[2].c = 1.5707964F;
      this.aD[3].c = 3.1415927F;
      this.aD[5].d = -1.5707964F;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.aD[5].f = 4.0F - var4;

      for(int var8 = 0; var8 < 6; ++var8) {
         this.aD[var8].for(var7);
      }

   }
}
