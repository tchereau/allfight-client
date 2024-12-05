import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class jx extends i5 {
   private int mW;

   public void dA() {
      this.hT.clear();
      if (this.hW.vm.l().void()) {
         if (this.hW.hT()) {
            this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 96, aqz.if("deathScreen.deleteWorld")));
         } else {
            this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 96, aqz.if("deathScreen.leaveServer")));
         }
      } else {
         this.hT.add(new j6(1, this.hV / 2 - 100, this.hU / 4 + 72, aqz.if("deathScreen.respawn")));
         this.hT.add(new j6(2, this.hV / 2 - 100, this.hU / 4 + 96, aqz.if("deathScreen.titleScreen")));
         if (this.hW.vg == null) {
            ((j6)this.hT.get(1)).hu = false;
         }
      }

      j6 var2;
      for(Iterator var1 = this.hT.iterator(); var1.hasNext(); var2.hu = false) {
         var2 = (j6)var1.next();
      }

   }

   protected void if(char var1, int var2) {
   }

   protected void a(j6 var1) {
      switch(var1.hv) {
      case 1:
         this.hW.vk.cK();
         this.hW.a((i5)null);
         break;
      case 2:
         this.hW.vm.u();
         this.hW.a((ex)null);
         this.hW.a((i5)(new x()));
      }

   }

   public void if(int var1, int var2, float var3) {
      this.a(0, 0, this.hV, this.hU, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      boolean var4 = this.hW.vm.l().void();
      String var5 = var4 ? aqz.if("deathScreen.title.hardcore") : aqz.if("deathScreen.title");
      this.a(this.hR, var5, this.hV / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      if (var4) {
         this.a(this.hR, aqz.if("deathScreen.hardcoreInfo"), this.hV / 2, 144, 16777215);
      }

      this.a(this.hR, aqz.if("deathScreen.score") + ": " + aqj.b + this.hW.vk.cJ(), this.hV / 2, 100, 16777215);
      super.if(var1, var2, var3);
   }

   public boolean dy() {
      return false;
   }

   public void dG() {
      super.dG();
      ++this.mW;
      j6 var2;
      if (this.mW == 20) {
         for(Iterator var1 = this.hT.iterator(); var1.hasNext(); var2.hu = true) {
            var2 = (j6)var1.next();
         }
      }

   }
}
