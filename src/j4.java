public class j4 extends i5 {
   private static final kc[] nW;
   private static final kc[] nV;
   private final i5 n1;
   private final ke nZ;
   private String n0;
   private String nY;
   private int nX = 0;

   public j4(i5 var1, ke var2) {
      this.n1 = var1;
      this.nZ = var2;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = 0;
      this.n0 = var1.a("options.chat.title");
      this.nY = var1.a("options.multiplayer.title");
      kc[] var3 = nW;
      int var4 = var3.length;

      int var5;
      kc var6;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var3[var5];
         if (var6.if()) {
            this.hT.add(new iz(var6.a(), this.hV / 2 - 155 + var2 % 2 * 160, this.hU / 6 + 24 * (var2 >> 1), var6, this.nZ.do(var6), this.nZ.a(var6)));
         } else {
            this.hT.add(new iy(var6.a(), this.hV / 2 - 155 + var2 % 2 * 160, this.hU / 6 + 24 * (var2 >> 1), var6, this.nZ.do(var6)));
         }

         ++var2;
      }

      if (var2 % 2 == 1) {
         ++var2;
      }

      this.nX = this.hU / 6 + 24 * (var2 >> 1);
      var2 += 2;
      var3 = nV;
      var4 = var3.length;

      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var3[var5];
         if (var6.if()) {
            this.hT.add(new iz(var6.a(), this.hV / 2 - 155 + var2 % 2 * 160, this.hU / 6 + 24 * (var2 >> 1), var6, this.nZ.do(var6), this.nZ.a(var6)));
         } else {
            this.hT.add(new iy(var6.a(), this.hV / 2 - 155 + var2 % 2 * 160, this.hU / 6 + 24 * (var2 >> 1), var6, this.nZ.do(var6)));
         }

         ++var2;
      }

      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168, var1.a("gui.done")));
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv < 100 && var1 instanceof iy) {
            this.nZ.a((kc)((iy)var1).dv(), 1);
            var1.hw = this.nZ.do(kc.a(var1.hv));
         }

         if (var1.hv == 200) {
            this.hW.u1.new();
            this.hW.a(this.n1);
         }

      }
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.n0, this.hV / 2, 20, 16777215);
      this.a(this.hR, this.nY, this.hV / 2, this.nX + 7, 16777215);
      super.if(var1, var2, var3);
   }

   static {
      nW = new kc[]{kc.w, kc.v, kc.t, kc.s, kc.r, kc.am, kc.ak, kc.ah, kc.al};
      nV = new kc[]{kc.ao};
   }
}
