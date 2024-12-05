class iw extends i3 {
   // $FF: synthetic field
   final ix s;

   public iw(ix var1) {
      super(var1.hW, var1.hV, var1.hU, 80, var1.hU - 40, var1.hR.i + 1);
      this.s = var1;
   }

   protected int new() {
      return ix.if(this.s).size();
   }

   protected void a(int var1, boolean var2) {
   }

   protected boolean a(int var1) {
      return false;
   }

   protected void int() {
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      this.s.hR.if((String)ix.if(this.s).get(var1), 10, var3, 16777215);
      this.s.hR.if((String)ix.a(this.s).get(var1), 230, var3, 16777215);
   }

   protected int a() {
      return this.s.hV - 10;
   }
}
