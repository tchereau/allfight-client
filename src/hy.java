import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import org.lwjgl.opengl.GL11;

public class hy extends il {
   private zn oY;
   private hx oX;
   private hx oW;
   private int oV = 0;
   private String oU;

   public hy(aen var1, zn var2, y6 var3, String var4) {
      super(new adh(var1, var2, var3));
      this.oY = var2;
      this.oU = var4 != null && var4.length() >= 1 ? var4 : aqz.if("entity.Villager.name");
   }

   public void dA() {
      super.dA();
      int var1 = (this.hV - this.oR) / 2;
      int var2 = (this.hU - this.oQ) / 2;
      this.hT.add(this.oX = new hx(1, var1 + 120 + 27, var2 + 24 - 1, true));
      this.hT.add(this.oW = new hx(2, var1 + 36 - 19, var2 + 24 - 1, false));
      this.oX.hu = false;
      this.oW.hu = false;
   }

   protected void f(int var1, int var2) {
      this.hR.if(this.oU, this.oR / 2 - this.hR.for(this.oU) / 2, 6, 4210752);
      this.hR.if(aqz.if("container.inventory"), 8, this.oQ - 96 + 2, 4210752);
   }

   public void dG() {
      super.dG();
      zl var1 = this.oY.char(this.hW.vk);
      if (var1 != null) {
         this.oX.hu = this.oV < var1.size() - 1;
         this.oW.hu = this.oV > 0;
      }

   }

   protected void a(j6 var1) {
      boolean var2 = false;
      if (var1 == this.oX) {
         ++this.oV;
         var2 = true;
      } else if (var1 == this.oW) {
         --this.oV;
         var2 = true;
      }

      if (var2) {
         ((adh)this.oP).int(this.oV);
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);

         try {
            var4.writeInt(this.oV);
            this.hW.hU().for((an7)(new aov("MC|TrSel", var3.toByteArray())));
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }

   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/trading.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      zl var6 = this.oY.char(this.hW.vk);
      if (var6 != null && !var6.isEmpty()) {
         int var7 = this.oV;
         zm var8 = (zm)var6.get(var7);
         if (var8.new()) {
            this.hW.vb.for("/gui/trading.png");
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(2896);
            this.if(this.oO + 83, this.oN + 21, 212, 0, 28, 21);
            this.if(this.oO + 83, this.oN + 51, 212, 0, 28, 21);
         }
      }

   }

   public void if(int var1, int var2, float var3) {
      super.if(var1, var2, var3);
      zl var4 = this.oY.char(this.hW.vk);
      if (var4 != null && !var4.isEmpty()) {
         int var5 = (this.hV - this.oR) / 2;
         int var6 = (this.hU - this.oQ) / 2;
         int var7 = this.oV;
         zm var8 = (zm)var4.get(var7);
         GL11.glPushMatrix();
         abp var9 = var8.byte();
         abp var10 = var8.for();
         abp var11 = var8.if();
         k1.a();
         GL11.glDisable(2896);
         GL11.glEnable(32826);
         GL11.glEnable(2903);
         GL11.glEnable(2896);
         oS.c = 100.0F;
         oS.a(this.hR, this.hW.vb, var9, var5 + 36, var6 + 24);
         oS.if(this.hR, this.hW.vb, var9, var5 + 36, var6 + 24);
         if (var10 != null) {
            oS.a(this.hR, this.hW.vb, var10, var5 + 62, var6 + 24);
            oS.if(this.hR, this.hW.vb, var10, var5 + 62, var6 + 24);
         }

         oS.a(this.hR, this.hW.vb, var11, var5 + 120, var6 + 24);
         oS.if(this.hR, this.hW.vb, var11, var5 + 120, var6 + 24);
         oS.c = 0.0F;
         GL11.glDisable(2896);
         if (this.do(36, 24, 16, 16, var1, var2)) {
            this.a(var9, var1, var2);
         } else if (var10 != null && this.do(62, 24, 16, 16, var1, var2)) {
            this.a(var10, var1, var2);
         } else if (this.do(120, 24, 16, 16, var1, var2)) {
            this.a(var11, var1, var2);
         }

         GL11.glPopMatrix();
         GL11.glEnable(2896);
         GL11.glEnable(2929);
         k1.if();
      }

   }

   public zn et() {
      return this.oY;
   }
}
