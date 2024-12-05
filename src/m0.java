import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class m0 extends FilterInputStream {
   private m8 if;
   private m2 a;
   private byte[] try;
   private byte[] new;
   private int int;
   private int for;
   private boolean do;

   public m0(InputStream var1, m8 var2) {
      super(var1);
      this.if = var2;
      this.try = new byte[var2.if(2048)];
      this.new = new byte[2048];
   }

   private int a() {
      int var1 = super.available();
      if (var1 <= 0) {
         var1 = 1;
      }

      if (var1 > this.new.length) {
         var1 = super.read(this.new, 0, this.new.length);
      } else {
         var1 = super.read(this.new, 0, var1);
      }

      if (var1 < 0) {
         if (this.do) {
            return -1;
         }

         try {
            if (this.if != null) {
               this.for = this.if.a(this.try, 0);
            } else {
               this.for = 0;
            }
         } catch (Exception var4) {
            throw new IOException("error processing stream: " + var4.toString());
         }

         this.int = 0;
         this.do = true;
         if (this.int == this.for) {
            return -1;
         }
      } else {
         this.int = 0;

         try {
            if (this.if != null) {
               this.for = this.if.a(this.new, 0, var1, this.try, 0);
            } else {
               this.a.a(this.new, 0, var1, this.try, 0);
               this.for = var1;
            }
         } catch (Exception var3) {
            throw new IOException("error processing stream: " + var3.toString());
         }

         if (this.for == 0) {
            return this.a();
         }
      }

      return this.for;
   }

   public int read() {
      return this.int == this.for && this.a() < 0 ? -1 : this.try[this.int++] & 255;
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if (this.int == this.for && this.a() < 0) {
         return -1;
      } else {
         int var4 = this.for - this.int;
         if (var3 > var4) {
            System.arraycopy(this.try, this.int, var1, var2, var4);
            this.int = this.for;
            return var4;
         } else {
            System.arraycopy(this.try, this.int, var1, var2, var3);
            this.int += var3;
            return var3;
         }
      }
   }

   public long skip(long var1) {
      if (var1 <= 0L) {
         return 0L;
      } else {
         int var3 = this.for - this.int;
         if (var1 > (long)var3) {
            this.int = this.for;
            return (long)var3;
         } else {
            this.int += (int)var1;
            return (long)((int)var1);
         }
      }
   }

   public int available() {
      return this.for - this.int;
   }

   public void close() {
      super.close();
   }

   public boolean markSupported() {
      return false;
   }
}
