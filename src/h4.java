import java.util.Collection;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public abstract class h4 extends il {
   private boolean pe;

   public h4(ad1 var1) {
      super(var1);
   }

   public void dA() {
      super.dA();
      if (!this.hW.vk.bi().isEmpty()) {
         this.oO = 160 + (this.hV - this.oR - 200) / 2;
         this.pe = true;
      }

   }

   public void if(int var1, int var2, float var3) {
      super.if(var1, var2, var3);
      if (this.pe) {
         this.ev();
      }

   }

   private void ev() {
      int var1 = this.oO - 124;
      int var2 = this.oN;
      Collection var4 = this.hW.vk.bi();
      if (!var4.isEmpty()) {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glDisable(2896);
         int var5 = 33;
         if (var4.size() > 5) {
            var5 = 132 / (var4.size() - 1);
         }

         for(Iterator var6 = this.hW.vk.bi().iterator(); var6.hasNext(); var2 += var5) {
            aiz var7 = (aiz)var6.next();
            ai0 var8 = ai0.A[var7.byte()];
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.hW.vb.for("/gui/inventory.png");
            this.if(var1, var2, 0, 166, 140, 32);
            if (var8.if()) {
               int var9 = var8.try();
               this.if(var1 + 6, var2 + 7, 0 + var9 % 8 * 18, 198 + var9 / 8 * 18, 18, 18);
            }

            String var11 = aqz.if(var8.byte());
            if (var7.int() == 1) {
               var11 = var11 + " II";
            } else if (var7.int() == 2) {
               var11 = var11 + " III";
            } else if (var7.int() == 3) {
               var11 = var11 + " IV";
            }

            this.hR.a(var11, var1 + 10 + 18, var2 + 6, 16777215);
            String var10 = ai0.a(var7);
            this.hR.a(var10, var1 + 10 + 18, var2 + 6 + 10, 8355711);
         }

      }
   }
}
