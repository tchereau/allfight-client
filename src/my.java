public class my implements m9 {
   private byte[] g;
   private byte[] f;
   private byte[] k;
   private int j;
   private m9 i = null;
   private boolean h;

   public my(m9 var1, int var2) {
      this.i = var1;
      this.j = var2 / 8;
      this.g = new byte[var1.if()];
      this.f = new byte[var1.if()];
      this.k = new byte[var1.if()];
   }

   public void a(boolean var1, m6 var2) {
      this.h = var1;
      if (var2 instanceof mw) {
         mw var3 = (mw)var2;
         byte[] var4 = var3.do();
         if (var4.length < this.g.length) {
            System.arraycopy(var4, 0, this.g, this.g.length - var4.length, var4.length);

            for(int var5 = 0; var5 < this.g.length - var4.length; ++var5) {
               this.g[var5] = 0;
            }
         } else {
            System.arraycopy(var4, 0, this.g, 0, this.g.length);
         }

         this.a();
         if (var3.if() != null) {
            this.i.a(true, var3.if());
         }
      } else {
         this.a();
         this.i.a(true, var2);
      }

   }

   public String do() {
      return this.i.do() + "/CFB" + this.j * 8;
   }

   public int if() {
      return this.j;
   }

   public int a(byte[] var1, int var2, byte[] var3, int var4) {
      return this.h ? this.do(var1, var2, var3, var4) : this.if(var1, var2, var3, var4);
   }

   public int do(byte[] var1, int var2, byte[] var3, int var4) {
      if (var2 + this.j > var1.length) {
         throw new m5("input buffer too short");
      } else if (var4 + this.j > var3.length) {
         throw new m5("output buffer too short");
      } else {
         this.i.a(this.f, 0, this.k, 0);

         for(int var5 = 0; var5 < this.j; ++var5) {
            var3[var4 + var5] = (byte)(this.k[var5] ^ var1[var2 + var5]);
         }

         System.arraycopy(this.f, this.j, this.f, 0, this.f.length - this.j);
         System.arraycopy(var3, var4, this.f, this.f.length - this.j, this.j);
         return this.j;
      }
   }

   public int if(byte[] var1, int var2, byte[] var3, int var4) {
      if (var2 + this.j > var1.length) {
         throw new m5("input buffer too short");
      } else if (var4 + this.j > var3.length) {
         throw new m5("output buffer too short");
      } else {
         this.i.a(this.f, 0, this.k, 0);
         System.arraycopy(this.f, this.j, this.f, 0, this.f.length - this.j);
         System.arraycopy(var1, var2, this.f, this.f.length - this.j, this.j);

         for(int var5 = 0; var5 < this.j; ++var5) {
            var3[var4 + var5] = (byte)(this.k[var5] ^ var1[var2 + var5]);
         }

         return this.j;
      }
   }

   public void a() {
      System.arraycopy(this.g, 0, this.f, 0, this.g.length);
      this.i.a();
   }
}
