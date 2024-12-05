import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class h2 extends il {
   private static f8 o6 = new f8();
   private Random o5 = new Random();
   private adr o4;
   public int o2;
   public float pd;
   public float pc;
   public float pb;
   public float pa;
   public float o9;
   public float o8;
   abp o7;
   private String o3;

   public h2(aen var1, y6 var2, int var3, int var4, int var5, String var6) {
      super(new adr(var1, var2, var3, var4, var5));
      this.o4 = (adr)this.oP;
      this.o3 = var6;
   }

   protected void f(int var1, int var2) {
      this.hR.if(this.o3 == null ? aqz.if("container.enchant") : this.o3, 12, 5, 4210752);
      this.hR.if(aqz.if("container.inventory"), 8, this.oQ - 96 + 2, 4210752);
   }

   public void dG() {
      super.dG();
      this.eu();
   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;

      for(int var6 = 0; var6 < 3; ++var6) {
         int var7 = var1 - (var4 + 60);
         int var8 = var2 - (var5 + 14 + 19 * var6);
         if (var7 >= 0 && var8 >= 0 && var7 < 108 && var8 < 19 && this.o4.a(this.hW.vk, var6)) {
            this.hW.vp.a(this.o4.new, var6);
         }
      }

   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/enchant.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GL11.glLoadIdentity();
      i4 var6 = new i4(this.hW.u1, this.hW.vo, this.hW.vn);
      GL11.glViewport((var6.int() - 320) / 2 * var6.do(), (var6.if() - 240) / 2 * var6.do(), 320 * var6.do(), 240 * var6.do());
      GL11.glTranslatef(-0.34F, 0.23F, 0.0F);
      GLU.gluPerspective(90.0F, 1.3333334F, 9.0F, 80.0F);
      float var7 = 1.0F;
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      k1.if();
      GL11.glTranslatef(0.0F, 3.3F, -16.0F);
      GL11.glScalef(var7, var7, var7);
      float var8 = 5.0F;
      GL11.glScalef(var8, var8, var8);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      this.hW.vb.for("/item/book.png");
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      float var9 = this.o8 + (this.o9 - this.o8) * var1;
      GL11.glTranslatef((1.0F - var9) * 0.2F, (1.0F - var9) * 0.1F, (1.0F - var9) * 0.25F);
      GL11.glRotatef(-(1.0F - var9) * 90.0F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      float var10 = this.pc + (this.pd - this.pc) * var1 + 0.25F;
      float var11 = this.pc + (this.pd - this.pc) * var1 + 0.75F;
      var10 = (var10 - (float)ajs.if((double)var10)) * 1.6F - 0.3F;
      var11 = (var11 - (float)ajs.if((double)var11)) * 1.6F - 0.3F;
      if (var10 < 0.0F) {
         var10 = 0.0F;
      }

      if (var11 < 0.0F) {
         var11 = 0.0F;
      }

      if (var10 > 1.0F) {
         var10 = 1.0F;
      }

      if (var11 > 1.0F) {
         var11 = 1.0F;
      }

      GL11.glEnable(32826);
      o6.a((aiw)null, 0.0F, var10, var11, var9, 0.0F, 0.0625F);
      GL11.glDisable(32826);
      k1.do();
      GL11.glMatrixMode(5889);
      GL11.glViewport(0, 0, this.hW.vo, this.hW.vn);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      k1.do();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/enchant.png");
      h3.if.a(this.o4.A);

      for(int var12 = 0; var12 < 3; ++var12) {
         String var13 = h3.if.a();
         this.gH = 0.0F;
         this.hW.vb.for("/gui/enchant.png");
         int var14 = this.o4.z[var12];
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var14 == 0) {
            this.if(var4 + 60, var5 + 14 + 19 * var12, 0, 185, 108, 19);
         } else {
            String var15 = "" + var14;
            jq var16 = this.hW.u9;
            int var17 = 6839882;
            if (this.hW.vk.fX < var14 && !this.hW.vk.fY.new) {
               this.if(var4 + 60, var5 + 14 + 19 * var12, 0, 185, 108, 19);
               var16.a(var13, var4 + 62, var5 + 16 + 19 * var12, 104, (var17 & 16711422) >> 1);
               var16 = this.hW.va;
               var17 = 4226832;
               var16.a(var15, var4 + 62 + 104 - var16.for(var15), var5 + 16 + 19 * var12 + 7, var17);
            } else {
               int var18 = var2 - (var4 + 60);
               int var19 = var3 - (var5 + 14 + 19 * var12);
               if (var18 >= 0 && var19 >= 0 && var18 < 108 && var19 < 19) {
                  this.if(var4 + 60, var5 + 14 + 19 * var12, 0, 204, 108, 19);
                  var17 = 16777088;
               } else {
                  this.if(var4 + 60, var5 + 14 + 19 * var12, 0, 166, 108, 19);
               }

               var16.a(var13, var4 + 62, var5 + 16 + 19 * var12, 104, var17);
               var16 = this.hW.va;
               var17 = 8453920;
               var16.a(var15, var4 + 62 + 104 - var16.for(var15), var5 + 16 + 19 * var12 + 7, var17);
            }
         }
      }

   }

   public void eu() {
      abp var1 = this.oP.do(0).for();
      if (!abp.if(var1, this.o7)) {
         this.o7 = var1;

         do {
            this.pb += (float)(this.o5.nextInt(4) - this.o5.nextInt(4));
         } while(this.pd <= this.pb + 1.0F && this.pd >= this.pb - 1.0F);
      }

      ++this.o2;
      this.pc = this.pd;
      this.o8 = this.o9;
      boolean var2 = false;

      for(int var3 = 0; var3 < 3; ++var3) {
         if (this.o4.z[var3] != 0) {
            var2 = true;
         }
      }

      if (var2) {
         this.o9 += 0.2F;
      } else {
         this.o9 -= 0.2F;
      }

      if (this.o9 < 0.0F) {
         this.o9 = 0.0F;
      }

      if (this.o9 > 1.0F) {
         this.o9 = 1.0F;
      }

      float var5 = (this.pb - this.pd) * 0.4F;
      float var4 = 0.2F;
      if (var5 < -var4) {
         var5 = -var4;
      }

      if (var5 > var4) {
         var5 = var4;
      }

      this.pa += (var5 - this.pa) * 0.9F;
      this.pd += this.pa;
   }
}
