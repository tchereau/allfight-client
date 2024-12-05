import java.util.List;

public class oq extends pa {
   public static final String[] cF = new String[]{"oak", "spruce", "birch", "jungle"};
   public static final String[] cE = new String[]{"wood", "wood_spruce", "wood_birch", "wood_jungle"};
   private ajd[] cG;

   public oq(int var1) {
      super(var1, ts.w);
      this.a(acn.d);
   }

   public ajd if(int var1, int var2) {
      if (var2 < 0 || var2 >= this.cG.length) {
         var2 = 0;
      }

      return this.cG[var2];
   }

   public int for(int var1) {
      return var1;
   }

   public void a(int var1, acn var2, List var3) {
      var3.add(new abp(var1, 1, 0));
      var3.add(new abp(var1, 1, 1));
      var3.add(new abp(var1, 1, 2));
      var3.add(new abp(var1, 1, 3));
   }

   public void a(ajc var1) {
      this.cG = new ajd[cE.length];

      for(int var2 = 0; var2 < this.cG.length; ++var2) {
         this.cG[var2] = var1.a(cE[var2]);
      }

   }
}
