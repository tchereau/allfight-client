import org.lwjgl.opengl.GL11;

public class hu extends il {
   public oi oT;

   public hu(aen var1, oi var2) {
      super(new ac7(var1, var2));
      this.oT = var2;
   }

   protected void f(int var1, int var2) {
      String var3 = this.oT.s() ? this.oT.t() : aqz.if(this.oT.t());
      this.hR.if(var3, this.oR / 2 - this.hR.for(var3) / 2, 6, 4210752);
      this.hR.if(aqz.if("container.inventory"), 8, this.oQ - 96 + 2, 4210752);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/trap.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
   }
}
