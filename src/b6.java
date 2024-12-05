import org.lwjgl.opengl.GL11;

public class b6 extends ck {
   protected fx byte;
   protected final c2 case;

   public b6() {
      this.for = 0.5F;
      this.byte = new fy();
      this.case = new c2();
   }

   public void a(afj var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      long var10 = (long)var1.av * 493286711L;
      var10 = var10 * var10 * 4392167121L + var10 * 98761L;
      float var12 = (((float)(var10 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var10 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var14 = (((float)(var10 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      GL11.glTranslatef(var12, var13, var14);
      double var15 = var1.aJ + (var1.al - var1.aJ) * (double)var9;
      double var17 = var1.aI + (var1.ak - var1.aI) * (double)var9;
      double var19 = var1.aH + (var1.aj - var1.aH) * (double)var9;
      double var21 = 0.30000001192092896D;
      nr var23 = var1.void(var15, var17, var19);
      float var24 = var1.a0 + (var1.a4 - var1.a0) * var9;
      if (var23 != null) {
         nr var25 = var1.if(var15, var17, var19, var21);
         nr var26 = var1.if(var15, var17, var19, -var21);
         if (var25 == null) {
            var25 = var23;
         }

         if (var26 == null) {
            var26 = var23;
         }

         var2 += var23.int - var15;
         var4 += (var25.for + var26.for) / 2.0D - var17;
         var6 += var23.do - var19;
         nr var27 = var26.a(-var25.int, -var25.for, -var25.do);
         if (var27.a() != 0.0D) {
            var27 = var27.if();
            var8 = (float)(Math.atan2(var27.do, var27.int) * 180.0D / 3.141592653589793D);
            var24 = (float)(Math.atan(var27.for) * 73.0D);
         }
      }

      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      GL11.glRotatef(180.0F - var8, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var24, 0.0F, 0.0F, 1.0F);
      float var31 = (float)var1.f7() - var9;
      float var32 = (float)var1.f2() - var9;
      if (var32 < 0.0F) {
         var32 = 0.0F;
      }

      if (var31 > 0.0F) {
         GL11.glRotatef(ajs.try(var31) * var31 * var32 / 10.0F * (float)var1.fZ(), 1.0F, 0.0F, 0.0F);
      }

      int var33 = var1.f5();
      pa var28 = var1.f4();
      int var29 = var1.f9();
      if (var28 != null) {
         GL11.glPushMatrix();
         this.a("/terrain.png");
         float var30 = 0.75F;
         GL11.glScalef(var30, var30, var30);
         GL11.glTranslatef(0.0F, (float)var33 / 16.0F, 0.0F);
         this.a(var1, var9, var28, var29);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

      this.a("/item/cart.png");
      GL11.glScalef(-1.0F, -1.0F, 1.0F);
      this.byte.a(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   protected void a(afj var1, float var2, pa var3, int var4) {
      float var5 = var1.int(var2);
      GL11.glPushMatrix();
      this.case.a(var3, var4, var5);
      GL11.glPopMatrix();
   }
}
