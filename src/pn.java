import java.util.List;

public class pn extends pa {
   public static final String[] c9 = new String[]{"default", "mossy", "cracked", "chiseled"};
   public static final String[] c8 = new String[]{"stonebricksmooth", "stonebricksmooth_mossy", "stonebricksmooth_cracked", "stonebricksmooth_carved"};
   private ajd[] da;

   public pn(int var1) {
      super(var1, ts.v);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var2 < 0 || var2 >= c8.length) {
         var2 = 0;
      }

      return this.da[var2];
   }

   public int for(int var1) {
      return var1;
   }

   public void a(int var1, acn var2, List var3) {
      for(int var4 = 0; var4 < 4; ++var4) {
         var3.add(new abp(var1, 1, var4));
      }

   }

   public void a(ajc var1) {
      this.da = new ajd[c8.length];

      for(int var2 = 0; var2 < this.da.length; ++var2) {
         this.da[var2] = var1.a(c8[var2]);
      }

   }
}
