import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class kb implements ajo {
   private String lZ = "";
   private Minecraft lY;
   private String l2 = "";
   private long l1 = Minecraft.h1();
   private boolean l0 = false;

   public kb(Minecraft var1) {
      this.lY = var1;
   }

   public void m(String var1) {
      this.l0 = false;
      this.o(var1);
   }

   public void l(String var1) {
      this.l0 = true;
      this.o(var1);
   }

   public void o(String var1) {
      this.l2 = var1;
      if (!this.lY.uE) {
         if (!this.l0) {
            throw new j9();
         }
      } else {
         i4 var2 = new i4(this.lY.u1, this.lY.vo, this.lY.vn);
         GL11.glClear(256);
         GL11.glMatrixMode(5889);
         GL11.glLoadIdentity();
         GL11.glOrtho(0.0D, var2.for(), var2.a(), 0.0D, 100.0D, 300.0D);
         GL11.glMatrixMode(5888);
         GL11.glLoadIdentity();
         GL11.glTranslatef(0.0F, 0.0F, -200.0F);
      }
   }

   public void n(String var1) {
      if (!this.lY.uE) {
         if (!this.l0) {
            throw new j9();
         }
      } else {
         this.l1 = 0L;
         this.lZ = var1;
         this.ac(-1);
         this.l1 = 0L;
      }
   }

   public void ac(int var1) {
      if (!this.lY.uE) {
         if (!this.l0) {
            throw new j9();
         }
      } else {
         long var2 = Minecraft.h1();
         if (var2 - this.l1 >= 100L) {
            this.l1 = var2;
            i4 var4 = new i4(this.lY.u1, this.lY.vo, this.lY.vn);
            int var5 = var4.int();
            int var6 = var4.if();
            GL11.glClear(256);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0D, var4.for(), var4.a(), 0.0D, 100.0D, 300.0D);
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -200.0F);
            GL11.glClear(16640);
            c4 var7 = c4.G;
            this.lY.vb.for("/gui/background.png");
            float var8 = 32.0F;
            var7.if();
            var7.a(4210752);
            var7.a(0.0D, (double)var6, 0.0D, 0.0D, (double)((float)var6 / var8));
            var7.a((double)var5, (double)var6, 0.0D, (double)((float)var5 / var8), (double)((float)var6 / var8));
            var7.a((double)var5, 0.0D, 0.0D, (double)((float)var5 / var8), 0.0D);
            var7.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
            var7.for();
            if (var1 >= 0) {
               byte var9 = 100;
               byte var10 = 2;
               int var11 = var5 / 2 - var9 / 2;
               int var12 = var6 / 2 + 16;
               GL11.glDisable(3553);
               var7.if();
               var7.a(8421504);
               var7.if((double)var11, (double)var12, 0.0D);
               var7.if((double)var11, (double)(var12 + var10), 0.0D);
               var7.if((double)(var11 + var9), (double)(var12 + var10), 0.0D);
               var7.if((double)(var11 + var9), (double)var12, 0.0D);
               var7.a(8454016);
               var7.if((double)var11, (double)var12, 0.0D);
               var7.if((double)var11, (double)(var12 + var10), 0.0D);
               var7.if((double)(var11 + var1), (double)(var12 + var10), 0.0D);
               var7.if((double)(var11 + var1), (double)var12, 0.0D);
               var7.for();
               GL11.glEnable(3553);
            }

            this.lY.va.a(this.l2, (var5 - this.lY.va.for(this.l2)) / 2, var6 / 2 - 4 - 16, 16777215);
            this.lY.va.a(this.lZ, (var5 - this.lY.va.for(this.lZ)) / 2, var6 / 2 - 4 + 8, 16777215);
            Display.update();

            try {
               Thread.yield();
            } catch (Exception var13) {
            }

         }
      }
   }

   public void d6() {
   }
}
