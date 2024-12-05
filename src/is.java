import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class is extends i5 {
   private static cb k4 = new cb();
   protected i5 kY;
   protected String kX = "Select world";
   private ip k2;
   private io k3;
   private ir k1;
   private v k0;
   private i3 kZ = null;

   public is(i5 var1, v var2) {
      this.kY = var1;
      this.k0 = var2;
   }

   public void dA() {
      this.kX = aqz.if("gui.stats");
      this.k2 = new ip(this);
      this.k2.a(this.hT, 1, 1);
      this.k3 = new io(this);
      this.k3.a(this.hT, 1, 1);
      this.k1 = new ir(this);
      this.k1.a(this.hT, 1, 1);
      this.kZ = this.k2;
      this.d1();
   }

   public void d1() {
      aqy var1 = aqy.if();
      this.hT.add(new j6(0, this.hV / 2 + 4, this.hU - 28, 150, 20, var1.a("gui.done")));
      this.hT.add(new j6(1, this.hV / 2 - 154, this.hU - 52, 100, 20, var1.a("stat.generalButton")));
      j6 var2;
      this.hT.add(var2 = new j6(2, this.hV / 2 - 46, this.hU - 52, 100, 20, var1.a("stat.blocksButton")));
      j6 var3;
      this.hT.add(var3 = new j6(3, this.hV / 2 + 62, this.hU - 52, 100, 20, var1.a("stat.itemsButton")));
      if (this.k1.new() == 0) {
         var2.hu = false;
      }

      if (this.k3.new() == 0) {
         var3.hu = false;
      }

   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == 0) {
            this.hW.a(this.kY);
         } else if (var1.hv == 1) {
            this.kZ = this.k2;
         } else if (var1.hv == 3) {
            this.kZ = this.k3;
         } else if (var1.hv == 2) {
            this.kZ = this.k1;
         } else {
            this.kZ.a(var1);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.kZ.a(var1, var2, var3);
      this.a(this.hR, this.kX, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
   }

   private void goto(int var1, int var2, int var3) {
      this.void(var1 + 1, var2 + 1);
      GL11.glEnable(32826);
      k1.a();
      k4.do(this.hR, this.hW.vb, new abp(var3, 1, 0), var1 + 2, var2 + 2);
      k1.do();
      GL11.glDisable(32826);
   }

   private void void(int var1, int var2) {
      this.char(var1, var2, 0, 0);
   }

   private void char(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/slot.png");
      c4 var9 = c4.G;
      var9.if();
      var9.a((double)(var1 + 0), (double)(var2 + 18), (double)this.gH, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.a((double)(var1 + 18), (double)(var2 + 18), (double)this.gH, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.a((double)(var1 + 18), (double)(var2 + 0), (double)this.gH, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.a((double)(var1 + 0), (double)(var2 + 0), (double)this.gH, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.for();
   }

   // $FF: synthetic method
   static Minecraft int(is var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static jq do(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static v case(is var0) {
      return var0.k0;
   }

   // $FF: synthetic method
   static jq else(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq long(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static Minecraft void(is var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static void a(is var0, int var1, int var2, int var3, int var4) {
      var0.char(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   static Minecraft try(is var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static jq b(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq a(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq if(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq for(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq byte(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static void a(is var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static jq goto(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq new(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static void if(is var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.a(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static jq char(is var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static void a(is var0, int var1, int var2, int var3) {
      var0.goto(var1, var2, var3);
   }
}
