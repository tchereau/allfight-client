public class ajv {
   private transient aju[] if = new aju[1024];
   private transient int a;
   private int int;
   private final float for;
   private transient volatile int do;

   public ajv() {
      this.int = (int)(0.75F * (float)this.if.length);
      this.for = 0.75F;
   }

   private static int if(long var0) {
      return (int)(var0 ^ var0 >>> 27);
   }

   private static int a(int var0) {
      var0 ^= var0 >>> 20 ^ var0 >>> 12;
      return var0 ^ var0 >>> 7 ^ var0 >>> 4;
   }

   private static int a(int var0, int var1) {
      return var0 & var1 - 1;
   }

   public int if() {
      return this.a;
   }

   public Object int(long var1) {
      int var3 = if(var1);

      for(aju var4 = this.if[a(var3, this.if.length)]; var4 != null; var4 = var4.for) {
         if (var4.if == var1) {
            return var4.a;
         }
      }

      return null;
   }

   public boolean try(long var1) {
      return this.for(var1) != null;
   }

   final aju for(long var1) {
      int var3 = if(var1);

      for(aju var4 = this.if[a(var3, this.if.length)]; var4 != null; var4 = var4.for) {
         if (var4.if == var1) {
            return var4;
         }
      }

      return null;
   }

   public void a(long var1, Object var3) {
      int var4 = if(var1);
      int var5 = a(var4, this.if.length);

      for(aju var6 = this.if[var5]; var6 != null; var6 = var6.for) {
         if (var6.if == var1) {
            var6.a = var3;
            return;
         }
      }

      ++this.do;
      this.a(var4, var1, var3, var5);
   }

   private void if(int var1) {
      aju[] var2 = this.if;
      int var3 = var2.length;
      if (var3 == 1073741824) {
         this.int = Integer.MAX_VALUE;
      } else {
         aju[] var4 = new aju[var1];
         this.a(var4);
         this.if = var4;
         float var10001 = (float)var1;
         this.getClass();
         this.int = (int)(var10001 * 0.75F);
      }

   }

   private void a(aju[] var1) {
      aju[] var2 = this.if;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var2.length; ++var4) {
         aju var5 = var2[var4];
         if (var5 != null) {
            var2[var4] = null;

            aju var6;
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

   public Object new(long var1) {
      aju var3 = this.a(var1);
      return var3 == null ? null : var3.a;
   }

   final aju a(long var1) {
      int var3 = if(var1);
      int var4 = a(var3, this.if.length);
      aju var5 = this.if[var4];

      aju var6;
      aju var7;
      for(var6 = var5; var6 != null; var6 = var7) {
         var7 = var6.for;
         if (var6.if == var1) {
            ++this.do;
            --this.a;
            if (var5 == var6) {
               this.if[var4] = var7;
            } else {
               var5.for = var7;
            }

            return var6;
         }

         var5 = var6;
      }

      return var6;
   }

   private void a(int var1, long var2, Object var4, int var5) {
      aju var6 = this.if[var5];
      this.if[var5] = new aju(var1, var2, var4, var6);
      if (this.a++ >= this.int) {
         this.if(2 * this.if.length);
      }

   }

   static int do(long var0) {
      return if(var0);
   }

   public double a() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.if.length; ++var2) {
         if (this.if[var2] != null) {
            ++var1;
         }
      }

      return 1.0D * (double)var1 / (double)this.a;
   }
}
