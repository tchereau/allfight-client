public class m8 {
   protected byte[] if;
   protected int a;
   protected boolean new;
   protected m9 int;
   protected boolean for;
   protected boolean do;

   protected m8() {
   }

   public m8(m9 var1) {
      this.int = var1;
      this.if = new byte[var1.if()];
      this.a = 0;
      String var2 = var1.do();
      int var3 = var2.indexOf(47) + 1;
      this.do = var3 > 0 && var2.startsWith("PGP", var3);
      if (this.do) {
         this.for = true;
      } else {
         this.for = var3 > 0 && (var2.startsWith("CFB", var3) || var2.startsWith("OFB", var3) || var2.startsWith("OpenPGP", var3) || var2.startsWith("SIC", var3) || var2.startsWith("GCTR", var3));
      }

   }

   public void a(boolean var1, m6 var2) {
      this.new = var1;
      this.a();
      this.int.a(var1, var2);
   }

   public int if() {
      return this.int.if();
   }

   public int a(int var1) {
      int var2 = var1 + this.a;
      int var3;
      if (this.do) {
         var3 = var2 % this.if.length - (this.int.if() + 2);
      } else {
         var3 = var2 % this.if.length;
      }

      return var2 - var3;
   }

   public int if(int var1) {
      return var1 + this.a;
   }

   public int a(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var3 < 0) {
         throw new IllegalArgumentException("Can't have a negative input length!");
      } else {
         int var6 = this.if();
         int var7 = this.a(var3);
         if (var7 > 0 && var5 + var7 > var4.length) {
            throw new m5("output buffer too short");
         } else {
            int var8 = 0;
            int var9 = this.if.length - this.a;
            if (var3 > var9) {
               System.arraycopy(var1, var2, this.if, this.a, var9);
               var8 += this.int.a(this.if, 0, var4, var5);
               this.a = 0;
               var3 -= var9;

               for(var2 += var9; var3 > this.if.length; var2 += var6) {
                  var8 += this.int.a(var1, var2, var4, var5 + var8);
                  var3 -= var6;
               }
            }

            System.arraycopy(var1, var2, this.if, this.a, var3);
            this.a += var3;
            if (this.a == this.if.length) {
               var8 += this.int.a(this.if, 0, var4, var5 + var8);
               this.a = 0;
            }

            return var8;
         }
      }
   }

   public int a(byte[] var1, int var2) {
      int var4;
      try {
         int var3 = 0;
         if (var2 + this.a > var1.length) {
            throw new m5("output buffer too short for doFinal()");
         }

         if (this.a != 0) {
            if (!this.for) {
               throw new m5("data not block size aligned");
            }

            this.int.a(this.if, 0, this.if, 0);
            var3 = this.a;
            this.a = 0;
            System.arraycopy(this.if, 0, var1, var2, var3);
         }

         var4 = var3;
      } finally {
         this.a();
      }

      return var4;
   }

   public void a() {
      for(int var1 = 0; var1 < this.if.length; ++var1) {
         this.if[var1] = 0;
      }

      this.a = 0;
      this.int.a();
   }
}
