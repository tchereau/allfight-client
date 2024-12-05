import java.util.List;
import net.minecraft.client.Minecraft;

public class hl extends i5 {
   protected hr jC;
   private int jB = -1;
   private hk jI;
   private iy jG;
   private go jH;
   private List jF;
   private String jE;
   private String jD;

   public hl(hr var1, List var2, go var3, String var4, String var5) {
      this.jC = var1;
      this.jF = var2;
      this.jH = var3;
      this.jE = var4;
      this.jD = var5;
   }

   public void dA() {
      aqy var1 = aqy.if();
      this.hT.add(this.jG = new iy(6, this.hV / 2 - 75, this.hU - 38, var1.a("gui.done")));
      this.jI = new hk(this);
      this.jI.a(this.hT, 7, 8);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         switch(var1.hv) {
         case 5:
            break;
         case 6:
            this.jC.a(this.jH, this.jE, this.jD);
            this.hW.a((i5)this.jC);
            break;
         default:
            this.jI.a(var1);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.jI.a(var1, var2, var3);
      if (this.jB <= 0) {
         this.hW.uT.char();
         this.jB += 20;
      }

      aqy var4 = aqy.if();
      this.a(this.hR, var4.a("mco.create.world.location.title"), this.hV / 2, 16, 16777215);
      this.a(this.hR, "(" + var4.a("mco.create.world.location.warning") + ")", this.hV / 2, this.hU - 56, 8421504);
      super.if(var1, var2, var3);
   }

   public void dG() {
      super.dG();
      --this.jB;
   }

   // $FF: synthetic method
   static Minecraft if(hl var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static List do(hl var0) {
      return var0.jF;
   }

   // $FF: synthetic method
   static go a(hl var0, go var1) {
      return var0.jH = var1;
   }

   // $FF: synthetic method
   static iy new(hl var0) {
      return var0.jG;
   }

   // $FF: synthetic method
   static go for(hl var0) {
      return var0.jH;
   }

   // $FF: synthetic method
   static jq a(hl var0) {
      return var0.hR;
   }

   // $FF: synthetic method
   static jq int(hl var0) {
      return var0.hR;
   }
}
