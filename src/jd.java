public class jd extends i5 {
   private static final kc[] mk;
   private final i5 mn;
   private final ke mm;
   protected String ml = "Options";

   public jd(i5 var1, ke var2) {
      this.mn = var1;
      this.mm = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      this.ml = var1.a("options.title");
      kc[] var3 = mk;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         if (var6.if()) {
            this.hT.add(new iz(var6.a(), this.hV / 2 - 155 + var2 % 2 * 160, this.hU / 6 - 12 + 24 * (var2 >> 1), var6, this.mm.do(var6), this.mm.a(var6)));
         } else {
            iy var7 = new iy(var6.a(), this.hV / 2 - 155 + var2 % 2 * 160, this.hU / 6 - 12 + 24 * (var2 >> 1), var6, this.mm.do(var6));
            if (var6 == kc.F && this.hW.vm != null && this.hW.vm.l().void()) {
               var7.hu = false;
               var7.hw = aqz.if("options.difficulty") + ": " + aqz.if("options.difficulty.hardcore");
            }

            this.hT.add(var7);
         }

         ++var2;
      }

      this.hT.add(new j6(101, this.hV / 2 - 152, this.hU / 6 + 96 - 6, 150, 20, var1.a("options.video")));
      this.hT.add(new j6(100, this.hV / 2 + 2, this.hU / 6 + 96 - 6, 150, 20, var1.a("options.controls")));
      this.hT.add(new j6(102, this.hV / 2 - 152, this.hU / 6 + 120 - 6, 150, 20, var1.a("options.language")));
      this.hT.add(new j6(103, this.hV / 2 + 2, this.hU / 6 + 120 - 6, 150, 20, var1.a("options.multiplayer.title")));
      this.hT.add(new j6(104, this.hV / 2 + 2, this.hU / 6 + 144 - 6, 150, 20, var1.a("options.snooper.view")));
      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.mm.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.mm.do(kc.a(var1.hv));
         }

         if (var1.hv == 101) {
            this.hW.u1.new();
            this.hW.a((i5)(new iv(this, this.mm)));
         }

         if (var1.hv == 100) {
            this.hW.u1.new();
            this.hW.a((i5)(new j1(this, this.mm)));
         }

         if (var1.hv == 102) {
            this.hW.u1.new();
            this.hW.a((i5)(new jh(this, this.mm)));
         }

         if (var1.hv == 103) {
            this.hW.u1.new();
            this.hW.a((i5)(new j4(this, this.mm)));
         }

         if (var1.hv == 104) {
            this.hW.u1.new();
            this.hW.a((i5)(new ix(this, this.mm)));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.mn);
         }

         if (var1.hv == 105) {
            this.hW.u1.new();
            this.hW.a((i5)(new ag(this, this.mm)));
         }
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.ml, this.hV / 2, 15, 16777215);
      super.if(var1, var2, var3);
   }

   static {
      mk = new kc[]{kc.S, kc.Q, kc.P, kc.O, kc.M, kc.F, kc.an};
   }
}
