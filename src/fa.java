import org.lwjgl.opengl.GL11;

public class fa extends fx {
   private e7 g;
   private e7 f;
   private e7 e;
   private e7 d;
   private e7 c;
   private e7 b;
   private e7 void;
   private e7 long;
   private e7 goto;
   private e7 else;
   private e7 char;
   private e7 case;
   private float byte;

   public fa(float var1) {
      this.do = 256;
      this.if = 256;
      this.a("body.body", 0, 0);
      this.a("wing.skin", -56, 88);
      this.a("wingtip.skin", -56, 144);
      this.a("rearleg.main", 0, 0);
      this.a("rearfoot.main", 112, 0);
      this.a("rearlegtip.main", 196, 0);
      this.a("head.upperhead", 112, 30);
      this.a("wing.bone", 112, 88);
      this.a("head.upperlip", 176, 44);
      this.a("jaw.jaw", 176, 65);
      this.a("frontleg.main", 112, 104);
      this.a("wingtip.bone", 112, 136);
      this.a("frontfoot.main", 144, 104);
      this.a("neck.box", 192, 104);
      this.a("frontlegtip.main", 226, 138);
      this.a("body.scale", 220, 53);
      this.a("head.scale", 0, 0);
      this.a("neck.scale", 48, 0);
      this.a("head.nostril", 112, 0);
      float var2 = -16.0F;
      this.g = new e7(this, "head");
      this.g.a("upperlip", -6.0F, -1.0F, -8.0F + var2, 12, 5, 16);
      this.g.a("upperhead", -8.0F, -8.0F, 6.0F + var2, 16, 16, 16);
      this.g.void = true;
      this.g.a("scale", -5.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.g.a("nostril", -5.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.g.void = false;
      this.g.a("scale", 3.0F, -12.0F, 12.0F + var2, 2, 4, 6);
      this.g.a("nostril", 3.0F, -3.0F, -6.0F + var2, 2, 2, 4);
      this.e = new e7(this, "jaw");
      this.e.a(0.0F, 4.0F, 8.0F + var2);
      this.e.a("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
      this.g.a(this.e);
      this.f = new e7(this, "neck");
      this.f.a("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
      this.f.a("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
      this.d = new e7(this, "body");
      this.d.a(0.0F, 4.0F, 8.0F);
      this.d.a("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
      this.d.a("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
      this.d.a("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
      this.d.a("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
      this.char = new e7(this, "wing");
      this.char.a(-12.0F, 5.0F, 2.0F);
      this.char.a("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
      this.char.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.case = new e7(this, "wingtip");
      this.case.a(-56.0F, 0.0F, 0.0F);
      this.case.a("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
      this.case.a("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
      this.char.a(this.case);
      this.b = new e7(this, "frontleg");
      this.b.a(-12.0F, 20.0F, 2.0F);
      this.b.a("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
      this.long = new e7(this, "frontlegtip");
      this.long.a(0.0F, 20.0F, -1.0F);
      this.long.a("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
      this.b.a(this.long);
      this.else = new e7(this, "frontfoot");
      this.else.a(0.0F, 23.0F, 0.0F);
      this.else.a("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
      this.long.a(this.else);
      this.c = new e7(this, "rearleg");
      this.c.a(-16.0F, 16.0F, 42.0F);
      this.c.a("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
      this.void = new e7(this, "rearlegtip");
      this.void.a(0.0F, 32.0F, -4.0F);
      this.void.a("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
      this.c.a(this.void);
      this.goto = new e7(this, "rearfoot");
      this.goto.a(0.0F, 31.0F, 4.0F);
      this.goto.a("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
      this.void.a(this.goto);
   }

   public void a(aig var1, float var2, float var3, float var4) {
      this.byte = var4;
   }

   public void a(aiw var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      GL11.glPushMatrix();
      afr var8 = (afr)var1;
      float var9 = var8.qq + (var8.qp - var8.qq) * this.byte;
      this.e.d = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F)) + 1.0D) * 0.2F;
      float var10 = (float)(Math.sin((double)(var9 * 3.1415927F * 2.0F - 1.0F)) + 1.0D);
      var10 = (var10 * var10 * 1.0F + var10 * 2.0F) * 0.05F;
      GL11.glTranslatef(0.0F, var10 - 2.0F, -3.0F);
      GL11.glRotatef(var10 * 2.0F, 1.0F, 0.0F, 0.0F);
      float var11 = -30.0F;
      float var13 = 0.0F;
      float var14 = 1.5F;
      double[] var15 = var8.if(6, this.byte);
      float var16 = this.a(var8.if(5, this.byte)[0] - var8.if(10, this.byte)[0]);
      float var17 = this.a(var8.if(5, this.byte)[0] + (double)(var16 / 2.0F));
      var11 += 2.0F;
      float var18 = var9 * 3.1415927F * 2.0F;
      var11 = 20.0F;
      float var12 = -12.0F;

      float var21;
      for(int var19 = 0; var19 < 5; ++var19) {
         double[] var20 = var8.if(5 - var19, this.byte);
         var21 = (float)Math.cos((double)((float)var19 * 0.45F + var18)) * 0.15F;
         this.f.c = this.a(var20[0] - var15[0]) * 3.1415927F / 180.0F * var14;
         this.f.d = var21 + (float)(var20[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
         this.f.b = -this.a(var20[0] - (double)var17) * 3.1415927F / 180.0F * var14;
         this.f.f = var11;
         this.f.e = var12;
         this.f.g = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.f.d) * 10.0D);
         var12 = (float)((double)var12 - Math.cos((double)this.f.c) * Math.cos((double)this.f.d) * 10.0D);
         var13 = (float)((double)var13 - Math.sin((double)this.f.c) * Math.cos((double)this.f.d) * 10.0D);
         this.f.for(var7);
      }

      this.g.f = var11;
      this.g.e = var12;
      this.g.g = var13;
      double[] var22 = var8.if(0, this.byte);
      this.g.c = this.a(var22[0] - var15[0]) * 3.1415927F / 180.0F * 1.0F;
      this.g.b = -this.a(var22[0] - (double)var17) * 3.1415927F / 180.0F * 1.0F;
      this.g.for(var7);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var16 * var14 * 1.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(0.0F, -1.0F, 0.0F);
      this.d.b = 0.0F;
      this.d.for(var7);

      for(int var23 = 0; var23 < 2; ++var23) {
         GL11.glEnable(2884);
         var21 = var9 * 3.1415927F * 2.0F;
         this.char.d = 0.125F - (float)Math.cos((double)var21) * 0.2F;
         this.char.c = 0.25F;
         this.char.b = (float)(Math.sin((double)var21) + 0.125D) * 0.8F;
         this.case.b = -((float)(Math.sin((double)(var21 + 2.0F)) + 0.5D)) * 0.75F;
         this.c.d = 1.0F + var10 * 0.1F;
         this.void.d = 0.5F + var10 * 0.1F;
         this.goto.d = 0.75F + var10 * 0.1F;
         this.b.d = 1.3F + var10 * 0.1F;
         this.long.d = -0.5F - var10 * 0.1F;
         this.else.d = 0.75F + var10 * 0.1F;
         this.char.for(var7);
         this.b.for(var7);
         this.c.for(var7);
         GL11.glScalef(-1.0F, 1.0F, 1.0F);
         if (var23 == 0) {
            GL11.glCullFace(1028);
         }
      }

      GL11.glPopMatrix();
      GL11.glCullFace(1029);
      GL11.glDisable(2884);
      float var24 = -((float)Math.sin((double)(var9 * 3.1415927F * 2.0F))) * 0.0F;
      var18 = var9 * 3.1415927F * 2.0F;
      var11 = 10.0F;
      var12 = 60.0F;
      var13 = 0.0F;
      var15 = var8.if(11, this.byte);

      for(int var25 = 0; var25 < 12; ++var25) {
         var22 = var8.if(12 + var25, this.byte);
         var24 = (float)((double)var24 + Math.sin((double)((float)var25 * 0.45F + var18)) * 0.05000000074505806D);
         this.f.c = (this.a(var22[0] - var15[0]) * var14 + 180.0F) * 3.1415927F / 180.0F;
         this.f.d = var24 + (float)(var22[1] - var15[1]) * 3.1415927F / 180.0F * var14 * 5.0F;
         this.f.b = this.a(var22[0] - (double)var17) * 3.1415927F / 180.0F * var14;
         this.f.f = var11;
         this.f.e = var12;
         this.f.g = var13;
         var11 = (float)((double)var11 + Math.sin((double)this.f.d) * 10.0D);
         var12 = (float)((double)var12 - Math.cos((double)this.f.c) * Math.cos((double)this.f.d) * 10.0D);
         var13 = (float)((double)var13 - Math.sin((double)this.f.c) * Math.cos((double)this.f.d) * 10.0D);
         this.f.for(var7);
      }

      GL11.glPopMatrix();
   }

   private float a(double var1) {
      while(var1 >= 180.0D) {
         var1 -= 360.0D;
      }

      while(var1 < -180.0D) {
         var1 += 360.0D;
      }

      return (float)var1;
   }
}
