public class i0 extends i5 {
   private final i5 lC;
   private j6 lB;
   private j6 lF;
   private String lD = "survival";
   private boolean lE = false;

   public i0(i5 var1) {
      this.lC = var1;
   }

   public void dA() {
      this.hT.clear();
      this.hT.add(new j6(101, this.hV / 2 - 155, this.hU - 28, 150, 20, aqz.if("lanServer.start")));
      this.hT.add(new j6(102, this.hV / 2 + 5, this.hU - 28, 150, 20, aqz.if("gui.cancel")));
      this.hT.add(this.lF = new j6(104, this.hV / 2 - 155, 100, 150, 20, aqz.if("selectWorld.gameMode")));
      this.hT.add(this.lB = new j6(103, this.hV / 2 + 5, 100, 150, 20, aqz.if("selectWorld.allowCommands")));
      this.d3();
   }

   private void d3() {
      aqy var1 = aqy.if();
      this.lF.hw = var1.a("selectWorld.gameMode") + " " + var1.a("selectWorld.gameMode." + this.lD);
      this.lB.hw = var1.a("selectWorld.allowCommands") + " ";
      StringBuilder var10000;
      j6 var10002;
      if (this.lE) {
         var10000 = new StringBuilder();
         var10002 = this.lB;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.on")).toString();
      } else {
         var10000 = new StringBuilder();
         var10002 = this.lB;
         var10002.hw = var10000.append(var10002.hw).append(var1.a("options.off")).toString();
      }

   }

   protected void a(j6 var1) {
      if (var1.hv == 102) {
         this.hW.a(this.lC);
      } else if (var1.hv == 104) {
         if (this.lD.equals("survival")) {
            this.lD = "creative";
         } else if (this.lD.equals("creative")) {
            this.lD = "adventure";
         } else {
            this.lD = "survival";
         }

         this.d3();
      } else if (var1.hv == 103) {
         this.lE = !this.lE;
         this.d3();
      } else if (var1.hv == 101) {
         this.hW.a((i5)null);
         String var2 = this.hW.hV().a(yz.a(this.lD), this.lE);
         String var3 = "";
         if (var2 != null) {
            var3 = this.hW.vk.a("commands.publish.started", new Object[]{var2});
         } else {
            var3 = this.hW.vk.a("commands.publish.failed", new Object[0]);
         }

         this.hW.u4.c5().else(var3);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, aqz.if("lanServer.title"), this.hV / 2, 50, 16777215);
      this.a(this.hR, aqz.if("lanServer.otherPlayers"), this.hV / 2, 82, 16777215);
      super.if(var1, var2, var3);
   }
}
