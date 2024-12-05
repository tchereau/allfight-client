import java.util.List;
import java.util.Random;

public class ph extends pa {
   public static final String[] c2 = new String[]{"stone", "cobble", "brick"};

   public ph(int var1) {
      super(var1, ts.void);
      this.if(0.0F);
      this.a((acn)acn.c);
   }

   public ajd if(int var1, int var2) {
      if (var2 == 1) {
         return pa.bf.do(var1);
      } else {
         return var2 == 2 ? pa.am.do(var1) : pa.k.do(var1);
      }
   }

   public void a(ajc var1) {
   }

   public void a(y6 var1, int var2, int var3, int var4, int var5) {
      if (!var1.goto) {
         aex var6 = new aex(var1);
         var6.if((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.new(var6);
         var6.br();
      }

      super.a(var1, var2, var3, var4, var5);
   }

   public int a(Random var1) {
      return 0;
   }

   public static boolean g(int var0) {
      return var0 == pa.k.void || var0 == pa.bf.void || var0 == pa.am.void;
   }

   public static int f(int var0) {
      if (var0 == pa.bf.void) {
         return 1;
      } else {
         return var0 == pa.am.void ? 2 : 0;
      }
   }

   protected abp int(int var1) {
      pa var2 = pa.k;
      if (var1 == 1) {
         var2 = pa.bf;
      }

      if (var1 == 2) {
         var2 = pa.am;
      }

      return new abp(var2);
   }

   public int a(y6 var1, int var2, int var3, int var4) {
      return var1.for(var2, var3, var4);
   }

   public void a(int var1, acn var2, List var3) {
      for(int var4 = 0; var4 < 3; ++var4) {
         var3.add(new abp(var1, 1, var4));
      }

   }
}
