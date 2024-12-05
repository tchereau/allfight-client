import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class hw extends il implements adv {
   private ade pA;
   private ju pz;
   private aen py;

   public hw(aen var1, y6 var2, int var3, int var4, int var5) {
      super(new ade(var1, var2, var3, var4, var5, Minecraft.ih().vk));
      this.py = var1;
      this.pA = (ade)this.oP;
   }

   public void dA() {
      super.dA();
      Keyboard.enableRepeatEvents(true);
      int var1 = (this.hV - this.oR) / 2;
      int var2 = (this.hU - this.oQ) / 2;
      this.pz = new ju(this.hR, var1 + 62, var2 + 24, 103, 12);
      this.pz.I(-1);
      this.pz.N(-1);
      this.pz.j(false);
      this.pz.M(30);
      this.oP.if((adv)this);
      this.oP.a((adv)this);
   }

   public void dF() {
      super.dF();
      Keyboard.enableRepeatEvents(false);
      this.oP.if((adv)this);
   }

   protected void f(int var1, int var2) {
      GL11.glDisable(2896);
      this.hR.if(aqz.if("container.repair"), 60, 6, 4210752);
      if (this.pA.g > 0) {
         int var3 = 8453920;
         boolean var4 = true;
         String var5 = aqz.a("container.repair.cost", this.pA.g);
         if (this.pA.g >= 40 && !this.hW.vk.fY.new) {
            var5 = aqz.if("container.repair.expensive");
            var3 = 16736352;
         } else if (!this.pA.do(2).do()) {
            var4 = false;
         } else if (!this.pA.do(2).a(this.py.Z)) {
            var3 = 16736352;
         }

         if (var4) {
            int var6 = -16777216 | (var3 & 16579836) >> 2 | var3 & -16777216;
            int var7 = this.oR - 8 - this.hR.for(var5);
            byte var8 = 67;
            if (this.hR.do()) {
               a(var7 - 3, var8 - 2, this.oR - 7, var8 + 10, -16777216);
               a(var7 - 2, var8 - 1, this.oR - 8, var8 + 9, -12895429);
            } else {
               this.hR.if(var5, var7, var8 + 1, var6);
               this.hR.if(var5, var7 + 1, var8, var6);
               this.hR.if(var5, var7 + 1, var8 + 1, var6);
            }

            this.hR.if(var5, var7, var8, var3);
         }
      }

      GL11.glEnable(2896);
   }

   protected void if(char var1, int var2) {
      if (this.pz.a(var1, var2)) {
         this.pA.a(this.pz.dc());
         this.hW.vk.gF.for((an7)(new aov("MC|ItemName", this.pz.dc().getBytes())));
      } else {
         super.if(var1, var2);
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.pz.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      super.if(var1, var2, var3);
      GL11.glDisable(2896);
      this.pz.db();
   }

   protected void for(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.hW.vb.for("/gui/repair.png");
      int var4 = (this.hV - this.oR) / 2;
      int var5 = (this.hU - this.oQ) / 2;
      this.if(var4, var5, 0, 0, this.oR, this.oQ);
      this.if(var4 + 59, var5 + 20, 0, this.oQ + (this.pA.do(0).do() ? 0 : 16), 110, 16);
      if ((this.pA.do(0).do() || this.pA.do(1).do()) && !this.pA.do(2).do()) {
         this.if(var4 + 99, var5 + 45, this.oR, 0, 28, 21);
      }

   }

   public void a(ad1 var1, List var2) {
      this.a(var1, 0, var1.do(0).for());
   }

   public void a(ad1 var1, int var2, abp var3) {
      if (var2 == 0) {
         this.pz.case(var3 == null ? "" : var3.void());
         this.pz.k(var3 != null);
         if (var3 != null) {
            this.pA.a(this.pz.dc());
            this.hW.vk.gF.for((an7)(new aov("MC|ItemName", this.pz.dc().getBytes())));
         }
      }

   }

   public void a(ad1 var1, int var2, int var3) {
   }
}
