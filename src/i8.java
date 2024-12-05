import org.lwjgl.opengl.GL11;

class i8 extends i3 {
   public int v;
   // $FF: synthetic field
   final ja u;

   public i8(ja var1) {
      super(var1.hW, var1.hV, var1.hU, 80, var1.hU - 37, 24);
      this.u = var1;
      this.v = -1;
   }

   private void a(int var1, int var2, int var3) {
      this.for(var1 + 1, var2 + 1);
      GL11.glEnable(32826);
      k1.a();
      ja.d8().do(this.u.hR, this.u.hW.vb, new abp(var3, 1, 0), var1 + 2, var2 + 2);
      k1.do();
      GL11.glDisable(32826);
   }

   private void for(int var1, int var2) {
      this.do(var1, var2, 0, 0);
   }

   private void do(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.u.hW.vb.for("/gui/slot.png");
      c4 var9 = c4.G;
      var9.if();
      var9.a((double)(var1 + 0), (double)(var2 + 18), (double)this.u.gH, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.a((double)(var1 + 18), (double)(var2 + 18), (double)this.u.gH, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.a((double)(var1 + 18), (double)(var2 + 0), (double)this.u.gH, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.u.gH, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.for();
   }

   protected int new() {
      return ja.d7().size();
   }

   protected void a(int var1, boolean var2) {
      this.v = var1;
      this.u.d9();
      ja.if(this.u).case(((i9)ja.d7().get(ja.a(this.u).v)).do);
   }

   protected boolean a(int var1) {
      return var1 == this.v;
   }

   protected void int() {
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      i9 var6 = (i9)ja.d7().get(var1);
      this.a(var2, var3, var6.if);
      this.u.hR.if(var6.a, var2 + 18 + 5, var3 + 6, 16777215);
   }
}
