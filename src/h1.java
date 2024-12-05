import org.lwjgl.opengl.GL11;

public class h1 extends il {
   private oe o1;

   public h1(aen var1, oe var2) {
      super(new ado(var1, var2));
      this.o1 = var2;
   }

   protected void f(int var1, int var2) {
      String var3 = this.o1.s() ? this.o1.t() : aqz.if(this.o1.t());
      this.hR.if(var3, this.oR / 2 - this.hR.for(var3) / 2, 6, 4210752);
      this.hR.if(aqz.if("container.inventory"), 8, this.oQ - 96 + 2, 4210752);
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/furnace.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      int var6;
      if (this.o1.gs()) {
         var6 = this.o1.aM(12);
         this.if(var4 + 56, var5 + 36 + 12 - var6, 176, 12 - var6, 14, var6 + 2);
      }

      var6 = this.o1.aN(24);
      this.if(var4 + 79, var5 + 34, 176, 14, var6 + 1, 16);
   }
}
