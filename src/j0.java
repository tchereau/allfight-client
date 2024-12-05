public class j0 extends i5 {
   private static cb nv = new cb();
   private final jy nu;
   private we nt = we.do();
   private String ns;
   private String nr;
   private String nq;
   private jz np;
   private j6 no;
   private j6 nn;
   private j6 nw;

   public j0(jy var1, String var2) {
      this.nu = var1;
      this.p(var2);
   }

   public String em() {
      return this.nt.toString();
   }

   public void p(String var1) {
      this.nt = we.a(var1);
   }

   public void dA() {
      this.hT.clear();
      this.ns = aqz.if("createWorld.customize.flat.title");
      this.nr = aqz.if("createWorld.customize.flat.tile");
      this.nq = aqz.if("createWorld.customize.flat.height");
      this.np = new jz(this);
      this.hT.add(this.no = new j6(2, this.hV / 2 - 154, this.hU - 52, 100, 20, aqz.if("createWorld.customize.flat.addLayer") + " (NYI)"));
      this.hT.add(this.nn = new j6(3, this.hV / 2 - 50, this.hU - 52, 100, 20, aqz.if("createWorld.customize.flat.editLayer") + " (NYI)"));
      this.hT.add(this.nw = new j6(4, this.hV / 2 - 155, this.hU - 52, 150, 20, aqz.if("createWorld.customize.flat.removeLayer")));
      this.hT.add(new j6(0, this.hV / 2 - 155, this.hU - 28, 150, 20, aqz.if("gui.done")));
      this.hT.add(new j6(5, this.hV / 2 + 5, this.hU - 52, 150, 20, aqz.if("createWorld.customize.presets")));
      this.hT.add(new j6(1, this.hV / 2 + 5, this.hU - 28, 150, 20, aqz.if("gui.cancel")));
      this.no.ht = this.nn.ht = false;
      this.nt.for();
      this.el();
   }

   protected void a(j6 var1) {
      int var2 = this.nt.a().size() - this.np.B - 1;
      if (var1.hv == 1) {
         this.hW.a((i5)this.nu);
      } else if (var1.hv == 0) {
         this.nu.nm = this.em();
         this.hW.a((i5)this.nu);
      } else if (var1.hv == 5) {
         this.hW.a((i5)(new ja(this)));
      } else if (var1.hv == 4 && this.ej()) {
         this.nt.a().remove(var2);
         this.np.B = Math.min(this.np.B, this.nt.a().size() - 1);
      }

      this.nt.for();
      this.el();
   }

   public void el() {
      boolean var1 = this.ej();
      this.nw.hu = var1;
      this.nn.hu = var1;
      this.nn.hu = false;
      this.no.hu = false;
   }

   private boolean ej() {
      return this.np.B > -1 && this.np.B < this.nt.a().size();
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.np.a(var1, var2, var3);
      this.a(this.hR, this.ns, this.hV / 2, 8, 16777215);
      int var4 = this.hV / 2 - 92 - 16;
      this.if(this.hR, this.nr, var4, 32, 16777215);
      this.if(this.hR, this.nq, var4 + 2 + 213 - this.hR.for(this.nq), 32, 16777215);
      super.if(var1, var2, var3);
   }

   // $FF: synthetic method
   static cb ek() {
      return nv;
   }

   // $FF: synthetic method
   static we a(j0 var0) {
      return var0.nt;
   }
}
