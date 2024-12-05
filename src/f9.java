public class f9 extends fx {
   public e7[] bm = new e7[5];

   public f9() {
      this.bm[0] = new e7(this, 0, 8);
      this.bm[1] = new e7(this, 0, 0);
      this.bm[2] = new e7(this, 0, 0);
      this.bm[3] = new e7(this, 0, 0);
      this.bm[4] = new e7(this, 0, 0);
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.bm[0].a((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
      this.bm[0].a(0.0F, (float)var4, 0.0F);
      this.bm[1].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.bm[1].a((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.bm[2].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.bm[2].a((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.bm[3].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.bm[3].a(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.bm[4].a((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.bm[4].a(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.bm[0].d = 1.5707964F;
      this.bm[1].c = 4.712389F;
      this.bm[2].c = 1.5707964F;
      this.bm[3].c = 3.1415927F;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      for(int var8 = 0; var8 < 5; ++var8) {
         this.bm[var8].for(var7);
      }

   }
}
