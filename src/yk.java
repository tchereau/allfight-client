public class yk {
   public float[] if;
   public float[] a;
   public yn[] try;
   public int new;
   public int int;
   public long for;
   // $FF: synthetic field
   final yl do;

   public yk(yl var1, int var2, int var3) {
      this.do = var1;
      this.if = new float[256];
      this.a = new float[256];
      this.try = new yn[256];
      this.new = var2;
      this.int = var3;
      yl.a(var1).a((float[])this.if, var2 << 4, var3 << 4, 16, 16);
      yl.a(var1).if((float[])this.a, var2 << 4, var3 << 4, 16, 16);
      yl.a(var1).a(this.try, var2 << 4, var3 << 4, 16, 16, false);
   }

   public yn a(int var1, int var2) {
      return this.try[var1 & 15 | (var2 & 15) << 4];
   }
}
