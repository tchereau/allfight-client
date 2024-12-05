import org.lwjgl.opengl.GL11;

public class ic extends il {
   private on pu;

   public ic(aen var1, on var2) {
      super(new ady(var1, var2));
      this.pu = var2;
   }

   protected void f(int var1, int var2) {
      String var3 = this.pu.s() ? this.pu.t() : aqz.if(this.pu.t());
      this.hR.if(var3, this.oR / 2 - this.hR.for(var3) / 2, 6, 4210752);
      this.hR.if(aqz.if("container.inventory"), 8, this.oQ - 96 + 2, 4210752);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/alchemy.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      int var6 = this.pu.gw();
      if (var6 > 0) {
         int var7 = (int)(28.0F * (1.0F - (float)var6 / 400.0F));
         if (var7 > 0) {
            this.if(var4 + 97, var5 + 16, 176, 0, 9, var7);
         }

         int var8 = var6 / 2 % 7;
         switch(var8) {
         case 0:
            var7 = 29;
            break;
         case 1:
            var7 = 24;
            break;
         case 2:
            var7 = 20;
            break;
         case 3:
            var7 = 16;
            break;
         case 4:
            var7 = 11;
            break;
         case 5:
            var7 = 6;
            break;
         case 6:
            var7 = 0;
         }

         if (var7 > 0) {
            this.if(var4 + 65, var5 + 14 + 29 - var7, 185, 29 - var7, 12, var7);
         }
      }

   }
}
