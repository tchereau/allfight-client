import java.io.DataInput;
import java.io.DataOutput;

public class aqi extends aqd {
   public short for;

   public aqi(String var1) {
      super(var1);
   }

   public aqi(String var1, short var2) {
      super(var1);
      this.for = var2;
   }

   void a(DataOutput var1) {
      var1.writeShort(this.for);
   }

   void if(DataInput var1) {
      this.for = var1.readShort();
   }

   public byte a() {
      return 2;
   }

   public String toString() {
      return "" + this.for;
   }

   public aqd do() {
      return new aqi(this.if(), this.for);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqi var2 = (aqi)var1;
         return this.for == var2.for;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return super.hashCode() ^ this.for;
   }
}
