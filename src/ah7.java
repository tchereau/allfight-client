import java.util.ArrayList;

public class ah7 extends aii {
   public ah6 r2;

   public ah7(y6 var1) {
      super(var1);
   }

   public ah7(y6 var1, int var2, int var3, int var4, int var5) {
      super(var1, var2, var3, var4, var5);
      ArrayList var6 = new ArrayList();
      ah6[] var7 = ah6.a();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         ah6 var10 = var7[var9];
         this.r2 = var10;
         this.aA(var5);
         if (this.fT()) {
            var6.add(var10);
         }
      }

      if (!var6.isEmpty()) {
         this.r2 = (ah6)var6.get(this.bm.nextInt(var6.size()));
      }

      this.aA(var5);
   }

   public ah7(y6 var1, int var2, int var3, int var4, int var5, String var6) {
      this(var1, var2, var3, var4, var5);
      ah6[] var7 = ah6.a();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         ah6 var10 = var7[var9];
         if (var10.new.equals(var6)) {
            this.r2 = var10;
            break;
         }
      }

      this.aA(var5);
   }

   public void for(aqv var1) {
      var1.a("Motive", this.r2.new);
      super.for(var1);
   }

   public void try(aqv var1) {
      String var2 = var1.new("Motive");
      ah6[] var3 = ah6.a();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         ah6 var6 = var3[var5];
         if (var6.new.equals(var2)) {
            this.r2 = var6;
         }
      }

      if (this.r2 == null) {
         this.r2 = ah6.w;
      }

      super.try(var1);
   }

   public int fQ() {
      return this.r2.int;
   }

   public int fR() {
      return this.r2.for;
   }

   public void fS() {
      this.a(new abp(abr.bq), 0.0F);
   }
}
