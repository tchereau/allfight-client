import java.util.List;

final class ac3 extends ara {
   protected abp if(arc var1, abp var2) {
      aq6 var3 = rh.B(var1.byte());
      int var4 = var1.case() + var3.a();
      int var5 = var1.new() + var3.for();
      int var6 = var1.int() + var3.if();
      nw var7 = nw.if().a((double)var4, (double)var5, (double)var6, (double)(var4 + 1), (double)(var5 + 1), (double)(var6 + 1));
      List var8 = var1.for().a((Class)aig.class, (nw)var7, (aip)(new ail(var2)));
      if (var8.size() > 0) {
         aig var9 = (aig)var8.get(0);
         int var10 = var9 instanceof aek ? 1 : 0;
         int var11 = aig.case(var2);
         abp var12 = var2.n();
         var12.if = 1;
         var9.do(var11 - var10, var12);
         var9.a(var11, 2.0F);
         --var2.if;
         return var2;
      } else {
         return super.if(var1, var2);
      }
   }
}
