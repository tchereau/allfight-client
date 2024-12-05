public class zj extends ajj {
   public final aqv if;
   public final String for;
   // $FF: synthetic field
   final zk do;

   public zj(zk var1, aqv var2) {
      super(var2.goto("Weight"));
      this.do = var1;
      aqv var3 = var2.char("Properties");
      String var4 = var2.new("Type");
      if (var4.equals("Minecart")) {
         if (var3 != null) {
            switch(var3.goto("Type")) {
            case 0:
               var4 = "MinecartRideable";
               break;
            case 1:
               var4 = "MinecartChest";
               break;
            case 2:
               var4 = "MinecartFurnace";
            }
         } else {
            var4 = "MinecartRideable";
         }
      }

      this.if = var3;
      this.for = var4;
   }

   public zj(zk var1, aqv var2, String var3) {
      super(1);
      this.do = var1;
      if (var3.equals("Minecart")) {
         if (var2 != null) {
            switch(var2.goto("Type")) {
            case 0:
               var3 = "MinecartRideable";
               break;
            case 1:
               var3 = "MinecartChest";
               break;
            case 2:
               var3 = "MinecartFurnace";
            }
         } else {
            var3 = "MinecartRideable";
         }
      }

      this.if = var2;
      this.for = var3;
   }

   public aqv a() {
      aqv var1 = new aqv();
      var1.a("Properties", this.if);
      var1.a("Type", this.for);
      var1.a("Weight", this.a);
      return var1;
   }
}
