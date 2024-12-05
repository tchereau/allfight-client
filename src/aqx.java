import java.io.DataInput;
import java.io.DataOutput;
import java.util.Arrays;

public class aqx extends aqd {
   public byte[] void;

   public aqx(String var1) {
      super(var1);
   }

   public aqx(String var1, byte[] var2) {
      super(var1);
      this.void = var2;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.void.length);
      var1.write(this.void);
   }

   void if(DataInput var1) {
      int var2 = var1.readInt();
      this.void = new byte[var2];
      var1.readFully(this.void);
   }

   public byte a() {
      return 7;
   }

   public String toString() {
      return "[" + this.void.length + " bytes]";
   }

   public aqd do() {
      byte[] var1 = new byte[this.void.length];
      System.arraycopy(this.void, 0, var1, 0, this.void.length);
      return new aqx(this.if(), var1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1) ? Arrays.equals(this.void, ((aqx)var1).void) : false;
   }

   public int hashCode() {
      return super.hashCode() ^ Arrays.hashCode(this.void);
   }
}
