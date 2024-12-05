import java.util.Random;

public class r0 extends pa {
   protected r0(int var1, ts var2) {
      super(var1, var2);
      this.a(true);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
      this.a(acn.c);
   }

   protected r0(int var1) {
      this(var1, ts.p);
   }

   public boolean case(y6 var1, int var2, int var3, int var4) {
      return super.case(var1, var2, var3, var4) && this.K(var1.new(var2, var3 - 1, var4));
   }

   protected boolean K(int var1) {
      return var1 == pa.i.void || var1 == pa.g.void || var1 == pa.cs.void;
   }

   public void new(y6 var1, int var2, int var3, int var4, int var5) {
      super.new(var1, var2, var3, var4, var5);
      this.S(var1, var2, var3, var4);
   }

   public void if(y6 var1, int var2, int var3, int var4, Random var5) {
      this.S(var1, var2, var3, var4);
   }

   protected final void S(y6 var1, int var2, int var3, int var4) {
      if (!this.try(var1, var2, var3, var4)) {
         this.a(var1, var2, var3, var4, var1.for(var2, var3, var4), 0);
         var1.o(var2, var3, var4);
      }

   }

   public boolean try(y6 var1, int var2, int var3, int var4) {
      return (var1.m(var2, var3, var4) >= 8 || var1.j(var2, var3, var4)) && this.K(var1.new(var2, var3 - 1, var4));
   }

   public nw int(y6 var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean do() {
      return false;
   }

   public boolean if() {
      return false;
   }

   public int new() {
      return 1;
   }
}
