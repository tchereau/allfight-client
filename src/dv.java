import org.lwjgl.opengl.GL11;

public class dv extends d7 {
   private aiw bF;
   private aiw bJ;
   private int bI = 0;
   private int bH = 0;
   private float bG;

   public dv(y6 var1, aiw var2, aiw var3, float var4) {
      super(var1, var2.al, var2.ak, var2.aj, var2.ai, var2.ah, var2.ag);
      this.bF = var2;
      this.bJ = var3;
      this.bH = 3;
      this.bG = var4;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.bI + var2) / (float)this.bH;
      var8 *= var8;
      double var9 = this.bF.al;
      double var11 = this.bF.ak;
      double var13 = this.bF.aj;
      double var15 = this.bJ.aJ + (this.bJ.al - this.bJ.aJ) * (double)var2;
      double var17 = this.bJ.aI + (this.bJ.ak - this.bJ.aI) * (double)var2 + (double)this.bG;
      double var19 = this.bJ.aH + (this.bJ.aj - this.bJ.aH) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = ajs.a(var21);
      int var28 = ajs.a(var23 + (double)(this.aQ / 2.0F));
      int var29 = ajs.a(var25);
      int var30 = this.new(var2);
      int var31 = var30 % 65536;
      int var32 = var30 / 65536;
      q.a(q.a, (float)var31 / 1.0F, (float)var32 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var21 -= bD;
      var23 -= bC;
      var25 -= bt;
      cl.e.if(this.bF, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.bF.a5, var2);
   }

   public void aC() {
      ++this.bI;
      if (this.bI == this.bH) {
         this.az();
      }

   }

   public int aS() {
      return 3;
   }
}
