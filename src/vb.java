import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class vb extends uo {
   private yn[] char;
   private boolean case;
   private zi[] byte;
   private double try;
   private int new;

   public vb() {
      this.char = new yn[]{yn.D, yn.B, yn.C, yn.z, yn.A, yn.t, yn.s, yn.o, yn.n, yn.l, yn.k, yn.j};
      this.byte = new zi[3];
      this.try = 32.0D;
      this.new = 3;
   }

   public vb(Map var1) {
      this.char = new yn[]{yn.D, yn.B, yn.C, yn.z, yn.A, yn.t, yn.s, yn.o, yn.n, yn.l, yn.k, yn.j};
      this.byte = new zi[3];
      this.try = 32.0D;
      this.new = 3;
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (((String)var3.getKey()).equals("distance")) {
            this.try = ajs.a((String)var3.getValue(), this.try, 1.0D);
         } else if (((String)var3.getKey()).equals("count")) {
            this.byte = new zi[ajs.a((String)((String)var3.getValue()), this.byte.length, 1)];
         } else if (((String)var3.getKey()).equals("spread")) {
            this.new = ajs.a((String)((String)var3.getValue()), this.new, 1);
         }
      }

   }

   protected boolean if(int var1, int var2) {
      if (!this.case) {
         Random var3 = new Random();
         var3.setSeed(this.do.b());
         double var4 = var3.nextDouble() * 3.141592653589793D * 2.0D;
         int var6 = 1;

         for(int var7 = 0; var7 < this.byte.length; ++var7) {
            double var8 = (1.25D * (double)var6 + var3.nextDouble()) * this.try * (double)var6;
            int var10 = (int)Math.round(Math.cos(var4) * var8);
            int var11 = (int)Math.round(Math.sin(var4) * var8);
            ArrayList var12 = new ArrayList();
            Collections.addAll(var12, this.char);
            yp var13 = this.do.void().a((var10 << 4) + 8, (var11 << 4) + 8, 112, var12, var3);
            if (var13 != null) {
               var10 = var13.if >> 4;
               var11 = var13.do >> 4;
            }

            this.byte[var7] = new zi(var10, var11);
            var4 += 6.283185307179586D * (double)var6 / (double)this.new;
            if (var7 == this.new) {
               var6 += 2 + var3.nextInt(5);
               this.new += 1 + var3.nextInt(2);
            }
         }

         this.case = true;
      }

      zi[] var14 = this.byte;
      int var15 = var14.length;

      for(int var5 = 0; var5 < var15; ++var5) {
         zi var16 = var14[var5];
         if (var1 == var16.if && var2 == var16.a) {
            return true;
         }
      }

      return false;
   }

   protected List a() {
      ArrayList var1 = new ArrayList();
      zi[] var2 = this.byte;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         zi var5 = var2[var4];
         if (var5 != null) {
            var1.add(var5.a(64));
         }
      }

      return var1;
   }

   protected ui a(int var1, int var2) {
      va var3;
      for(var3 = new va(this.do, this.a, var1, var2); var3.for().isEmpty() || ((ut)var3.for().get(0)).char == null; var3 = new va(this.do, this.a, var1, var2)) {
      }

      return var3;
   }
}
