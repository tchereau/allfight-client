import org.lwjgl.opengl.GL11;

public class h0 extends il {
   private ajg o0;
   private ajg oZ;

   public h0(aen var1, ajg var2) {
      super(new adm(var1, var2));
      this.o0 = var1;
      this.oZ = var2;
      this.hS = false;
      this.oQ = 133;
   }

   protected void f(int var1, int var2) {
      this.hR.if(this.oZ.s() ? this.oZ.t() : aqz.if(this.oZ.t()), 8, 6, 4210752);
      this.hR.if(this.o0.s() ? this.o0.t() : aqz.if(this.o0.t()), 8, this.oQ - 96 + 2, 4210752);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/hopper.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
   }
}
