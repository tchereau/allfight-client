import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class hz extends h4 {
   private float pg;
   private float pf;

   public hz(aek var1) {
      super(var1.fQ);
      this.hS = true;
      var1.a((akf)akk.n, 1);
   }

   public void dG() {
      if (this.hW.vp.try()) {
         this.hW.a((i5)(new h7(this.hW.vk)));
      }

   }

   public void dA() {
      this.hT.clear();
      if (this.hW.vp.try()) {
         this.hW.a((i5)(new h7(this.hW.vk)));
      } else {
         super.dA();
      }

   }

   protected void f(int var1, int var2) {
      this.hR.if(aqz.if("container.crafting"), 86, 16, 4210752);
   }

   public void if(int var1, int var2, float var3) {
      super.if(var1, var2, var3);
      this.pg = (float)var1;
      this.pf = (float)var2;
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/inventory.png");
      int var4 = this.oO;
      int var5 = this.oN;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      if(this.hW, var4 + 51, var5 + 75, 30, (float)(var4 + 51) - this.pg, (float)(var5 + 75 - 50) - this.pf);
   }

   public static void if(Minecraft var0, int var1, int var2, int var3, float var4, float var5) {
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var1, (float)var2, 50.0F);
      GL11.glScalef((float)(-var3), (float)var3, (float)var3);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = var0.vk.eH;
      float var7 = var0.vk.a5;
      float var8 = var0.vk.a4;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      k1.if();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var5 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      var0.vk.eH = (float)Math.atan((double)(var4 / 40.0F)) * 20.0F;
      var0.vk.a5 = (float)Math.atan((double)(var4 / 40.0F)) * 40.0F;
      var0.vk.a4 = -((float)Math.atan((double)(var5 / 40.0F))) * 20.0F;
      var0.vk.fA = var0.vk.a5;
      GL11.glTranslatef(0.0F, var0.vk.aQ, 0.0F);
      cl.e.case = 180.0F;
      cl.e.if(var0.vk, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      var0.vk.eH = var6;
      var0.vk.a5 = var7;
      var0.vk.a4 = var8;
      GL11.glPopMatrix();
      k1.do();
      GL11.glDisable(32826);
      q.a(q.a);
      GL11.glDisable(3553);
      q.a(q.if);
   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.hW.a((i5)(new it(this.hW.uP)));
      }

      if (var1.hv == 1) {
         this.hW.a((i5)(new is(this, this.hW.uP)));
      }

   }
}
