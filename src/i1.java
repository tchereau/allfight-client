import java.util.Date;

class i1 extends i3 {
   // $FF: synthetic field
   final i2 t;

   public i1(i2 var1) {
      super(var1.hW, var1.hV, var1.hU, 32, var1.hU - 64, 36);
      this.t = var1;
   }

   protected int new() {
      return i2.case(this.t).size();
   }

   protected void a(int var1, boolean var2) {
      i2.a(this.t, var1);
      boolean var3 = i2.if(this.t) >= 0 && i2.if(this.t) < this.new();
      i2.for(this.t).hu = var3;
      i2.try(this.t).hu = var3;
      i2.byte(this.t).hu = var3;
      i2.new(this.t).hu = var3;
      if (var2 && var3) {
         this.t.aa(var1);
      }

   }

   protected boolean a(int var1) {
      return var1 == i2.if(this.t);
   }

   protected int if() {
      return i2.case(this.t).size() * 36;
   }

   protected void int() {
      this.t.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      sf var6 = (sf)i2.case(this.t).get(var1);
      String var7 = var6.int();
      if (var7 == null || ajs.a(var7)) {
         var7 = i2.a(this.t) + " " + (var1 + 1);
      }

      String var8 = var6.try();
      var8 = var8 + " (" + i2.char(this.t).format(new Date(var6.new()));
      var8 = var8 + ")";
      String var9 = "";
      if (var6.if()) {
         var9 = i2.do(this.t) + " " + var9;
      } else {
         var9 = i2.int(this.t)[var6.do().new()];
         if (var6.for()) {
            var9 = aqj.l + aqz.if("gameMode.hardcore") + aqj.int;
         }

         if (var6.a()) {
            var9 = var9 + ", " + aqz.if("selectWorld.cheats");
         }
      }

      this.t.if(this.t.hR, var7, var2 + 2, var3 + 1, 16777215);
      this.t.if(this.t.hR, var8, var2 + 2, var3 + 12, 8421504);
      this.t.if(this.t.hR, var9, var2 + 2, var3 + 12 + 10, 8421504);
   }
}
