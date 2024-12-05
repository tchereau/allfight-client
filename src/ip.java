class ip extends i3 {
   // $FF: synthetic field
   final is r;

   public ip(is var1) {
      super(is.int(var1), var1.hV, var1.hU, 32, var1.hU - 64, 10);
      this.r = var1;
      this.a(false);
   }

   protected int new() {
      return aka.s.size();
   }

   protected void a(int var1, boolean var2) {
   }

   protected boolean a(int var1) {
      return false;
   }

   protected int if() {
      return this.new() * 10;
   }

   protected void int() {
      this.r.dx();
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      akf var6 = (akf)aka.s.get(var1);
      this.r.if(is.do(this.r), aqz.if(var6.a()), var2 + 2, var3 + 1, var1 % 2 == 0 ? 16777215 : 9474192);
      String var7 = var6.a(is.case(this.r).a(var6));
      this.r.if(is.else(this.r), var7, var2 + 2 + 213 - is.long(this.r).for(var7), var3 + 1, var1 % 2 == 0 ? 16777215 : 9474192);
   }
}
