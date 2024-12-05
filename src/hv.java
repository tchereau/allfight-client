import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class hv extends i5 {
   private static final String kv;
   protected String kw = "Edit sign message:";
   private n7 kA;
   private int ky;
   private int kz = 0;
   private j6 kx;

   public hv(n7 var1) {
      this.kA = var1;
   }

   public void dA() {
      this.hT.clear();
      Keyboard.enableRepeatEvents(true);
      this.hT.add(this.kx = new j6(0, this.hV / 2 - 100, this.hU / 4 + 120, "Done"));
      this.kA.a(false);
   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
      e5 var1 = this.hW.hU();
      if (var1 != null) {
         var1.for((an7)(new ang(this.kA.new, this.kA.int, this.kA.for, this.kA.i)));
      }

      this.kA.a(true);
   }

   public void dG() {
      ++this.ky;
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 0) {
            this.kA.case();
            this.hW.a((i5)null);
         }

      }
   }

   protected void if(char var1, int var2) {
      if (var2 == 200) {
         this.kz = this.kz - 1 & 3;
      }

      if (var2 == 208 || var2 == 28) {
         this.kz = this.kz + 1 & 3;
      }

      if (var2 == 14 && this.kA.i[this.kz].length() > 0) {
         this.kA.i[this.kz] = this.kA.i[this.kz].substring(0, this.kA.i[this.kz].length() - 1);
      }

      if (kv.indexOf(var1) >= 0 && this.kA.i[this.kz].length() < 15) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10002 = this.kA.i;
         int var10004 = this.kz;
         var10002[var10004] = var10000.append(var10002[var10004]).append(var1).toString();
      }

      if (var2 == 1) {
         this.a(this.kx);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.kw, this.hV / 2, 40, 16777215);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.hV / 2), 0.0F, 50.0F);
      float var4 = 93.75F;
      GL11.glScalef(-var4, -var4, -var4);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
      pa var5 = this.kA.else();
      if (var5 == pa.cp) {
         float var6 = (float)(this.kA.try() * 360) / 16.0F;
         GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      } else {
         int var8 = this.kA.try();
         float var7 = 0.0F;
         if (var8 == 2) {
            var7 = 180.0F;
         }

         if (var8 == 4) {
            var7 = 90.0F;
         }

         if (var8 == 5) {
            var7 = -90.0F;
         }

         GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      }

      if (this.ky / 6 % 2 == 0) {
         this.kA.h = this.kz;
      }

      az.void.a(this.kA, -0.5D, -0.75D, -0.5D, 0.0F);
      this.kA.h = -1;
      GL11.glPopMatrix();
      super.if(var1, var2, var3);
   }

   static {
      kv = apc.if;
   }
}
