import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class mz extends FilterOutputStream {
   private m8 if;
   private m2 a;
   private byte[] for = new byte[1];
   private byte[] do;

   public mz(OutputStream var1, m8 var2) {
      super(var1);
      this.if = var2;
      this.do = new byte[var2.if()];
   }

   public void write(int var1) {
      this.for[0] = (byte)var1;
      if (this.if != null) {
         int var2 = this.if.a(this.for, 0, 1, this.do, 0);
         if (var2 != 0) {
            this.out.write(this.do, 0, var2);
         }
      } else {
         this.out.write(this.a.a((byte)var1));
      }

   }

   public void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   public void write(byte[] var1, int var2, int var3) {
      byte[] var4;
      if (this.if != null) {
         var4 = new byte[this.if.if(var3)];
         int var5 = this.if.a(var1, var2, var3, var4, 0);
         if (var5 != 0) {
            this.out.write(var4, 0, var5);
         }
      } else {
         var4 = new byte[var3];
         this.a.a(var1, var2, var3, var4, 0);
         this.out.write(var4, 0, var3);
      }

   }

   public void flush() {
      super.flush();
   }

   public void close() {
      try {
         if (this.if != null) {
            byte[] var1 = new byte[this.if.if(0)];
            int var2 = this.if.a(var1, 0);
            if (var2 != 0) {
               this.out.write(var1, 0, var2);
            }
         }
      } catch (Exception var3) {
         throw new IOException("Error closing stream: " + var3.toString());
      }

      this.flush();
      super.close();
   }
}
