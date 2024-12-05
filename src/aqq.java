import java.io.DataInput;
import java.io.DataOutput;

public class aqq extends aqd {
   public float char;

   public aqq(String var1) {
      super(var1);
   }

   public aqq(String var1, float var2) {
      super(var1);
      this.char = var2;
   }

   void a(DataOutput var1) {
      var1.writeFloat(this.char);
   }

   void if(DataInput var1) {
      this.char = var1.readFloat();
   }

   public byte a() {
      return 5;
   }

   public String toString() {
      return "" + this.char;
   }

   public aqd do() {
      return new aqq(this.if(), this.char);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqq var2 = (aqq)var1;
         return this.char == var2.char;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ Float.floatToIntBits(this.char);
   }
}
