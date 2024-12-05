package com.jcraft.a;

public class e {
   private static final int for = 256;
   private static final int[] if = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   int try = 0;
   byte[] a = null;
   int do = 0;
   int int = 0;
   int new = 0;

   public void int() {
      this.a = new byte[256];
      this.try = 0;
      this.a[0] = 0;
      this.new = 256;
   }

   public void a(byte[] var1) {
      for(int var2 = 0; var2 < var1.length && var1[var2] != 0; ++var2) {
         this.a(var1[var2], 8);
      }

   }

   public void a(byte[] var1, int var2) {
      for(int var3 = 0; var2-- != 0; var1[var3++] = (byte)this.for(8)) {
      }

   }

   void for() {
      this.try = 0;
      this.a[0] = 0;
      this.do = this.int = 0;
   }

   public void byte() {
      this.a = null;
   }

   public void if(byte[] var1, int var2) {
      this.a(var1, 0, var2);
   }

   public void a(byte[] var1, int var2, int var3) {
      this.try = var2;
      this.a = var1;
      this.do = this.int = 0;
      this.new = var3;
   }

   public void a(int var1, int var2) {
      if (this.int + 4 >= this.new) {
         byte[] var3 = new byte[this.new + 256];
         System.arraycopy(this.a, 0, var3, 0, this.new);
         this.a = var3;
         this.new += 256;
      }

      var1 &= if[var2];
      var2 += this.do;
      byte[] var10000 = this.a;
      int var10001 = this.try;
      var10000[var10001] |= (byte)(var1 << this.do);
      if (var2 >= 8) {
         this.a[this.try + 1] = (byte)(var1 >>> 8 - this.do);
         if (var2 >= 16) {
            this.a[this.try + 2] = (byte)(var1 >>> 16 - this.do);
            if (var2 >= 24) {
               this.a[this.try + 3] = (byte)(var1 >>> 24 - this.do);
               if (var2 >= 32) {
                  if (this.do > 0) {
                     this.a[this.try + 4] = (byte)(var1 >>> 32 - this.do);
                  } else {
                     this.a[this.try + 4] = 0;
                  }
               }
            }
         }
      }

      this.int += var2 / 8;
      this.try += var2 / 8;
      this.do = var2 & 7;
   }

   public int a(int var1) {
      int var3 = if[var1];
      var1 += this.do;
      if (this.int + 4 >= this.new && this.int + (var1 - 1) / 8 >= this.new) {
         return -1;
      } else {
         int var2 = (this.a[this.try] & 255) >>> this.do;
         if (var1 > 8) {
            var2 |= (this.a[this.try + 1] & 255) << 8 - this.do;
            if (var1 > 16) {
               var2 |= (this.a[this.try + 2] & 255) << 16 - this.do;
               if (var1 > 24) {
                  var2 |= (this.a[this.try + 3] & 255) << 24 - this.do;
                  if (var1 > 32 && this.do != 0) {
                     var2 |= (this.a[this.try + 4] & 255) << 32 - this.do;
                  }
               }
            }
         }

         return var3 & var2;
      }
   }

   public int a() {
      return this.int >= this.new ? -1 : this.a[this.try] >> this.do & 1;
   }

   public void do(int var1) {
      var1 += this.do;
      this.try += var1 / 8;
      this.int += var1 / 8;
      this.do = var1 & 7;
   }

   public void if() {
      ++this.do;
      if (this.do > 7) {
         this.do = 0;
         ++this.try;
         ++this.int;
      }

   }

   public int for(int var1) {
      int var3 = if[var1];
      var1 += this.do;
      if (this.int + 4 >= this.new) {
         byte var2 = -1;
         if (this.int + (var1 - 1) / 8 >= this.new) {
            this.try += var1 / 8;
            this.int += var1 / 8;
            this.do = var1 & 7;
            return var2;
         }
      }

      int var4 = (this.a[this.try] & 255) >>> this.do;
      if (var1 > 8) {
         var4 |= (this.a[this.try + 1] & 255) << 8 - this.do;
         if (var1 > 16) {
            var4 |= (this.a[this.try + 2] & 255) << 16 - this.do;
            if (var1 > 24) {
               var4 |= (this.a[this.try + 3] & 255) << 24 - this.do;
               if (var1 > 32 && this.do != 0) {
                  var4 |= (this.a[this.try + 4] & 255) << 32 - this.do;
               }
            }
         }
      }

      var4 &= var3;
      this.try += var1 / 8;
      this.int += var1 / 8;
      this.do = var1 & 7;
      return var4;
   }

   public int if(int var1) {
      int var3 = 32 - var1;
      var1 += this.do;
      if (this.int + 4 >= this.new) {
         byte var2 = -1;
         if (this.int * 8 + var1 > this.new * 8) {
            this.try += var1 / 8;
            this.int += var1 / 8;
            this.do = var1 & 7;
            return var2;
         }
      }

      int var4 = (this.a[this.try] & 255) << 24 + this.do;
      if (var1 > 8) {
         var4 |= (this.a[this.try + 1] & 255) << 16 + this.do;
         if (var1 > 16) {
            var4 |= (this.a[this.try + 2] & 255) << 8 + this.do;
            if (var1 > 24) {
               var4 |= (this.a[this.try + 3] & 255) << this.do;
               if (var1 > 32 && this.do != 0) {
                  var4 |= (this.a[this.try + 4] & 255) >> 8 - this.do;
               }
            }
         }
      }

      var4 = var4 >>> (var3 >> 1) >>> (var3 + 1 >> 1);
      this.try += var1 / 8;
      this.int += var1 / 8;
      this.do = var1 & 7;
      return var4;
   }

   public int try() {
      if (this.int >= this.new) {
         byte var2 = -1;
         ++this.do;
         if (this.do > 7) {
            this.do = 0;
            ++this.try;
            ++this.int;
         }

         return var2;
      } else {
         int var1 = this.a[this.try] >> this.do & 1;
         ++this.do;
         if (this.do > 7) {
            this.do = 0;
            ++this.try;
            ++this.int;
         }

         return var1;
      }
   }

   public int do() {
      return this.int + (this.do + 7) / 8;
   }

   public int case() {
      return this.int * 8 + this.do;
   }

   public byte[] new() {
      return this.a;
   }

   public static int int(int var0) {
      int var1;
      for(var1 = 0; var0 > 0; var0 >>>= 1) {
         ++var1;
      }

      return var1;
   }

   public static void a(String var0) {
      System.err.println(var0);
      System.exit(1);
   }
}
