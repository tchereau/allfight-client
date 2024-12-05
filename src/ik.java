import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class ik extends il {
   private oo px;
   private ii pw;
   private boolean pv;

   public ik(aen var1, oo var2) {
      super(new ad0(var1, var2));
      this.px = var2;
      this.oR = 230;
      this.oQ = 219;
   }

   public void dA() {
      super.dA();
      this.hT.add(this.pw = new ii(this, -1, this.oO + 164, this.oN + 107));
      this.hT.add(new ij(this, -2, this.oO + 190, this.oN + 107));
      this.pv = true;
      this.pw.hu = false;
   }

   public void dG() {
      super.dG();
      if (this.pv && this.px.B() >= 0) {
         this.pv = false;

         int var2;
         int var3;
         int var4;
         int var5;
         ih var6;
         for(int var1 = 0; var1 <= 2; ++var1) {
            var2 = oo.K[var1].length;
            var3 = var2 * 22 + (var2 - 1) * 2;

            for(var4 = 0; var4 < var2; ++var4) {
               var5 = oo.K[var1][var4].try;
               var6 = new ih(this, var1 << 8 | var5, this.oO + 76 + var4 * 24 - var3 / 2, this.oN + 22 + var1 * 25, var5, var1);
               this.hT.add(var6);
               if (var1 >= this.px.B()) {
                  var6.hu = false;
               } else if (var5 == this.px.y()) {
                  var6.m(true);
               }
            }
         }

         byte var7 = 3;
         var2 = oo.K[var7].length + 1;
         var3 = var2 * 22 + (var2 - 1) * 2;

         for(var4 = 0; var4 < var2 - 1; ++var4) {
            var5 = oo.K[var7][var4].try;
            var6 = new ih(this, var7 << 8 | var5, this.oO + 167 + var4 * 24 - var3 / 2, this.oN + 47, var5, var7);
            this.hT.add(var6);
            if (var7 >= this.px.B()) {
               var6.hu = false;
            } else if (var5 == this.px.z()) {
               var6.m(true);
            }
         }

         if (this.px.y() > 0) {
            ih var8 = new ih(this, var7 << 8 | this.px.y(), this.oO + 167 + (var2 - 1) * 24 - var3 / 2, this.oN + 47, this.px.y(), var7);
            this.hT.add(var8);
            if (var7 >= this.px.B()) {
               var8.hu = false;
            } else if (this.px.y() == this.px.z()) {
               var8.m(true);
            }
         }
      }

      this.pw.hu = this.px.do(0) != null && this.px.y() > 0;
   }

   protected void a(j6 var1) {
      if (var1.hv == -2) {
         this.hW.a((i5)null);
      } else if (var1.hv == -1) {
         String var2 = "MC|Beacon";
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);

         try {
            var4.writeInt(this.px.y());
            var4.writeInt(this.px.z());
            this.hW.hU().for((an7)(new aov(var2, var3.toByteArray())));
         } catch (Exception var6) {
            var6.printStackTrace();
         }

         this.hW.a((i5)null);
      } else if (var1 instanceof ih) {
         if (((ih)var1).du()) {
            return;
         }

         int var7 = var1.hv;
         int var8 = var7 & 255;
         int var9 = var7 >> 8;
         if (var9 < 3) {
            this.px.for(var8);
         } else {
            this.px.new(var8);
         }

         this.hT.clear();
         this.dA();
         this.dG();
      }

   }

   protected void f(int var1, int var2) {
      k1.do();
      this.a(this.hR, aqz.if("tile.beacon.primary"), 62, 10, 14737632);
      this.a(this.hR, aqz.if("tile.beacon.secondary"), 169, 10, 14737632);
      Iterator var3 = this.hT.iterator();

      while(var3.hasNext()) {
         j6 var4 = (j6)var3.next();
         if (var4.dt()) {
            var4.else(var1 - this.oO, var2 - this.oN);
            break;
         }
      }

      k1.a();
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/beacon.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      oS.c = 100.0F;
      oS.a(this.hR, this.hW.vb, new abp(abr.bP), var4 + 42, var5 + 109);
      oS.a(this.hR, this.hW.vb, new abp(abr.P), var4 + 42 + 22, var5 + 109);
      oS.a(this.hR, this.hW.vb, new abp(abr.L), var4 + 42 + 44, var5 + 109);
      oS.a(this.hR, this.hW.vb, new abp(abr.N), var4 + 42 + 66, var5 + 109);
      oS.c = 0.0F;
   }
}
