import org.lwjgl.opengl.GL11;

public class bz extends b4 {
   private f1 t;
   private f1 w;
   private f1 v;
   private static final String[] u = new String[]{"cloth", "chain", "iron", "diamond", "gold"};

   public bz() {
      super(new f1(0.0F), 0.5F);
      this.t = (f1)this.l;
      this.w = new f1(1.0F);
      this.v = new f1(0.5F);
   }

   protected void if(aek var1) {
      this.a(var1.af, var1.W());
   }

   protected int a(aek var1, int var2, float var3) {
      abp var4 = var1.fR.long(3 - var2);
      if (var4 != null) {
         abr var5 = var4.d();
         if (var5 instanceof ac4) {
            ac4 var6 = (ac4)var5;
            this.a("/armor/" + u[var6.dT] + "_" + (var2 == 2 ? 2 : 1) + ".png");
            f1 var7 = var2 == 2 ? this.v : this.w;
            var7.aS.long = var2 == 0;
            var7.aR.long = var2 == 0;
            var7.aQ.long = var2 == 1 || var2 == 2;
            var7.aP.long = var2 == 1;
            var7.aO.long = var2 == 1;
            var7.aN.long = var2 == 2 || var2 == 3;
            var7.aM.long = var2 == 2 || var2 == 3;
            this.a(var7);
            if (var7 != null) {
               var7.try = this.l.try;
            }

            if (var7 != null) {
               var7.new = this.l.new;
            }

            if (var7 != null) {
               var7.for = this.l.for;
            }

            float var8 = 1.0F;
            if (var6.y() == ac1.long) {
               int var9 = var6.void(var4);
               float var10 = (float)(var9 >> 16 & 255) / 255.0F;
               float var11 = (float)(var9 >> 8 & 255) / 255.0F;
               float var12 = (float)(var9 & 255) / 255.0F;
               GL11.glColor3f(var8 * var10, var8 * var11, var8 * var12);
               if (var4.case()) {
                  return 31;
               }

               return 16;
            }

            GL11.glColor3f(var8, var8, var8);
            if (var4.case()) {
               return 15;
            }

            return 1;
         }
      }

      return -1;
   }

   protected void if(aek var1, int var2, float var3) {
      abp var4 = var1.fR.long(3 - var2);
      if (var4 != null) {
         abr var5 = var4.d();
         if (var5 instanceof ac4) {
            ac4 var6 = (ac4)var5;
            this.a("/armor/" + u[var6.dT] + "_" + (var2 == 2 ? 2 : 1) + "_b.png");
            float var7 = 1.0F;
            GL11.glColor3f(var7, var7, var7);
         }
      }

   }

   public void a(aek var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 1.0F;
      GL11.glColor3f(var10, var10, var10);
      abp var11 = var1.fR.L();
      this.w.aI = this.v.aI = this.t.aI = var11 != null ? 1 : 0;
      if (var11 != null && var1.cy() > 0) {
         aax var12 = var11.l();
         if (var12 == aax.new) {
            this.w.aI = this.v.aI = this.t.aI = 3;
         } else if (var12 == aax.int) {
            this.w.aG = this.v.aG = this.t.aG = true;
         }
      }

      this.w.aH = this.v.aH = this.t.aH = var1.Q();
      double var14 = var4 - (double)var1.aQ;
      if (var1.Q() && !(var1 instanceof dq)) {
         var14 -= 0.125D;
      }

      super.a(var1, var2, var14, var6, var8, var9);
      this.w.aG = this.v.aG = this.t.aG = false;
      this.w.aH = this.v.aH = this.t.aH = false;
      this.w.aI = this.v.aI = this.t.aI = 0;
   }

   protected void if(aek var1, float var2) {
      float var3 = 1.0F;
      GL11.glColor3f(var3, var3, var3);
      super.do(var1, var2);
      super.if(var1, var2);
      abp var4 = var1.fR.long(3);
      float var5;
      if (var4 != null) {
         GL11.glPushMatrix();
         this.t.aS.if(0.0625F);
         if (var4.d().A < 256) {
            if (c2.a(pa.x[var4.new].new())) {
               var5 = 0.625F;
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var5, -var5, -var5);
            }

            this.a.long.a(var1, var4, 0);
         } else if (var4.d().A == abr.bv.A) {
            var5 = 1.0625F;
            GL11.glScalef(var5, -var5, -var5);
            String var6 = "";
            if (var4.a() && var4.b().try("SkullOwner")) {
               var6 = var4.b().new("SkullOwner");
            }

            a1.do.a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var4.new(), var6);
         }

         GL11.glPopMatrix();
      }

      float var22;
      if (var1.fJ.equals("deadmau5") && this.a(var1.af, (String)null)) {
         for(int var7 = 0; var7 < 2; ++var7) {
            float var8 = var1.a2 + (var1.a5 - var1.a2) * var2 - (var1.eG + (var1.eH - var1.eG) * var2);
            var5 = var1.a0 + (var1.a4 - var1.a0) * var2;
            GL11.glPushMatrix();
            GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.375F * (float)(var7 * 2 - 1), 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.375F, 0.0F);
            GL11.glRotatef(-var5, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-var8, 0.0F, 1.0F, 0.0F);
            var22 = 1.3333334F;
            GL11.glScalef(var22, var22, var22);
            this.t.if(0.0625F);
            GL11.glPopMatrix();
         }
      }

      float var23;
      if (this.a(var1.ae, (String)null) && !var1.U() && !var1.cV()) {
         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 0.0F, 0.125F);
         double var24 = var1.fH + (var1.fE - var1.fH) * (double)var2 - (var1.ao + (var1.al - var1.ao) * (double)var2);
         double var10 = var1.fG + (var1.fD - var1.fG) * (double)var2 - (var1.an + (var1.ak - var1.an) * (double)var2);
         double var12 = var1.fF + (var1.fC - var1.fF) * (double)var2 - (var1.am + (var1.aj - var1.am) * (double)var2);
         var23 = var1.eG + (var1.eH - var1.eG) * var2;
         double var14 = (double)ajs.try(var23 * 3.1415927F / 180.0F);
         double var16 = (double)(-ajs.for(var23 * 3.1415927F / 180.0F));
         float var18 = (float)var10 * 10.0F;
         if (var18 < -6.0F) {
            var18 = -6.0F;
         }

         if (var18 > 32.0F) {
            var18 = 32.0F;
         }

         float var19 = (float)(var24 * var14 + var12 * var16) * 100.0F;
         float var20 = (float)(var24 * var16 - var12 * var14) * 100.0F;
         if (var19 < 0.0F) {
            var19 = 0.0F;
         }

         float var21 = var1.fL + (var1.fK - var1.fL) * var2;
         var18 += ajs.try((var1.aN + (var1.aM - var1.aN) * var2) * 6.0F) * 32.0F * var21;
         if (var1.Q()) {
            var18 += 25.0F;
         }

         GL11.glRotatef(6.0F + var19 / 2.0F + var18, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var20 / 2.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var20 / 2.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         this.t.a(0.0625F);
         GL11.glPopMatrix();
      }

      abp var25 = var1.fR.L();
      if (var25 != null) {
         GL11.glPushMatrix();
         this.t.aP.if(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if (var1.fS != null) {
            var25 = new abp(abr.a9);
         }

         aax var9 = null;
         if (var1.cy() > 0) {
            var9 = var25.l();
         }

         if (var25.new < 256 && c2.a(pa.x[var25.new].new())) {
            var5 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var5 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(-var5, -var5, var5);
         } else if (var25.new == abr.W.A) {
            var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (var25.new == mod_saphir.G.A) {
            var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (var25.new == mod_emeraude.void.A) {
            var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (var25.new == mod_rubis.ap.A) {
            var5 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (abr.ai[var25.new].g()) {
            var5 = 0.625F;
            if (abr.ai[var25.new].else()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            if (var1.cy() > 0 && var9 == aax.new) {
               GL11.glTranslatef(0.05F, 0.0F, -0.1F);
               GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
               GL11.glRotatef(-10.0F, 1.0F, 0.0F, 0.0F);
               GL11.glRotatef(-60.0F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var5, -var5, var5);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var5 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var5, var5, var5);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         int var11;
         float var26;
         float var27;
         if (var25.d().do()) {
            for(var11 = 0; var11 <= 1; ++var11) {
               int var13 = var25.d().a(var25, var11);
               var27 = (float)(var13 >> 16 & 255) / 255.0F;
               var26 = (float)(var13 >> 8 & 255) / 255.0F;
               var23 = (float)(var13 & 255) / 255.0F;
               GL11.glColor4f(var27, var26, var23, 1.0F);
               this.a.long.a(var1, var25, var11);
            }
         } else {
            var11 = var25.d().a(var25, 0);
            var22 = (float)(var11 >> 16 & 255) / 255.0F;
            var27 = (float)(var11 >> 8 & 255) / 255.0F;
            var26 = (float)(var11 & 255) / 255.0F;
            GL11.glColor4f(var22, var27, var26, 1.0F);
            this.a.long.a(var1, var25, 0);
         }

         GL11.glPopMatrix();
      }

   }

   protected void a(aek var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   protected void a(aek var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      if (var10 < 100.0D) {
         nl var12 = var1.ct();
         np var13 = var12.if(2);
         if (var13 != null) {
            nn var14 = var12.a(var1.aB(), var13);
            if (var1.cg()) {
               this.a(var1, var14.for() + " " + var13.for(), var2, var4 - 1.5D, var6, 64);
            } else {
               this.a(var1, var14.for() + " " + var13.for(), var2, var4, var6, 64);
            }

            var4 += (double)((float)this.a().i * 1.15F * var9);
         }
      }

      super.a(var1, var2, var4, var6, var8, var9, var10);
   }

   public void a(aek var1) {
      float var2 = 1.0F;
      GL11.glColor3f(var2, var2, var2);
      this.t.try = 0.0F;
      this.t.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
      this.t.aP.for(0.0625F);
   }

   protected void a(aek var1, double var2, double var4, double var6) {
      if (var1.aA() && var1.cg()) {
         super.a(var1, var2 + (double)var1.f0, var4 + (double)var1.fB, var6 + (double)var1.fZ);
      } else {
         super.a(var1, var2, var4, var6);
      }

   }

   protected void a(aek var1, float var2, float var3, float var4) {
      if (var1.aA() && var1.cg()) {
         GL11.glRotatef(var1.cR(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(this.a(var1), 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
      } else {
         super.a(var1, var2, var3, var4);
      }

   }

   protected void a(aig var1, double var2, double var4, double var6, String var8, float var9, double var10) {
      this.a((aek)var1, var2, var4, var6, var8, var9, var10);
   }

   protected void int(aig var1, float var2) {
      this.a((aek)var1, var2);
   }

   protected void if(aig var1, int var2, float var3) {
      this.if((aek)var1, var2, var3);
   }

   protected int do(aig var1, int var2, float var3) {
      return this.a((aek)var1, var2, var3);
   }

   protected void do(aig var1, float var2) {
      this.if((aek)var1, var2);
   }

   protected void a(aig var1, float var2, float var3, float var4) {
      this.a((aek)var1, var2, var3, var4);
   }

   protected void a(aig var1, double var2, double var4, double var6) {
      this.a((aek)var1, var2, var4, var6);
   }

   protected void if(aig var1) {
      this.if((aek)var1);
   }

   public void a(aig var1, double var2, double var4, double var6, float var8, float var9) {
      this.a((aek)var1, var2, var4, var6, var8, var9);
   }

   public void do(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      this.a((aek)var1, var2, var4, var6, var8, var9);
   }
}
