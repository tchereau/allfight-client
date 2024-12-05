import org.lwjgl.opengl.GL11;

public class h9 extends il {
   public h9(aen var1, y6 var2, int var3, int var4, int var5) {
      super(new ads(var1, var2, var3, var4, var5));
   }

   protected void f(int var1, int var2) {
      this.hR.if(aqz.if("container.crafting"), 28, 6, 4210752);
      this.hR.if(aqz.if("container.inventory"), 8, this.oQ - 96 + 2, 4210752);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/crafting.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
   }
}
