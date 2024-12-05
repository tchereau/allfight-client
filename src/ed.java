import org.lwjgl.opengl.GL11;

public class ed extends d7 {
   private int b2 = 0;
   private int b4 = 0;
   private c3 b3;

   public ed(c3 var1, y6 var2, double var3, double var5, double var7) {
      super(var2, var3, var5, var7, 0.0D, 0.0D, 0.0D);
      this.b3 = var1;
      this.ai = this.ah = this.ag = 0.0D;
      this.b4 = 200;
   }

   public void a(c4 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.b2 + var2) / (float)this.b4;
      var8 *= var8;
      float var9 = 2.0F - var8 * 2.0F;
      if (var9 > 1.0F) {
         var9 = 1.0F;
      }

      var9 *= 0.2F;
      GL11.glDisable(2896);
      float var10 = 0.125F;
      float var11 = (float)(this.al - bD);
      float var12 = (float)(this.ak - bC);
      float var13 = (float)(this.aj - bt);
      float var14 = this.ap.int(ajs.a(this.al), ajs.a(this.ak), ajs.a(this.aj));
      this.b3.for("/misc/footprint.png");
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      var1.if();
      var1.a(var14, var14, var14, var9);
      var1.a((double)(var11 - var10), (double)var12, (double)(var13 + var10), 0.0D, 1.0D);
      var1.a((double)(var11 + var10), (double)var12, (double)(var13 + var10), 1.0D, 1.0D);
      var1.a((double)(var11 + var10), (double)var12, (double)(var13 - var10), 1.0D, 0.0D);
      var1.a((double)(var11 - var10), (double)var12, (double)(var13 - var10), 0.0D, 0.0D);
      var1.for();
      GL11.glDisable(3042);
      GL11.glEnable(2896);
   }

   public void aC() {
      ++this.b2;
      if (this.b2 == this.b4) {
         this.az();
      }

   }

   public int aS() {
      return 3;
   }
}
