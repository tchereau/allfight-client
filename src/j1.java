public class j1 extends i5 {
   private i5 nx;
   protected String ny = "Controls";
   private ke nA;
   private int nz = -1;

   public j1(i5 var1, ke var2) {
      this.nx = var1;
      this.nA = var2;
   }

   private int en() {
      return this.hV / 2 - 155;
   }

   public void dA() {
      aqy var1 = aqy.if();
      int var2 = this.en();

      for(int var3 = 0; var3 < this.nA.aw.length; ++var3) {
         this.hT.add(new iy(var3, var2 + var3 % 2 * 160, this.hU / 6 + 24 * (var3 >> 1), 70, 20, this.nA.if(var3)));
      }

      this.hT.add(new j6(200, this.hV / 2 - 100, this.hU / 6 + 168, var1.a("gui.done")));
      this.ny = var1.a("controls.title");
   }

   protected void a(j6 var1) {
      for(int var2 = 0; var2 < this.nA.aw.length; ++var2) {
         ((j6)this.hT.get(var2)).hw = this.nA.if(var2);
      }

      if (var1.hv == 200) {
         this.hW.a(this.nx);
      } else {
         this.nz = var1.hv;
         var1.hw = "> " + this.nA.if(var1.hv) + " <";
      }

   }

   protected void char(int var1, int var2, int var3) {
      if (this.nz >= 0) {
         this.nA.a(this.nz, -100 + var3);
         ((j6)this.hT.get(this.nz)).hw = this.nA.if(this.nz);
         this.nz = -1;
         k2.a();
      } else {
         super.char(var1, var2, var3);
      }

   }

   protected void if(char var1, int var2) {
      if (this.nz >= 0) {
         this.nA.a(this.nz, var2);
         ((j6)this.hT.get(this.nz)).hw = this.nA.if(this.nz);
         this.nz = -1;
         k2.a();
      } else {
         super.if(var1, var2);
      }

   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, this.ny, this.hV / 2, 20, 16777215);
      int var4 = this.en();

      for(int var5 = 0; var5 < this.nA.aw.length; ++var5) {
         boolean var6 = false;

         for(int var7 = 0; var7 < this.nA.aw.length; ++var7) {
            if (var7 != var5 && this.nA.aw[var5].int == this.nA.aw[var7].int) {
               var6 = true;
               break;
            }
         }

         if (this.nz == var5) {
            ((j6)this.hT.get(var5)).hw = "" + aqj.void + "> " + aqj.b + "??? " + aqj.void + "<";
         } else if (var6) {
            ((j6)this.hT.get(var5)).hw = aqj.d + this.nA.if(var5);
         } else {
            ((j6)this.hT.get(var5)).hw = this.nA.if(var5);
         }

         this.if(this.hR, this.nA.a(var5), var4 + var5 % 2 * 160 + 70 + 6, this.hU / 6 + 24 * (var5 >> 1) + 7, -1);
      }

      super.if(var1, var2, var3);
   }
}
