import org.lwjgl.opengl.GL11;

public class ia extends il {
   private ajg pt;
   private ajg ps;
   private int pr = 0;

   public ia(ajg var1, ajg var2) {
      super(new adu(var1, var2));
      this.pt = var1;
      this.ps = var2;
      this.hS = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.pr = var2.r() / 9;
      this.oQ = var4 + this.pr * 18;
   }

   protected void f(int var1, int var2) {
      this.hR.if(this.ps.s() ? this.ps.t() : aqz.if(this.ps.t()), 8, 6, 4210752);
      this.hR.if(this.pt.s() ? this.pt.t() : aqz.if(this.pt.t()), 8, this.oQ - 96 + 2, 4210752);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/container.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.pr * 18 + 17);
      this.if(var4, var5 + this.pr * 18 + 17, 0, 126, this.oR, 96);
   }
}
