import org.lwjgl.opengl.GL11;

class jz extends i3 {
   public int B;
   // $FF: synthetic field
   final j0 A;

   public jz(j0 var1) {
      super(var1.hW, var1.hV, var1.hU, 43, var1.hU - 60, 24);
      this.A = var1;
      this.B = -1;
   }

   private void a(int var1, int var2, abp var3) {
      this.int(var1 + 1, var2 + 1);
      GL11.glEnable(32826);
      if (var3 != null) {
         k1.a();
         j0.ek().do(this.A.hR, this.A.hW.vb, var3, var1 + 2, var2 + 2);
         k1.do();
      }

      GL11.glDisable(32826);
   }

   private void int(int var1, int var2) {
      this.for(var1, var2, 0, 0);
   }

   private void for(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.A.hW.vb.for("/gui/slot.png");
      c4 var9 = c4.G;
      var9.if();
      var9.a((double)(var1 + 0), (double)(var2 + 18), (double)this.A.gH, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.a((double)(var1 + 18), (double)(var2 + 18), (double)this.A.gH, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.a((double)(var1 + 18), (double)(var2 + 0), (double)this.A.gH, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.A.gH, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.for();
   }

   protected int new() {
      return j0.a(this.A).a().size();
   }

   protected void a(int var1, boolean var2) {
      this.B = var1;
      this.A.el();
   }

   protected boolean a(int var1) {
      return var1 == this.B;
   }

   protected void int() {
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      wd var6 = (wd)j0.a(this.A).a().get(j0.a(this.A).a().size() - var1 - 1);
      abp var7 = var6.if() == 0 ? null : new abp(var6.if(), 1, var6.a());
      String var8 = var7 == null ? "Air" : abr.ai[var6.if()].byte(var7);
      this.a(var2, var3, var7);
      this.A.hR.if(var8, var2 + 18 + 5, var3 + 3, 16777215);
      String var9;
      if (var1 == 0) {
         var9 = aqz.a("createWorld.customize.flat.layer.top", var6.do());
      } else if (var1 == j0.a(this.A).a().size() - 1) {
         var9 = aqz.a("createWorld.customize.flat.layer.bottom", var6.do());
      } else {
         var9 = aqz.a("createWorld.customize.flat.layer", var6.do());
      }

      this.A.hR.if(var9, var2 + 2 + 213 - this.A.hR.for(var9), var3 + 3, 16777215);
   }

   protected int a() {
      return this.A.hV - 70;
   }
}
