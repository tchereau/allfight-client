class hs extends hb {
   // $FF: synthetic field
   final ht void;

   public hs(ht var1) {
      super(ht.do(var1), ht.if(var1), ht.if(var1, 2), ht.int(var1), ht.if(var1, 9) - ht.if(var1, 2), 12);
      this.void = var1;
   }

   protected int new() {
      return ht.new(this.void).b.size() + 1;
   }

   protected void a(int var1, boolean var2) {
      if (var1 < ht.new(this.void).b.size()) {
         ht.a(this.void, var1);
      }
   }

   protected boolean a(int var1) {
      return var1 == ht.a(this.void);
   }

   protected int do() {
      return this.new() * 12;
   }

   protected void for() {
   }

   protected void a(int var1, int var2, int var3, int var4, c4 var5) {
      if (var1 < ht.new(this.void).b.size()) {
         this.if(var1, var2, var3, var4, var5);
      }

   }

   private void if(int var1, int var2, int var3, int var4, c4 var5) {
      String var6 = (String)ht.new(this.void).b.get(var1);
      this.void.if(ht.for(this.void), var6, var2 + 2, var3 + 1, 16777215);
   }
}
