public class ahq extends ahk {
   private aig bi;
   private y6 bk;
   int bj = 0;

   public ahq(aig var1) {
      this.bi = var1;
      this.bk = var1.ap;
      this.a(7);
   }

   public boolean do() {
      if (this.bi.bq().nextInt(this.bi.bG() ? 50 : 1000) != 0) {
         return false;
      } else {
         int var1 = ajs.a(this.bi.al);
         int var2 = ajs.a(this.bi.ak);
         int var3 = ajs.a(this.bi.aj);
         if (this.bk.new(var1, var2, var3) == pa.b3.void && this.bk.for(var1, var2, var3) == 1) {
            return true;
         } else {
            return this.bk.new(var1, var2 - 1, var3) == pa.i.void;
         }
      }
   }

   public void a() {
      this.bj = 40;
      this.bk.a((aiw)this.bi, (byte)10);
      this.bi.bl().case();
   }

   public void new() {
      this.bj = 0;
   }

   public boolean try() {
      return this.bj > 0;
   }

   public int void() {
      return this.bj;
   }

   public void int() {
      this.bj = Math.max(0, this.bj - 1);
      if (this.bj == 4) {
         int var1 = ajs.a(this.bi.al);
         int var2 = ajs.a(this.bi.ak);
         int var3 = ajs.a(this.bi.aj);
         if (this.bk.new(var1, var2, var3) == pa.b3.void) {
            this.bk.int(var1, var2, var3, false);
            this.bi.cp();
         } else if (this.bk.new(var1, var2 - 1, var3) == pa.i.void) {
            this.bk.for(2001, var1, var2 - 1, var3, pa.i.void);
            this.bk.int(var1, var2 - 1, var3, pa.g.void, 0, 2);
            this.bi.cp();
         }

      }
   }
}
