public class xw {
   private int if;
   private int a;
   private int byte;
   private byte[] try;
   private xz new;
   private xz int;
   private xz for;
   private xz do;

   public xw(int var1, boolean var2) {
      this.if = var1;
      this.try = new byte[4096];
      this.int = new xz(this.try.length, 4);
      this.for = new xz(this.try.length, 4);
      if (var2) {
         this.do = new xz(this.try.length, 4);
      }

   }

   public int a(int var1, int var2, int var3) {
      int var4 = this.try[var2 << 8 | var3 << 4 | var1] & 255;
      return this.new != null ? this.new.a(var1, var2, var3) << 8 | var4 : var4;
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.try[var2 << 8 | var3 << 4 | var1] & 255;
      if (this.new != null) {
         var5 |= this.new.a(var1, var2, var3) << 8;
      }

      if (var5 == 0 && var4 != 0) {
         ++this.a;
         if (pa.x[var4] != null && pa.x[var4].f()) {
            ++this.byte;
         }
      } else if (var5 != 0 && var4 == 0) {
         --this.a;
         if (pa.x[var5] != null && pa.x[var5].f()) {
            --this.byte;
         }
      } else if (pa.x[var5] != null && pa.x[var5].f() && (pa.x[var4] == null || !pa.x[var4].f())) {
         --this.byte;
      } else if ((pa.x[var5] == null || !pa.x[var5].f()) && pa.x[var4] != null && pa.x[var4].f()) {
         ++this.byte;
      }

      this.try[var2 << 8 | var3 << 4 | var1] = (byte)(var4 & 255);
      if (var4 > 255) {
         if (this.new == null) {
            this.new = new xz(this.try.length, 4);
         }

         this.new.a(var1, var2, var3, (var4 & 3840) >> 8);
      } else if (this.new != null) {
         this.new.a(var1, var2, var3, 0);
      }

   }

   public int for(int var1, int var2, int var3) {
      return this.int.a(var1, var2, var3);
   }

   public void do(int var1, int var2, int var3, int var4) {
      this.int.a(var1, var2, var3, var4);
   }

   public boolean new() {
      return this.a == 0;
   }

   public boolean else() {
      return this.byte > 0;
   }

   public int int() {
      return this.if;
   }

   public void for(int var1, int var2, int var3, int var4) {
      this.do.a(var1, var2, var3, var4);
   }

   public int do(int var1, int var2, int var3) {
      return this.do.a(var1, var2, var3);
   }

   public void if(int var1, int var2, int var3, int var4) {
      this.for.a(var1, var2, var3, var4);
   }

   public int if(int var1, int var2, int var3) {
      return this.for.a(var1, var2, var3);
   }

   public void for() {
      this.a = 0;
      this.byte = 0;

      for(int var1 = 0; var1 < 16; ++var1) {
         for(int var2 = 0; var2 < 16; ++var2) {
            for(int var3 = 0; var3 < 16; ++var3) {
               int var4 = this.a(var1, var2, var3);
               if (var4 > 0) {
                  if (pa.x[var4] == null) {
                     this.try[var2 << 8 | var3 << 4 | var1] = 0;
                     if (this.new != null) {
                        this.new.a(var1, var2, var3, 0);
                     }
                  } else {
                     ++this.a;
                     if (pa.x[var4].f()) {
                        ++this.byte;
                     }
                  }
               }
            }
         }
      }

   }

   public byte[] char() {
      return this.try;
   }

   public void case() {
      this.new = null;
   }

   public xz try() {
      return this.new;
   }

   public xz a() {
      return this.int;
   }

   public xz do() {
      return this.for;
   }

   public xz byte() {
      return this.do;
   }

   public void a(byte[] var1) {
      this.try = var1;
   }

   public void for(xz var1) {
      this.new = var1;
   }

   public void a(xz var1) {
      this.int = var1;
   }

   public void do(xz var1) {
      this.for = var1;
   }

   public void if(xz var1) {
      this.do = var1;
   }

   public xz if() {
      this.new = new xz(this.try.length, 4);
      return this.new;
   }
}
