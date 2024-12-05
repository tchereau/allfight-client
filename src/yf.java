import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class yf extends yi {
   private yn try;
   private float new;
   private float int;

   public yf(yn var1, float var2, float var3) {
      this.try = var1;
      this.new = var2;
      this.int = var3;
   }

   public yn a(int var1, int var2) {
      return this.try;
   }

   public yn[] if(yn[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new yn[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.try);
      return var1;
   }

   public float[] a(float[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.new);
      return var1;
   }

   public float[] if(float[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new float[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.int);
      return var1;
   }

   public yn[] a(yn[] var1, int var2, int var3, int var4, int var5) {
      if (var1 == null || var1.length < var4 * var5) {
         var1 = new yn[var4 * var5];
      }

      Arrays.fill(var1, 0, var4 * var5, this.try);
      return var1;
   }

   public yn[] a(yn[] var1, int var2, int var3, int var4, int var5, boolean var6) {
      return this.a(var1, var2, var3, var4, var5);
   }

   public yp a(int var1, int var2, int var3, List var4, Random var5) {
      return var4.contains(this.try) ? new yp(var1 - var3 + var5.nextInt(var3 * 2 + 1), 0, var2 - var3 + var5.nextInt(var3 * 2 + 1)) : null;
   }

   public boolean a(int var1, int var2, int var3, List var4) {
      return var4.contains(this.try);
   }
}
