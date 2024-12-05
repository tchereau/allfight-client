package com.jcraft.a;

public class c {
   byte[] case;
   int if;
   int new;
   private int for;
   int[] do;
   long[] char;
   int a;
   int int;
   int try;
   int d;
   byte[] void;
   int goto;
   public int long;
   int c;
   int e;
   int b;
   long byte;
   long else;

   public c() {
      this.void = new byte[282];
      this.for();
   }

   c(int var1) {
      this();
      this.do(var1);
   }

   void for() {
      this.if = 16384;
      this.case = new byte[this.if];
      this.a = 1024;
      this.do = new int[this.a];
      this.char = new long[this.a];
   }

   public void do(int var1) {
      if (this.case == null) {
         this.for();
      } else {
         int var2;
         for(var2 = 0; var2 < this.case.length; ++var2) {
            this.case[var2] = 0;
         }

         for(var2 = 0; var2 < this.do.length; ++var2) {
            this.do[var2] = 0;
         }

         for(var2 = 0; var2 < this.char.length; ++var2) {
            this.char[var2] = 0L;
         }
      }

      this.e = var1;
   }

   public void a() {
      this.case = null;
      this.do = null;
      this.char = null;
   }

   void if() {
      this.a();
   }

   void a(int var1) {
      if (this.if <= this.new + var1) {
         this.if += var1 + 1024;
         byte[] var2 = new byte[this.if];
         System.arraycopy(this.case, 0, var2, 0, this.case.length);
         this.case = var2;
      }

   }

   void if(int var1) {
      if (this.a <= this.int + var1) {
         this.a += var1 + 32;
         int[] var2 = new int[this.a];
         System.arraycopy(this.do, 0, var2, 0, this.do.length);
         this.do = var2;
         long[] var3 = new long[this.a];
         System.arraycopy(this.char, 0, var3, 0, this.char.length);
         this.char = var3;
      }

   }

   public int a(com.jcraft.a.d var1) {
      int var2 = var1.a / 255 + 1;
      if (this.for != 0) {
         this.new -= this.for;
         if (this.new != 0) {
            System.arraycopy(this.case, this.for, this.case, 0, this.new);
         }

         this.for = 0;
      }

      this.a(var1.a);
      this.if(var2);
      System.arraycopy(var1.do, var1.new, this.case, this.new, var1.a);
      this.new += var1.a;

      int var3;
      for(var3 = 0; var3 < var2 - 1; ++var3) {
         this.do[this.int + var3] = 255;
         this.char[this.int + var3] = this.else;
      }

      this.do[this.int + var3] = var1.a % 255;
      this.else = this.char[this.int + var3] = var1.if;
      int[] var10000 = this.do;
      int var10001 = this.int;
      var10000[var10001] |= 256;
      this.int += var2;
      ++this.byte;
      if (var1.for != 0) {
         this.long = 1;
      }

      return 0;
   }

   public int if(com.jcraft.a.d var1) {
      int var2 = this.d;
      if (this.try <= var2) {
         return 0;
      } else if ((this.do[var2] & 1024) != 0) {
         ++this.d;
         ++this.byte;
         return -1;
      } else {
         int var3 = this.do[var2] & 255;
         byte var4 = 0;
         var1.do = this.case;
         var1.new = this.for;
         var1.for = this.do[var2] & 512;
         var1.try = this.do[var2] & 256;

         int var6;
         for(var6 = var4 + var3; var3 == 255; var6 += var3) {
            ++var2;
            int var5 = this.do[var2];
            var3 = var5 & 255;
            if ((var5 & 512) != 0) {
               var1.for = 512;
            }
         }

         var1.int = this.byte;
         var1.if = this.char[var2];
         var1.a = var6;
         this.for += var6;
         this.d = var2 + 1;
         ++this.byte;
         return 1;
      }
   }

   public int do(com.jcraft.a.b var1) {
      byte[] var2 = var1.new;
      int var3 = var1.try;
      byte[] var4 = var1.int;
      int var5 = var1.a;
      int var6 = var1.for;
      int var7 = 0;
      int var8 = var1.do();
      int var9 = var1.a();
      int var10 = var1.byte();
      int var11 = var1.new();
      long var12 = var1.int();
      int var14 = var1.for();
      int var15 = var1.try();
      int var16 = var2[var3 + 26] & 255;
      int var17 = this.d;
      int var18 = this.for;
      if (var18 != 0) {
         this.new -= var18;
         if (this.new != 0) {
            System.arraycopy(this.case, var18, this.case, 0, this.new);
         }

         this.for = 0;
      }

      if (var17 != 0) {
         if (this.int - var17 != 0) {
            System.arraycopy(this.do, var17, this.do, 0, this.int - var17);
            System.arraycopy(this.char, var17, this.char, 0, this.int - var17);
         }

         this.int -= var17;
         this.try -= var17;
         this.d = 0;
      }

      if (var14 != this.e) {
         return -1;
      } else if (var8 > 0) {
         return -1;
      } else {
         this.if(var16 + 1);
         if (var15 != this.b) {
            for(var17 = this.try; var17 < this.int; ++var17) {
               this.new -= this.do[var17] & 255;
            }

            this.int = this.try;
            if (this.b != -1) {
               this.do[this.int++] = 1024;
               ++this.try;
            }

            if (var9 != 0) {
               for(var10 = 0; var7 < var16; ++var7) {
                  var18 = var2[var3 + 27 + var7] & 255;
                  var5 += var18;
                  var6 -= var18;
                  if (var18 < 255) {
                     ++var7;
                     break;
                  }
               }
            }
         }

         if (var6 != 0) {
            this.a(var6);
            System.arraycopy(var4, var5, this.case, this.new, var6);
            this.new += var6;
         }

         var17 = -1;

         int[] var10000;
         int var10001;
         while(var7 < var16) {
            var18 = var2[var3 + 27 + var7] & 255;
            this.do[this.int] = var18;
            this.char[this.int] = -1L;
            if (var10 != 0) {
               var10000 = this.do;
               var10001 = this.int;
               var10000[var10001] |= 256;
               var10 = 0;
            }

            if (var18 < 255) {
               var17 = this.int;
            }

            ++this.int;
            ++var7;
            if (var18 < 255) {
               this.try = this.int;
            }
         }

         if (var17 != -1) {
            this.char[var17] = var12;
         }

         if (var11 != 0) {
            this.long = 1;
            if (this.int > 0) {
               var10000 = this.do;
               var10001 = this.int - 1;
               var10000[var10001] |= 512;
            }
         }

         this.b = var15 + 1;
         return 0;
      }
   }

   public int a(com.jcraft.a.b var1) {
      boolean var3 = false;
      int var4 = this.int > 255 ? 255 : this.int;
      int var5 = 0;
      int var6 = 0;
      long var7 = this.char[0];
      if (var4 == 0) {
         return 0;
      } else {
         int var10;
         if (this.c == 0) {
            var7 = 0L;

            for(var10 = 0; var10 < var4; ++var10) {
               if ((this.do[var10] & 255) < 255) {
                  ++var10;
                  break;
               }
            }
         } else {
            for(var10 = 0; var10 < var4 && var6 <= 4096; ++var10) {
               var6 += this.do[var10] & 255;
               var7 = this.char[var10];
            }
         }

         System.arraycopy("OggS".getBytes(), 0, this.void, 0, 4);
         this.void[4] = 0;
         this.void[5] = 0;
         byte[] var10000;
         if ((this.do[0] & 256) == 0) {
            var10000 = this.void;
            var10000[5] = (byte)(var10000[5] | 1);
         }

         if (this.c == 0) {
            var10000 = this.void;
            var10000[5] = (byte)(var10000[5] | 2);
         }

         if (this.long != 0 && this.int == var10) {
            var10000 = this.void;
            var10000[5] = (byte)(var10000[5] | 4);
         }

         this.c = 1;

         int var2;
         for(var2 = 6; var2 < 14; ++var2) {
            this.void[var2] = (byte)((int)var7);
            var7 >>>= 8;
         }

         int var9 = this.e;

         for(var2 = 14; var2 < 18; ++var2) {
            this.void[var2] = (byte)var9;
            var9 >>>= 8;
         }

         if (this.b == -1) {
            this.b = 0;
         }

         var9 = this.b++;

         for(var2 = 18; var2 < 22; ++var2) {
            this.void[var2] = (byte)var9;
            var9 >>>= 8;
         }

         this.void[22] = 0;
         this.void[23] = 0;
         this.void[24] = 0;
         this.void[25] = 0;
         this.void[26] = (byte)var10;

         for(var2 = 0; var2 < var10; ++var2) {
            this.void[var2 + 27] = (byte)this.do[var2];
            var5 += this.void[var2 + 27] & 255;
         }

         var1.new = this.void;
         var1.try = 0;
         var1.if = this.goto = var10 + 27;
         var1.int = this.case;
         var1.a = this.for;
         var1.for = var5;
         this.int -= var10;
         System.arraycopy(this.do, var10, this.do, 0, this.int * 4);
         System.arraycopy(this.char, var10, this.char, 0, this.int * 8);
         this.for += var5;
         var1.if();
         return 1;
      }
   }

   public int if(com.jcraft.a.b var1) {
      return (this.long == 0 || this.int == 0) && this.new - this.for <= 4096 && this.int < 255 && (this.int == 0 || this.c != 0) ? 0 : this.a(var1);
   }

   public int int() {
      return this.long;
   }

   public int do() {
      this.new = 0;
      this.for = 0;
      this.int = 0;
      this.try = 0;
      this.d = 0;
      this.goto = 0;
      this.long = 0;
      this.c = 0;
      this.b = -1;
      this.byte = 0L;
      this.else = 0L;
      return 0;
   }
}
