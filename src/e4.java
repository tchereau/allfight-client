import net.minecraft.client.Minecraft;

class e4 extends i5 {
   // $FF: synthetic field
   final String iU;
   // $FF: synthetic field
   final e5 iT;

   e4(e5 var1, String var2) {
      this.iT = var1;
      this.iU = var2;
   }

   public void do(boolean var1, int var2) {
      this.hW = Minecraft.ih();
      if (this.hW.il() != null) {
         this.hW.il().if(var1);
         ep.a(this.hW.il());
      }

      if (var1) {
         this.hW.uT.a(this.iU);
      }

      this.hW.a((i5)null);
   }
}
