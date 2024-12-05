import java.util.Iterator;
import java.util.List;

public class agq extends agk {
   boolean ce;
   aig cd;

   public agq(aig var1, boolean var2) {
      super(var1, 16.0F, false);
      this.ce = var2;
      this.a(1);
   }

   public boolean do() {
      return this.a(this.b1.bD(), true);
   }

   public boolean try() {
      return this.b1.bD() != null && this.b1.bD() != this.cd;
   }

   public void a() {
      this.b1.do(this.b1.bD());
      this.cd = this.b1.bD();
      if (this.ce) {
         List var1 = this.b1.ap.a(this.b1.getClass(), nw.if().a(this.b1.al, this.b1.ak, this.b1.aj, this.b1.al + 1.0D, this.b1.ak + 1.0D, this.b1.aj + 1.0D).do((double)this.b0, 10.0D, (double)this.b0));
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            aig var3 = (aig)var2.next();
            if (this.b1 != var3 && var3.bB() == null) {
               var3.do(this.b1.bD());
            }
         }
      }

      super.a();
   }

   public void new() {
      if (this.b1.bB() != null && this.b1.bB() instanceof aek && ((aek)this.b1.bB()).fY.if) {
         super.new();
      }

   }
}
