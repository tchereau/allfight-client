public class aqg extends i5 {
   private i5 og;
   protected String oj = "Animation Settings";
   private ke oh;
   private static kc[] oi;

   public aqg(i5 var1, ke var2) {
      this.og = var1;
      this.oh = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      kc[] var3 = oi;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         kc var6 = var3[var5];
         int var7 = this.hV / 2 - 155 + var2 % 2 * 160;
         int var8 = this.hU / 6 + 21 * (var2 / 2) - 10;
         if (!var6.if()) {
            this.hT.add(new iy(var6.a(), var7, var8, var6, this.oh.do(var6)));
         } else {
            this.hT.add(new iz(var6.a(), var7, var8, var6, this.oh.do(var6), this.oh.a(var6)));
         }

         ++var2;
      }

      this.hT.add(new j6(210, this.hV / 2 - 155, this.hU / 6 + 168 + 11, 70, 20, "All ON"));
      this.hT.add(new j6(211, this.hV / 2 - 155 + 80, this.hU / 6 + 168 + 11, 70, 20, "All OFF"));
      this.hT.add(new iy(200, this.hV / 2 + 5, this.hU / 6 + 168 + 11, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.oh.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.oh.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.og);
         }

         if (var1.hv == 210) {
            this.hW.u1.a(true);
         }

         if (var1.hv == 211) {
            this.hW.u1.a(false);
         }

         if (var1.hv != kc.long.ordinal()) {
            i4 var2 = new i4(this.hW.u1, this.hW.vo, this.hW.vn);
            int var3 = var2.int();
            int var4 = var2.if();
            this.for(this.hW, var3, var4);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.oj, this.hV / 2, 20, 16777215);
      super.if(var1, var2, var3);
   }

   static {
      oi = new kc[]{kc.h, kc.ax, kc.if, kc.j, kc.aC, kc.X, kc.goto, kc.aj, kc.d, kc.new, kc.B, kc.p, kc.y, kc.ay, kc.W, kc.af, kc.for};
   }
}
