import java.util.HashSet;
import java.util.Set;

public class ajy {
   private transient ajx[] if = new ajx[16];
   private transient int a;
   private int new = 12;
   private final float int = 0.75F;
   private transient volatile int for;
   private Set do = new HashSet();

   private static int a(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public Object for(int var1) {
      int var2 = a(var1);

      for(ajx var3 = this.if[a(var2, this.if.length)]; var3 != null; var3 = var3.for) {
         if (var3.if == var1) {
            return var3.a;
         }
      }

      return null;
   }

   public boolean byte(int var1) {
      return this.new(var1) != null;
   }

   final ajx new(int var1) {
      int var2 = a(var1);

      for(ajx var3 = this.if[a(var2, this.if.length)]; var3 != null; var3 = var3.for) {
         if (var3.if == var1) {
            return var3;
         }
      }

      return null;
   }

   public void a(int var1, Object var2) {
      this.do.add(var1);
      int var3 = a(var1);
      int var4 = a(var3, this.if.length);

      for(ajx var5 = this.if[var4]; var5 != null; var5 = var5.for) {
         if (var5.if == var1) {
            var5.a = var2;
            return;
         }
      }

      ++this.for;
      this.a(var3, var1, var2, var4);
   }

   private void int(int var1) {
      ajx[] var2 = this.if;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.new = Integer.MAX_VALUE;
      } else {
         ajx[] var4 = new ajx[var1];
         this.a(var4);
         this.if = var4;
         this.new = (int)((float)var1 * this.int);
      }
   }

   private void a(ajx[] var1) {
      ajx[] var2 = this.if;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         ajx var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            ajx var6;
            do {
               var6 = var5.for;
               int var7 = a(var5.do, var3);
               var5.for = var1[var7];
               var1[var7] = var5;
               var5 = var6;
            } while(var6 != null);
         }
      }

   }

   public Object try(int var1) {
      this.do.remove(var1);
      ajx var2 = this.do(var1);
      return var2 == null ? null : var2.a;
   }

   final ajx do(int var1) {
      int var2 = a(var1);
      int var3 = a(var2, this.if.length);
      ajx var4 = this.if[var3];

      ajx var5;
      ajx var6;
      for(var5 = var4; var5 != null; var5 = var6) {
         var6 = var5.for;
         if (var5.if == var1) {
            ++this.for;
            --this.a;
            if (var4 == var5) {
               this.if[var3] = var6;
            } else {
               var4.for = var6;
            }

            return var5;
         }

         var4 = var5;
      }

      return var5;
   }

   public void if() {
      ++this.for;
      ajx[] var1 = this.if;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = null;
      }

      this.a = 0;
   }

   private void a(int var1, int var2, Object var3, int var4) {
      ajx var5 = this.if[var4];
      this.if[var4] = new ajx(var1, var2, var3, var5);
      if (this.a++ >= this.new) {
         this.int(2 * this.if.length);
      }

   }

   public Set a() {
      return this.do;
   }

   // $FF: synthetic method
   static int if(int var0) {
      return a(var0);
   }
}
