import java.io.DataInput;
import java.io.DataOutput;

public class aqw extends aqd {
   public byte long;

   public aqw(String var1) {
      super(var1);
   }

   public aqw(String var1, byte var2) {
      super(var1);
      this.long = var2;
   }

   void a(DataOutput var1) {
      var1.writeByte(this.long);
   }

   void if(DataInput var1) {
      this.long = var1.readByte();
   }

   public byte a() {
      return 1;
   }

   public String toString() {
      return "" + this.long;
   }

   public aqd do() {
      return new aqw(this.if(), this.long);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqw var2 = (aqw)var1;
         return this.long == var2.long;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.long;
   }
}
