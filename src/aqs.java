import java.io.DataInput;
import java.io.DataOutput;

public class aqs extends aqd {
   public double else;

   public aqs(String var1) {
      super(var1);
   }

   public aqs(String var1, double var2) {
      super(var1);
      this.else = var2;
   }

   void a(DataOutput var1) {
      var1.writeDouble(this.else);
   }

   void if(DataInput var1) {
      this.else = var1.readDouble();
   }

   public byte a() {
      return 6;
   }

   public String toString() {
      return "" + this.else;
   }

   public aqd do() {
      return new aqs(this.if(), this.else);
   }

   public boolean equals(Object var1) {
      if (super.equals(var1)) {
         aqs var2 = (aqs)var1;
         return this.else == var2.else;
      } else {
         return false;
      }
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.else);
      return super.hashCode() ^ (int)(var1 ^ var1 >>> 32);
   }
}
