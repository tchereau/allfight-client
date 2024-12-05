import java.util.Random;

public class ahp extends ahk {
   private ah5 bd;
   private double bc;
   private double bh;
   private double bg;
   private float bf;
   private y6 be;

   public ahp(ah5 var1, float var2) {
      this.bd = var1;
      this.bf = var2;
      this.be = var1.ap;
      this.a(1);
   }

   public boolean do() {
      if (!this.be.j()) {
         return false;
      } else if (!this.bd.aP()) {
         return false;
      } else if (!this.be.j(ajs.a(this.bd.al), (int)this.bd.aZ.a, ajs.a(this.bd.aj))) {
         return false;
      } else {
         nr var1 = this.long();
         if (var1 == null) {
            return false;
         } else {
            this.bc = var1.int;
            this.bh = var1.for;
            this.bg = var1.do;
            return true;
         }
      }
   }

   public boolean try() {
      return !this.bd.bl().new();
   }

   public void a() {
      this.bd.bl().a(this.bc, this.bh, this.bg, this.bf);
   }

   private nr long() {
      Random var1 = this.bd.bq();

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = ajs.a(this.bd.al + (double)var1.nextInt(20) - 10.0D);
         int var4 = ajs.a(this.bd.aZ.a + (double)var1.nextInt(6) - 3.0D);
         int var5 = ajs.a(this.bd.aj + (double)var1.nextInt(20) - 10.0D);
         if (!this.be.j(var3, var4, var5) && this.bd.long(var3, var4, var5) < 0.0F) {
            return this.be.do().a((double)var3, (double)var4, (double)var5);
         }
      }

      return null;
   }
}
