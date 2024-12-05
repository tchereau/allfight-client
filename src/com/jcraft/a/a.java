package com.jcraft.a;

public class a {
   public byte[] do;
   int int;
   int byte;
   int if;
   int new;
   int a;
   int try;
   private com.jcraft.a.b for = new com.jcraft.a.b();
   private byte[] case = new byte[4];

   public int int() {
      this.do = null;
      return 0;
   }

   public int a(int var1) {
      if (this.if != 0) {
         this.byte -= this.if;
         if (this.byte > 0) {
            System.arraycopy(this.do, this.if, this.do, 0, this.byte);
         }

         this.if = 0;
      }

      if (var1 > this.int - this.byte) {
         int var2 = var1 + this.byte + 4096;
         if (this.do != null) {
            byte[] var3 = new byte[var2];
            System.arraycopy(this.do, 0, var3, 0, this.do.length);
            this.do = var3;
         } else {
            this.do = new byte[var2];
         }

         this.int = var2;
      }

      return this.byte;
   }

   public int if(int var1) {
      if (this.byte + var1 > this.int) {
         return -1;
      } else {
         this.byte += var1;
         return 0;
      }
   }

   public int a(com.jcraft.a.b var1) {
      int var2 = this.if;
      int var4 = this.byte - this.if;
      int var3;
      int var7;
      if (this.a == 0) {
         if (var4 < 27) {
            return 0;
         }

         if (this.do[var2] != 79 || this.do[var2 + 1] != 103 || this.do[var2 + 2] != 103 || this.do[var2 + 3] != 83) {
            this.a = 0;
            this.try = 0;
            var3 = 0;

            for(var7 = 0; var7 < var4 - 1; ++var7) {
               if (this.do[var2 + 1 + var7] == 79) {
                  var3 = var2 + 1 + var7;
                  break;
               }
            }

            if (var3 == 0) {
               var3 = this.byte;
            }

            this.if = var3;
            return -(var3 - var2);
         }

         int var5 = (this.do[var2 + 26] & 255) + 27;
         if (var4 < var5) {
            return 0;
         }

         for(int var6 = 0; var6 < (this.do[var2 + 26] & 255); ++var6) {
            this.try += this.do[var2 + 27 + var6] & 255;
         }

         this.a = var5;
      }

      if (this.try + this.a > var4) {
         return 0;
      } else {
         synchronized(this.case) {
            System.arraycopy(this.do, var2 + 22, this.case, 0, 4);
            this.do[var2 + 22] = 0;
            this.do[var2 + 23] = 0;
            this.do[var2 + 24] = 0;
            this.do[var2 + 25] = 0;
            com.jcraft.a.b var10 = this.for;
            var10.new = this.do;
            var10.try = var2;
            var10.if = this.a;
            var10.int = this.do;
            var10.a = var2 + this.a;
            var10.for = this.try;
            var10.if();
            if (this.case[0] != this.do[var2 + 22] || this.case[1] != this.do[var2 + 23] || this.case[2] != this.do[var2 + 24] || this.case[3] != this.do[var2 + 25]) {
               System.arraycopy(this.case, 0, this.do, var2 + 22, 4);
               this.a = 0;
               this.try = 0;
               var3 = 0;

               for(var7 = 0; var7 < var4 - 1; ++var7) {
                  if (this.do[var2 + 1 + var7] == 79) {
                     var3 = var2 + 1 + var7;
                     break;
                  }
               }

               if (var3 == 0) {
                  var3 = this.byte;
               }

               this.if = var3;
               return -(var3 - var2);
            }
         }

         var2 = this.if;
         if (var1 != null) {
            var1.new = this.do;
            var1.try = var2;
            var1.if = this.a;
            var1.int = this.do;
            var1.a = var2 + this.a;
            var1.for = this.try;
         }

         this.new = 0;
         this.if += var4 = this.a + this.try;
         this.a = 0;
         this.try = 0;
         return var4;
      }
   }

   public int if(com.jcraft.a.b var1) {
      do {
         int var2 = this.a(var1);
         if (var2 > 0) {
            return 1;
         }

         if (var2 == 0) {
            return 0;
         }
      } while(this.new != 0);

      this.new = 1;
      return -1;
   }

   public int a() {
      this.byte = 0;
      this.if = 0;
      this.new = 0;
      this.a = 0;
      this.try = 0;
      return 0;
   }

   public void for() {
   }

   public int do() {
      return this.if;
   }

   public int if() {
      return this.byte;
   }
}
