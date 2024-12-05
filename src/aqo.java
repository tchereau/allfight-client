import java.io.DataInput;
import java.io.DataOutput;

public class aqo extends aqd {
   public int byte;

   public aqo(String var1) {
      super(var1);
   }

   public aqo(String var1, int var2) {
      super(var1);
      this.byte = var2;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.byte);
   }

   void if(DataInput var1) {
      this.byte = var1.readInt();
   }

   public byte a() {
      return 3;
   }

   public String toString() {
      return "" + this.byte;
   }

   public aqd do() {
      return new aqo(this.if(), this.byte);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqo var2 = (aqo)var1;
         return this.byte == var2.byte;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.byte;
   }
}
