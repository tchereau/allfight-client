package com.jcraft.a;

public class b {
   private static int[] do = new int[256];
   public byte[] new;
   public int try;
   public int if;
   public byte[] int;
   public int a;
   public int for;

   private static int a(int var0) {
      int var1 = var0 << 24;

      for(int var2 = 0; var2 < 8; ++var2) {
         if ((var1 & Integer.MIN_VALUE) != 0) {
            var1 = var1 << 1 ^ 79764919;
         } else {
            var1 <<= 1;
         }
      }

      return var1 & -1;
   }

   int do() {
      return this.new[this.try + 4] & 255;
   }

   int a() {
      return this.new[this.try + 5] & 1;
   }

   public int byte() {
      return this.new[this.try + 5] & 2;
   }

   public int new() {
      return this.new[this.try + 5] & 4;
   }

   public long int() {
      long var1 = (long)(this.new[this.try + 13] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 12] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 11] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 10] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 9] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 8] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 7] & 255);
      var1 = var1 << 8 | (long)(this.new[this.try + 6] & 255);
      return var1;
   }

   public int for() {
      return this.new[this.try + 14] & 255 | (this.new[this.try + 15] & 255) << 8 | (this.new[this.try + 16] & 255) << 16 | (this.new[this.try + 17] & 255) << 24;
   }

   int try() {
      return this.new[this.try + 18] & 255 | (this.new[this.try + 19] & 255) << 8 | (this.new[this.try + 20] & 255) << 16 | (this.new[this.try + 21] & 255) << 24;
   }

   void if() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < this.if; ++var2) {
         var1 = var1 << 8 ^ do[var1 >>> 24 & 255 ^ this.new[this.try + var2] & 255];
      }

      for(var2 = 0; var2 < this.for; ++var2) {
         var1 = var1 << 8 ^ do[var1 >>> 24 & 255 ^ this.int[this.a + var2] & 255];
      }

      this.new[this.try + 22] = (byte)var1;
      this.new[this.try + 23] = (byte)(var1 >>> 8);
      this.new[this.try + 24] = (byte)(var1 >>> 16);
      this.new[this.try + 25] = (byte)(var1 >>> 24);
   }

   public com.jcraft.a.b case() {
      return this.a(new com.jcraft.a.b());
   }

   public com.jcraft.a.b a(com.jcraft.a.b var1) {
      byte[] var2 = new byte[this.if];
      System.arraycopy(this.new, this.try, var2, 0, this.if);
      var1.if = this.if;
      var1.new = var2;
      var1.try = 0;
      var2 = new byte[this.for];
      System.arraycopy(this.int, this.a, var2, 0, this.for);
      var1.for = this.for;
      var1.int = var2;
      var1.a = 0;
      return var1;
   }

   static {
      for(int var0 = 0; var0 < do.length; ++var0) {
         do[var0] = a(var0);
      }

   }
}
