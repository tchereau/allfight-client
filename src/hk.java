class hk extends i3 {
   // $FF: synthetic field
   final hl i;

   public hk(hl var1) {
      super(hl.if(var1), var1.hV, var1.hU, 32, var1.hU - 65 + 4, 18);
      this.i = var1;
   }

   protected int new() {
      return hl.do(this.i).size();
   }

   protected void a(int var1, boolean var2) {
      hl.a(this.i, (go)hl.do(this.i).get(var1));
      hl.new(this.i).hw = aqy.if().a("gui.done");
   }

   protected boolean a(int var1) {
      return ((go)hl.do(this.i).get(var1)).h.equals(hl.for(this.i).h);
   }

   protected int if() {
      return this.new() * 18;
   }

   protected void int() {
      this.i.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      hl.a(this.i).if(true);
      this.i.a(hl.int(this.i), ((go)hl.do(this.i).get(var1)).h, this.i.hV / 2, var3 + 1, 16777215);
   }
}
