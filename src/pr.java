import java.util.List;

public class pr extends pa {
   public static final String[] dc = new String[]{"default", "chiseled", "smooth"};
   private static final String[] db = new String[]{"sandstone_side", "sandstone_carved", "sandstone_smooth"};
   private ajd[] df;
   private ajd de;
   private ajd dd;

   public pr(int var1) {
      super(var1, ts.v);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var1 != 1 && (var1 != 0 || var2 != 1 && var2 != 2)) {
         if (var1 == 0) {
            return this.dd;
         } else {
            if (var2 < 0 || var2 >= this.df.length) {
               var2 = 0;
            }

            return this.df[var2];
         }
      } else {
         return this.de;
      }
   }

   public int for(int var1) {
      return var1;
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
   }

   public void a(ajc var1) {
      this.df = new ajd[db.length];

      for(int var2 = 0; var2 < this.df.length; ++var2) {
         this.df[var2] = var1.a(db[var2]);
      }

      this.de = var1.a("sandstone_top");
      this.dd = var1.a("sandstone_bottom");
   }
}
