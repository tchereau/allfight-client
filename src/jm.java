public class jm extends j3 {
   public void dA() {
      super.dA();
      aqy var1 = aqy.if();
      this.hT.add(new j6(1, this.hV / 2 - 100, this.hU - 40, var1.a("multiplayer.stopSleeping")));
   }

   protected void if(char var1, int var2) {
      if (var2 == 1) {
         this.er();
      } else if (var2 == 28) {
         String var3 = this.nU.dc().trim();
         if (var3.length() > 0) {
            this.hW.vk.try(var3);
         }

         this.nU.case("");
         this.hW.u4.c5().dk();
      } else {
         super.if(var1, var2);
      }

   }

   protected void a(j6 var1) {
      if (var1.hv == 1) {
         this.er();
      } else {
         super.a((j6)var1);
      }

   }

   private void er() {
      e5 var1 = this.hW.vk.gF;
      var1.for((an7)(new an3(this.hW.vk, 3)));
   }
}
