package com.jcraft.jorbis;

public class y {
   private static byte[] if = "vorbis".getBytes();
   private static byte[] do = "Xiphophorus libVorbis I 20000508".getBytes();
   private static final int a = -130;
   public byte[][] int;
   public int[] for;
   public int new;
   public byte[] try;

   public void do() {
      this.int = (byte[][])null;
      this.new = 0;
      this.try = null;
   }

   public void a(String var1) {
      this.a(var1.getBytes());
   }

   private void a(byte[] var1) {
      byte[][] var2 = new byte[this.new + 2][];
      if (this.int != null) {
         System.arraycopy(this.int, 0, var2, 0, this.new);
      }

      this.int = var2;
      int[] var3 = new int[this.new + 2];
      if (this.for != null) {
         System.arraycopy(this.for, 0, var3, 0, this.new);
      }

      this.for = var3;
      byte[] var4 = new byte[var1.length + 1];
      System.arraycopy(var1, 0, var4, 0, var1.length);
      this.int[this.new] = var4;
      this.for[this.new] = var1.length;
      ++this.new;
      this.int[this.new] = null;
   }

   public void a(String var1, String var2) {
      if (var2 == null) {
         var2 = "";
      }

      this.a(var1 + "=" + var2);
   }

   static boolean a(byte[] var0, byte[] var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         byte var4 = var0[var3];
         byte var5 = var1[var3];
         if (90 >= var4 && var4 >= 65) {
            var4 = (byte)(var4 - 65 + 97);
         }

         if (90 >= var5 && var5 >= 65) {
            var5 = (byte)(var5 - 65 + 97);
         }

         if (var4 != var5) {
            return false;
         }
      }

      return true;
   }

   public String if(String var1) {
      return this.a((String)var1, 0);
   }

   public String a(String var1, int var2) {
      int var3 = this.a(var1.getBytes(), var2);
      if (var3 == -1) {
         return null;
      } else {
         byte[] var4 = this.int[var3];

         for(int var5 = 0; var5 < this.for[var3]; ++var5) {
            if (var4[var5] == 61) {
               return new String(var4, var5 + 1, this.for[var3] - (var5 + 1));
            }
         }

         return null;
      }
   }

   private int a(byte[] var1, int var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = var1.length + 1;
      byte[] var6 = new byte[var5];
      System.arraycopy(var1, 0, var6, 0, var1.length);
      var6[var1.length] = 61;

      for(int var7 = 0; var7 < this.new; ++var7) {
         if (a(this.int[var7], var6, var5)) {
            if (var2 == var4) {
               return var7;
            }

            ++var4;
         }
      }

      return -1;
   }

   int if(com.jcraft.a.e var1) {
      int var2 = var1.for(32);
      if (var2 < 0) {
         this.a();
         return -1;
      } else {
         this.try = new byte[var2 + 1];
         var1.a(this.try, var2);
         this.new = var1.for(32);
         if (this.new < 0) {
            this.a();
            return -1;
         } else {
            this.int = new byte[this.new + 1][];
            this.for = new int[this.new + 1];

            for(int var3 = 0; var3 < this.new; ++var3) {
               int var4 = var1.for(32);
               if (var4 < 0) {
                  this.a();
                  return -1;
               }

               this.for[var3] = var4;
               this.int[var3] = new byte[var4 + 1];
               var1.a(this.int[var3], var4);
            }

            if (var1.for(1) != 1) {
               this.a();
               return -1;
            } else {
               return 0;
            }
         }
      }
   }

   int a(com.jcraft.a.e var1) {
      var1.a(3, 8);
      var1.a(if);
      var1.a(do.length, 32);
      var1.a(do);
      var1.a(this.new, 32);
      if (this.new != 0) {
         for(int var2 = 0; var2 < this.new; ++var2) {
            if (this.int[var2] != null) {
               var1.a(this.for[var2], 32);
               var1.a(this.int[var2]);
            } else {
               var1.a(0, 32);
            }
         }
      }

      var1.a(1, 1);
      return 0;
   }

   public int a(com.jcraft.a.d var1) {
      com.jcraft.a.e var2 = new com.jcraft.a.e();
      var2.int();
      if (this.a(var2) != 0) {
         return -130;
      } else {
         var1.do = new byte[var2.do()];
         var1.new = 0;
         var1.a = var2.do();
         System.arraycopy(var2.new(), 0, var1.do, 0, var1.a);
         var1.try = 0;
         var1.for = 0;
         var1.if = 0L;
         return 0;
      }
   }

   void a() {
      for(int var1 = 0; var1 < this.new; ++var1) {
         this.int[var1] = null;
      }

      this.int = (byte[][])null;
      this.try = null;
   }

   public String if() {
      return new String(this.try, 0, this.try.length - 1);
   }

   public String a(int var1) {
      return this.new <= var1 ? null : new String(this.int[var1], 0, this.int[var1].length - 1);
   }

   public String toString() {
      String var1 = "Vendor: " + new String(this.try, 0, this.try.length - 1);

      for(int var2 = 0; var2 < this.new; ++var2) {
         var1 = var1 + "\nComment: " + new String(this.int[var2], 0, this.int[var2].length - 1);
      }

      var1 = var1 + "\n";
      return var1;
   }
}
