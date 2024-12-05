public abstract class ahr extends ahk {
   protected aig bm;
   protected int bl;
   protected int bs;
   protected int br;
   protected rg bq;
   boolean bp;
   float bo;
   float bn;

   public ahr(aig var1) {
      this.bm = var1;
   }

   public boolean do() {
      if (!this.bm.aX) {
         return false;
      } else {
         agj var1 = this.bm.bl();
         s5 var2 = var1.a();
         if (var2 != null && !var2.int() && var1.goto()) {
            for(int var3 = 0; var3 < Math.min(var2.for() + 2, var2.a()); ++var3) {
               s6 var4 = var2.a(var3);
               this.bl = var4.char;
               this.bs = var4.case + 1;
               this.br = var4.byte;
               if (!(this.bm.if((double)this.bl, this.bm.ak, (double)this.br) > 2.25D)) {
                  this.bq = this.a(this.bl, this.bs, this.br);
                  if (this.bq != null) {
                     return true;
                  }
               }
            }

            this.bl = ajs.a(this.bm.al);
            this.bs = ajs.a(this.bm.ak + 1.0D);
            this.br = ajs.a(this.bm.aj);
            this.bq = this.a(this.bl, this.bs, this.br);
            return this.bq != null;
         } else {
            return false;
         }
      }
   }

   public boolean try() {
      return !this.bp;
   }

   public void a() {
      this.bp = false;
      this.bo = (float)((double)((float)this.bl + 0.5F) - this.bm.al);
      this.bn = (float)((double)((float)this.br + 0.5F) - this.bm.aj);
   }

   public void int() {
      float var1 = (float)((double)((float)this.bl + 0.5F) - this.bm.al);
      float var2 = (float)((double)((float)this.br + 0.5F) - this.bm.aj);
      float var3 = this.bo * var1 + this.bn * var2;
      if (var3 < 0.0F) {
         this.bp = true;
      }

   }

   private rg a(int var1, int var2, int var3) {
      int var4 = this.bm.ap.new(var1, var2, var3);
      return var4 != pa.co.void ? null : (rg)pa.x[var4];
   }
}
