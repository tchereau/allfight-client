import org.lwjgl.opengl.GL11;

public class cd extends b4 {
   protected f1 G;
   protected float K;
   protected f1 J;
   protected f1 I;
   private static final String[] H = new String[]{"cloth", "chain", "iron", "diamond", "gold"};

   public cd(f1 var1, float var2) {
      this(var1, var2, 1.0F);
   }

   public cd(f1 var1, float var2, float var3) {
      super(var1, var2);
      this.G = var1;
      this.K = var3;
      this.int();
   }

   protected void int() {
      this.J = new f1(1.0F);
      this.I = new f1(0.5F);
   }

   protected int do(aig var1, int var2, float var3) {
      abp var4 = var1.s(3 - var2);
      if (var4 != null) {
         abr var5 = var4.d();
         if (var5 instanceof ac4) {
            ac4 var6 = (ac4)var5;
            this.a("/armor/" + H[var6.dT] + "_" + (var2 == 2 ? 2 : 1) + ".png");
            f1 var7 = var2 == 2 ? this.I : this.J;
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

   protected void if(aig var1, int var2, float var3) {
      abp var4 = var1.s(3 - var2);
      if (var4 != null) {
         abr var5 = var4.d();
         if (var5 instanceof ac4) {
            ac4 var6 = (ac4)var5;
            this.a("/armor/" + H[var6.dT] + "_" + (var2 == 2 ? 2 : 1) + "_b.png");
            float var7 = 1.0F;
            GL11.glColor3f(var7, var7, var7);
         }
      }

   }

   public void a(aig var1, double var2, double var4, double var6, float var8, float var9) {
      float var10 = 1.0F;
      GL11.glColor3f(var10, var10, var10);
      abp var11 = var1.bW();
      this.a(var1, var11);
      double var12 = var4 - (double)var1.aQ;
      if (var1.Q() && !(var1 instanceof dq)) {
         var12 -= 0.125D;
      }

      super.a(var1, var2, var12, var6, var8, var9);
      this.J.aG = this.I.aG = this.G.aG = false;
      this.J.aH = this.I.aH = this.G.aH = false;
      this.J.aI = this.I.aI = this.G.aI = 0;
   }

   protected void a(aig var1, abp var2) {
      this.J.aI = this.I.aI = this.G.aI = var2 != null ? 1 : 0;
      this.J.aH = this.I.aH = this.G.aH = var1.Q();
   }

   protected void do(aig var1, float var2) {
      float var3 = 1.0F;
      GL11.glColor3f(var3, var3, var3);
      super.do(var1, var2);
      abp var4 = var1.bW();
      abp var5 = var1.s(3);
      float var6;
      if (var5 != null) {
         GL11.glPushMatrix();
         this.G.aS.if(0.0625F);
         if (var5.d().A < 256) {
            if (c2.a(pa.x[var5.new].new())) {
               var6 = 0.625F;
               GL11.glTranslatef(0.0F, -0.25F, 0.0F);
               GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
               GL11.glScalef(var6, -var6, -var6);
            }

            this.a.long.a(var1, var5, 0);
         } else if (var5.d().A == abr.bv.A) {
            var6 = 1.0625F;
            GL11.glScalef(var6, -var6, -var6);
            String var7 = "";
            if (var5.a() && var5.b().try("SkullOwner")) {
               var7 = var5.b().new("SkullOwner");
            }

            a1.do.a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var5.new(), var7);
         }

         GL11.glPopMatrix();
      }

      if (var4 != null) {
         GL11.glPushMatrix();
         if (this.l.for) {
            var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.625F, 0.0F);
            GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
            GL11.glScalef(var6, var6, var6);
         }

         this.G.aP.if(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         if (var4.new < 256 && c2.a(pa.x[var4.new].new())) {
            var6 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var6 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(-var6, -var6, var6);
         } else if (var4.new == abr.W.A) {
            var6 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (var4.new == mod_saphir.G.A) {
            var6 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (var4.new == mod_emeraude.void.A) {
            var6 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (var4.new == mod_rubis.ap.A) {
            var6 = 0.625F;
            GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
            GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else if (abr.ai[var4.new].g()) {
            var6 = 0.625F;
            if (abr.ai[var4.new].else()) {
               GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
               GL11.glTranslatef(0.0F, -0.125F, 0.0F);
            }

            this.for();
            GL11.glScalef(var6, -var6, var6);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var6 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var6, var6, var6);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.a.long.a(var1, var4, 0);
         if (var4.d().do()) {
            this.a.long.a(var1, var4, 1);
         }

         GL11.glPopMatrix();
      }

   }

   protected void for() {
      GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
   }

   public void do(aiw var1, double var2, double var4, double var6, float var8, float var9) {
      this.a((aig)var1, var2, var4, var6, var8, var9);
   }
}
